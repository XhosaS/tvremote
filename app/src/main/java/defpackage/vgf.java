package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vgf {
    public final int a;
    public final int b;

    public vgf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgf)) {
            return false;
        }
        vgf vgfVar = (vgf) obj;
        return this.a == vgfVar.a && this.b == vgfVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ActiveCallbacks(callbacksId=" + this.a + ", callbacksState=" + this.b + ")";
    }
}
