package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btx {
    private final float a;
    private final float b;
    private final long c;
    private final int d;

    public btx(float f, float f2, long j, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof btx)) {
            return false;
        }
        btx btxVar = (btx) obj;
        return btxVar.a == this.a && btxVar.b == this.b && btxVar.c == this.c && btxVar.d == this.d;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + a.k(this.c)) * 31) + this.d;
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ",deviceId=" + this.d + ')';
    }
}
