package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuy {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;

    public kuy() {
        throw null;
    }

    public final int a() {
        return this.b < 720 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuy) {
            kuy kuyVar = (kuy) obj;
            if (this.a == kuyVar.a && this.b == kuyVar.b && this.c == kuyVar.c && this.d == kuyVar.d && this.e == kuyVar.e && this.f == kuyVar.f && this.g == kuyVar.g && this.h.equals(kuyVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.d ? 1237 : 1231;
        int i2 = this.a;
        int i3 = this.b;
        return ((((((((i ^ ((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ this.c) * 1000003)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "ItagInfo{width=" + this.a + ", height=" + this.b + ", audioChannels=" + this.c + ", isDash=" + this.d + ", isMulti=" + this.e + ", drmType=" + this.f + ", dynamicRangeType=" + this.g + ", mimeType='" + this.h + "'}";
    }

    public kuy(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = i4;
        this.g = i5;
        this.h = str;
    }
}
