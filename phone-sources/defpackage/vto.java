package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vto {
    private final Object a;
    private final int b;

    public vto(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vto)) {
            return false;
        }
        vto vtoVar = (vto) obj;
        return this.a == vtoVar.a && this.b == vtoVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
