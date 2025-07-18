package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utu {
    public final xsm a;
    public final xsm b;
    public final vvj c;

    public utu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof utu) {
            utu utuVar = (utu) obj;
            if (this.a.equals(utuVar.a) && this.b.equals(utuVar.b)) {
                vvj vvjVar = this.c;
                vvj vvjVar2 = utuVar.c;
                if (vvjVar != null ? vvjVar.equals(vvjVar2) : vvjVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        vvj vvjVar = this.c;
        return ((iHashCode * 1000003) ^ (vvjVar == null ? 0 : vvjVar.hashCode())) * 1000003;
    }

    public final String toString() {
        vvj vvjVar = this.c;
        xsm xsmVar = this.b;
        return "Response{headers=" + String.valueOf(this.a) + ", trailers=" + String.valueOf(xsmVar) + ", responseMessage=" + String.valueOf(vvjVar) + ", responseStream=null}";
    }

    public utu(xsm xsmVar, xsm xsmVar2, vvj vvjVar) {
        this.a = xsmVar;
        this.b = xsmVar2;
        this.c = vvjVar;
    }
}
