package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfe implements gfd, gfg {
    private final geu a;
    private String b;
    private ahrs c;
    private final rqw d;
    private int e;
    private int f;

    public gfe(geu geuVar, rqw rqwVar) {
        geuVar.getClass();
        this.a = geuVar;
        this.d = rqwVar;
        this.e = 4;
        this.f = 2;
    }

    @Override // defpackage.gfd
    public final gfg a(String str) {
        str.getClass();
        this.b = str;
        this.e = 4;
        return this;
    }

    @Override // defpackage.gfd
    public final gfg b() {
        this.f = 5;
        this.e = 5;
        return this;
    }

    @Override // defpackage.gfg
    public final void c(abqb abqbVar) {
        abqbVar.getClass();
        this.a.b(ggg.EVENT_TYPE_END, this.d.b(abqbVar), this.e, this.f, this.b, this.c);
    }

    @Override // defpackage.gfg
    public final void d(int i) {
        this.a.b(ggg.EVENT_TYPE_END, this.d.a(ggj.a(i), "katniss_status_code"), this.e, this.f, this.b, this.c);
    }

    @Override // defpackage.gfg
    public final void e(Duration duration) {
        this.d.f(duration);
    }

    @Override // defpackage.gfg
    public final void f(ahrs ahrsVar) {
        ahrsVar.getClass();
        this.c = ahrsVar;
    }

    @Override // defpackage.gfg
    public final void g(String str) {
        str.getClass();
        ((rqt) this.d.a).h(str);
    }

    @Override // defpackage.gfg
    public final void h(String str) {
        if (str != null) {
            ((rqt) this.d.a).i("APP_FLOW_TAG_FLOW_REQUEST_ID", str);
        }
    }
}
