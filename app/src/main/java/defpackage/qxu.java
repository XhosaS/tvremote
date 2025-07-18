package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qxu extends qyf {
    private final int a;
    private final int b;

    public qxu(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.qyf, defpackage.qtl
    public final int a() {
        return this.a;
    }

    @Override // defpackage.qyf
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qyf) {
            qyf qyfVar = (qyf) obj;
            if (this.b == qyfVar.d() && this.a == qyfVar.a()) {
                qyfVar.e();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + qtm.a(this.b) + ", rateLimitPerSecond=" + this.a + ", perfettoMustBeExplicitlyTriggered=false}";
    }

    @Override // defpackage.qyf
    public final void e() {
    }
}
