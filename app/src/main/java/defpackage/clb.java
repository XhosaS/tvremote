package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clb {
    public final String a;
    public final ccq b;

    public clb(String str, ccq ccqVar) {
        ccqVar.getClass();
        this.a = str;
        this.b = ccqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clb)) {
            return false;
        }
        clb clbVar = (clb) obj;
        return agvy.c(this.a, clbVar.a) && this.b == clbVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
