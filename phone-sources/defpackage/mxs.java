package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxs {
    public final tst a;
    public final tst b;
    public final tst c;
    public final boolean d;
    public final boolean e;
    public final tst f;
    public final boolean g;
    public final tst h;
    public final tst i;
    public final tst j;
    public final kuo k;
    public final int l;
    public final boolean m;
    public final lio n;
    public final tst o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    private final boolean s;
    private final boolean t;

    public mxs() {
        throw null;
    }

    public static mxr a() {
        mxr mxrVar = new mxr(null);
        trk trkVar = trk.a;
        mxrVar.a = trkVar;
        mxrVar.b = trkVar;
        mxrVar.d(0);
        mxrVar.c = trkVar;
        mxrVar.f(false);
        mxrVar.e(false);
        mxrVar.d = trkVar;
        mxrVar.l(true);
        mxrVar.k(false);
        mxrVar.j(false);
        mxrVar.e = trkVar;
        mxrVar.f = trkVar;
        mxrVar.g(false);
        mxrVar.h(false);
        mxrVar.b(lic.a);
        mxrVar.g = trkVar;
        mxrVar.m(false);
        mxrVar.i(false);
        mxrVar.h = trkVar;
        return mxrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxs) {
            mxs mxsVar = (mxs) obj;
            if (this.a.equals(mxsVar.a) && this.b.equals(mxsVar.b) && this.c.equals(mxsVar.c) && this.d == mxsVar.d && this.e == mxsVar.e && this.f.equals(mxsVar.f) && this.g == mxsVar.g && this.h.equals(mxsVar.h) && this.i.equals(mxsVar.i) && this.j.equals(mxsVar.j) && this.k.equals(mxsVar.k) && this.l == mxsVar.l && this.m == mxsVar.m && this.s == mxsVar.s && this.t == mxsVar.t && this.n.equals(mxsVar.n) && this.o.equals(mxsVar.o) && this.p == mxsVar.p && this.q == mxsVar.q && this.r == mxsVar.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ (true != this.t ? 1237 : 1231)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ (true == this.r ? 1231 : 1237);
    }

    public final String toString() {
        tst tstVar = this.o;
        lio lioVar = this.n;
        kuo kuoVar = this.k;
        tst tstVar2 = this.j;
        tst tstVar3 = this.i;
        tst tstVar4 = this.h;
        tst tstVar5 = this.f;
        tst tstVar6 = this.c;
        tst tstVar7 = this.b;
        return "EpisodeViewModel{progressBarResumeTime=" + String.valueOf(this.a) + ", episodeStatusMessage=" + String.valueOf(tstVar7) + ", watchAction=" + String.valueOf(tstVar6) + ", isExpanded=" + this.d + ", isDimmed=" + this.e + ", downloadStatus=" + String.valueOf(tstVar5) + ", showFamilyLibrary=" + this.g + ", entitledMarkDrawableResId=" + String.valueOf(tstVar4) + ", annotation=" + String.valueOf(tstVar3) + ", purchaseOption=" + String.valueOf(tstVar2) + ", episode=" + String.valueOf(kuoVar) + ", index=" + this.l + ", showThumbnail=" + this.m + ", isFreeOrEntitled=" + this.s + ", isFreeTabEnabled=" + this.t + ", elementNode=" + String.valueOf(lioVar) + ", interactionLogger=" + String.valueOf(tstVar) + ", showDebugInfo=" + this.p + ", synopsisAlwaysExpanded=" + this.q + ", isGtvApplication=" + this.r + "}";
    }

    public mxs(tst tstVar, tst tstVar2, tst tstVar3, boolean z, boolean z2, tst tstVar4, boolean z3, tst tstVar5, tst tstVar6, tst tstVar7, kuo kuoVar, int i, boolean z4, boolean z5, boolean z6, lio lioVar, tst tstVar8, boolean z7, boolean z8, boolean z9) {
        this.a = tstVar;
        this.b = tstVar2;
        this.c = tstVar3;
        this.d = z;
        this.e = z2;
        this.f = tstVar4;
        this.g = z3;
        this.h = tstVar5;
        this.i = tstVar6;
        this.j = tstVar7;
        this.k = kuoVar;
        this.l = i;
        this.m = z4;
        this.s = z5;
        this.t = z6;
        this.n = lioVar;
        this.o = tstVar8;
        this.p = z7;
        this.q = z8;
        this.r = z9;
    }
}
