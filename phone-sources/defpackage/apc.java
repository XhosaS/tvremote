package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apc implements rs {
    public final long a;
    private final boolean b = true;
    private final float c = Float.NaN;
    private final bns d = null;

    public apc(long j) {
        this.a = j;
    }

    @Override // defpackage.rn
    public final /* synthetic */ rz a(bao baoVar) {
        return hw.k(baoVar);
    }

    @Override // defpackage.rs
    public final bxv b(kw kwVar) {
        return new aof(kwVar, new apb(this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apc)) {
            return false;
        }
        apc apcVar = (apc) obj;
        boolean z = apcVar.b;
        float f = apcVar.c;
        if (!cma.b(Float.NaN, Float.NaN)) {
            return false;
        }
        bns bnsVar = apcVar.d;
        if (!yks.e(null, null)) {
            return false;
        }
        long j = this.a;
        long j2 = apcVar.a;
        long j3 = bnq.a;
        return a.s(j, j2);
    }

    @Override // defpackage.rs
    public final int hashCode() {
        int iQ = (a.q(true) * 31) + Float.floatToIntBits(Float.NaN);
        long j = bnq.a;
        return (iQ * 961) + a.k(this.a);
    }
}
