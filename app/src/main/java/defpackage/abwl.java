package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwl {
    private final Object a;
    private final int b;

    public abwl(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abwl)) {
            return false;
        }
        abwl abwlVar = (abwl) obj;
        return this.a == abwlVar.a && this.b == abwlVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
