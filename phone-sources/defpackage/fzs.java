package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzs extends fzv {
    public final Throwable a;

    public fzs(Throwable th) {
        super(false);
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fzs)) {
            return false;
        }
        fzs fzsVar = (fzs) obj;
        return this.c == fzsVar.c && yks.e(this.a, fzsVar.a);
    }

    public final int hashCode() {
        return a.q(this.c) + this.a.hashCode();
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.c + ", error=" + this.a + ')';
    }
}
