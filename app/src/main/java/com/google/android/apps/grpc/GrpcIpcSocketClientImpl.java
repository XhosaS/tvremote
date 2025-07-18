package com.google.android.apps.grpc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.grpc.BindingManager;
import com.google.assistant.base.ContextHelper;
import com.google.assistant.base.annotations.JNINamespace;

/* compiled from: PG */
@JNINamespace("chromecast")
/* loaded from: classes.dex */
public final class GrpcIpcSocketClientImpl implements GrpcIpcSocketClient {
    private static final String TAG = "GrpcIpcSocketClientImpl";
    private final BindingManager binding;
    private final long nativePointer;
    private final String socketUri;

    public static /* synthetic */ boolean $r8$lambda$RO10DvYB5ftaXYm3vfOVXWgqSFk(GrpcIpcSocketClientImpl grpcIpcSocketClientImpl, Message message) {
        grpcIpcSocketClientImpl.lambda$getGrpcIpcSocket$1(message);
        return true;
    }

    public GrpcIpcSocketClientImpl(Context context, String str, String str2, long j) {
        this.socketUri = str2;
        this.nativePointer = j;
        Intent intent = new Intent();
        intent.setClassName(str, "com.google.android.apps.grpc.GrpcIpcSocketService");
        this.binding = new BindingManager(context, intent, new BindingManager.BinderConverter(this) { // from class: com.google.android.apps.grpc.GrpcIpcSocketClientImpl.1
            {
                this.getClass();
            }

            @Override // com.google.android.apps.grpc.BindingManager.BinderConverter
            public Messenger convertBinder(IBinder iBinder) {
                return new Messenger(iBinder);
            }
        }, new BindingManager.BinderDiedReceiver() { // from class: com.google.android.apps.grpc.GrpcIpcSocketClientImpl$$ExternalSyntheticLambda1
            @Override // com.google.android.apps.grpc.BindingManager.BinderDiedReceiver
            public final void onBinderDied() {
                this.f$0.lambda$new$0();
            }
        });
    }

    public static GrpcIpcSocketClientImpl create(String str, String str2, long j) {
        return new GrpcIpcSocketClientImpl(ContextHelper.getApplicationContext(), str, str2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getGrpcIpcSocket$0(Messenger messenger) throws RemoteException {
        if (messenger == null) {
            Log.e(TAG, "messenger is null");
            lambda$new$0();
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Messenger messenger2 = new Messenger(new Handler(looperMyLooper, new Handler.Callback() { // from class: com.google.android.apps.grpc.GrpcIpcSocketClientImpl$$ExternalSyntheticLambda2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                GrpcIpcSocketClientImpl.$r8$lambda$RO10DvYB5ftaXYm3vfOVXWgqSFk(this.f$0, message);
                return true;
            }
        }));
        Bundle bundle = new Bundle();
        bundle.putBinder("reply-to", messenger2.getBinder());
        bundle.putCharSequence(GrpcIpcSocketClient.EXTRA_REQUEST_SOCKET_URI, this.socketUri);
        Message messageObtain = Message.obtain((Handler) null, 1);
        messageObtain.setData(bundle);
        try {
            messenger.send(messageObtain);
        } catch (RemoteException e) {
            Log.e(TAG, "Failed to send message.", e);
        }
    }

    private /* synthetic */ boolean lambda$getGrpcIpcSocket$1(Message message) {
        if (message.what == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) message.getData().getParcelable(GrpcIpcSocketClient.EXTRA_REQUEST_SOCKET);
            if (parcelFileDescriptor == null) {
                Log.e(TAG, "invalid message");
                lambda$new$0();
                return true;
            }
            int iDetachFd = parcelFileDescriptor.detachFd();
            String str = TAG;
            Log.d(str, String.format("Received FD (Parcel): %d", Integer.valueOf(iDetachFd)));
            if (iDetachFd < 0) {
                Log.e(str, "invalid fd received");
                lambda$new$0();
                return true;
            }
            onFileDescriptor(iDetachFd);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onError, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0() {
        new GrpcNativeCallsGoogle3().grpcIpcSocketClientOnError(this.nativePointer);
    }

    private void onFileDescriptor(int i) {
        new GrpcNativeCallsGoogle3().grpcIpcSocketClientOnFileDescriptor(this.nativePointer, i);
    }

    @Override // com.google.android.apps.grpc.GrpcIpcSocketClient
    public void getGrpcIpcSocket() {
        this.binding.with(new BindingManager.BinderReceiver() { // from class: com.google.android.apps.grpc.GrpcIpcSocketClientImpl$$ExternalSyntheticLambda0
            @Override // com.google.android.apps.grpc.BindingManager.BinderReceiver
            public final void onGotBinder(Object obj) throws RemoteException {
                this.f$0.lambda$getGrpcIpcSocket$0((Messenger) obj);
            }
        });
    }

    @Override // com.google.android.apps.grpc.GrpcIpcSocketClient
    public void unbind() {
        this.binding.unbind();
    }
}
