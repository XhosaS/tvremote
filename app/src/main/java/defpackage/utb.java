package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utb {
    private final float a = 0.0f;
    private final float b = 0.0f;
    private final float c = 10.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utb)) {
            return false;
        }
        utb utbVar = (utb) obj;
        float f = utbVar.a;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f2 = utbVar.b;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        float f3 = utbVar.c;
        return Float.compare(10.0f, 10.0f) == 0;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(10.0f);
    }

    public final String toString() {
        return "NoiseMoveSpeed(x=0.0, y=0.0, z=10.0)";
    }
}
