package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alt extends bko implements byl, byc, cae {
    private yjv B;
    public cfy a;
    public chc b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public bns g;
    public yjv h;
    public als i;
    public esn j;
    private yjv k;
    private List l;
    private yjv m;
    private alo n;
    private Map o;
    private all p;

    public /* synthetic */ alt(cfy cfyVar, chc chcVar, esn esnVar, yjv yjvVar, int i, boolean z, int i2, int i3, List list, yjv yjvVar2, alo aloVar, bns bnsVar, yjv yjvVar3) {
        this.a = cfyVar;
        this.b = chcVar;
        this.j = esnVar;
        this.k = yjvVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.l = list;
        this.m = yjvVar2;
        this.n = aloVar;
        this.g = bnsVar;
        this.h = yjvVar3;
    }

    private final all u(clx clxVar) {
        all allVar;
        als alsVar = this.i;
        if (alsVar != null && alsVar.c && (allVar = alsVar.d) != null) {
            allVar.g(clxVar);
            return allVar;
        }
        all allVarI = i();
        allVarI.g(clxVar);
        return allVarI;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:3:0x0005, B:26:0x0072, B:28:0x007d, B:30:0x008a, B:32:0x0091, B:33:0x0094, B:35:0x0098, B:37:0x009e, B:39:0x00ac, B:40:0x00b1, B:41:0x00ba, B:43:0x00be, B:44:0x00c4, B:45:0x00e4, B:47:0x00e8, B:48:0x00ed, B:6:0x0018, B:8:0x0022, B:10:0x0028, B:22:0x0055, B:25:0x0066, B:13:0x0031, B:15:0x003b, B:17:0x0045, B:19:0x0050), top: B:54:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:3:0x0005, B:26:0x0072, B:28:0x007d, B:30:0x008a, B:32:0x0091, B:33:0x0094, B:35:0x0098, B:37:0x009e, B:39:0x00ac, B:40:0x00b1, B:41:0x00ba, B:43:0x00be, B:44:0x00c4, B:45:0x00e4, B:47:0x00e8, B:48:0x00ed, B:6:0x0018, B:8:0x0022, B:10:0x0028, B:22:0x0055, B:25:0x0066, B:13:0x0031, B:15:0x003b, B:17:0x0045, B:19:0x0050), top: B:54:0x0005 }] */
    @Override // defpackage.byl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bvu b(defpackage.bvv r9, defpackage.bvs r10, long r11) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alt.b(bvv, bvs, long):bvu");
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        List list;
        amo amoVar;
        if (this.A) {
            alo aloVar = this.n;
            boolean z = false;
            if (aloVar != null && (amoVar = (amo) aloVar.b.b().a(aloVar.a)) != null) {
                boolean z2 = amoVar.c;
                int i = !z2 ? amoVar.a.a : amoVar.b.a;
                int i2 = !z2 ? amoVar.b.a : amoVar.a.a;
                if (i != i2) {
                    if (aloVar.f != null) {
                        throw null;
                    }
                    int iK = ykn.k(i, 0);
                    int iK2 = ykn.k(i2, 0);
                    cgz cgzVar = aloVar.d.c;
                    bni bniVarT = cgzVar != null ? cgzVar.t(iK, iK2) : null;
                    if (bniVarT != null) {
                        cgz cgzVar2 = aloVar.d.c;
                        if (cgzVar2 == null || a.r(cgzVar2.a.f, 3) || !cgzVar2.o()) {
                            brx.I(byuVar, bniVarT, aloVar.c, null, 60);
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (byuVar.n() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (byuVar.n() & 4294967295L));
                            bpn bpnVarP = byuVar.p();
                            long jA = bpnVarP.a();
                            bpnVarP.b().g();
                            try {
                                bpnVarP.c.v(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                                brx.I(byuVar, bniVarT, aloVar.c, null, 60);
                            } finally {
                                bpnVarP.b().e();
                                bpnVarP.h(jA);
                            }
                        }
                    }
                }
            }
            bnp bnpVarB = byuVar.p().b();
            cgz cgzVarD = u(byuVar).d();
            cgh cghVar = cgzVarD.b;
            if (cgzVarD.o() && !a.r(this.c, 3)) {
                z = true;
            }
            if (z) {
                long j = cgzVarD.c;
                bmy bmyVarW = d.w(0L, (4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
                bnpVarB.g();
                bnpVarB.l(bmyVarW);
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
                long jA2 = bnsVar != null ? bnsVar.a() : bnq.g;
                if (jA2 == 16) {
                    jA2 = this.b.e() != 16 ? this.b.e() : bnq.a;
                }
                cgh.l(cghVar, bnpVarB, jA2, bokVar, cllVar, brxVar);
                als alsVar = this.i;
                if (((alsVar == null || !alsVar.c) && hw.A(this.a)) || !((list = this.l) == null || list.isEmpty())) {
                    byuVar.r();
                }
            } finally {
                if (z) {
                    bnpVarB.e();
                }
            }
        }
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        return u(buzVar).a(i, buzVar.n());
    }

    @Override // defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        return hq.p(u(buzVar).c(buzVar.n()).a());
    }

    @Override // defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        return u(buzVar).a(i, buzVar.n());
    }

    @Override // defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        return hq.p(((Number) u(buzVar).c(buzVar.n()).c.a()).floatValue());
    }

    public final all i() {
        if (this.p == null) {
            this.p = new all(this.a, this.b, this.j, this.c, this.d, this.e, this.l);
        }
        all allVar = this.p;
        allVar.getClass();
        return allVar;
    }

    public final void l() {
        this.i = null;
    }

    public final void m(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            i().h(this.a, this.b, this.j, this.c, this.d, this.e, this.l);
        }
        if (this.A) {
            if (z2 || (z && this.B != null)) {
                cbp.M(this);
            }
            if (z2 || z3 || z4) {
                cbp.Y(this);
                fh.D(this);
            }
            if (z) {
                fh.D(this);
            }
        }
    }

    public final void n() {
        cbp.M(this);
        cbp.Y(this);
        fh.D(this);
    }

    public final boolean o(yjv yjvVar, yjv yjvVar2, alo aloVar, yjv yjvVar3) {
        boolean z;
        if (this.k != yjvVar) {
            this.k = yjvVar;
            z = true;
        } else {
            z = false;
        }
        if (this.m != yjvVar2) {
            this.m = yjvVar2;
            z = true;
        }
        if (!yks.e(this.n, aloVar)) {
            this.n = aloVar;
            z = true;
        }
        if (this.h == yjvVar3) {
            return z;
        }
        this.h = yjvVar3;
        return true;
    }

    @Override // defpackage.cae
    public final /* synthetic */ boolean q() {
        return false;
    }

    public final boolean r(bns bnsVar, chc chcVar) {
        boolean zE = yks.e(bnsVar, this.g);
        this.g = bnsVar;
        return (zE && chcVar.t(this.b)) ? false : true;
    }

    public final boolean s(cfy cfyVar) {
        boolean zE = yks.e(this.a.b, cfyVar.b);
        boolean zE2 = yks.e(this.a.a, cfyVar.a);
        boolean z = true;
        if (zE && zE2) {
            z = false;
        }
        if (z) {
            this.a = cfyVar;
        }
        if (!zE) {
            l();
        }
        return z;
    }

    public final boolean t(chc chcVar, List list, int i, int i2, boolean z, esn esnVar, int i3) {
        boolean z2 = !this.b.u(chcVar);
        this.b = chcVar;
        if (!yks.e(this.l, list)) {
            this.l = list;
            z2 = true;
        }
        if (this.f != i) {
            this.f = i;
            z2 = true;
        }
        if (this.e != i2) {
            this.e = i2;
            z2 = true;
        }
        if (this.d != z) {
            this.d = z;
            z2 = true;
        }
        if (!yks.e(this.j, esnVar)) {
            this.j = esnVar;
            z2 = true;
        }
        if (!a.r(this.c, i3)) {
            this.c = i3;
            z2 = true;
        }
        if (yks.e(null, null)) {
            return z2;
        }
        return true;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        yjv akhVar = this.B;
        if (akhVar == null) {
            akhVar = new akh(this, 5);
            this.B = akhVar;
        }
        cfk.n(cfcVar, this.a);
        als alsVar = this.i;
        if (alsVar != null) {
            cfk.o(cfcVar, alsVar.b);
            cfk.l(cfcVar, alsVar.c);
        }
        cfcVar.e(cfb.k, new ces(null, new akh(this, 6)));
        cfcVar.e(cfb.l, new ces(null, new akh(this, 7)));
        cfcVar.e(cfb.m, new ces(null, new ajm(this, 15)));
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
