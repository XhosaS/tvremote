package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeo implements aei {
    private final float a;

    public aeo(float f) {
        this.a = f;
    }

    @Override // defpackage.aei
    public final float a(long j, clx clxVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aeo) && Float.compare(this.a, ((aeo) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
