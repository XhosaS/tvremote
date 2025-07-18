package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsq implements Runnable {
    final /* synthetic */ afst a;

    public afsq(afst afstVar) {
        this.a = afstVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afst afstVar = this.a;
        afsv afsvVar = afstVar.c;
        afsvVar.u = null;
        if (afsvVar.s != null) {
            yqw.M(afsvVar.q == null, "Unexpected non-null activeTransport");
            afstVar.a.f(afsvVar.s);
            return;
        }
        afot afotVar = afsvVar.p;
        afot afotVar2 = afstVar.a;
        if (afotVar == afotVar2) {
            afsvVar.q = afotVar2;
            afsvVar.p = null;
            afsvVar.t = afsvVar.h.a();
            afsvVar.d(affe.READY);
        }
    }
}
