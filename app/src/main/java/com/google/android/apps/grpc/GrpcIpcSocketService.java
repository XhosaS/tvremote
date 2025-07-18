package com.google.android.apps.grpc;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.assistant.base.Log;
import com.google.assistant.base.annotations.JNINamespace;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
@JNINamespace("chromecast")
/* loaded from: classes.dex */
public final class GrpcIpcSocketService extends Service {
    private static final String TAG = "GrpcIpcSocketService";
    private static boolean readyForConnections;
    private static Set socketUris;
    private final Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.android.apps.grpc.GrpcIpcSocketService.1
        final /* synthetic */ GrpcIpcSocketService this$0;

        {
            this.getClass();
            this.this$0 = this;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws RemoteException, IOException {
            if (!AndroidIpcUidPolicy.isWhitelisted(message.sendingUid)) {
                Log.e(GrpcIpcSocketService.TAG, "Calling package not allowed.", new Object[0]);
                this.this$0.replyWithError(message);
                return true;
            }
            if (!GrpcIpcSocketService.readyForConnections) {
                Log.e(GrpcIpcSocketService.TAG, "Native code not initialized yet.", new Object[0]);
                this.this$0.replyWithError(message);
                return true;
            }
            if (message.what != 1) {
                Log.e(GrpcIpcSocketService.TAG, "Unknown message, what=%d", Integer.valueOf(message.what));
            } else {
                this.this$0.onGetGrpcSocket(message);
            }
            return true;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public void onGetGrpcSocket(Message message) throws RemoteException, IOException {
        Bundle data = message.getData();
        CharSequence charSequence = data.getCharSequence(GrpcIpcSocketClient.EXTRA_REQUEST_SOCKET_URI);
        if (charSequence == null || charSequence.length() == 0) {
            Log.e(TAG, "Client request is missing EXTRA_REQUEST_PATH", new Object[0]);
            replyWithError(message);
            return;
        }
        String string = charSequence.toString();
        if (!socketUris.contains(string)) {
            Log.e(TAG, String.format("Invalid request for unregistered socket uri, %s", string), new Object[0]);
            replyWithError(message);
            return;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(new GrpcNativeCallsGoogle3().getGrpcSocketFd(string));
            Messenger messenger = new Messenger(data.getBinder("reply-to"));
            Message messageObtain = Message.obtain((Handler) null, 1);
            Bundle bundle = new Bundle();
            bundle.putParcelable(GrpcIpcSocketClient.EXTRA_REQUEST_SOCKET, parcelFileDescriptorFromFd);
            messageObtain.setData(bundle);
            try {
                messenger.send(messageObtain);
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to send reply.", e);
            }
        } catch (IOException e2) {
            Log.e(TAG, e2.toString(), new Object[0]);
            replyWithError(message);
        }
    }

    public static void registerIpcSocket(String str) {
        if (socketUris == null) {
            socketUris = new HashSet();
        }
        Log.i(TAG, String.format("Registered socket uri, '%s'", str), new Object[0]);
        socketUris.add(str);
        readyForConnections = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replyWithError(Message message) throws RemoteException {
        Messenger messenger = new Messenger(message.getData().getBinder("reply-to"));
        Message messageObtain = Message.obtain((Handler) null, message.what);
        messageObtain.arg1 = -1;
        try {
            messenger.send(messageObtain);
        } catch (RemoteException e) {
            Log.e(TAG, "Failed to send error reply.", e);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(this.handler).getBinder();
    }
}
