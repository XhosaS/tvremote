package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoc {
    public final float a = 6.0f;
    public final float b = 12.0f;
    public final float c = 8.0f;
    public final float d = 8.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoc)) {
            return false;
        }
        aoc aocVar = (aoc) obj;
        float f = aocVar.a;
        if (!cma.b(6.0f, 6.0f)) {
            return false;
        }
        float f2 = aocVar.b;
        if (!cma.b(12.0f, 12.0f)) {
            return false;
        }
        float f3 = aocVar.c;
        if (!cma.b(8.0f, 8.0f)) {
            return false;
        }
        float f4 = aocVar.d;
        return cma.b(8.0f, 8.0f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(6.0f) * 31) + Float.floatToIntBits(12.0f)) * 31) + Float.floatToIntBits(8.0f)) * 31) + Float.floatToIntBits(8.0f);
    }
}
