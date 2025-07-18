package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysb extends ysc {
    public final Throwable a;

    public ysb(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ysb) && yks.e(this.a, ((ysb) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ysc
    public final String toString() {
        return "Closed(" + this.a + ")";
    }
}
