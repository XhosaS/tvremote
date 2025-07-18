package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsp extends jth {
    public final boolean a;
    public final yzq b;

    public jsp(boolean z, yzq yzqVar) {
        this.a = z;
        this.b = yzqVar;
    }

    @Override // defpackage.jth
    public final yzq a() {
        return this.b;
    }

    @Override // defpackage.jth
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jth) {
            jth jthVar = (jth) obj;
            if (this.a == jthVar.b() && this.b.equals(jthVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DownloadConstraints{requireUnmeteredNetwork=" + this.a + ", requiredNetworkTypes=" + String.valueOf(this.b) + "}";
    }
}
