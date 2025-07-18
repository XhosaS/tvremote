package com.google.android.apps.assistant.localGrpcAuth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.assistant.localGrpcAuth.BindingManager;
import com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClient;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LocalGrpcAuthClientImpl implements LocalGrpcAuthClient {
    private static final String TAG = "LocalGrpcAuthClientImpl";
    private final BindingManager binding;
    private RetryBindingHandler retryHandler;

    public LocalGrpcAuthClientImpl(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.apps.mediashell", "com.google.android.apps.mediashell.LocalGrpcAuthService");
        BindingManager bindingManager = new BindingManager(context, intent, new BindingManager.BinderConverter(this) { // from class: com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClientImpl.1
            {
                this.getClass();
            }

            @Override // com.google.android.apps.assistant.localGrpcAuth.BindingManager.BinderConverter
            public Messenger convertBinder(IBinder iBinder) {
                return new Messenger(iBinder);
            }
        });
        this.binding = bindingManager;
        this.retryHandler = new RetryBindingHandler(Looper.getMainLooper(), bindingManager);
    }

    @Override // com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClient
    public void getLocalCloudcastServiceInfo(final LocalGrpcAuthClient.Callback callback) {
        this.binding.with(new BindingManager.BinderReceiver(this) { // from class: com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClientImpl.2
            final /* synthetic */ LocalGrpcAuthClientImpl this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // com.google.android.apps.assistant.localGrpcAuth.BindingManager.BinderReceiver
            public void onGotBinder(Messenger messenger) throws RemoteException {
                if (messenger == null) {
                    Log.e(LocalGrpcAuthClientImpl.TAG, "messenger is null");
                    return;
                }
                final LocalGrpcAuthClient.Callback callback2 = callback;
                Messenger messenger2 = new Messenger(new Handler(Looper.myLooper(), new Handler.Callback(this) { // from class: com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClientImpl.2.1
                    final /* synthetic */ AnonymousClass2 this$1;

                    {
                        this.getClass();
                        this.this$1 = this;
                    }

                    @Override // android.os.Handler.Callback
                    public boolean handleMessage(Message message) {
                        if (message.what == 1) {
                            int i = message.arg1;
                            Bundle data = message.getData();
                            if (i == 0 || data == null) {
                                Log.e(LocalGrpcAuthClientImpl.TAG, "invalid message");
                                this.this$1.this$0.retryHandler.retryGetAuthInfoWithExponentialBackoffs();
                                callback2.onError();
                            } else {
                                CharSequence charSequence = data.getCharSequence(LocalGrpcAuthClient.EXTRA_REQUEST_TOKEN_STRING);
                                if (charSequence == null || charSequence.length() == 0) {
                                    Log.e(LocalGrpcAuthClientImpl.TAG, "auth token is null or empty");
                                    this.this$1.this$0.retryHandler.retryGetAuthInfoWithExponentialBackoffs();
                                    callback2.onError();
                                    return true;
                                }
                                callback2.onResult(i, charSequence.toString());
                                this.this$1.this$0.retryHandler.resetRetryHandler();
                            }
                        }
                        return true;
                    }
                }));
                Bundle bundle = new Bundle();
                bundle.putBinder("reply-to", messenger2.getBinder());
                Message messageObtain = Message.obtain((Handler) null, 1);
                messageObtain.setData(bundle);
                try {
                    messenger.send(messageObtain);
                } catch (RemoteException e) {
                    Log.e(LocalGrpcAuthClientImpl.TAG, "Failed to send message.", e);
                }
            }
        }, this.retryHandler);
    }

    @Override // com.google.android.apps.assistant.localGrpcAuth.LocalGrpcAuthClient
    public void unbind() {
        this.binding.unbind();
    }
}
