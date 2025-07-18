package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ain {
    public int a;
    public int b;
    public int c;
    public int d;

    public ain(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ain)) {
            return false;
        }
        ain ainVar = (ain) obj;
        return this.a == ainVar.a && this.b == ainVar.b && this.c == ainVar.c && this.d == ainVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Change(preStart=" + this.a + ", preEnd=" + this.b + ", originalStart=" + this.c + ", originalEnd=" + this.d + ')';
    }
}
