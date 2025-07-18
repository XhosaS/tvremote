package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clh {
    private final Object a;
    private final int b;

    public clh(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof clh)) {
            return false;
        }
        clh clhVar = (clh) obj;
        return this.a == clhVar.a && this.b == clhVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
