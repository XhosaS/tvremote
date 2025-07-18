package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ddu implements dav {
    final /* synthetic */ dhd a;
    final /* synthetic */ ddv b;

    public ddu(ddv ddvVar, dhd dhdVar) {
        this.a = dhdVar;
        this.b = ddvVar;
    }

    @Override // defpackage.dav
    public final void b(Object obj) {
        ddv ddvVar = this.b;
        dhd dhdVar = this.a;
        if (ddvVar.f(dhdVar)) {
            dcr dcrVar = ddvVar.a.o;
            if (obj != null && dcrVar.c(dhdVar.c.g())) {
                ddvVar.c = obj;
                ddvVar.b.b();
            } else {
                dcd dcdVar = ddvVar.b;
                daj dajVar = dhdVar.a;
                daw dawVar = dhdVar.c;
                dcdVar.e(dajVar, obj, dawVar, dawVar.g(), ddvVar.d);
            }
        }
    }

    @Override // defpackage.dav
    public final void e(Exception exc) {
        ddv ddvVar = this.b;
        dhd dhdVar = this.a;
        if (ddvVar.f(dhdVar)) {
            dcb dcbVar = ddvVar.d;
            daw dawVar = dhdVar.c;
            ddvVar.b.d(dcbVar, exc, dawVar, dawVar.g());
        }
    }
}
