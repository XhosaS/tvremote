package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iar extends iax {
    public final Object a;
    private final int b;

    public iar(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // defpackage.iax
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iar)) {
            return false;
        }
        iar iarVar = (iar) obj;
        return yks.e(this.a, iarVar.a) && this.b == iarVar.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        int i = this.b;
        a.bw(i);
        return (iHashCode * 31) + i;
    }

    public final String toString() {
        return "Data(value=" + this.a + ", origin=" + ((Object) hur.b(this.b)) + ")";
    }
}
