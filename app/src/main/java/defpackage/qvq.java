package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qvq extends qvs {
    public final float a;
    private final int b;
    private final agow c;
    private final yqt d;
    private final int e;

    public qvq(int i, float f, int i2, agow agowVar, yqt yqtVar) {
        this.e = i;
        this.a = f;
        this.b = i2;
        this.c = agowVar;
        this.d = yqtVar;
    }

    @Override // defpackage.qvs, defpackage.qtl
    public final agow b() {
        return this.c;
    }

    @Override // defpackage.qvs
    public final float d() {
        return this.a;
    }

    @Override // defpackage.qvs
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        agow agowVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvs) {
            qvs qvsVar = (qvs) obj;
            if (this.e == qvsVar.g() && Float.floatToIntBits(this.a) == Float.floatToIntBits(qvsVar.d()) && this.b == qvsVar.e() && ((agowVar = this.c) != null ? agowVar.equals(qvsVar.b()) : qvsVar.b() == null) && this.d.equals(qvsVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qvs
    public final yqt f() {
        return this.d;
    }

    @Override // defpackage.qvs
    public final int g() {
        return this.e;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((this.e ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
        agow agowVar = this.c;
        return (((((iFloatToIntBits * 1000003) ^ this.b) * 1000003) ^ (agowVar == null ? 0 : agowVar.hashCode())) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CrashConfigurations{enablement=" + qtm.a(this.e) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=" + String.valueOf(this.c) + ", crashLoopListener=Optional.absent()}";
    }
}
