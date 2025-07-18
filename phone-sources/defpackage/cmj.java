package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmj implements cmn {
    private final float a;

    public cmj(float f) {
        this.a = f;
    }

    @Override // defpackage.cmn
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.cmn
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmj) && Float.compare(this.a, ((cmj) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
