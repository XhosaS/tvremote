package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ato implements rs {
    public final long a;
    private final boolean b;
    private final float c;
    private final bns d = null;

    public ato(boolean z, float f, long j) {
        this.b = z;
        this.c = f;
        this.a = j;
    }

    @Override // defpackage.rn
    public final /* synthetic */ rz a(bao baoVar) {
        return hw.k(baoVar);
    }

    @Override // defpackage.rs
    public final bxv b(kw kwVar) {
        return new arx(kwVar, this.b, this.c, new apb(this, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ato)) {
            return false;
        }
        ato atoVar = (ato) obj;
        if (this.b != atoVar.b || !cma.b(this.c, atoVar.c)) {
            return false;
        }
        bns bnsVar = atoVar.d;
        if (!yks.e(null, null)) {
            return false;
        }
        long j = this.a;
        long j2 = atoVar.a;
        long j3 = bnq.a;
        return a.s(j, j2);
    }

    @Override // defpackage.rs
    public final int hashCode() {
        int iQ = (a.q(this.b) * 31) + Float.floatToIntBits(this.c);
        long j = bnq.a;
        return (iQ * 961) + a.k(this.a);
    }
}
