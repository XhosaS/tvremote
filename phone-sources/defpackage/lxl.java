package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxl {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;

    public lxl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lxl) {
            lxl lxlVar = (lxl) obj;
            if (this.a == lxlVar.a && this.b == lxlVar.b && this.c == lxlVar.c && this.d == lxlVar.d && this.e == lxlVar.e && this.f == lxlVar.f && this.g == lxlVar.g && this.h == lxlVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.h ? 1237 : 1231;
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = this.d;
        return i ^ ((((((((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003);
    }

    public final String toString() {
        return "ImageDimensionRequirement{maxMoviePosterWidth=" + this.a + ", maxMovieScreenshotWidth=" + this.b + ", maxShowPosterWidth=" + this.c + ", maxShowBannerWidth=" + this.d + ", maxEpisodeScreenshotWidth=" + this.e + ", maxAppIconSize=" + this.f + ", maxLogoSize=" + this.g + ", allowPadding=" + this.h + "}";
    }

    public lxl(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = z;
    }
}
