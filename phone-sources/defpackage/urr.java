package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class urr {
    public final String a;
    public final urx b;
    public final Object c;
    public final upo d;
    public final upo e;

    public urr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        upo upoVar;
        upo upoVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof urr) {
            urr urrVar = (urr) obj;
            if (this.a.equals(urrVar.a) && this.b.equals(urrVar.b) && ((upoVar = this.d) != null ? upoVar.equals(urrVar.d) : urrVar.d == null) && ((upoVar2 = this.e) != null ? upoVar2.equals(urrVar.e) : urrVar.e == null) && this.c.equals(urrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        upo upoVar = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (upoVar == null ? 0 : upoVar.hashCode())) * 1000003;
        upo upoVar2 = this.e;
        return ((iHashCode2 ^ (upoVar2 != null ? upoVar2.hashCode() : 0)) * (-721379959)) ^ this.c.hashCode();
    }

    public final String toString() {
        Object obj = this.c;
        upo upoVar = this.e;
        upo upoVar2 = this.d;
        return "PooledRpcCacheConfig{name=" + this.a + ", pool=" + this.b.toString() + ", keyMarshaller=" + String.valueOf(upoVar2) + ", valueMarshaller=" + String.valueOf(upoVar) + ", keyEquivalence=null, account=" + obj.toString() + "}";
    }

    public urr(String str, urx urxVar, upo upoVar, upo upoVar2, Object obj) {
        this.a = str;
        this.b = urxVar;
        this.d = upoVar;
        this.e = upoVar2;
        this.c = obj;
    }
}
