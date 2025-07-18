package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxo {
    private final rxh a;
    private final rwk b;
    private final String c;
    private final int d;
    private final int e;

    public sxo(rxh rxhVar, int i, rwk rwkVar, int i2, String str) {
        rxhVar.getClass();
        rwkVar.getClass();
        this.a = rxhVar;
        this.d = i;
        this.b = rwkVar;
        this.e = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxo)) {
            return false;
        }
        sxo sxoVar = (sxo) obj;
        return this.a == sxoVar.a && this.d == sxoVar.d && this.b == sxoVar.b && this.e == sxoVar.e && agvy.c(this.c, sxoVar.c);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.d) * 31) + this.b.hashCode()) * 31) + this.e) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "FailedRouteStatuses(openingFailure=" + this.a + ", closingFailure=" + ((Object) Integer.toString(this.d - 1)) + ", disconnectReason=" + this.b + ", updateRoutingStatus=" + ((Object) Integer.toString(this.e - 1)) + ", message=" + this.c + ")";
    }
}
