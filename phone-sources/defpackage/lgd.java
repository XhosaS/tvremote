package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgd {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final ImmutableList o;

    public lgd() {
        throw null;
    }

    public static lgc a(int i, String str, String str2) {
        lgc lgcVar = new lgc();
        lgcVar.a = i;
        lgcVar.d = (byte) (lgcVar.d | 1);
        if (str == null) {
            throw new NullPointerException("Null assetId");
        }
        lgcVar.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null rootId");
        }
        lgcVar.c = str2;
        lgcVar.b("");
        lgcVar.m("");
        lgcVar.i("");
        lgcVar.j("");
        lgcVar.k("");
        lgcVar.l(-1);
        lgcVar.d(-1);
        lgcVar.g("");
        lgcVar.h(false);
        lgcVar.c(0);
        lgcVar.f(false);
        lgcVar.e(ImmutableList.of());
        return lgcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lgd) {
            lgd lgdVar = (lgd) obj;
            if (this.a == lgdVar.a && this.b.equals(lgdVar.b) && this.c.equals(lgdVar.c) && this.d.equals(lgdVar.d) && this.e.equals(lgdVar.e) && this.f.equals(lgdVar.f) && this.g.equals(lgdVar.g) && this.h.equals(lgdVar.h) && this.i == lgdVar.i && this.j == lgdVar.j && this.k.equals(lgdVar.k) && this.l == lgdVar.l && this.m == lgdVar.m && this.n == lgdVar.n && this.o.equals(lgdVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ this.m) * 1000003) ^ (true == this.n ? 1231 : 1237)) * 1000003) ^ this.o.hashCode();
    }

    public final String toString() {
        return "AssetValue{assetType=" + this.a + ", assetId=" + this.b + ", rootId=" + this.c + ", eidrId=" + this.d + ", title=" + this.e + ", posterUri=" + this.f + ", ratingId=" + this.g + ", ratingName=" + this.h + ", seasonSequenceNumber=" + this.i + ", episodeSequenceNumber=" + this.j + ", nextEpisodeId=" + this.k + ", nextEpisodeInSameSeason=" + this.l + ", endCreditStartSeconds=" + this.m + ", isBonusContent=" + this.n + ", inBundles=" + String.valueOf(this.o) + "}";
    }

    public lgd(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, String str8, boolean z, int i4, boolean z2, ImmutableList immutableList) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = i2;
        this.j = i3;
        this.k = str8;
        this.l = z;
        this.m = i4;
        this.n = z2;
        this.o = immutableList;
    }
}
