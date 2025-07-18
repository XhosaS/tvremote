package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwp {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;

    public kwp() {
        throw null;
    }

    public static kwo a() {
        kwo kwoVar = new kwo();
        kwoVar.i(0);
        kwoVar.c(false);
        kwoVar.f(false);
        kwoVar.b(false);
        kwoVar.e(false);
        kwoVar.d(false);
        kwoVar.g(Long.MAX_VALUE);
        kwoVar.h(0L);
        return kwoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwp) {
            kwp kwpVar = (kwp) obj;
            if (this.a == kwpVar.a && this.b == kwpVar.b && this.c == kwpVar.c && this.d == kwpVar.d && this.e == kwpVar.e && this.f == kwpVar.f && this.g == kwpVar.g && this.h == kwpVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.b ? 1237 : 1231;
        int i2 = this.a;
        int i3 = (((((((((i ^ ((i2 ^ 1000003) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003;
        long j = this.g;
        int i4 = (i3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.h;
        return i4 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "ShowLibraryItem{numberOfEpisodes=" + this.a + ", containsRentedItems=" + this.b + ", containsUnwatchedItems=" + this.c + ", containsHDItems=" + this.d + ", containsUHDItems=" + this.e + ", containsSDItems=" + this.f + ", mostRecentTimeAdded=" + this.g + ", mostRecentExpTime=" + this.h + "}";
    }

    public kwp(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, long j2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = j;
        this.h = j2;
    }
}
