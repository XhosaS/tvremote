package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khr {
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    private final clx f;

    public khr(int i, int i2, clx clxVar, long j, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.f = clxVar;
        this.c = j;
        this.d = i3;
        this.e = i4;
    }

    public static /* synthetic */ khr a(khr khrVar, int i, int i2, long j, int i3) {
        if ((i3 & 1) != 0) {
            i = khrVar.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = khrVar.b;
        }
        int i5 = i2;
        clx clxVar = (i3 & 4) != 0 ? khrVar.f : null;
        if ((i3 & 8) != 0) {
            j = khrVar.c;
        }
        int i6 = khrVar.d;
        int i7 = khrVar.e;
        clxVar.getClass();
        return new khr(i4, i5, clxVar, j, i6, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khr)) {
            return false;
        }
        khr khrVar = (khr) obj;
        return this.a == khrVar.a && this.b == khrVar.b && yks.e(this.f, khrVar.f) && a.s(this.c, khrVar.c) && this.d == khrVar.d && this.e == khrVar.e;
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + this.b) * 31) + this.f.hashCode()) * 31) + a.k(this.c)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "SwipeControlDotPosition(offsetX=" + this.a + ", offsetY=" + this.b + ", density=" + this.f + ", containerSize=" + cmh.a(this.c) + ", dotSizePx=" + this.d + ", dotMarginPx=" + this.e + ")";
    }
}
