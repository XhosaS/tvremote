package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ael implements aei {
    private final float a;

    public ael(float f) {
        this.a = f;
    }

    @Override // defpackage.aei
    public final float a(long j, clx clxVar) {
        return clxVar.cr(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ael) && cma.b(this.a, ((ael) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
