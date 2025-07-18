package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsw {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public gsw(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsw)) {
            return false;
        }
        gsw gswVar = (gsw) obj;
        return this.a == gswVar.a && this.b == gswVar.b && this.c == gswVar.c && this.d == gswVar.d;
    }

    public final int hashCode() {
        int iQ = a.q(this.a);
        boolean z = this.d;
        return (((((iQ * 31) + a.q(this.b)) * 31) + a.q(this.c)) * 31) + a.q(z);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
