package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atc {
    public final boolean a;
    private final bzs b;

    public atc() {
        throw null;
    }

    public final bzs a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atc) {
            atc atcVar = (atc) obj;
            if (this.a == atcVar.a && biu.h(this.b, atcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }

    public atc(boolean z, bzs bzsVar) {
        this.a = z;
        if (bzsVar == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = bzsVar;
    }
}
