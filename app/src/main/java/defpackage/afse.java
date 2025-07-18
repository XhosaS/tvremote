package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afse implements Runnable {
    final /* synthetic */ afsv a;

    public afse(afsv afsvVar) {
        this.a = afsvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afsv afsvVar = this.a;
        afsvVar.k = null;
        afsvVar.d.a(2, "CONNECTING after backoff");
        afsvVar.d(affe.CONNECTING);
        afsvVar.i();
    }
}
