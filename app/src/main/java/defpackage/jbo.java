package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbo extends Handler {
    final /* synthetic */ jbq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbo(jbq jbqVar) {
        super(Looper.getMainLooper());
        this.a = jbqVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws RemoteException {
        message.getClass();
        if (message.what == 2) {
            jbq jbqVar = this.a;
            Messenger messenger = message.replyTo;
            if (messenger != null) {
                jbqVar.a = messenger;
                jbqVar.f();
            }
        }
        super.handleMessage(message);
    }
}
