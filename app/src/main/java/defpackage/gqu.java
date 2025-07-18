package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqu implements gqr {
    public final ahbt a;
    public final gri b;
    public final izr c;
    public ahdl d;
    public final Duration e;
    public String f;
    public final yrn g;
    public grk h;
    public final gyh i;

    public gqu(ahbt ahbtVar, gyh gyhVar, gph gphVar, gri griVar, izr izrVar, yrx yrxVar) {
        ahbtVar.getClass();
        griVar.getClass();
        this.a = ahbtVar;
        this.i = gyhVar;
        this.b = griVar;
        this.c = izrVar;
        Duration durationOfSeconds = gphVar == gph.a ? Duration.ofSeconds(15L) : Duration.ofSeconds(2L).plusMillis(500L);
        durationOfSeconds.getClass();
        this.e = durationOfSeconds;
        this.g = new yrn(yrxVar);
    }

    public final void a() {
        ahdl ahdlVar = this.d;
        if (ahdlVar != null) {
            ahdlVar.s(null);
        }
        this.d = null;
    }

    public final void b() {
        if (this.f != null) {
            Duration.ofNanos(this.g.b());
            String str = this.f;
            if (str != null) {
                gri griVar = this.b;
                if (!griVar.b) {
                    griVar.f();
                }
                griVar.c.p(griVar.a(str, griVar.c(str)));
            }
        } else {
            Duration.ofNanos(this.g.b());
            this.b.e();
        }
        this.c.b();
    }
}
