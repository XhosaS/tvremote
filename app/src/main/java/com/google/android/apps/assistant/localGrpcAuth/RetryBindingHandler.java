package com.google.android.apps.assistant.localGrpcAuth;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RetryBindingHandler extends Handler {
    private static final int FIRST_DELAY_MILLIS = 500;
    private static final int MAX_NUM_ATTEMPTS = 17;
    private static final int MULTIPLIER = 2;
    private static final String TAG = "RetryBindingHandler";
    private static final int WHAT_RETRY_BIND_SERVICE = 1;
    private static final int WHAT_RETRY_GET_LOCAL_CLOUDCAST_SERVICE_INFO = 2;
    private BindingManager bindingManager;
    private int millisDelay;
    private int retryNum;

    public RetryBindingHandler(Looper looper, BindingManager bindingManager) {
        super(looper);
        this.millisDelay = FIRST_DELAY_MILLIS;
        this.retryNum = 1;
        this.bindingManager = bindingManager;
    }

    private void sendMessageWithExponentialBackoffs(Message message) {
        if (this.retryNum > MAX_NUM_ATTEMPTS) {
            Log.d(TAG, "The times of retrying get Local grpc auth info exceeds limitation");
            return;
        }
        Log.d(TAG, "send message in " + this.millisDelay + " ms");
        sendMessageDelayed(message, (long) this.millisDelay);
        int i = this.millisDelay;
        this.millisDelay = i + i;
        this.retryNum++;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == 1) {
            Log.d(TAG, "Handle WHAT_RETRY_BIND_SERVICE message");
            BindingManager bindingManager = this.bindingManager;
            if (bindingManager != null) {
                bindingManager.bindService();
                return;
            }
            return;
        }
        if (i != 2) {
            Log.d(TAG, "unknown message in retry binding handler");
            return;
        }
        Log.d(TAG, "Handle WHAT_RETRY_GET_LOCAL_CLOUDCAST_SERVICE_INFO message");
        BindingManager bindingManager2 = this.bindingManager;
        if (bindingManager2 != null) {
            bindingManager2.updateReceivers();
        }
    }

    public void removeAllRetryBindMessages() {
        Log.d(TAG, "Remove all enqueued WHAT_RETRY_BIND_SERVICE messages");
        removeMessages(1);
    }

    public void resetRetryHandler() {
        Log.d(TAG, "reset retry binding handler");
        removeAllRetryBindMessages();
        removeMessages(2);
        this.retryNum = 1;
        this.millisDelay = FIRST_DELAY_MILLIS;
    }

    public void retryBindServiceWithExponentialBackoffs() {
        if (hasMessages(1)) {
            return;
        }
        Log.d(TAG, "retry bind local grpc service");
        sendMessageWithExponentialBackoffs(obtainMessage(1));
    }

    public void retryGetAuthInfoWithExponentialBackoffs() {
        if (hasMessages(2)) {
            return;
        }
        Log.d(TAG, "retry get auth info");
        sendMessageWithExponentialBackoffs(obtainMessage(2));
    }
}
