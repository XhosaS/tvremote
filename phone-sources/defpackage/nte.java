package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nte {
    public final int a;
    public final whn b;

    public nte() {
        throw null;
    }

    public static nte a(int i, whn whnVar) {
        a.H(i > 0);
        ocv.aF(whnVar);
        return new nte(i, whnVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nte) {
            nte nteVar = (nte) obj;
            if (this.a == nteVar.a && this.b.equals(nteVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ComplianceProductData{productId=" + this.a + ", productIdOrigin=" + this.b.toString() + "}";
    }

    public nte(int i, whn whnVar) {
        this.a = i;
        this.b = whnVar;
    }
}
