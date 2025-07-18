package com.google.android.apps.assistant.localGrpcAuth;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class BindingManager implements ServiceConnection {
    private static final int MAX_DEATH_COUNT = 3;
    private static final String TAG = "BindingManager";
    private final Intent bindIntent;
    private Object cachedBinder;
    private final Context context;
    private final BinderConverter converter;
    private RetryBindingHandler retryHandler;
    private final List pendingReceivers = new ArrayList();
    private boolean mustUnbind = false;
    private boolean retry = true;
    private int deathCount = 0;
    private MainThreadHandler mainThreadHandler = new MainThreadHandler(this, this);

    /* compiled from: PG */
    public interface BinderConverter {
        Object convertBinder(IBinder iBinder);
    }

    /* compiled from: PG */
    public interface BinderReceiver {
        void onGotBinder(Object obj);
    }

    /* compiled from: PG */
    class MainThreadHandler extends Handler {
        private static final int WHAT_UNBIND = 1;
        private BindingManager bindingManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainThreadHandler(BindingManager bindingManager, BindingManager bindingManager2) {
            super(Looper.getMainLooper());
            bindingManager.getClass();
            this.bindingManager = bindingManager2;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                this.bindingManager.unbindOnMainThread();
            }
        }

        public void postUnbind() {
            if (hasMessages(1)) {
                return;
            }
            sendMessage(obtainMessage(1));
        }
    }

    public BindingManager(Context context, Intent intent, BinderConverter binderConverter) {
        this.context = context;
        this.bindIntent = intent;
        this.converter = binderConverter;
    }

    public void bindService() {
        if (this.mustUnbind) {
            return;
        }
        Log.d(TAG, "bind to service");
        try {
            boolean zBindService = this.context.bindService(this.bindIntent, this, 1);
            this.mustUnbind = zBindService;
            this.retry = zBindService;
        } catch (SecurityException e) {
            this.retry = false;
            Log.e(TAG, "Libassistant embedder does not have permission to bind to the service".concat(String.valueOf(e.toString())));
        }
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        RetryBindingHandler retryBindingHandler;
        Log.i(TAG, "The binding to this connection is dead");
        this.cachedBinder = null;
        this.deathCount++;
        unbind();
        if (this.deathCount >= 3 || !this.retry || (retryBindingHandler = this.retryHandler) == null) {
            updateReceivers();
        } else {
            retryBindingHandler.retryBindServiceWithExponentialBackoffs();
        }
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        Log.i(TAG, "service binding will never become usable");
        this.cachedBinder = null;
        this.retry = false;
        unbind();
        updateReceivers();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i(TAG, "Bound service connected");
        this.cachedBinder = this.converter.convertBinder(iBinder);
        updateReceivers();
        RetryBindingHandler retryBindingHandler = this.retryHandler;
        if (retryBindingHandler != null) {
            retryBindingHandler.removeAllRetryBindMessages();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i(TAG, "Bound service disconnected");
        this.cachedBinder = null;
        unbind();
        if (!this.retry) {
            updateReceivers();
            return;
        }
        RetryBindingHandler retryBindingHandler = this.retryHandler;
        if (retryBindingHandler != null) {
            retryBindingHandler.retryBindServiceWithExponentialBackoffs();
        }
    }

    public void unbind() {
        this.mainThreadHandler.postUnbind();
    }

    public void unbindOnMainThread() {
        if (this.mustUnbind) {
            Log.d(TAG, "unbind on main thread");
            this.context.unbindService(this);
            this.mustUnbind = false;
        }
    }

    public void updateReceivers() {
        Iterator it = this.pendingReceivers.iterator();
        while (it.hasNext()) {
            ((BinderReceiver) it.next()).onGotBinder(this.cachedBinder);
        }
    }

    public void with(BinderReceiver binderReceiver, RetryBindingHandler retryBindingHandler) {
        Log.d(TAG, "with");
        Object obj = this.cachedBinder;
        if (obj != null) {
            binderReceiver.onGotBinder(obj);
        } else if (this.mustUnbind || this.retry) {
            this.pendingReceivers.add(binderReceiver);
            bindService();
        } else {
            binderReceiver.onGotBinder(null);
        }
        if (this.retryHandler == null) {
            this.retryHandler = retryBindingHandler;
        }
    }
}
