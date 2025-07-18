package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzu extends fzv {
    public static final fzu a = new fzu(true);
    public static final fzu b = new fzu(false);

    public fzu(boolean z) {
        super(z);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fzu) && this.c == ((fzu) obj).c;
    }

    public final int hashCode() {
        return a.q(this.c);
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.c + ')';
    }
}
