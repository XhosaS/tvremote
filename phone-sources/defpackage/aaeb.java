package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aaeb extends aadr {
    final long a;
    private final aabu b;

    public aaeb(aabo aaboVar, aabu aabuVar) {
        super(aaboVar);
        if (!aabuVar.g()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long jE = aabuVar.e();
        this.a = jE;
        if (jE < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.b = aabuVar;
    }

    @Override // defpackage.aabm
    public int d() {
        return 0;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public long f(long j) {
        if (j >= 0) {
            return j % this.a;
        }
        long j2 = this.a;
        return (((j + 1) % j2) + j2) - 1;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public long g(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.a;
        } else {
            long j3 = j + 1;
            j2 = this.a;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public long h(long j, int i) {
        vxr.ay(this, i, d(), z(j, i));
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu s() {
        return this.b;
    }

    protected int z(long j, int i) {
        return y(j);
    }

    @Override // defpackage.aabm
    public final void x() {
    }
}
