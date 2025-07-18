package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class kpv implements khh {
    final /* synthetic */ kpw a;

    public kpv(kpw kpwVar) {
        this.a = kpwVar;
    }

    @Override // defpackage.khh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        khg khgVar;
        kpt kptVar = this.a.a;
        synchronized (kptVar) {
            ((kpo) kptVar).b = false;
            khgVar = ((kpo) kptVar).a.b;
        }
        if (khgVar != null) {
            ((kpo) kptVar).c.i(khgVar, 2441);
        }
    }
}
