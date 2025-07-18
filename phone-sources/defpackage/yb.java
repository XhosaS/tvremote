package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yb extends ye {
    private final bkc a;

    public yb(bkc bkcVar) {
        this.a = bkcVar;
    }

    @Override // defpackage.ye
    public final int a(int i, cmi cmiVar) {
        return this.a.a(0, i, cmiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb) && yks.e(this.a, ((yb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.a + ')';
    }
}
