package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjy {
    public final int a;
    public final Integer b;

    public bjy(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjy)) {
            return false;
        }
        bjy bjyVar = (bjy) obj;
        return this.a == bjyVar.a && yks.e(this.b, bjyVar.b);
    }

    public final int hashCode() {
        Integer num = this.b;
        return (this.a * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ')';
    }
}
