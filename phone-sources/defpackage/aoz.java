package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoz {
    public final long a;
    private final aqd b = null;

    public aoz(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoz)) {
            return false;
        }
        long j = this.a;
        aoz aozVar = (aoz) obj;
        long j2 = aozVar.a;
        long j3 = bnq.a;
        if (!a.s(j, j2)) {
            return false;
        }
        aqd aqdVar = aozVar.b;
        return yks.e(null, null);
    }

    public final int hashCode() {
        long j = bnq.a;
        return a.k(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) bnq.g(this.a)) + ", rippleAlpha=null)";
    }
}
