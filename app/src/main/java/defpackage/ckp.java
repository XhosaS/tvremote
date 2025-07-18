package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckp {
    public final String a;
    public final int b;

    public ckp(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckp)) {
            return false;
        }
        ckp ckpVar = (ckp) obj;
        return agvy.c(this.a, ckpVar.a) && this.b == ckpVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
