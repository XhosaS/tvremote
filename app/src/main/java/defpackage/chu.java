package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public chu(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chu)) {
            return false;
        }
        chu chuVar = (chu) obj;
        return this.a == chuVar.a && this.b == chuVar.b && this.c == chuVar.c && this.d == chuVar.d;
    }

    public final int hashCode() {
        int iA = cht.a(this.a);
        boolean z = this.d;
        return (((((iA * 31) + cht.a(this.b)) * 31) + cht.a(this.c)) * 31) + cht.a(z);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
