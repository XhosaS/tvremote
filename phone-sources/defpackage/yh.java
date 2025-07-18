package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yh implements zr {
    private final float a = 0.0f;
    private final float b = 0.0f;
    private final float c = 0.0f;
    private final float d = 0.0f;

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        return clxVar.cu(0.0f);
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        return clxVar.cu(0.0f);
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        return clxVar.cu(0.0f);
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        return clxVar.cu(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh)) {
            return false;
        }
        yh yhVar = (yh) obj;
        float f = yhVar.a;
        if (cma.b(0.0f, 0.0f)) {
            float f2 = yhVar.b;
            if (cma.b(0.0f, 0.0f)) {
                float f3 = yhVar.c;
                if (cma.b(0.0f, 0.0f)) {
                    float f4 = yhVar.d;
                    if (cma.b(0.0f, 0.0f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) cma.a(0.0f)) + ", top=" + ((Object) cma.a(0.0f)) + ", right=" + ((Object) cma.a(0.0f)) + ", bottom=" + ((Object) cma.a(0.0f)) + ')';
    }
}
