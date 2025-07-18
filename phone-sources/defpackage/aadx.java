package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aadx extends aadr {
    private final aabu a;
    final long b;

    public aadx(aabo aaboVar, long j) {
        super(aaboVar);
        this.b = j;
        this.a = new aadw(this, ((aabn) aaboVar).a);
    }

    public long A(long j, long j2) {
        throw null;
    }

    public final int B(long j, long j2) {
        return vxr.au(A(j, j2));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu s() {
        return this.a;
    }

    public abstract long z(long j, long j2);
}
