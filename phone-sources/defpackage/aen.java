package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aen implements aei {
    private final float a;

    public aen(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            wv.c("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.aei
    public final float a(long j, clx clxVar) {
        return bna.b(j) * (this.a / 100.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aen) && Float.compare(this.a, ((aen) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
