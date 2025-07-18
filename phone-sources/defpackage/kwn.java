package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kwn implements Parcelable, kss, kws, kxa, kwf, kst, kvy, kwi, kwz {
    public final ieg a;
    public final String b;
    public final String c;
    public final ksy d;
    public final Uri e;
    public final float f;
    public final String g;
    public final Uri h;
    public final float i;
    public final float j;
    public final lcu k;
    public final String l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final ImmutableList q;
    public final ImmutableList r;
    public final ieg s;
    public final ImmutableList t;

    public kwn() {
        throw null;
    }

    public static kwm c(ksy ksyVar) {
        kwm kwmVar = new kwm();
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        kwmVar.a = ksyVar;
        kwmVar.r("");
        String str = ksyVar.b;
        kwmVar.m(kxd.f(str));
        kwmVar.l(1.0f);
        kwmVar.c(kxd.e(str));
        kwmVar.q(Float.NaN);
        kwmVar.i(Float.NaN);
        kwmVar.s(lcu.TOMATOMETER_RATING_UNKNOWN);
        kwmVar.t("");
        kwmVar.f("");
        kwmVar.n("");
        kwmVar.e("");
        kwmVar.k(false);
        kwmVar.j(false);
        kwmVar.o(-1);
        kwmVar.d(Collections.EMPTY_LIST);
        kwmVar.h(Collections.EMPTY_LIST);
        ieg iegVar = ieg.a;
        kwmVar.g(iegVar);
        kwmVar.b(iegVar);
        kwmVar.p(ImmutableList.of());
        return kwmVar;
    }

    public static kwn d(ksy ksyVar) {
        return c(ksyVar).a();
    }

    @Override // defpackage.kwf
    public final String D() {
        return this.b;
    }

    @Override // defpackage.kwz
    public final String E() {
        return this.g;
    }

    @Override // defpackage.kws
    public final boolean W() {
        return !Float.isNaN(this.i);
    }

    @Override // defpackage.kxa
    public final boolean X() {
        return !Float.isNaN(this.j);
    }

    @Override // defpackage.kxa
    public final float a() {
        return this.j;
    }

    @Override // defpackage.kws
    public final float b() {
        return this.i;
    }

    @Override // defpackage.kum
    public final String dX() {
        return this.d.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwn) {
            kwn kwnVar = (kwn) obj;
            if (this.a.equals(kwnVar.a) && this.b.equals(kwnVar.b) && this.c.equals(kwnVar.c) && this.d.equals(kwnVar.d) && this.e.equals(kwnVar.e)) {
                if (Float.floatToIntBits(this.f) == Float.floatToIntBits(kwnVar.f) && this.g.equals(kwnVar.g) && this.h.equals(kwnVar.h)) {
                    if (Float.floatToIntBits(this.i) == Float.floatToIntBits(kwnVar.i)) {
                        if (Float.floatToIntBits(this.j) == Float.floatToIntBits(kwnVar.j) && this.k.equals(kwnVar.k) && this.l.equals(kwnVar.l) && this.m.equals(kwnVar.m) && this.n == kwnVar.n && this.o == kwnVar.o && this.p == kwnVar.p && this.q.equals(kwnVar.q) && this.r.equals(kwnVar.r) && this.s.equals(kwnVar.s) && this.t.equals(kwnVar.t)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.kvy
    public final Uri g() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ Float.floatToIntBits(this.j)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ (true == this.o ? 1231 : 1237)) * 1000003) ^ this.p) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode();
    }

    @Override // defpackage.kwi
    public final ieg j() {
        return this.s;
    }

    @Override // defpackage.kss
    public final ieg k() {
        throw null;
    }

    @Override // defpackage.kst
    public final ksy o() {
        return this.d;
    }

    @Override // defpackage.kxa
    public final lcu p() {
        return this.k;
    }

    public final String toString() {
        ImmutableList immutableList = this.t;
        ieg iegVar = this.s;
        ImmutableList immutableList2 = this.r;
        ImmutableList immutableList3 = this.q;
        lcu lcuVar = this.k;
        Uri uri = this.h;
        Uri uri2 = this.e;
        ksy ksyVar = this.d;
        return "Show{entitlementAnnotation=" + this.a.toString() + ", ratingId=" + this.b + ", contentRating=" + this.c + ", assetId=" + ksyVar.toString() + ", posterUrl=" + uri2.toString() + ", posterAspectRatio=" + this.f + ", title=" + this.g + ", bannerUrl=" + uri.toString() + ", starRating=" + this.i + ", floatTomatoRating=" + this.j + ", tomatometerRating=" + lcuVar.toString() + ", tomatometerRatingSourceUrl=" + this.l + ", description=" + this.m + ", hasSurroundSound=" + this.n + ", hasCaption=" + this.o + ", releaseYear=" + this.p + ", broadcasters=" + immutableList3.toString() + ", episodeAvailability=" + immutableList2.toString() + ", assetRestrictionListResult=" + iegVar.toString() + ", showItemIds=" + immutableList.toString() + "}";
    }

    @Override // defpackage.kwf
    public final String z() {
        return this.c;
    }

    public kwn(ieg iegVar, String str, String str2, ksy ksyVar, Uri uri, float f, String str3, Uri uri2, float f2, float f3, lcu lcuVar, String str4, String str5, boolean z, boolean z2, int i, ImmutableList immutableList, ImmutableList immutableList2, ieg iegVar2, ImmutableList immutableList3) {
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
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.e = uri;
        this.f = f;
        if (str3 == null) {
            throw new NullPointerException("Null title");
        }
        this.g = str3;
        if (uri2 == null) {
            throw new NullPointerException("Null bannerUrl");
        }
        this.h = uri2;
        this.i = f2;
        this.j = f3;
        if (lcuVar == null) {
            throw new NullPointerException("Null tomatometerRating");
        }
        this.k = lcuVar;
        if (str4 == null) {
            throw new NullPointerException("Null tomatometerRatingSourceUrl");
        }
        this.l = str4;
        if (str5 == null) {
            throw new NullPointerException("Null description");
        }
        this.m = str5;
        this.n = z;
        this.o = z2;
        this.p = i;
        if (immutableList == null) {
            throw new NullPointerException("Null broadcasters");
        }
        this.q = immutableList;
        if (immutableList2 == null) {
            throw new NullPointerException("Null episodeAvailability");
        }
        this.r = immutableList2;
        if (iegVar2 == null) {
            throw new NullPointerException("Null assetRestrictionListResult");
        }
        this.s = iegVar2;
        if (immutableList3 == null) {
            throw new NullPointerException("Null showItemIds");
        }
        this.t = immutableList3;
    }
}
