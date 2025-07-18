package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fru extends Handler {
    final /* synthetic */ frw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fru(frw frwVar, Looper looper) {
        super(looper);
        this.a = frwVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        frx frxVar;
        fru fruVar;
        frw frwVar;
        if (message.what == 1) {
            frw frwVar2 = this.a;
            synchronized (frwVar2.o) {
                frxVar = (frx) frwVar2.q.get();
                fruVar = frwVar2.r;
            }
            if (frxVar == null || (frwVar = this.a) != frxVar.b() || fruVar == null) {
                return;
            }
            frxVar.d((fsf) message.obj);
            frwVar.K(frxVar, fruVar);
            frxVar.d(null);
        }
    }
}
