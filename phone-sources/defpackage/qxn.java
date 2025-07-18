package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxn {
    public final qyn a;
    public final zft b;

    public qxn(zft zftVar, qyn qynVar) {
        this.b = zftVar;
        this.a = qynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxn)) {
            return false;
        }
        qxn qxnVar = (qxn) obj;
        return yks.e(this.b, qxnVar.b) && yks.e(this.a, qxnVar.a);
    }

    public final int hashCode() {
        zft zftVar = this.b;
        return ((zftVar == null ? 0 : zftVar.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "BentoData(bentoEntryPoint=" + this.b + ", appStateData=" + this.a + ")";
    }
}
