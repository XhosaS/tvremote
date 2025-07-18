package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tke extends Handler {
    final /* synthetic */ tkg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tke(tkg tkgVar, Looper looper) {
        super(looper);
        this.a = tkgVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 2) {
            this.a.b();
            return;
        }
        if (i != 3) {
            ((tug) ((tug) tkg.a.g()).j("com/google/android/tv/remote/support/core/TcpWakePortClient$1", "handleMessage", 85, "TcpWakePortClient.java")).s("Received unexpected message type");
            return;
        }
        try {
            ((tms) message.obj).f(this.a.e);
        } catch (IOException e) {
            ((tug) ((tug) ((tug) tkg.a.f()).i(e)).j("com/google/android/tv/remote/support/core/TcpWakePortClient$1", "handleMessage", 'P', "TcpWakePortClient.java")).s("Error sending message");
        }
    }
}
