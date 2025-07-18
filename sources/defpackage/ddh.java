package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddh extends czr {
    public static final czv a;
    public static final czv b;
    public static final czv c;
    public static final czv d;
    public static final czv e;
    public static final czv f;
    public static final czv g;
    public static final czv h;
    public static final czv i;
    public static final czv j;
    public static final czv k;
    public static final czv l;
    public static final czv m;
    public static final czv n;
    public static final czv o;
    public static final czv p;
    public static final czv q;
    public czv r;
    public boolean s;
    public czx t;

    static {
        new czv("2.5.29.9").i();
        new czv("2.5.29.14").i();
        a = new czv("2.5.29.15").i();
        new czv("2.5.29.16").i();
        b = new czv("2.5.29.17").i();
        c = new czv("2.5.29.18").i();
        d = new czv("2.5.29.19").i();
        e = new czv("2.5.29.20").i();
        f = new czv("2.5.29.21").i();
        new czv("2.5.29.23").i();
        new czv("2.5.29.24").i();
        g = new czv("2.5.29.27").i();
        h = new czv("2.5.29.28").i();
        i = new czv("2.5.29.29").i();
        j = new czv("2.5.29.30").i();
        k = new czv("2.5.29.31").i();
        l = new czv("2.5.29.32").i();
        m = new czv("2.5.29.33").i();
        new czv("2.5.29.35").i();
        n = new czv("2.5.29.36").i();
        o = new czv("2.5.29.37").i();
        p = new czv("2.5.29.46").i();
        q = new czv("2.5.29.54").i();
        new czv("1.3.6.1.5.5.7.1.1").i();
        new czv("1.3.6.1.5.5.7.1.11").i();
        new czv("1.3.6.1.5.5.7.1.12").i();
        new czv("1.3.6.1.5.5.7.1.2").i();
        new czv("1.3.6.1.5.5.7.1.3").i();
        new czv("1.3.6.1.5.5.7.1.4").i();
        new czv("2.5.29.56").i();
        new czv("2.5.29.55").i();
        new czv("2.5.29.60").i();
        new czv("2.5.29.72").i();
        new czv("2.5.29.73").i();
        new czv("2.5.29.74").i();
        new czv("2.16.840.1.114027.80.6.1");
    }

    public ddh(dag dagVar) {
        if (dagVar.b() == 2) {
            this.r = czv.h(dagVar.h(0));
            this.s = false;
            this.t = czx.f(dagVar.h(1));
        } else if (dagVar.b() == 3) {
            this.r = czv.h(dagVar.h(0));
            this.s = cyz.f(dagVar.h(1)).h();
            this.t = czx.f(dagVar.h(2));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + dagVar.b());
        }
    }

    public static dab a(ddh ddhVar) {
        try {
            return dab.v(ddhVar.t.b);
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't convert extension: ".concat(e2.toString()));
        }
    }

    @Override // defpackage.czr
    public final boolean equals(Object obj) {
        if (!(obj instanceof ddh)) {
            return false;
        }
        ddh ddhVar = (ddh) obj;
        return ddhVar.r.w(this.r) && ddhVar.t.w(this.t) && ddhVar.s == this.s;
    }

    @Override // defpackage.czr
    public final int hashCode() {
        return this.s ? this.t.hashCode() ^ this.r.hashCode() : ~(this.t.hashCode() ^ this.r.hashCode());
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(3);
        czcVar.b(this.r);
        if (this.s) {
            czcVar.b(cyz.g(true));
        }
        czcVar.b(this.t);
        return new dbk(czcVar);
    }
}
