package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqn {
    public final String a;
    public final uqm b;

    public uqn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqn) {
            uqn uqnVar = (uqn) obj;
            if (this.a.equals(uqnVar.a)) {
                uqm uqmVar = this.b;
                uqm uqmVar2 = uqnVar.b;
                if (uqmVar != null ? uqmVar.equals(uqmVar2) : uqmVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        uqm uqmVar = this.b;
        return (iHashCode * (-721379959)) ^ (uqmVar == null ? 0 : uqmVar.hashCode());
    }

    public final String toString() {
        return "GrpcMethodConfig{service=" + this.a + ", method=null, grpcRetryConfig=" + String.valueOf(this.b) + "}";
    }

    public uqn(String str, uqm uqmVar) {
        this.a = str;
        this.b = uqmVar;
    }
}
