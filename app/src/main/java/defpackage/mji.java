package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mji extends mju {
    private final int a;
    private final int b;

    public mji(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.mju
    public final int a() {
        return this.a;
    }

    @Override // defpackage.mju
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mju) {
            mju mjuVar = (mju) obj;
            if (this.a == mjuVar.a() && this.b == mjuVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "HapticFeedback{hapticFeedbackConstant=" + this.a + ", versionCode=" + this.b + "}";
    }
}
