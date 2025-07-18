package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzt extends qzu {
    private final yqt a;

    public qzt(yqt yqtVar) {
        this.a = yqtVar;
    }

    @Override // defpackage.qzu
    public final yqt d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qzu) {
            qzu qzuVar = (qzu) obj;
            qzuVar.h();
            qzuVar.g();
            qzuVar.f();
            qzuVar.e();
            if (this.a.equals(qzuVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return -1065311384;
    }

    public final String toString() {
        return "NetworkConfigurations{enablement=EXPLICITLY_DISABLED, batchSize=50, urlSanitizer=null, enableUrlAutoSanitization=false, metricExtensionProvider=" + String.valueOf(this.a) + "}";
    }

    @Override // defpackage.qzu
    public final void e() {
    }

    @Override // defpackage.qzu
    public final void f() {
    }

    @Override // defpackage.qzu
    public final void g() {
    }

    @Override // defpackage.qzu
    public final void h() {
    }
}
