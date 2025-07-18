package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aftu implements Runnable {
    final /* synthetic */ afun a;

    public aftu(afun afunVar) {
        this.a = afunVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afun afunVar = this.a;
        if (afunVar.v == null) {
            return;
        }
        afunVar.k(true);
        afpu afpuVar = afunVar.A;
        afpuVar.a(null);
        afunVar.J.a(2, "Entering IDLE state");
        afunVar.p.a(affe.IDLE);
        afrx afrxVar = afunVar.U;
        Object[] objArr = {afunVar.z, afpuVar};
        for (int i = 0; i < 2; i++) {
            if (afrxVar.a.contains(objArr[i])) {
                afunVar.h();
                return;
            }
        }
    }
}
