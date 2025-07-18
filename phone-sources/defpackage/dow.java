package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dow {
    private final Object a;
    private final int b;

    public dow(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dow)) {
            return false;
        }
        dow dowVar = (dow) obj;
        return this.a == dowVar.a && this.b == dowVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
