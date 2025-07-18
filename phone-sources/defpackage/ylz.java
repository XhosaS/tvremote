package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylz implements yma {
    private final float a;
    private final float b;

    public ylz(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* bridge */ /* synthetic */ boolean e(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // defpackage.yma
    public final /* bridge */ /* synthetic */ Comparable a() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.yma
    public final /* bridge */ /* synthetic */ Comparable b() {
        return Float.valueOf(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.a && fFloatValue <= this.b;
    }

    @Override // defpackage.yma
    public final boolean d() {
        return this.a > this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ylz) {
            if (d() && ((ylz) obj).d()) {
                return true;
            }
            ylz ylzVar = (ylz) obj;
            return this.a == ylzVar.a && this.b == ylzVar.b;
        }
        return false;
    }

    public final int hashCode() {
        if (d()) {
            return -1;
        }
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
