package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffn implements fdr {
    public final long a;
    private final fdr b;

    public ffn(long j, fdr fdrVar) {
        this.a = j;
        this.b = fdrVar;
    }

    @Override // defpackage.fdr
    public final fel dq(int i, int i2) {
        return this.b.dq(i, i2);
    }

    @Override // defpackage.fdr
    public final void j() {
        this.b.j();
    }

    @Override // defpackage.fdr
    public final void r(fef fefVar) {
        this.b.r(new ffm(this, fefVar, fefVar));
    }
}
