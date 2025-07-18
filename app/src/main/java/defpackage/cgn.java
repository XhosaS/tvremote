package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class cgn implements Runnable {
    final /* synthetic */ cld a;
    final /* synthetic */ cgo b;

    public cgn(cgo cgoVar, cld cldVar) {
        this.b = cgoVar;
        this.a = cldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cld cldVar = this.a;
        cbx.c().a(cgo.a, "Scheduling work ".concat(cldVar.c));
        this.b.b.c(cldVar);
    }
}
