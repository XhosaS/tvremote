package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyr extends jzc {
    public final int a;
    public final aech b;

    public jyr(int i, aech aechVar) {
        this.a = i;
        this.b = aechVar;
    }

    @Override // defpackage.jzc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.jzc
    public final aech b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jzc) {
            jzc jzcVar = (jzc) obj;
            if (this.a == jzcVar.a() && this.b.equals(jzcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ComplianceProductData{productId=" + this.a + ", productIdOrigin=" + Integer.toString(this.b.l) + "}";
    }
}
