package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhe {
    public final int a;
    public final Object b;

    public yhe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhe)) {
            return false;
        }
        yhe yheVar = (yhe) obj;
        return this.a == yheVar.a && yks.e(this.b, yheVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
