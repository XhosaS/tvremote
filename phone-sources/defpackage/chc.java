package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chc {
    public static final chc a = new chc(0, 0, null, 0, 0, 0, 0, 16777215);
    public final cgs b;
    public final cgm c;
    public final cgr d;

    public chc(cgs cgsVar, cgm cgmVar, cgr cgrVar) {
        this.b = cgsVar;
        this.c = cgmVar;
        this.d = cgrVar;
    }

    public static /* synthetic */ chc v(chc chcVar, long j, long j2, cji cjiVar, ciy ciyVar, String str, long j3, long j4, cgr cgrVar, clj cljVar, int i) {
        long jB = (i & 1) != 0 ? chcVar.b.b() : j;
        long j5 = (i & 2) != 0 ? chcVar.b.b : j2;
        cji cjiVar2 = (i & 4) != 0 ? chcVar.b.c : cjiVar;
        cje cjeVar = (i & 8) != 0 ? chcVar.b.d : null;
        cjf cjfVar = (i & 16) != 0 ? chcVar.b.e : null;
        ciy ciyVar2 = (i & 32) != 0 ? chcVar.b.f : ciyVar;
        String str2 = (i & 64) != 0 ? chcVar.b.g : str;
        long j6 = (i & 128) != 0 ? chcVar.b.h : j3;
        cld cldVar = (i & 256) != 0 ? chcVar.b.i : null;
        clp clpVar = (i & 512) != 0 ? chcVar.b.j : null;
        ckq ckqVar = (i & 1024) != 0 ? chcVar.b.k : null;
        long j7 = (i & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? chcVar.b.l : 0L;
        cll cllVar = (i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? chcVar.b.m : null;
        bok bokVar = (i & 8192) != 0 ? chcVar.b.n : null;
        brx brxVar = (i & 16384) != 0 ? chcVar.b.p : null;
        int i2 = (32768 & i) != 0 ? chcVar.c.a : 0;
        int i3 = (65536 & i) != 0 ? chcVar.c.b : 0;
        long j8 = (131072 & i) != 0 ? chcVar.c.c : j4;
        clq clqVar = (262144 & i) != 0 ? chcVar.c.d : null;
        cgr cgrVar2 = (524288 & i) != 0 ? chcVar.d : cgrVar;
        clj cljVar2 = (i & 1048576) != 0 ? chcVar.c.f : cljVar;
        cgm cgmVar = chcVar.c;
        int i4 = cgmVar.g;
        clj cljVar3 = cljVar2;
        int i5 = cgmVar.h;
        clr clrVar = cgmVar.i;
        cgr cgrVar3 = cgrVar2;
        cgs cgsVar = chcVar.b;
        int i6 = i2;
        long jB2 = cgsVar.b();
        long j9 = bnq.a;
        return new chc(new cgs(a.s(jB, jB2) ? cgsVar.a : clw.r(jB), j5, cjiVar2, cjeVar, cjfVar, ciyVar2, str2, j6, cldVar, clpVar, ckqVar, j7, cllVar, bokVar, brxVar), new cgm(i6, i3, j8, clqVar, cgrVar3 != null ? cgrVar3.b : null, cljVar3, i4, i5, clrVar), cgrVar3);
    }

    public static /* synthetic */ chc w(chc chcVar, long j, long j2, cji cjiVar, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? bnq.g : j;
        long j6 = (i2 & 2) != 0 ? cmk.a : j2;
        cji cjiVar2 = (i2 & 4) != 0 ? null : cjiVar;
        long j7 = (i2 & 128) != 0 ? cmk.a : j3;
        long j8 = (i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? bnq.g : 0L;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        int i4 = (65536 & i2) == 0 ? 0 : Integer.MIN_VALUE;
        long j9 = (i2 & 131072) != 0 ? cmk.a : j4;
        cgs cgsVar = chcVar.b;
        cgs cgsVarA = cgt.a(cgsVar, j5, j6, cjiVar2, null, null, null, null, j7, null, null, null, j8, null, null, null);
        cgm cgmVar = chcVar.c;
        cgm cgmVarA = cgn.a(cgmVar, i3, i4, j9, null, null, null, 0, Integer.MIN_VALUE, null);
        return (cgsVar == cgsVarA && cgmVar == cgmVarA) ? chcVar : new chc(cgsVarA, cgmVarA);
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chc)) {
            return false;
        }
        chc chcVar = (chc) obj;
        return yks.e(this.b, chcVar.b) && yks.e(this.c, chcVar.c) && yks.e(this.d, chcVar.d);
    }

    public final long f() {
        return this.b.b;
    }

    public final long g() {
        return this.b.h;
    }

    public final long h() {
        return this.c.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        cgr cgrVar = this.d;
        return (iHashCode * 31) + (cgrVar != null ? cgrVar.hashCode() : 0);
    }

    public final bok i() {
        return this.b.n;
    }

    public final chc j(chc chcVar) {
        if (chcVar == null || yks.e(chcVar, a)) {
            return this;
        }
        return new chc(this.b.c(chcVar.b), this.c.a(chcVar.c));
    }

    public final ciy k() {
        return this.b.f;
    }

    public final cje l() {
        return this.b.d;
    }

    public final cjf m() {
        return this.b.e;
    }

    public final cji n() {
        return this.b.c;
    }

    public final ckq o() {
        return this.b.k;
    }

    public final clj p() {
        return this.c.f;
    }

    public final cll q() {
        return this.b.m;
    }

    public final clq r() {
        return this.c.d;
    }

    public final clr s() {
        return this.c.i;
    }

    public final boolean t(chc chcVar) {
        return this == chcVar || this.b.e(chcVar.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) bnq.g(e()));
        sb.append(", brush=null, alpha=");
        x();
        sb.append(a());
        sb.append(", fontSize=");
        sb.append((Object) cmk.d(f()));
        sb.append(", fontWeight=");
        sb.append(n());
        sb.append(", fontStyle=");
        sb.append(l());
        sb.append(", fontSynthesis=");
        sb.append(m());
        sb.append(", fontFamily=");
        sb.append(k());
        sb.append(", fontFeatureSettings=");
        cgs cgsVar = this.b;
        sb.append(cgsVar.g);
        sb.append(", letterSpacing=");
        sb.append((Object) cmk.d(g()));
        sb.append(", baselineShift=");
        sb.append(cgsVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(cgsVar.j);
        sb.append(", localeList=");
        sb.append(o());
        sb.append(", background=");
        sb.append((Object) bnq.g(cgsVar.l));
        sb.append(", textDecoration=");
        sb.append(q());
        sb.append(", shadow=");
        sb.append(i());
        sb.append(", drawStyle=");
        sb.append(y());
        sb.append(", textAlign=");
        sb.append((Object) clk.a(c()));
        sb.append(", textDirection=");
        sb.append((Object) clm.a(d()));
        sb.append(", lineHeight=");
        sb.append((Object) cmk.d(h()));
        sb.append(", textIndent=");
        sb.append(r());
        sb.append(", platformStyle=");
        sb.append(this.d);
        sb.append(", lineHeightStyle=");
        sb.append(p());
        sb.append(", lineBreak=");
        sb.append((Object) clh.a(b()));
        sb.append(", hyphens=");
        sb.append((Object) clg.a(this.c.h));
        sb.append(", textMotion=");
        sb.append(s());
        sb.append(')');
        return sb.toString();
    }

    public final boolean u(chc chcVar) {
        if (this != chcVar) {
            return yks.e(this.c, chcVar.c) && this.b.d(chcVar.b);
        }
        return true;
    }

    public final void x() {
        this.b.f();
    }

    public final brx y() {
        return this.b.p;
    }

    public /* synthetic */ chc(long j, long j2, cji cjiVar, long j3, int i, int i2, long j4, int i3) {
        this(new cgs((i3 & 1) != 0 ? bnq.g : j, (i3 & 2) != 0 ? cmk.a : j2, (i3 & 4) != 0 ? null : cjiVar, (cje) null, (cjf) null, (ciy) null, (i3 & 128) != 0 ? cmk.a : j3, (cld) null, (i3 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? bnq.g : 0L, (cll) null), new cgm((32768 & i3) != 0 ? Integer.MIN_VALUE : i, (65536 & i3) != 0 ? Integer.MIN_VALUE : i2, (i3 & 131072) != 0 ? cmk.a : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public chc(cgs cgsVar, cgm cgmVar) {
        cgp cgpVar = cgmVar.e;
        this(cgsVar, cgmVar, cgpVar == null ? null : new cgr(cgpVar));
    }
}
