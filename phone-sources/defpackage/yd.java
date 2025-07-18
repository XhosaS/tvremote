package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yd extends ye {
    private final bkh a;

    public yd(bkh bkhVar) {
        this.a = bkhVar;
    }

    @Override // defpackage.ye
    public final int a(int i, cmi cmiVar) {
        return this.a.a(0, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd) && yks.e(this.a, ((yd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.a + ')';
    }
}
