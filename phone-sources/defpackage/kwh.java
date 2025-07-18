package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwh {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final Uri g;
    public final String h;
    public final String i;
    public final Uri j;
    public final String k;
    public final String l;
    public final String m;

    public kwh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwh) {
            kwh kwhVar = (kwh) obj;
            String str5 = this.a;
            if (str5 != null ? str5.equals(kwhVar.a) : kwhVar.a == null) {
                String str6 = this.b;
                if (str6 != null ? str6.equals(kwhVar.b) : kwhVar.b == null) {
                    String str7 = this.c;
                    if (str7 != null ? str7.equals(kwhVar.c) : kwhVar.c == null) {
                        if (this.d == kwhVar.d && this.e == kwhVar.e && this.f == kwhVar.f && this.g.equals(kwhVar.g) && ((str = this.h) != null ? str.equals(kwhVar.h) : kwhVar.h == null) && ((str2 = this.i) != null ? str2.equals(kwhVar.i) : kwhVar.i == null) && this.j.equals(kwhVar.j) && ((str3 = this.k) != null ? str3.equals(kwhVar.k) : kwhVar.k == null) && ((str4 = this.l) != null ? str4.equals(kwhVar.l) : kwhVar.l == null)) {
                            String str8 = this.m;
                            String str9 = kwhVar.m;
                            if (str8 != null ? str8.equals(str9) : str9 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        String str3 = this.c;
        int iHashCode3 = ((((((((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.i;
        int iHashCode5 = (((iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003;
        String str6 = this.k;
        int iHashCode6 = (iHashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.l;
        int iHashCode7 = (iHashCode6 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.m;
        return iHashCode7 ^ (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        Uri uri = this.j;
        return "RemotePlaybackInfo{title=" + this.a + ", showTitle=" + this.b + ", videoId=" + this.c + ", trailer=" + this.d + ", hasAvodOffer=" + this.e + ", durationMillis=" + this.f + ", clientStateUri=" + String.valueOf(this.g) + ", preferredLanguage=" + this.h + ", videoAssetId=" + this.i + ", posterUrl=" + String.valueOf(uri) + ", showId=" + this.k + ", seasonId=" + this.l + ", parentMovieId=" + this.m + "}";
    }

    public kwh(String str, String str2, String str3, boolean z, boolean z2, int i, Uri uri, String str4, String str5, Uri uri2, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = uri;
        this.h = str4;
        this.i = str5;
        this.j = uri2;
        this.k = str6;
        this.l = str7;
        this.m = str8;
    }
}
