package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class me extends ml {
    public pf a;
    public mf b;
    public mg c;
    public yjk d;
    public bkd e;
    public ly f;
    public hnj g;
    public hnj h;
    public hnj i;
    private long j = -9223372034707292160L;
    private final yjv k;
    private final yjv l;

    public me(pf pfVar, hnj hnjVar, hnj hnjVar2, hnj hnjVar3, mf mfVar, mg mgVar, yjk yjkVar, ly lyVar) {
        this.a = pfVar;
        this.g = hnjVar;
        this.h = hnjVar2;
        this.i = hnjVar3;
        this.b = mfVar;
        this.c = mgVar;
        this.d = yjkVar;
        this.f = lyVar;
        clw.k(0, 0, 15);
        this.k = new lk(this, 10);
        this.l = new lk(this, 11);
    }

    public final bkd a() {
        lv lvVar;
        if (this.a.e().c(lx.a, lx.b)) {
            lv lvVar2 = this.b.b.c;
            if (lvVar2 != null) {
                return lvVar2.a;
            }
            lvVar = this.c.b.c;
            if (lvVar == null) {
                return null;
            }
        } else {
            lv lvVar3 = this.c.b.c;
            if (lvVar3 != null) {
                return lvVar3.a;
            }
            lvVar = this.b.b.c;
            if (lvVar == null) {
                return null;
            }
        }
        return lvVar.a;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        if (this.a.f() == this.a.g()) {
            this.e = null;
        } else if (this.e == null) {
            bkd bkdVarA = a();
            if (bkdVarA == null) {
                bkdVarA = bkb.a;
            }
            this.e = bkdVarA;
        }
        if (bvvVar.cA()) {
            bwj bwjVarU = bvsVar.u(j);
            long j2 = (bwjVarU.a << 32) | (bwjVarU.b & 4294967295L);
            this.j = j2;
            return bvvVar.cz((int) (j2 >> 32), (int) (4294967295L & j2), yhc.a, new lk(bwjVarU, 8));
        }
        if (!((Boolean) this.d.a()).booleanValue()) {
            bwj bwjVarU2 = bvsVar.u(j);
            return bvvVar.cz(bwjVarU2.a, bwjVarU2.b, yhc.a, new lk(bwjVarU2, 9));
        }
        ly lyVar = this.f;
        hnj hnjVar = lyVar.d;
        hnj hnjVar2 = lyVar.e;
        pf pfVar = lyVar.a;
        mf mfVar = lyVar.b;
        mg mgVar = lyVar.c;
        hnj hnjVar3 = lyVar.f;
        os osVar = mc.a;
        bdy bdyVarC = hnjVar != null ? hnjVar.c(new lz(mfVar, mgVar, 0), new lz(mfVar, mgVar, 2)) : null;
        if (pfVar.f() == lx.a) {
            mp mpVar = mfVar.b;
            mp mpVar2 = mgVar.b;
        } else {
            mp mpVar3 = mgVar.b;
            mp mpVar4 = mfVar.b;
        }
        ma maVar = new ma(bdyVarC, (bdy) null, (bdy) null, 0);
        bwj bwjVarU3 = bvsVar.u(j);
        int i = bwjVarU3.a;
        long j3 = this.j;
        long j4 = (i << 32) | (bwjVarU3.b & 4294967295L);
        if (true == a.s(j3, -9223372034707292160L)) {
            j3 = j4;
        }
        hnj hnjVar4 = this.g;
        bdy bdyVarC2 = hnjVar4 != null ? hnjVar4.c(this.k, new lh(this, j3, 2)) : null;
        if (bdyVarC2 != null) {
            j4 = ((cmh) bdyVarC2.a()).a;
        }
        long jE = clw.e(j, j4);
        hnj hnjVar5 = this.h;
        long j5 = hnjVar5 != null ? ((cmf) hnjVar5.c(lo.g, new lh(this, j3, 3)).a()).a : 0L;
        hnj hnjVar6 = this.i;
        long j6 = hnjVar6 != null ? ((cmf) hnjVar6.c(this.l, new lh(this, j3, 4)).a()).a : 0L;
        bkd bkdVar = this.e;
        return bvvVar.cz((int) (jE >> 32), (int) (jE & 4294967295L), yhc.a, new md(bwjVarU3, cmf.d(bkdVar != null ? bkdVar.a(j3, jE, cmi.a) : 0L, j6), j5, maVar));
    }

    @Override // defpackage.bko
    public final void cd() {
        this.j = -9223372034707292160L;
    }
}
