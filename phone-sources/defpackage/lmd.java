package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmd {
    public final ieg a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ImmutableList f;
    public final ImmutableList g;
    public final boolean h;
    public final tst i;
    public final int j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final ImmutableMap n;
    public final String o;

    public lmd() {
        throw null;
    }

    public static lmc a() {
        lmc lmcVar = new lmc(null);
        lmcVar.a = trk.a;
        lmcVar.e(0);
        lmcVar.f(0);
        lmcVar.k(ImmutableList.of());
        lmcVar.l(ImmutableList.of());
        lmcVar.c(false);
        lmcVar.d(ImmutableMap.of());
        lmcVar.n("");
        return lmcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lmd) {
            lmd lmdVar = (lmd) obj;
            if (this.a.equals(lmdVar.a) && this.b.equals(lmdVar.b) && this.c == lmdVar.c && this.d == lmdVar.d && this.e == lmdVar.e && this.f.equals(lmdVar.f) && this.g.equals(lmdVar.g) && this.h == lmdVar.h && this.i.equals(lmdVar.i) && this.j == lmdVar.j && this.k == lmdVar.k && this.l == lmdVar.l && this.m == lmdVar.m && this.n.equals(lmdVar.n) && this.o.equals(lmdVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true == this.m ? 1231 : 1237)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    public final String toString() {
        ImmutableMap immutableMap = this.n;
        tst tstVar = this.i;
        ImmutableList immutableList = this.g;
        ImmutableList immutableList2 = this.f;
        return "VideoInfo{account=" + String.valueOf(this.a) + ", videoId=" + this.b + ", episode=" + this.c + ", offline=" + this.d + ", rental=" + this.e + ", offlineStreams=" + String.valueOf(immutableList2) + ", onlineStreams=" + String.valueOf(immutableList) + ", encrypted=" + this.h + ", cencKeySetId=" + String.valueOf(tstVar) + ", cencSecurityLevel=" + this.j + ", downloadedPercentage=" + this.k + ", mainFeature=" + this.l + ", avod=" + this.m + ", avodData=" + String.valueOf(immutableMap) + ", sessionNonce=" + this.o + "}";
    }

    public lmd(ieg iegVar, String str, boolean z, boolean z2, boolean z3, ImmutableList immutableList, ImmutableList immutableList2, boolean z4, tst tstVar, int i, int i2, boolean z5, boolean z6, ImmutableMap immutableMap, String str2) {
        this.a = iegVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = immutableList;
        this.g = immutableList2;
        this.h = z4;
        this.i = tstVar;
        this.j = i;
        this.k = i2;
        this.l = z5;
        this.m = z6;
        this.n = immutableMap;
        this.o = str2;
    }
}
