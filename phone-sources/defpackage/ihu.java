package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihu extends ihw {
    public final Throwable a;
    private final int b;

    public ihu(Throwable th, int i) {
        this.a = th;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihu)) {
            return false;
        }
        ihu ihuVar = (ihu) obj;
        return yks.e(this.a, ihuVar.a) && this.b == ihuVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.bw(i);
        return iHashCode + i;
    }

    public final String toString() {
        return "Exception(error=" + this.a + ", origin=" + ((Object) ihz.a(this.b)) + ")";
    }
}
