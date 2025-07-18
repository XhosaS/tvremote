package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byb {
    private final float a = 10.0f;
    private final float b = 40.0f;
    private final float c = 10.0f;
    private final float d = 40.0f;
    private final boolean e = true;

    public static final long a(clx clxVar) {
        return cbp.L(clxVar.cu(10.0f), clxVar.cu(40.0f), clxVar.cu(10.0f), clxVar.cu(40.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byb)) {
            return false;
        }
        byb bybVar = (byb) obj;
        float f = bybVar.a;
        if (!cma.b(10.0f, 10.0f)) {
            return false;
        }
        float f2 = bybVar.b;
        if (!cma.b(40.0f, 40.0f)) {
            return false;
        }
        float f3 = bybVar.c;
        if (!cma.b(10.0f, 10.0f)) {
            return false;
        }
        float f4 = bybVar.d;
        if (!cma.b(40.0f, 40.0f)) {
            return false;
        }
        boolean z = bybVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(10.0f) * 31) + Float.floatToIntBits(40.0f)) * 31) + Float.floatToIntBits(10.0f)) * 31) + Float.floatToIntBits(40.0f)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) cma.a(10.0f)) + ", top=" + ((Object) cma.a(40.0f)) + ", end=" + ((Object) cma.a(10.0f)) + ", bottom=" + ((Object) cma.a(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
