package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmo extends zix {
    public static final zjb a;
    public static final zjb b;
    public static final zjb c;
    public static final zjb d;
    public static final zjb e;
    public static final zjb f;
    public static final zjb g;
    public static final zjb h;
    public static final zjb i;
    public static final zjb j;
    public static final zjb k;
    public static final zjb l;
    public static final zjb m;
    public static final zjb n;
    public static final zjb o;
    public static final zjb p;
    public static final zjb q;
    public zjb r;
    public boolean s;
    public zjd t;

    static {
        new zjb("2.5.29.9").i();
        new zjb("2.5.29.14").i();
        a = new zjb("2.5.29.15").i();
        new zjb("2.5.29.16").i();
        b = new zjb("2.5.29.17").i();
        c = new zjb("2.5.29.18").i();
        d = new zjb("2.5.29.19").i();
        e = new zjb("2.5.29.20").i();
        f = new zjb("2.5.29.21").i();
        new zjb("2.5.29.23").i();
        new zjb("2.5.29.24").i();
        g = new zjb("2.5.29.27").i();
        h = new zjb("2.5.29.28").i();
        i = new zjb("2.5.29.29").i();
        j = new zjb("2.5.29.30").i();
        k = new zjb("2.5.29.31").i();
        l = new zjb("2.5.29.32").i();
        m = new zjb("2.5.29.33").i();
        new zjb("2.5.29.35").i();
        n = new zjb("2.5.29.36").i();
        o = new zjb("2.5.29.37").i();
        p = new zjb("2.5.29.46").i();
        q = new zjb("2.5.29.54").i();
        new zjb("1.3.6.1.5.5.7.1.1").i();
        new zjb("1.3.6.1.5.5.7.1.11").i();
        new zjb("1.3.6.1.5.5.7.1.12").i();
        new zjb("1.3.6.1.5.5.7.1.2").i();
        new zjb("1.3.6.1.5.5.7.1.3").i();
        new zjb("1.3.6.1.5.5.7.1.4").i();
        new zjb("2.5.29.56").i();
        new zjb("2.5.29.55").i();
        new zjb("2.5.29.60").i();
        new zjb("2.5.29.72").i();
        new zjb("2.5.29.73").i();
        new zjb("2.5.29.74").i();
        new zjb("2.16.840.1.114027.80.6.1");
    }

    public zmo(zjm zjmVar) {
        if (zjmVar.b() == 2) {
            this.r = zjb.h(zjmVar.h(0));
            this.s = false;
            this.t = zjd.f(zjmVar.h(1));
        } else if (zjmVar.b() == 3) {
            this.r = zjb.h(zjmVar.h(0));
            this.s = zif.f(zjmVar.h(1)).h();
            this.t = zjd.f(zjmVar.h(2));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + zjmVar.b());
        }
    }

    public static zjh a(zmo zmoVar) {
        try {
            return zjh.v(zmoVar.t.b);
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't convert extension: ".concat(e2.toString()));
        }
    }

    @Override // defpackage.zix
    public final boolean equals(Object obj) {
        if (!(obj instanceof zmo)) {
            return false;
        }
        zmo zmoVar = (zmo) obj;
        return zmoVar.r.w(this.r) && zmoVar.t.w(this.t) && zmoVar.s == this.s;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return this.s ? this.t.hashCode() ^ this.r.hashCode() : ~(this.t.hashCode() ^ this.r.hashCode());
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(3);
        ziiVar.b(this.r);
        if (this.s) {
            ziiVar.b(zif.g(true));
        }
        ziiVar.b(this.t);
        return new zkq(ziiVar);
    }
}
