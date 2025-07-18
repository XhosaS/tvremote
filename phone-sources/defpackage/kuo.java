package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kuo implements Parcelable, kst, kwf, kwz, kvy, kvz, kxh {
    public final String A;
    public final ksy c;
    public final String d;
    public final String e;
    public final Uri f;
    public final float g;
    public final ieg h;
    public final List i;
    public final String j;
    public final String k;
    public final int l;
    public final int m;
    public final String n;
    public final String o;
    public final String p;
    public final Uri q;
    public final Uri r;
    public final String s;
    public final long t;
    public final String u;
    public final boolean v;
    public final ImmutableList w;
    public final ImmutableList x;
    public final ieg y;
    public final boolean z;

    public kuo() {
        throw null;
    }

    public static kun c(String str, String str2, String str3) {
        kun kunVar = new kun();
        kunVar.a = ksy.h(str);
        if (str2 == null) {
            throw new NullPointerException("Null seasonId");
        }
        kunVar.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null showId");
        }
        kunVar.d = str3;
        kunVar.u("");
        kunVar.q("");
        kunVar.g(0);
        kunVar.t(0);
        kunVar.j(kxd.f(str3));
        kunVar.b = 1.0f;
        kunVar.e = (byte) (kunVar.e | 1);
        kunVar.r(kxd.e(str3));
        kunVar.m(kxd.d(str));
        kunVar.s("");
        ieg iegVar = ieg.a;
        kunVar.i(iegVar);
        kunVar.o("");
        kunVar.n("");
        kunVar.l(0L);
        kunVar.k("");
        kunVar.e("");
        kunVar.f("");
        kunVar.c(false);
        kunVar.b(Collections.EMPTY_LIST);
        kunVar.d(Collections.EMPTY_LIST);
        kunVar.p(iegVar);
        kunVar.h(false);
        kunVar.v(Collections.EMPTY_LIST);
        return kunVar;
    }

    public static kuo d(String str, String str2, String str3) {
        return c(str, str2, str3).a();
    }

    @Override // defpackage.kwf
    public final String D() {
        return this.d;
    }

    @Override // defpackage.kwz
    public final String E() {
        return this.e;
    }

    @Override // defpackage.kvz
    @Deprecated
    public final ktz dW() {
        return (ktz) this.h.h(ktz.a);
    }

    @Override // defpackage.kum
    public final String dX() {
        return this.c.c;
    }

    @Override // defpackage.kxh
    public final List dY() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuo) {
            kuo kuoVar = (kuo) obj;
            if (this.c.equals(kuoVar.c) && this.d.equals(kuoVar.d) && this.e.equals(kuoVar.e) && this.f.equals(kuoVar.f)) {
                if (Float.floatToIntBits(this.g) == Float.floatToIntBits(kuoVar.g) && this.h.equals(kuoVar.h) && this.i.equals(kuoVar.i) && this.j.equals(kuoVar.j) && this.k.equals(kuoVar.k) && this.l == kuoVar.l && this.m == kuoVar.m && this.n.equals(kuoVar.n) && this.o.equals(kuoVar.o) && this.p.equals(kuoVar.p) && this.q.equals(kuoVar.q) && this.r.equals(kuoVar.r) && this.s.equals(kuoVar.s) && this.t == kuoVar.t && this.u.equals(kuoVar.u) && this.v == kuoVar.v && this.w.equals(kuoVar.w) && this.x.equals(kuoVar.x) && this.y.equals(kuoVar.y) && this.z == kuoVar.z && this.A.equals(kuoVar.A)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.kvy
    public final Uri g() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
        long j = this.t;
        return (((((((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.u.hashCode()) * 1000003) ^ (true != this.v ? 1237 : 1231)) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x.hashCode()) * 1000003) ^ this.y.hashCode()) * 1000003) ^ (true == this.z ? 1231 : 1237)) * 1000003) ^ this.A.hashCode();
    }

    @Override // defpackage.kvz
    public final ieg l() {
        return this.h;
    }

    @Override // defpackage.kst
    public final ksy o() {
        return this.c;
    }

    public final String toString() {
        ieg iegVar = this.y;
        ImmutableList immutableList = this.x;
        ImmutableList immutableList2 = this.w;
        Uri uri = this.r;
        Uri uri2 = this.q;
        List list = this.i;
        ieg iegVar2 = this.h;
        Uri uri3 = this.f;
        String string = this.c.toString();
        String string2 = uri3.toString();
        String string3 = iegVar2.toString();
        String string4 = list.toString();
        String string5 = uri2.toString();
        String string6 = uri.toString();
        String string7 = immutableList2.toString();
        String string8 = immutableList.toString();
        String string9 = iegVar.toString();
        StringBuilder sb = new StringBuilder("Episode{assetId=");
        sb.append(string);
        sb.append(", ratingId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", posterUrl=");
        sb.append(string2);
        sb.append(", posterAspectRatio=");
        sb.append(this.g);
        sb.append(", offersResult=");
        sb.append(string3);
        sb.append(", watchActions=");
        sb.append(string4);
        sb.append(", seasonId=");
        sb.append(this.j);
        sb.append(", showId=");
        sb.append(this.k);
        sb.append(", startOfCredit=");
        sb.append(this.l);
        sb.append(", duration=");
        sb.append(this.m);
        sb.append(", sequenceNumber=");
        sb.append(this.n);
        sb.append(", seasonTitle=");
        sb.append(this.o);
        sb.append(", seasonNumber=");
        sb.append(this.p);
        sb.append(", screenshotUrl=");
        sb.append(string5);
        sb.append(", showBannerUrl=");
        sb.append(string6);
        sb.append(", showTitle=");
        sb.append(this.s);
        sb.append(", releaseDate=");
        sb.append(this.t);
        sb.append(", description=");
        sb.append(this.u);
        sb.append(", bonusContent=");
        sb.append(this.v);
        sb.append(", audioTracks=");
        sb.append(string7);
        sb.append(", captionTracks=");
        String str = this.A;
        boolean z = this.z;
        sb.append(string8);
        sb.append(", seller=");
        sb.append(string9);
        sb.append(", includesVat=");
        sb.append(z);
        sb.append(", contentRatingName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.kwf
    public final String z() {
        return this.A;
    }

    public kuo(ksy ksyVar, String str, String str2, Uri uri, float f, ieg iegVar, List list, String str3, String str4, int i, int i2, String str5, String str6, String str7, Uri uri2, Uri uri3, String str8, long j, String str9, boolean z, ImmutableList immutableList, ImmutableList immutableList2, ieg iegVar2, boolean z2, String str10) {
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.c = ksyVar;
        if (str == null) {
            throw new NullPointerException("Null ratingId");
        }
        this.d = str;
        if (str2 == null) {
            throw new NullPointerException("Null title");
        }
        this.e = str2;
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.f = uri;
        this.g = f;
        if (iegVar == null) {
            throw new NullPointerException("Null offersResult");
        }
        this.h = iegVar;
        if (list == null) {
            throw new NullPointerException("Null watchActions");
        }
        this.i = list;
        if (str3 == null) {
            throw new NullPointerException("Null seasonId");
        }
        this.j = str3;
        if (str4 == null) {
            throw new NullPointerException("Null showId");
        }
        this.k = str4;
        this.l = i;
        this.m = i2;
        if (str5 == null) {
            throw new NullPointerException("Null sequenceNumber");
        }
        this.n = str5;
        if (str6 == null) {
            throw new NullPointerException("Null seasonTitle");
        }
        this.o = str6;
        if (str7 == null) {
            throw new NullPointerException("Null seasonNumber");
        }
        this.p = str7;
        if (uri2 == null) {
            throw new NullPointerException("Null screenshotUrl");
        }
        this.q = uri2;
        if (uri3 == null) {
            throw new NullPointerException("Null showBannerUrl");
        }
        this.r = uri3;
        if (str8 == null) {
            throw new NullPointerException("Null showTitle");
        }
        this.s = str8;
        this.t = j;
        if (str9 == null) {
            throw new NullPointerException("Null description");
        }
        this.u = str9;
        this.v = z;
        if (immutableList == null) {
            throw new NullPointerException("Null audioTracks");
        }
        this.w = immutableList;
        if (immutableList2 == null) {
            throw new NullPointerException("Null captionTracks");
        }
        this.x = immutableList2;
        if (iegVar2 == null) {
            throw new NullPointerException("Null seller");
        }
        this.y = iegVar2;
        this.z = z2;
        if (str10 == null) {
            throw new NullPointerException("Null contentRatingName");
        }
        this.A = str10;
    }
}
