package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alv extends bko implements byl, byc, cae {
    public String a;
    public chc b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public bns g;
    public yjv h;
    public alu i;
    public esn j;
    private Map k;
    private alm l;

    public alv(String str, chc chcVar, esn esnVar, int i, boolean z, int i2, int i3, bns bnsVar) {
        this.a = str;
        this.b = chcVar;
        this.j = esnVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = bnsVar;
    }

    private final alm n(buz buzVar) {
        alm almVarO = o();
        almVarO.d(buzVar);
        return almVarO;
    }

    private final alm o() {
        alm almVar;
        alu aluVar = this.i;
        if (aluVar != null) {
            if (true != aluVar.b) {
                aluVar = null;
            }
            if (aluVar != null && (almVar = aluVar.c) != null) {
                return almVar;
            }
        }
        return i();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001e  */
    @Override // defpackage.byl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bvu b(defpackage.bvv r18, defpackage.bvs r19, long r20) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alv.b(bvv, bvs, long):bvu");
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        if (this.A) {
            alm almVarO = o();
            cft cftVar = almVarO.k;
            if (cftVar == null) {
                wv.a("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.l + ", textSubstitution=" + this.i + ')');
                throw new yfs();
            }
            bnp bnpVarB = byuVar.p().b();
            boolean z = almVarO.f;
            if (z) {
                long j = almVarO.g;
                bnpVarB.g();
                bnpVarB.a(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                cll cllVarQ = this.b.q();
                if (cllVarQ == null) {
                    cllVarQ = cll.a;
                }
                cll cllVar = cllVarQ;
                bok bokVarI = this.b.i();
                if (bokVarI == null) {
                    bokVarI = bok.a;
                }
                bok bokVar = bokVarI;
                brx brxVarY = this.b.y();
                if (brxVarY == null) {
                    brxVarY = bps.a;
                }
                brx brxVar = brxVarY;
                this.b.x();
                bns bnsVar = this.g;
                long jA = bnsVar != null ? bnsVar.a() : bnq.g;
                if (jA == 16) {
                    jA = this.b.e() != 16 ? this.b.e() : bnq.a;
                }
                cftVar.m(bnpVarB, jA, bokVar, cllVar, brxVar);
                if (z) {
                    bnpVarB.e();
                }
            } catch (Throwable th) {
                if (z) {
                    bnpVarB.e();
                }
                throw th;
            }
        }
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        return n(buzVar).a(i, buzVar.n());
    }

    @Override // defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        return hq.p(n(buzVar).b(buzVar.n()).a());
    }

    @Override // defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        return n(buzVar).a(i, buzVar.n());
    }

    @Override // defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        return hq.p(n(buzVar).b(buzVar.n()).b());
    }

    public final alm i() {
        if (this.l == null) {
            this.l = new alm(this.a, this.b, this.j, this.c, this.d, this.e);
        }
        alm almVar = this.l;
        almVar.getClass();
        return almVar;
    }

    public final void l() {
        this.i = null;
    }

    public final void m() {
        cbp.M(this);
        cbp.Y(this);
        fh.D(this);
    }

    @Override // defpackage.cae
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        yjv akhVar = this.h;
        if (akhVar == null) {
            akhVar = new akh(this, 8);
            this.h = akhVar;
        }
        cfk.n(cfcVar, new cfy(this.a));
        alu aluVar = this.i;
        if (aluVar != null) {
            cfk.l(cfcVar, aluVar.b);
            cfk.o(cfcVar, new cfy(aluVar.a));
        }
        cfcVar.e(cfb.k, new ces(null, new akh(this, 9)));
        cfcVar.e(cfb.l, new ces(null, new akh(this, 10)));
        cfcVar.e(cfb.m, new ces(null, new ajm(this, 16)));
        cfcVar.e(cfb.a, new ces(null, akhVar));
    }

    @Override // defpackage.cae
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }

    @Override // defpackage.cae
    public final /* synthetic */ void z() {
    }
}
