package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dec {
    private final Object a;
    private final int b;

    public dec(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dec)) {
            return false;
        }
        dec decVar = (dec) obj;
        return this.a == decVar.a && this.b == decVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
