package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class naf {
    public final String a;
    public final ieg b;
    public final ieg c;
    public final ieg d;
    public final ieg e;
    public final ieg f;
    public final ieg g;
    public final ieg h;
    public final Uri i;
    public final float j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public naf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof naf) {
            naf nafVar = (naf) obj;
            if (this.a.equals(nafVar.a) && this.b.equals(nafVar.b) && this.c.equals(nafVar.c) && this.d.equals(nafVar.d) && this.e.equals(nafVar.e) && this.f.equals(nafVar.f) && this.g.equals(nafVar.g) && this.h.equals(nafVar.h) && this.i.equals(nafVar.i)) {
                if (Float.floatToIntBits(this.j) == Float.floatToIntBits(nafVar.j) && this.k == nafVar.k && this.l == nafVar.l && this.m == nafVar.m && this.n == nafVar.n && this.o == nafVar.o && this.p == nafVar.p && this.q == nafVar.q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.i.hashCode()) * 1000003) ^ Float.floatToIntBits(this.j)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true == this.q ? 1231 : 1237);
    }

    public final String toString() {
        Uri uri = this.i;
        ieg iegVar = this.h;
        ieg iegVar2 = this.g;
        ieg iegVar3 = this.f;
        ieg iegVar4 = this.e;
        ieg iegVar5 = this.d;
        ieg iegVar6 = this.c;
        return "TitleSectionViewModel{title=" + this.a + ", subtitle=" + String.valueOf(this.b) + ", subtitleContentDescription=" + String.valueOf(iegVar6) + ", contentRating=" + String.valueOf(iegVar5) + ", contentRatingId=" + String.valueOf(iegVar4) + ", tomatoRating=" + String.valueOf(iegVar3) + ", tomatometerRating=" + String.valueOf(iegVar2) + ", starRating=" + String.valueOf(iegVar) + ", showDownloadIcon=false, posterUrl=" + String.valueOf(uri) + ", posterAspectRatio=" + this.j + ", isBundle=" + this.k + ", show4KBadge=" + this.l + ", showBrazilRating=" + this.m + ", showSouthAfricaRating=" + this.n + ", hasAudioDescriptions=" + this.o + ", showDebugInfo=" + this.p + ", isPelogEnabled=" + this.q + "}";
    }

    public naf(String str, ieg iegVar, ieg iegVar2, ieg iegVar3, ieg iegVar4, ieg iegVar5, ieg iegVar6, ieg iegVar7, Uri uri, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = iegVar;
        this.c = iegVar2;
        this.d = iegVar3;
        this.e = iegVar4;
        this.f = iegVar5;
        this.g = iegVar6;
        this.h = iegVar7;
        this.i = uri;
        this.j = f;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = z7;
    }
}
