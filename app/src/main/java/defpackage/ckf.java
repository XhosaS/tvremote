package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckf {
    public final String a;
    public final int b;
    public final int c;

    public ckf(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckf)) {
            return false;
        }
        ckf ckfVar = (ckf) obj;
        return agvy.c(this.a, ckfVar.a) && this.b == ckfVar.b && this.c == ckfVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
