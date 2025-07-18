package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qry {
    public final boolean a;
    public final qrx b;

    public qry(boolean z, qrx qrxVar) {
        this.a = z;
        this.b = qrxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qry)) {
            return false;
        }
        qry qryVar = (qry) obj;
        return this.a == qryVar.a && this.b == qryVar.b;
    }

    public final int hashCode() {
        qrx qrxVar = this.b;
        return (a.q(this.a) * 31) + (qrxVar == null ? 0 : qrxVar.hashCode());
    }

    public final String toString() {
        return "InterceptionResult(isIntercepted=" + this.a + ", dropReason=" + this.b + ")";
    }
}
