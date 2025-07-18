package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rbw extends rce {
    public final float a;
    private final int b;

    public rbw(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.rce
    public final float d() {
        return this.a;
    }

    @Override // defpackage.rce
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rce) {
            rce rceVar = (rce) obj;
            if (this.b == rceVar.e() && Float.floatToIntBits(this.a) == Float.floatToIntBits(rceVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + qtm.a(this.b) + ", samplingProbability=" + this.a + "}";
    }
}
