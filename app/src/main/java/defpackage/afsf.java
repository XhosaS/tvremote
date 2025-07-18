package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsf implements Runnable {
    final /* synthetic */ afsv a;

    public afsf(afsv afsvVar) {
        this.a = afsvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afsv afsvVar = this.a;
        if (afsvVar.r.a == affe.IDLE) {
            afsvVar.d.a(2, "CONNECTING as requested");
            afsvVar.d(affe.CONNECTING);
            afsvVar.i();
        }
    }
}
