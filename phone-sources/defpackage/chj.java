package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chj {
    public final int a;
    public final int b;
    public final boolean c;

    public chj(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chj)) {
            return false;
        }
        chj chjVar = (chj) obj;
        return this.a == chjVar.a && this.b == chjVar.b && this.c == chjVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + a.q(this.c);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}
