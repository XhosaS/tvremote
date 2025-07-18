package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iht extends ihz {
    public final Object a;
    public final int b;

    public iht(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iht)) {
            return false;
        }
        iht ihtVar = (iht) obj;
        return yks.e(this.a, ihtVar.a) && this.b == ihtVar.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        int i = this.b;
        a.bw(i);
        return (iHashCode * 31) + i;
    }

    public final String toString() {
        return "Data(value=" + this.a + ", origin=" + ((Object) ihz.a(this.b)) + ")";
    }
}
