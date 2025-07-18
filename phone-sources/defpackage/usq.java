package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usq {
    public final usp a;
    public final String b;
    public final boolean c;

    public usq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof usq) {
            usq usqVar = (usq) obj;
            if (this.a.equals(usqVar.a) && ((str = this.b) != null ? str.equals(usqVar.b) : usqVar.b == null) && this.c == usqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "RpcServiceState{rpcServiceInfo=" + this.a.toString() + ", override=" + this.b + ", isUsingSystemProperty=" + this.c + "}";
    }

    public usq(usp uspVar, String str, boolean z) {
        if (uspVar == null) {
            throw new NullPointerException("Null rpcServiceInfo");
        }
        this.a = uspVar;
        this.b = str;
        this.c = z;
    }
}
