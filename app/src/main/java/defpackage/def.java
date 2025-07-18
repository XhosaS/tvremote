package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class def implements dek {
    int a;
    public Class b;
    private final deg c;

    public def(deg degVar) {
        this.c = degVar;
    }

    @Override // defpackage.dek
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof def) {
            def defVar = (def) obj;
            if (this.a == defVar.a && this.b == defVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.a + "array=" + String.valueOf(this.b) + "}";
    }
}
