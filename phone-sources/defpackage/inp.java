package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inp {
    public final boolean a;
    private final Object b;
    private final Throwable c;

    public /* synthetic */ inp(boolean z, Object obj, Throwable th, int i) {
        this.a = z;
        this.b = (i & 2) != 0 ? null : obj;
        this.c = (i & 4) != 0 ? null : th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inp)) {
            return false;
        }
        inp inpVar = (inp) obj;
        return this.a == inpVar.a && yks.e(this.b, inpVar.b) && yks.e(this.c, inpVar.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        boolean z = this.a;
        Throwable th = this.c;
        return (((a.q(z) * 31) + iHashCode) * 31) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "MutationResult(success=" + this.a + ", data=" + this.b + ", exception=" + this.c + ")";
    }
}
