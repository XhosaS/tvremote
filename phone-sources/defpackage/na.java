package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class na extends ne {
    public float a;

    public na(float f) {
        this.a = f;
    }

    @Override // defpackage.ne
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.ne
    public final int b() {
        return 1;
    }

    @Override // defpackage.ne
    public final /* synthetic */ ne c() {
        return new na(0.0f);
    }

    @Override // defpackage.ne
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.ne
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof na) && ((na) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
