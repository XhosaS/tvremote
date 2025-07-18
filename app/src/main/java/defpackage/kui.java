package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class kui implements Runnable {
    final /* synthetic */ lco a;
    final /* synthetic */ kuj b;

    public kui(kuj kujVar, lco lcoVar) {
        this.a = lcoVar;
        this.b = kujVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lco lcoVar = this.a;
        if (lcoVar.aA().a()) {
            lcoVar.aC().h(this);
            return;
        }
        kuj kujVar = this.b;
        boolean zD = kujVar.d();
        kujVar.a = 0L;
        if (zD) {
            kujVar.b();
        }
    }
}
