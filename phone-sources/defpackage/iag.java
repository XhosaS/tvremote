package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iag extends hur {
    public final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iag(Throwable th) {
        super((short[]) null);
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iag) && yks.e(this.a, ((iag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Exception(error=" + this.a + ")";
    }
}
