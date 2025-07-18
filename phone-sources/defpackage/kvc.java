package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvc {
    public static final kvc a = a().a();
    public final boolean b;
    public final long c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final long k;
    public final long l;
    public final boolean m;
    public final int n;
    public final long o;
    private final long p;
    private final int q;

    public kvc() {
        throw null;
    }

    public static kvb a() {
        kvb kvbVar = new kvb();
        kvbVar.i(false);
        kvbVar.p(0);
        kvbVar.c(Long.MAX_VALUE);
        kvbVar.h(false);
        kvbVar.g(false);
        kvbVar.f(false);
        kvbVar.o(Long.MAX_VALUE);
        kvbVar.j(false);
        kvbVar.e(false);
        kvbVar.n(0L);
        kvbVar.b(0L);
        kvbVar.d(false);
        kvbVar.q(0);
        kvbVar.m(0);
        kvbVar.l(0L);
        kvbVar.k(0L);
        return kvbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvc) {
            kvc kvcVar = (kvc) obj;
            if (this.b == kvcVar.b && this.c == kvcVar.c && this.d == kvcVar.d && this.e == kvcVar.e && this.f == kvcVar.f && this.g == kvcVar.g && this.h == kvcVar.h && this.i == kvcVar.i && this.j == kvcVar.j && this.k == kvcVar.k && this.l == kvcVar.l && this.m == kvcVar.m && this.n == kvcVar.n && this.o == kvcVar.o && this.p == kvcVar.p && this.q == kvcVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.b ? 1237 : 1231;
        long j = this.c;
        int i2 = this.d;
        int i3 = (((((((((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        long j2 = this.j;
        int i4 = (i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.k;
        int i5 = (i4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.l;
        int i6 = (((((i5 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ (true == this.m ? 1231 : 1237)) * 1000003) ^ this.n) * 1000003;
        long j5 = this.o;
        int i7 = (i6 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.p;
        return ((i7 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.q;
    }

    public final String toString() {
        return "LibraryItem{isPurchased=" + this.b + ", expirationTimestamp=" + this.c + ", resumeTime=" + this.d + ", isRental=" + this.e + ", isPreordered=" + this.f + ", isHd=" + this.g + ", isUhd=" + this.h + ", isFormat3D=" + this.i + ", rentalShortTimerSeconds=" + this.j + ", purchaseTimeSec=" + this.k + ", addToLibraryTimeSec=" + this.l + ", isBonusContent=" + this.m + ", purchaseSource=" + this.n + ", purchase4kUpgradeTimestampSeconds=" + this.o + ", purchase4kUpgradeNotificationTimestampSeconds=" + this.p + ", visibility=" + this.q + "}";
    }

    public kvc(boolean z, long j, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j2, long j3, long j4, boolean z7, int i2, long j5, long j6, int i3) {
        this.b = z;
        this.c = j;
        this.d = i;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = z7;
        this.n = i2;
        this.o = j5;
        this.p = j6;
        this.q = i3;
    }
}
