package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ias extends iau {
    public final Throwable a;
    private final int b;

    public ias(Throwable th, int i) {
        this.a = th;
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
        if (!(obj instanceof ias)) {
            return false;
        }
        ias iasVar = (ias) obj;
        return yks.e(this.a, iasVar.a) && this.b == iasVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.bw(i);
        return iHashCode + i;
    }

    public final String toString() {
        return "Exception(error=" + this.a + ", origin=" + ((Object) hur.b(this.b)) + ")";
    }
}
