package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpb extends Handler {
    private final iom a;

    public fpb(Looper looper, iom iomVar) {
        super(looper);
        this.a = iomVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        fnw fnwVar = (fnw) message.obj;
        if (this.a.r(fnwVar)) {
            try {
                fnv fnvVar = fnwVar.d;
                eci.e(fnvVar);
                fnvVar.j();
            } catch (RemoteException unused) {
            }
            this.a.q(fnwVar);
        }
    }
}
