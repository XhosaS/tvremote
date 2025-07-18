package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pkz extends ple {
    private final boolean d;
    private final yzq e;

    public pkz(boolean z, yzq yzqVar) {
        this.d = z;
        this.e = yzqVar;
    }

    @Override // defpackage.ple
    public final yzq a() {
        return this.e;
    }

    @Override // defpackage.ple
    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ple) {
            ple pleVar = (ple) obj;
            if (this.d == pleVar.b() && this.e.equals(pleVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "DownloadConstraints{requireUnmeteredNetwork=" + this.d + ", requiredNetworkTypes=" + String.valueOf(this.e) + "}";
    }
}
