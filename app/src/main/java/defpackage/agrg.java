package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agrg {
    public final int a;
    public final Object b;

    public agrg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agrg)) {
            return false;
        }
        agrg agrgVar = (agrg) obj;
        return this.a == agrgVar.a && agvy.c(this.b, agrgVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
