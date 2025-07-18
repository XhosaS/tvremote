package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ako implements agb {
    final /* synthetic */ alg a;
    private final yjk b;
    private int c = -1;
    private long d = 9205357640488583168L;
    private long e = 0;
    private afo f = afo.c;
    private boolean g = true;

    public ako(alg algVar, yjk yjkVar) {
        this.a = algVar;
        this.b = yjkVar;
    }

    @Override // defpackage.agb
    public final void a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    @Override // defpackage.agb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ako.b(long):void");
    }

    @Override // defpackage.agb
    public final void c(long j) {
        alg algVar = this.a;
        if (algVar.c) {
            algVar.F(this.f, j);
            algVar.C(false);
            algVar.z(akm.b);
            this.d = j;
            this.e = 0L;
            algVar.j = -1;
            this.g = true;
            lhr lhrVar = algVar.m;
            if (lhrVar.l() != null) {
                if (lhrVar.m(j)) {
                    akb akbVar = algVar.a;
                    if (akbVar.e().a() != 0) {
                        int iG = lhrVar.g(j, true);
                        long jL = algVar.L(new ahx(akbVar.e(), chb.a, null, null, null, 60), iG, iG, false, amr.c, false);
                        akbVar.j(jL);
                        algVar.E(alh.c);
                        this.c = chb.e(jL);
                        return;
                    }
                    return;
                }
                int iG2 = lhrVar.g(j, true);
                brs brsVar = algVar.g;
                if (brsVar != null) {
                    brsVar.a(9);
                }
                akb akbVar2 = algVar.a;
                long jN = ccf.N(iG2, iG2);
                long j2 = chb.a;
                akbVar2.j(jN);
                algVar.C(true);
                this.g = false;
                algVar.E(alh.b);
            }
        }
    }

    public final void d() {
        if ((this.d & 9223372034707292159L) != 9205357640488583168L) {
            alg algVar = this.a;
            algVar.u();
            this.c = -1;
            this.d = 9205357640488583168L;
            this.e = 0L;
            algVar.j = -1;
            algVar.z(akm.a);
            this.b.a();
            goe goeVar = algVar.l;
            if (goeVar == null) {
                return;
            }
            akb akbVar = algVar.a;
            CharSequence charSequence = akbVar.e().c;
            long j = akbVar.e().d;
            if (!this.g || charSequence.length() <= 0 || chb.g(j)) {
                return;
            }
            ykr.q(algVar.f, null, 4, new dsk(goeVar, charSequence, j, algVar, (yih) null, 1), 1);
        }
    }
}
