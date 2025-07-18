package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afxq implements Runnable {
    final /* synthetic */ afyd a;
    final /* synthetic */ afxr b;

    public afxq(afxr afxrVar, afyd afydVar) {
        this.a = afydVar;
        this.b = afxrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afxp afxpVar;
        boolean z;
        afye afyeVar;
        afxr afxrVar = this.b;
        afyf afyfVar = afxrVar.b;
        Object obj = afyfVar.q;
        synchronized (obj) {
            afxpVar = null;
            if (afxrVar.a.c) {
                z = true;
            } else {
                afyfVar.w = afyfVar.w.a(this.a);
                if (afyfVar.z(afyfVar.w) && ((afyeVar = afyfVar.u) == null || afyeVar.a())) {
                    afxpVar = new afxp(obj);
                    afyfVar.E = afxpVar;
                } else {
                    afyfVar.w = afyfVar.w.b();
                    afyfVar.E = null;
                }
                z = false;
            }
        }
        if (z) {
            afyd afydVar = this.a;
            afydVar.a.u(new afyc(this.b.b, afydVar));
            afydVar.a.n(Status.b.withDescription("Unneeded hedging"));
        } else {
            if (afxpVar != null) {
                afyf afyfVar2 = this.b.b;
                afxpVar.b(afyfVar2.m.schedule(new afxr(afyfVar2, afxpVar), afyfVar2.o.b, TimeUnit.NANOSECONDS));
            }
            this.b.b.w(this.a);
        }
    }
}
