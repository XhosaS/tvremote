package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxz {
    public final bxh a;
    public final bxy b;
    public final bxx c;

    public bxz(bxh bxhVar, bxy bxyVar, bxx bxxVar) {
        this.a = bxhVar;
        this.b = bxyVar;
        this.c = bxxVar;
        int i = bxhVar.c;
        int i2 = bxhVar.a;
        if (i - i2 == 0 && bxhVar.d - bxhVar.b == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i2 != 0 && bxhVar.b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final bxw a() {
        bxh bxhVar = this.a;
        return bxhVar.c - bxhVar.a > bxhVar.d - bxhVar.b ? bxw.b : bxw.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!agvy.c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        bxz bxzVar = (bxz) obj;
        return agvy.c(this.a, bxzVar.a) && agvy.c(this.b, bxzVar.b) && agvy.c(this.c, bxzVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "bxz { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
