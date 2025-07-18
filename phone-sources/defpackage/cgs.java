package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgs implements cfu {
    public final clo a;
    public final long b;
    public final cji c;
    public final cje d;
    public final cjf e;
    public final ciy f;
    public final String g;
    public final long h;
    public final cld i;
    public final clp j;
    public final ckq k;
    public final long l;
    public final cll m;
    public final bok n;
    public final cgq o;
    public final brx p;

    public cgs(clo cloVar, long j, cji cjiVar, cje cjeVar, cjf cjfVar, ciy ciyVar, String str, long j2, cld cldVar, clp clpVar, ckq ckqVar, long j3, cll cllVar, bok bokVar, brx brxVar) {
        this.a = cloVar;
        this.b = j;
        this.c = cjiVar;
        this.d = cjeVar;
        this.e = cjfVar;
        this.f = ciyVar;
        this.g = str;
        this.h = j2;
        this.i = cldVar;
        this.j = clpVar;
        this.k = ckqVar;
        this.l = j3;
        this.m = cllVar;
        this.n = bokVar;
        this.o = null;
        this.p = brxVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final cgs c(cgs cgsVar) {
        if (cgsVar == null) {
            return this;
        }
        clo cloVar = cgsVar.a;
        long jB = cloVar.b();
        cloVar.e();
        cloVar.a();
        return cgt.a(this, jB, cgsVar.b, cgsVar.c, cgsVar.d, cgsVar.e, cgsVar.f, cgsVar.g, cgsVar.h, cgsVar.i, cgsVar.j, cgsVar.k, cgsVar.l, cgsVar.m, cgsVar.n, cgsVar.p);
    }

    public final boolean d(cgs cgsVar) {
        if (this == cgsVar) {
            return true;
        }
        long j = this.b;
        long j2 = cgsVar.b;
        long j3 = cmk.a;
        if (!a.s(j, j2) || !yks.e(this.c, cgsVar.c) || !yks.e(this.d, cgsVar.d) || !yks.e(this.e, cgsVar.e) || !yks.e(this.f, cgsVar.f) || !yks.e(this.g, cgsVar.g) || !a.s(this.h, cgsVar.h) || !yks.e(this.i, cgsVar.i) || !yks.e(this.j, cgsVar.j) || !yks.e(this.k, cgsVar.k)) {
            return false;
        }
        long j4 = this.l;
        long j5 = cgsVar.l;
        long j6 = bnq.a;
        if (!a.s(j4, j5)) {
            return false;
        }
        cgq cgqVar = cgsVar.o;
        return yks.e(null, null);
    }

    public final boolean e(cgs cgsVar) {
        return yks.e(this.a, cgsVar.a) && yks.e(this.m, cgsVar.m) && yks.e(this.n, cgsVar.n) && yks.e(this.p, cgsVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgs)) {
            return false;
        }
        cgs cgsVar = (cgs) obj;
        return d(cgsVar) && e(cgsVar);
    }

    public final void f() {
        this.a.e();
    }

    public final int hashCode() {
        long jB = b();
        long j = bnq.a;
        int iK = a.k(jB);
        f();
        int iFloatToIntBits = (iK * 961) + Float.floatToIntBits(a());
        long j2 = cmk.a;
        cji cjiVar = this.c;
        int i = cjiVar != null ? cjiVar.h : 0;
        long j3 = this.b;
        int i2 = iFloatToIntBits * 31;
        cje cjeVar = this.d;
        int iK2 = (((((((i2 + a.k(j3)) * 31) + i) * 31) + (cjeVar != null ? cjeVar.a : 0)) * 31) + (this.e != null ? 65535 : 0)) * 31;
        ciy ciyVar = this.f;
        int iHashCode = (iK2 + (ciyVar != null ? ciyVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + a.k(this.h)) * 31) + (this.i != null ? Float.floatToIntBits(0.0f) : 0)) * 31;
        clp clpVar = this.j;
        int iHashCode3 = (iHashCode2 + (clpVar != null ? clpVar.hashCode() : 0)) * 31;
        ckq ckqVar = this.k;
        int iHashCode4 = (((iHashCode3 + (ckqVar != null ? ckqVar.hashCode() : 0)) * 31) + a.k(this.l)) * 31;
        cll cllVar = this.m;
        int i3 = (iHashCode4 + (cllVar != null ? cllVar.d : 0)) * 31;
        bok bokVar = this.n;
        int iHashCode5 = (i3 + (bokVar != null ? bokVar.hashCode() : 0)) * 961;
        brx brxVar = this.p;
        return iHashCode5 + (brxVar != null ? brxVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) bnq.g(b()));
        sb.append(", brush=null, alpha=");
        f();
        sb.append(a());
        sb.append(", fontSize=");
        sb.append((Object) cmk.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) cmk.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append((Object) bnq.g(this.l));
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ cgs(long j, cji cjiVar, cje cjeVar, cjf cjfVar, ciy ciyVar, long j2, cld cldVar, long j3, cll cllVar, int i) {
        this((i & 1) != 0 ? bnq.g : j, (i & 2) != 0 ? cmk.a : 0L, (i & 4) != 0 ? null : cjiVar, (i & 8) != 0 ? null : cjeVar, (i & 16) != 0 ? null : cjfVar, (i & 32) != 0 ? null : ciyVar, (i & 128) != 0 ? cmk.a : j2, (i & 256) != 0 ? null : cldVar, (i & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? bnq.g : j3, (i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : cllVar);
    }

    public /* synthetic */ cgs(long j, long j2, cji cjiVar, cje cjeVar, cjf cjfVar, ciy ciyVar, long j3, cld cldVar, long j4, cll cllVar) {
        this(clw.r(j), j2, cjiVar, cjeVar, cjfVar, ciyVar, null, j3, cldVar, null, null, j4, cllVar, null, null);
    }
}
