package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ksm extends kvf {
    public final lcu A;
    public final String B;
    public final String C;
    public final ImmutableList D;
    public final ImmutableList E;
    public final ImmutableList F;
    public final ImmutableList G;
    public final ImmutableList H;
    public final ImmutableList I;
    public final ieg J;
    public final ImmutableList K;
    public final ImmutableList L;
    public final ieg M;
    public final boolean N;
    public final ieg O;
    public final ieg P;
    public final ieg a;
    public final String b;
    public final String c;
    public final ksy d;
    public final String e;
    public final ieg f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final Uri r;
    public final Uri s;
    public final String t;
    public final int u;
    public final float v;
    public final long w;
    public final int x;
    public final ImmutableList y;
    public final float z;

    public ksm(ieg iegVar, String str, String str2, ksy ksyVar, String str3, ieg iegVar2, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, Uri uri, Uri uri2, String str5, int i2, float f, long j, int i3, ImmutableList immutableList, float f2, lcu lcuVar, String str6, String str7, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, ImmutableList immutableList6, ImmutableList immutableList7, ieg iegVar3, ImmutableList immutableList8, ImmutableList immutableList9, ieg iegVar4, boolean z10, ieg iegVar5, ieg iegVar6) {
        if (iegVar == null) {
            throw new NullPointerException("Null entitlementAnnotation");
        }
        this.a = iegVar;
        if (str == null) {
            throw new NullPointerException("Null ratingId");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null contentRating");
        }
        this.c = str2;
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.d = ksyVar;
        if (str3 == null) {
            throw new NullPointerException("Null title");
        }
        this.e = str3;
        if (iegVar2 == null) {
            throw new NullPointerException("Null offersResult");
        }
        this.f = iegVar2;
        if (str4 == null) {
            throw new NullPointerException("Null eidrId");
        }
        this.g = str4;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.q = i;
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.r = uri;
        if (uri2 == null) {
            throw new NullPointerException("Null screenshotUrl");
        }
        this.s = uri2;
        if (str5 == null) {
            throw new NullPointerException("Null description");
        }
        this.t = str5;
        this.u = i2;
        this.v = f;
        this.w = j;
        this.x = i3;
        if (immutableList == null) {
            throw new NullPointerException("Null trailers");
        }
        this.y = immutableList;
        this.z = f2;
        if (lcuVar == null) {
            throw new NullPointerException("Null tomatometerRating");
        }
        this.A = lcuVar;
        if (str6 == null) {
            throw new NullPointerException("Null tomatometerRatingSourceUrl");
        }
        this.B = str6;
        if (str7 == null) {
            throw new NullPointerException("Null primaryCategoryId");
        }
        this.C = str7;
        if (immutableList2 == null) {
            throw new NullPointerException("Null directors");
        }
        this.D = immutableList2;
        if (immutableList3 == null) {
            throw new NullPointerException("Null writers");
        }
        this.E = immutableList3;
        if (immutableList4 == null) {
            throw new NullPointerException("Null actors");
        }
        this.F = immutableList4;
        if (immutableList5 == null) {
            throw new NullPointerException("Null producers");
        }
        this.G = immutableList5;
        if (immutableList6 == null) {
            throw new NullPointerException("Null bundleIds");
        }
        this.H = immutableList6;
        if (immutableList7 == null) {
            throw new NullPointerException("Null bonusItems");
        }
        this.I = immutableList7;
        if (iegVar3 == null) {
            throw new NullPointerException("Null annotation");
        }
        this.J = iegVar3;
        if (immutableList8 == null) {
            throw new NullPointerException("Null audioTracks");
        }
        this.K = immutableList8;
        if (immutableList9 == null) {
            throw new NullPointerException("Null captionTracks");
        }
        this.L = immutableList9;
        if (iegVar4 == null) {
            throw new NullPointerException("Null seller");
        }
        this.M = iegVar4;
        this.N = z10;
        if (iegVar5 == null) {
            throw new NullPointerException("Null watchActionsResult");
        }
        this.O = iegVar5;
        if (iegVar6 == null) {
            throw new NullPointerException("Null assetRestrictionListResult");
        }
        this.P = iegVar6;
    }

    @Override // defpackage.kvf
    public final String A() {
        return this.t;
    }

    @Override // defpackage.kvf
    public final String B() {
        return this.g;
    }

    @Override // defpackage.kvf
    public final String C() {
        return this.C;
    }

    @Override // defpackage.kwf
    public final String D() {
        return this.b;
    }

    @Override // defpackage.kwz
    public final String E() {
        return this.e;
    }

    @Override // defpackage.kvf
    public final String F() {
        return this.B;
    }

    @Override // defpackage.kvf, defpackage.kxc
    public final /* synthetic */ List G() {
        return this.y;
    }

    @Override // defpackage.kvf
    public final boolean H() {
        return this.k;
    }

    @Override // defpackage.kvf
    public final boolean I() {
        return this.h;
    }

    @Override // defpackage.kvf
    public final boolean J() {
        return this.m;
    }

    @Override // defpackage.kvf
    public final boolean K() {
        return this.n;
    }

    @Override // defpackage.kvf
    public final boolean L() {
        return this.l;
    }

    @Override // defpackage.kvf
    public final boolean M() {
        return this.j;
    }

    @Override // defpackage.kvf
    public final boolean N() {
        return this.o;
    }

    @Override // defpackage.kvf
    public final boolean O() {
        return this.i;
    }

    @Override // defpackage.kvf
    public final boolean P() {
        return this.N;
    }

    @Override // defpackage.kvf
    public final boolean Q() {
        return this.p;
    }

    @Override // defpackage.kvf, defpackage.kxa
    public final float a() {
        return this.z;
    }

    @Override // defpackage.kvf, defpackage.kws
    public final float b() {
        return this.v;
    }

    @Override // defpackage.kvf
    public final int c() {
        return this.x;
    }

    @Override // defpackage.kvf
    public final int d() {
        return this.q;
    }

    @Override // defpackage.kvf
    public final int e() {
        return this.u;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvf) {
            kvf kvfVar = (kvf) obj;
            if (this.a.equals(kvfVar.k()) && this.b.equals(kvfVar.D()) && this.c.equals(kvfVar.z()) && this.d.equals(kvfVar.o()) && this.e.equals(kvfVar.E()) && this.f.equals(kvfVar.l()) && this.g.equals(kvfVar.B()) && this.h == kvfVar.I() && this.i == kvfVar.O() && this.j == kvfVar.M() && this.k == kvfVar.H() && this.l == kvfVar.L() && this.m == kvfVar.J() && this.n == kvfVar.K() && this.o == kvfVar.N() && this.p == kvfVar.Q() && this.q == kvfVar.d() && this.r.equals(kvfVar.g()) && this.s.equals(kvfVar.h()) && this.t.equals(kvfVar.A()) && this.u == kvfVar.e() && Float.floatToIntBits(this.v) == Float.floatToIntBits(kvfVar.b()) && this.w == kvfVar.f() && this.x == kvfVar.c() && this.y.equals(kvfVar.x()) && Float.floatToIntBits(this.z) == Float.floatToIntBits(kvfVar.a()) && this.A.equals(kvfVar.p()) && this.B.equals(kvfVar.F()) && this.C.equals(kvfVar.C()) && this.D.equals(kvfVar.v()) && this.E.equals(kvfVar.y()) && this.F.equals(kvfVar.q()) && this.G.equals(kvfVar.w()) && this.H.equals(kvfVar.t()) && this.I.equals(kvfVar.s()) && this.J.equals(kvfVar.i()) && this.K.equals(kvfVar.r()) && this.L.equals(kvfVar.u()) && this.M.equals(kvfVar.m()) && this.N == kvfVar.P() && this.O.equals(kvfVar.n()) && this.P.equals(kvfVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kvf
    public final long f() {
        return this.w;
    }

    @Override // defpackage.kvf, defpackage.kvy
    public final Uri g() {
        return this.r;
    }

    @Override // defpackage.kvf, defpackage.kwj
    public final Uri h() {
        return this.s;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ this.q) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u) * 1000003) ^ Float.floatToIntBits(this.v);
        ImmutableList immutableList = this.y;
        long j = this.w;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.x) * 1000003) ^ immutableList.hashCode()) * 1000003) ^ Float.floatToIntBits(this.z)) * 1000003) ^ this.A.hashCode()) * 1000003) ^ this.B.hashCode()) * 1000003) ^ this.C.hashCode()) * 1000003) ^ this.D.hashCode()) * 1000003) ^ this.E.hashCode()) * 1000003) ^ this.F.hashCode()) * 1000003) ^ this.G.hashCode()) * 1000003) ^ this.H.hashCode()) * 1000003) ^ this.I.hashCode()) * 1000003) ^ this.J.hashCode()) * 1000003) ^ this.K.hashCode()) * 1000003) ^ this.L.hashCode()) * 1000003) ^ this.M.hashCode()) * 1000003) ^ (true == this.N ? 1231 : 1237)) * 1000003) ^ this.O.hashCode()) * 1000003) ^ this.P.hashCode();
    }

    @Override // defpackage.kvf
    public final ieg i() {
        return this.J;
    }

    @Override // defpackage.kvf, defpackage.kwi
    public final ieg j() {
        return this.P;
    }

    @Override // defpackage.kss
    public final ieg k() {
        return this.a;
    }

    @Override // defpackage.kvz
    public final ieg l() {
        return this.f;
    }

    @Override // defpackage.kvf
    public final ieg m() {
        return this.M;
    }

    @Override // defpackage.kvf
    public final ieg n() {
        return this.O;
    }

    @Override // defpackage.kst
    public final ksy o() {
        return this.d;
    }

    @Override // defpackage.kvf, defpackage.kxa
    public final lcu p() {
        return this.A;
    }

    @Override // defpackage.kvf
    public final ImmutableList q() {
        return this.F;
    }

    @Override // defpackage.kvf
    public final ImmutableList r() {
        return this.K;
    }

    @Override // defpackage.kvf
    public final ImmutableList s() {
        return this.I;
    }

    @Override // defpackage.kvf
    public final ImmutableList t() {
        return this.H;
    }

    public final String toString() {
        ieg iegVar = this.P;
        ieg iegVar2 = this.O;
        ieg iegVar3 = this.M;
        ImmutableList immutableList = this.L;
        ImmutableList immutableList2 = this.K;
        ieg iegVar4 = this.J;
        ImmutableList immutableList3 = this.I;
        ImmutableList immutableList4 = this.H;
        ImmutableList immutableList5 = this.G;
        ImmutableList immutableList6 = this.F;
        ImmutableList immutableList7 = this.E;
        ImmutableList immutableList8 = this.D;
        lcu lcuVar = this.A;
        ImmutableList immutableList9 = this.y;
        Uri uri = this.s;
        Uri uri2 = this.r;
        ieg iegVar5 = this.f;
        ksy ksyVar = this.d;
        String string = this.a.toString();
        String string2 = ksyVar.toString();
        String string3 = iegVar5.toString();
        String string4 = uri2.toString();
        String string5 = uri.toString();
        String string6 = immutableList9.toString();
        String string7 = lcuVar.toString();
        String string8 = immutableList8.toString();
        String string9 = immutableList7.toString();
        String string10 = immutableList6.toString();
        String string11 = immutableList5.toString();
        String string12 = immutableList4.toString();
        String string13 = immutableList3.toString();
        String string14 = iegVar4.toString();
        String string15 = immutableList2.toString();
        String string16 = immutableList.toString();
        String string17 = iegVar3.toString();
        String string18 = iegVar2.toString();
        String string19 = iegVar.toString();
        StringBuilder sb = new StringBuilder("Movie{entitlementAnnotation=");
        sb.append(string);
        sb.append(", ratingId=");
        sb.append(this.b);
        sb.append(", contentRating=");
        sb.append(this.c);
        sb.append(", assetId=");
        sb.append(string2);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", offersResult=");
        sb.append(string3);
        sb.append(", eidrId=");
        sb.append(this.g);
        sb.append(", hasCaption=");
        sb.append(this.h);
        sb.append(", hasSurroundSound=");
        sb.append(this.i);
        sb.append(", hasKnowledge=");
        sb.append(this.j);
        sb.append(", has4KBadge=");
        sb.append(this.k);
        sb.append(", hasHDRBadge=");
        sb.append(this.l);
        sb.append(", hasDolbyVisionHDRBadge=");
        boolean z = this.N;
        String str = this.C;
        String str2 = this.B;
        float f = this.z;
        int i = this.x;
        long j = this.w;
        float f2 = this.v;
        int i2 = this.u;
        String str3 = this.t;
        int i3 = this.q;
        boolean z2 = this.p;
        boolean z3 = this.o;
        boolean z4 = this.n;
        sb.append(this.m);
        sb.append(", hasHDR10PlusBadge=");
        sb.append(z4);
        sb.append(", hasMoviesAnywhereBadge=");
        sb.append(z3);
        sb.append(", extra=");
        sb.append(z2);
        sb.append(", releaseYear=");
        sb.append(i3);
        sb.append(", posterUrl=");
        sb.append(string4);
        sb.append(", screenshotUrl=");
        sb.append(string5);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", startOfCredit=");
        sb.append(i2);
        sb.append(", starRating=");
        sb.append(f2);
        sb.append(", starRatingCount=");
        sb.append(j);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", trailers=");
        sb.append(string6);
        sb.append(", floatTomatoRating=");
        sb.append(f);
        sb.append(", tomatometerRating=");
        sb.append(string7);
        sb.append(", tomatometerRatingSourceUrl=");
        sb.append(str2);
        sb.append(", primaryCategoryId=");
        sb.append(str);
        sb.append(", directors=");
        sb.append(string8);
        sb.append(", writers=");
        sb.append(string9);
        sb.append(", actors=");
        sb.append(string10);
        sb.append(", producers=");
        sb.append(string11);
        sb.append(", bundleIds=");
        sb.append(string12);
        sb.append(", bonusItems=");
        sb.append(string13);
        sb.append(", annotation=");
        sb.append(string14);
        sb.append(", audioTracks=");
        sb.append(string15);
        sb.append(", captionTracks=");
        sb.append(string16);
        sb.append(", seller=");
        sb.append(string17);
        sb.append(", includesVat=");
        sb.append(z);
        sb.append(", watchActionsResult=");
        sb.append(string18);
        sb.append(", assetRestrictionListResult=");
        sb.append(string19);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.kvf
    public final ImmutableList u() {
        return this.L;
    }

    @Override // defpackage.kvf
    public final ImmutableList v() {
        return this.D;
    }

    @Override // defpackage.kvf
    public final ImmutableList w() {
        return this.G;
    }

    @Override // defpackage.kvf
    public final ImmutableList x() {
        return this.y;
    }

    @Override // defpackage.kvf
    public final ImmutableList y() {
        return this.E;
    }

    @Override // defpackage.kwf
    public final String z() {
        return this.c;
    }
}
