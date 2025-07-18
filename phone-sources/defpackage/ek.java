package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ek extends Handler {
    final /* synthetic */ em a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(em emVar, Looper looper) {
        super(looper);
        this.a = emVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        en enVar;
        ek ekVar;
        em emVar;
        if (message.what == 1) {
            em emVar2 = this.a;
            synchronized (emVar2.a) {
                enVar = (en) emVar2.c.get();
                ekVar = emVar2.d;
            }
            if (enVar == null || (emVar = this.a) != enVar.a() || ekVar == null) {
                return;
            }
            enVar.d((dyg) message.obj);
            emVar.j(enVar, ekVar);
            enVar.d(null);
        }
    }
}
