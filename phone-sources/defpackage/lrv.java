package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrv {
    public final int a;
    public final boolean b;

    public lrv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrv) {
            lrv lrvVar = (lrv) obj;
            if (this.a == lrvVar.a && this.b == lrvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LicenseKey{licenseType=" + this.a + ", hdr=" + this.b + "}";
    }

    public lrv(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
