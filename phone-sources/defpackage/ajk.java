package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajk extends bxw implements byl, byc, bxu, byd, cae {
    private int D;
    public boolean a;
    public boolean b;
    public akb c;
    public alg d;
    public bnn e;
    public boolean f;
    public sj g;
    public uv h;
    public yqe i;
    public final akg j;
    public lhr k;
    public uof l;
    public nxb m;
    private chb n;
    private bmy o = new bmy(-1.0f, -1.0f, -1.0f, -1.0f);
    private int p;

    public ajk(boolean z, boolean z2, lhr lhrVar, akb akbVar, alg algVar, bnn bnnVar, boolean z3, sj sjVar, uv uvVar, nxb nxbVar) {
        this.a = z;
        this.b = z2;
        this.k = lhrVar;
        this.c = akbVar;
        this.d = algVar;
        this.e = bnnVar;
        this.f = z3;
        this.g = sjVar;
        this.h = uvVar;
        this.m = nxbVar;
        akb akbVar2 = this.c;
        alg algVar2 = this.d;
        lhr lhrVar2 = this.k;
        boolean z4 = true;
        if (!z && !z2) {
            z4 = false;
        }
        akg akjVar = ru.a() ? new akj(akbVar2, algVar2, lhrVar2, z4) : new akc();
        O(akjVar);
        this.j = akjVar;
        O(new ahi(this.m, new afm(this, (yih) null, 2), new ajh(this, (yih) null, 0), new agt(this, 9)));
    }

    private static final void n(bpq bpqVar, cgz cgzVar) {
        bnp bnpVarB = bpqVar.p().b();
        boolean z = false;
        if (cgzVar.o() && !a.r(cgzVar.a.f, 3)) {
            z = true;
        }
        boolean z2 = z;
        if (z2) {
            long j = cgzVar.c;
            bmy bmyVarW = d.w(0L, (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            bnpVarB.g();
            bnpVarB.l(bmyVarW);
        }
        cgs cgsVar = cgzVar.a.b.b;
        cll cllVar = cgsVar.m;
        if (cllVar == null) {
            cllVar = cll.a;
        }
        cll cllVar2 = cllVar;
        bok bokVar = cgsVar.n;
        if (bokVar == null) {
            bokVar = bok.a;
        }
        bok bokVar2 = bokVar;
        brx brxVar = cgsVar.p;
        if (brxVar == null) {
            brxVar = bps.a;
        }
        brx brxVar2 = brxVar;
        try {
            cgsVar.f();
            clo cloVar = cgsVar.a;
            cgh.l(cgzVar.b, bnpVarB, cloVar != cln.a ? cloVar.b() : bnq.a, bokVar2, cllVar2, brxVar2);
            if (z2) {
                bnpVarB.e();
            }
        } finally {
        }
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        if (this.h == uv.a) {
            bwj bwjVarU = bvsVar.u(clv.k(j, 0, 0, 0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 7));
            int iMin = Math.min(bwjVarU.b, clv.a(j));
            return bvvVar.cz(bwjVarU.a, iMin, yhc.a, new ajg(this, iMin, bwjVarU, bvvVar, 2));
        }
        bwj bwjVarU2 = bvsVar.u(clv.k(j, 0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 0, 13));
        int iMin2 = Math.min(bwjVarU2.a, clv.b(j));
        return bvvVar.cz(iMin2, bwjVarU2.b, yhc.a, new ajg(this, iMin2, bwjVarU2, bvvVar, 0));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bcb, java.lang.Object] */
    @Override // defpackage.byd
    public final void bT(bvc bvcVar) {
        this.k.d.b(bvcVar);
        this.j.e(bvcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    @Override // defpackage.byc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bU(defpackage.byu r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajk.bU(byu):void");
    }

    @Override // defpackage.bko
    public final void cd() {
        if (this.a && m()) {
            i();
        }
    }

    @Override // defpackage.byl
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return fh.x(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int f(buz buzVar, buy buyVar, int i) {
        return fh.y(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int g(buz buzVar, buy buyVar, int i) {
        return fh.z(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return fh.A(this, buzVar, buyVar, i);
    }

    public final void i() {
        if (this.l == null) {
            this.l = new uof(((Boolean) fh.P(this, ccq.q)).booleanValue());
            fh.D(this);
        }
        this.i = ykr.q(F(), null, 0, new qy(this, (yih) null, 18), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.clx r10, int r11, int r12, long r13, defpackage.cmi r15) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajk.l(clx, int, int, long, cmi):void");
    }

    public final boolean m() {
        if (!this.f) {
            return false;
        }
        if (!this.a && !this.b) {
            return false;
        }
        bnn bnnVar = this.e;
        return ((bnnVar instanceof bon) && ((bon) bnnVar).a == 16) ? false : true;
    }

    @Override // defpackage.cae
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        this.j.x(cfcVar);
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
