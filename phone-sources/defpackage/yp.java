package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yp {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public yp(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp)) {
            return false;
        }
        yp ypVar = (yp) obj;
        return this.a == ypVar.a && this.b == ypVar.b && this.c == ypVar.c && this.d == ypVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "InsetsValues(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ')';
    }
}
