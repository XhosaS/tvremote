package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hoi implements hon {
    int a;
    public Class b;
    private final hoj c;

    public hoi(hoj hojVar) {
        this.c = hojVar;
    }

    @Override // defpackage.hon
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hoi) {
            hoi hoiVar = (hoi) obj;
            if (this.a == hoiVar.a && this.b == hoiVar.b) {
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
