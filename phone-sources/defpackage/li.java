package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class li<S> extends ml {
    public bdy a;
    public lj b;
    public hnj c;
    private long d = -9223372034707292160L;

    public li(hnj hnjVar, bdy bdyVar, lj ljVar) {
        this.c = hnjVar;
        this.a = bdyVar;
        this.b = ljVar;
    }

    public final long a(long j) {
        long j2 = this.d;
        return a.s(j2, -9223372034707292160L) ? j : j2;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        long j2;
        bwj bwjVarU = bvsVar.u(j);
        if (bvvVar.cA()) {
            j2 = (bwjVarU.a << 32) | (bwjVarU.b & 4294967295L);
        } else {
            hnj hnjVar = this.c;
            if (hnjVar == null) {
                j2 = (bwjVarU.a << 32) | (bwjVarU.b & 4294967295L);
                this.d = j2;
            } else {
                long j3 = (bwjVarU.b & 4294967295L) | (bwjVarU.a << 32);
                bdy bdyVarC = hnjVar.c(new lh(this, j3, 1), new lh(this, j3, 0));
                j2 = ((cmh) bdyVarC.a()).a;
                this.d = ((cmh) bdyVarC.a()).a;
            }
        }
        return bvvVar.cz((int) (j2 >> 32), (int) (4294967295L & j2), yhc.a, new lg(this, bwjVarU, j2));
    }

    @Override // defpackage.bko
    public final void bS() {
        this.d = -9223372034707292160L;
    }
}
