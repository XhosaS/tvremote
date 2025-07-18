package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kvj implements Parcelable, kss, kws, kxa, kwf, kst, kvy, kwi, kwz, kvz, kxc, kwj {
    public final ieg A;
    public final ksy a;
    public final String b;
    public final Uri c;
    public final Uri d;
    public final String e;
    public final int f;
    public final ImmutableList g;
    public final float h;
    public final float i;
    public final lcu j;
    public final String k;
    public final ieg l;
    public final ieg m;
    public final boolean n;
    public final String o;
    public final String p;
    public final ImmutableList q;
    public final ImmutableList r;
    public final ImmutableList s;
    public final ImmutableList t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final ieg z;

    public kvj() {
        throw null;
    }

    public static kvj c(String str, String str2, Uri uri, Uri uri2, float f, float f2, lcu lcuVar, String str3, ieg iegVar, String str4, int i, List list, String str5, String str6, boolean z, List list2, List list3, List list4, List list5, boolean z2, ieg iegVar2, boolean z3, boolean z4, boolean z5, boolean z6, ieg iegVar3, ieg iegVar4) {
        return e(str, str2, uri, uri2, f, f2, lcuVar, str3, iegVar, iegVar2, z3, str4, i, list, str5, str6, list2, list3, list4, list5, z, z2, z4, z5, z6, iegVar3, iegVar4).a();
    }

    public static kvj d(String str) {
        Uri uri = Uri.EMPTY;
        Uri uri2 = Uri.EMPTY;
        lcu lcuVar = lcu.TOMATOMETER_RATING_UNKNOWN;
        ieg iegVar = ieg.a;
        return e(str, "", uri, uri2, 0.0f, 0.0f, lcuVar, "", iegVar, iegVar, false, "", 0, Collections.EMPTY_LIST, "", "", Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, false, false, false, false, false, iegVar, iegVar).a();
    }

    private static kvi e(String str, String str2, Uri uri, Uri uri2, float f, float f2, lcu lcuVar, String str3, ieg iegVar, ieg iegVar2, boolean z, String str4, int i, List list, String str5, String str6, List list2, List list3, List list4, List list5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ieg iegVar3, ieg iegVar4) {
        kvi kviVar = new kvi();
        kviVar.a = ksy.j(str);
        str2.getClass();
        kviVar.b = str2;
        uri.getClass();
        kviVar.c = uri;
        uri2.getClass();
        kviVar.d = uri2;
        kviVar.h = f;
        short s = kviVar.B;
        kviVar.i = f2;
        kviVar.B = (short) (s | 6);
        if (lcuVar == null) {
            throw new NullPointerException("Null tomatometerRating");
        }
        kviVar.j = lcuVar;
        if (str3 == null) {
            throw new NullPointerException("Null tomatometerRatingSourceUrl");
        }
        kviVar.k = str3;
        if (iegVar == null) {
            throw new NullPointerException("Null offersResult");
        }
        kviVar.l = iegVar;
        if (iegVar2 == null) {
            throw new NullPointerException("Null sellerStringResult");
        }
        kviVar.m = iegVar2;
        kviVar.n = z;
        kviVar.B = (short) (s | 14);
        str4.getClass();
        kviVar.e = str4;
        kviVar.f = i;
        kviVar.B = (short) (kviVar.B | 1);
        kviVar.g = ImmutableList.copyOf((Collection) list);
        if (str5 == null) {
            throw new NullPointerException("Null ratingId");
        }
        kviVar.o = str5;
        str6.getClass();
        kviVar.p = str6;
        list2.getClass();
        kviVar.q = ImmutableList.copyOf((Collection) list2);
        list3.getClass();
        kviVar.r = ImmutableList.copyOf((Collection) list3);
        kviVar.s = ImmutableList.copyOf((Collection) list4);
        kviVar.t = ImmutableList.copyOf((Collection) list5);
        kviVar.u = z2;
        short s2 = kviVar.B;
        kviVar.v = z3;
        kviVar.w = z4;
        kviVar.x = z5;
        kviVar.y = z6;
        kviVar.B = (short) (s2 | 496);
        if (iegVar3 == null) {
            throw new NullPointerException("Null entitlementAnnotation");
        }
        kviVar.A = iegVar3;
        if (iegVar4 == null) {
            throw new NullPointerException("Null assetRestrictionListResult");
        }
        kviVar.z = iegVar4;
        return kviVar;
    }

    @Override // defpackage.kwf
    public final String D() {
        return this.o;
    }

    @Override // defpackage.kwz
    public final String E() {
        return this.b;
    }

    @Override // defpackage.kxc
    public final List G() {
        return this.r;
    }

    @Override // defpackage.kws
    public final boolean W() {
        return !Float.isNaN(this.h);
    }

    @Override // defpackage.kxa
    public final boolean X() {
        return !Float.isNaN(this.i);
    }

    @Override // defpackage.kxa
    public final float a() {
        return this.i;
    }

    @Override // defpackage.kws
    public final float b() {
        return this.h;
    }

    @Override // defpackage.kvz
    @Deprecated
    public final ktz dW() {
        return (ktz) this.l.h(ktz.a);
    }

    @Override // defpackage.kum
    public final String dX() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvj) {
            kvj kvjVar = (kvj) obj;
            if (this.a.equals(kvjVar.a) && this.b.equals(kvjVar.b) && this.c.equals(kvjVar.c) && this.d.equals(kvjVar.d) && this.e.equals(kvjVar.e) && this.f == kvjVar.f && this.g.equals(kvjVar.g)) {
                if (Float.floatToIntBits(this.h) == Float.floatToIntBits(kvjVar.h)) {
                    if (Float.floatToIntBits(this.i) == Float.floatToIntBits(kvjVar.i) && this.j.equals(kvjVar.j) && this.k.equals(kvjVar.k) && this.l.equals(kvjVar.l) && this.m.equals(kvjVar.m) && this.n == kvjVar.n && this.o.equals(kvjVar.o) && this.p.equals(kvjVar.p) && this.q.equals(kvjVar.q) && this.r.equals(kvjVar.r) && this.s.equals(kvjVar.s) && this.t.equals(kvjVar.t) && this.u == kvjVar.u && this.v == kvjVar.v && this.w == kvjVar.w && this.x == kvjVar.x && this.y == kvjVar.y && this.z.equals(kvjVar.z) && this.A.equals(kvjVar.A)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.kvy
    public final Uri g() {
        return this.c;
    }

    @Override // defpackage.kwj
    public final Uri h() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ (true != this.v ? 1237 : 1231)) * 1000003) ^ (true != this.w ? 1237 : 1231)) * 1000003) ^ (true != this.x ? 1237 : 1231)) * 1000003) ^ (true == this.y ? 1231 : 1237)) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode();
    }

    @Override // defpackage.kwi
    public final ieg j() {
        return this.z;
    }

    @Override // defpackage.kss
    public final ieg k() {
        throw null;
    }

    @Override // defpackage.kvz
    @Deprecated
    public final ieg l() {
        return this.l;
    }

    @Override // defpackage.kst
    public final ksy o() {
        return this.a;
    }

    @Override // defpackage.kxa
    public final lcu p() {
        return this.j;
    }

    public final String toString() {
        ieg iegVar = this.A;
        ieg iegVar2 = this.z;
        ImmutableList immutableList = this.t;
        ImmutableList immutableList2 = this.s;
        ImmutableList immutableList3 = this.r;
        ImmutableList immutableList4 = this.q;
        ieg iegVar3 = this.m;
        ieg iegVar4 = this.l;
        lcu lcuVar = this.j;
        ImmutableList immutableList5 = this.g;
        Uri uri = this.d;
        Uri uri2 = this.c;
        String string = this.a.toString();
        String string2 = uri2.toString();
        String string3 = uri.toString();
        String string4 = immutableList5.toString();
        String string5 = lcuVar.toString();
        String string6 = iegVar4.toString();
        String string7 = iegVar3.toString();
        String string8 = immutableList4.toString();
        String string9 = immutableList3.toString();
        String string10 = immutableList2.toString();
        String string11 = immutableList.toString();
        String string12 = iegVar2.toString();
        String string13 = iegVar.toString();
        StringBuilder sb = new StringBuilder("MoviesBundle{assetId=");
        sb.append(string);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", posterUrl=");
        sb.append(string2);
        sb.append(", screenshotUrl=");
        sb.append(string3);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", releaseYear=");
        sb.append(this.f);
        sb.append(", categoryIdList=");
        sb.append(string4);
        sb.append(", starRating=");
        sb.append(this.h);
        sb.append(", tomatoRating=");
        sb.append(this.i);
        sb.append(", tomatometerRating=");
        sb.append(string5);
        sb.append(", tomatometerRatingSourceUrl=");
        sb.append(this.k);
        sb.append(", offersResult=");
        sb.append(string6);
        sb.append(", sellerStringResult=");
        sb.append(string7);
        sb.append(", includesVat=");
        sb.append(this.n);
        sb.append(", ratingId=");
        sb.append(this.o);
        sb.append(", contentRating=");
        sb.append(this.p);
        sb.append(", bundleItemIds=");
        sb.append(string8);
        sb.append(", trailers=");
        sb.append(string9);
        sb.append(", audioTracks=");
        sb.append(string10);
        sb.append(", captionTracks=");
        boolean z = this.y;
        boolean z2 = this.x;
        boolean z3 = this.w;
        boolean z4 = this.v;
        boolean z5 = this.u;
        sb.append(string11);
        sb.append(", hasKnowledge=");
        sb.append(z5);
        sb.append(", has4kBadge=");
        sb.append(z4);
        sb.append(", hasHdrBadge=");
        sb.append(z3);
        sb.append(", hasMoviesAnywhereBadge=");
        sb.append(z2);
        sb.append(", hasDolbyVisionHdrBadge=");
        sb.append(z);
        sb.append(", assetRestrictionListResult=");
        sb.append(string12);
        sb.append(", entitlementAnnotation=");
        sb.append(string13);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.kwf
    public final String z() {
        return this.p;
    }

    public kvj(ksy ksyVar, String str, Uri uri, Uri uri2, String str2, int i, ImmutableList immutableList, float f, float f2, lcu lcuVar, String str3, ieg iegVar, ieg iegVar2, boolean z, String str4, String str5, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ieg iegVar3, ieg iegVar4) {
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.a = ksyVar;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.c = uri;
        if (uri2 == null) {
            throw new NullPointerException("Null screenshotUrl");
        }
        this.d = uri2;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.e = str2;
        this.f = i;
        if (immutableList == null) {
            throw new NullPointerException("Null categoryIdList");
        }
        this.g = immutableList;
        this.h = f;
        this.i = f2;
        if (lcuVar == null) {
            throw new NullPointerException("Null tomatometerRating");
        }
        this.j = lcuVar;
        if (str3 == null) {
            throw new NullPointerException("Null tomatometerRatingSourceUrl");
        }
        this.k = str3;
        if (iegVar == null) {
            throw new NullPointerException("Null offersResult");
        }
        this.l = iegVar;
        if (iegVar2 == null) {
            throw new NullPointerException("Null sellerStringResult");
        }
        this.m = iegVar2;
        this.n = z;
        if (str4 == null) {
            throw new NullPointerException("Null ratingId");
        }
        this.o = str4;
        if (str5 == null) {
            throw new NullPointerException("Null contentRating");
        }
        this.p = str5;
        if (immutableList2 == null) {
            throw new NullPointerException("Null bundleItemIds");
        }
        this.q = immutableList2;
        if (immutableList3 == null) {
            throw new NullPointerException("Null trailers");
        }
        this.r = immutableList3;
        if (immutableList4 == null) {
            throw new NullPointerException("Null audioTracks");
        }
        this.s = immutableList4;
        if (immutableList5 == null) {
            throw new NullPointerException("Null captionTracks");
        }
        this.t = immutableList5;
        this.u = z2;
        this.v = z3;
        this.w = z4;
        this.x = z5;
        this.y = z6;
        if (iegVar3 == null) {
            throw new NullPointerException("Null assetRestrictionListResult");
        }
        this.z = iegVar3;
        if (iegVar4 == null) {
            throw new NullPointerException("Null entitlementAnnotation");
        }
        this.A = iegVar4;
    }
}
