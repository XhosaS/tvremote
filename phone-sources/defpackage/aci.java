package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aci {
    public final int a;
    public final int b;

    public aci(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            wv.c("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        wv.c("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aci)) {
            return false;
        }
        aci aciVar = (aci) obj;
        return this.a == aciVar.a && this.b == aciVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Interval(start=" + this.a + ", end=" + this.b + ')';
    }
}
