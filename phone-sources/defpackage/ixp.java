package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixp {
    public final Throwable a;
    public final yjk b;

    public ixp(Throwable th, yjk yjkVar) {
        this.a = th;
        this.b = yjkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixp)) {
            return false;
        }
        ixp ixpVar = (ixp) obj;
        return yks.e(this.a, ixpVar.a) && yks.e(this.b, ixpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ErrorModel(error=" + this.a + ", retryAction=" + this.b + ")";
    }
}
