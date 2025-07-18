package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfj implements gfi, gfl {
    private final geu a;
    private final rqs b;
    private final ggg c;
    private String d;
    private ahrs e;
    private int f;
    private int g;

    public gfj(geu geuVar, rqs rqsVar, ggg gggVar) {
        geuVar.getClass();
        gggVar.getClass();
        this.a = geuVar;
        this.b = rqsVar;
        this.c = gggVar;
        this.f = 4;
        this.g = 2;
    }

    @Override // defpackage.gfi
    public final gfl a(String str) {
        str.getClass();
        this.d = str;
        this.f = 4;
        return this;
    }

    @Override // defpackage.gfi
    public final gfl b() {
        this.g = 5;
        this.f = 5;
        return this;
    }

    @Override // defpackage.gfl
    public final void c() {
        this.a.b(this.c, this.b, this.f, this.g, this.d, this.e);
    }

    @Override // defpackage.gfl
    public final void d(abqb abqbVar) {
        abqbVar.getClass();
        rqs rqsVar = this.b;
        rqsVar.b(abqbVar);
        this.a.b(this.c, rqsVar, this.f, this.g, this.d, this.e);
    }

    @Override // defpackage.gfl
    public final void e(int i) {
        rqs rqsVar = this.b;
        rqsVar.a(ggj.a(i), "katniss_status_code");
        this.a.b(this.c, rqsVar, this.f, this.g, this.d, this.e);
    }

    @Override // defpackage.gfl
    public final void f(Duration duration) {
        if (duration != null) {
            ((rqt) this.b).c = yqt.i(duration);
        }
    }

    @Override // defpackage.gfl
    public final void g(ahrs ahrsVar) {
        ahrsVar.getClass();
        this.e = ahrsVar;
    }

    @Override // defpackage.gfl
    public final void h(String str) {
        str.getClass();
        ((rqt) this.b).h(str);
    }

    @Override // defpackage.gfl
    public final void i(String str) {
        if (str != null) {
            ((rqt) this.b).i("APP_FLOW_TAG_FLOW_REQUEST_ID", str);
        }
    }
}
