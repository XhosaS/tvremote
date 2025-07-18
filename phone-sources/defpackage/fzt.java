package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzt extends fzv {
    public static final fzt a = new fzt();

    private fzt() {
        super(false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fzt) && this.c == ((fzt) obj).c;
    }

    public final int hashCode() {
        return a.q(this.c);
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.c + ')';
    }
}
