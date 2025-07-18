package defpackage;

import android.support.v7.appcompat.R;
import android.view.InputDevice;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajq extends bxw implements byc, cae, byd, cad, bry, bxu, bxh, bzt, byk, bxv {
    private final ajs D;
    private final yjv E;
    private final bcb F;
    private final bln G;
    public akb a;
    public alg b;
    public boolean c;
    public afw d;
    public boolean e;
    public yuj f;
    public final rf g;
    public wn h;
    public cdv i;
    public yqe j;
    public yqe k;
    public final yjk l;
    public atx m;
    public final bts n;
    public kw o;
    public lhr p;

    public ajq(akb akbVar, lhr lhrVar, alg algVar, boolean z, afw afwVar, atx atxVar, boolean z2, kw kwVar, yuj yujVar) {
        this.a = akbVar;
        this.p = lhrVar;
        this.b = algVar;
        this.c = z;
        this.d = afwVar;
        this.m = atxVar;
        this.e = z2;
        this.o = kwVar;
        this.f = yujVar;
        algVar.h = new afi(this, 17);
        this.g = new rf(this.o, new agt(this, 10), 2);
        qi qiVar = new qi(this, 8);
        bsr bsrVar = btm.a;
        bts btsVar = new bts(null, null, qiVar);
        O(btsVar);
        this.n = btsVar;
        afi afiVar = new afi(this, 19);
        xa xaVar = new xa(this, 7);
        bln blnVar = new bln(new lz(new agt(afiVar, 20), new ajr(new agt(this, 11), xaVar, new agt(this, 12), new agt(this, 13), new agt(this, 14), new agt(this, 15)), 4, null), 1);
        O(blnVar);
        this.G = blnVar;
        this.D = new ajs((byte[]) null);
        this.E = new agt(this, 16);
        this.l = new afi(this, 18);
        this.F = new bci(false, bcz.c);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjv] */
    public final boolean A(int i) {
        atx atxVar;
        if (!a.r(i, 0) && !a.r(i, 1) && (atxVar = this.m) != null) {
            atxVar.a.a(((aid) atxVar.b).c().toString());
            return true;
        }
        if (a.r(i, 6)) {
            ((bmh) fh.P(this, ccq.e)).h(1);
            return true;
        }
        if (a.r(i, 5)) {
            ((bmh) fh.P(this, ccq.e)).h(2);
            return true;
        }
        if (!a.r(i, 7)) {
            return false;
        }
        ((ckk) D().a).b.b(ckl.d);
        return true;
    }

    public final void C() {
        this.k = ykr.q(F(), null, 0, new qd(this, sq.a(this), (yih) null, 16), 3);
    }

    public final cvw D() {
        cvw cvwVar = (cvw) fh.P(this, ccq.j);
        if (cvwVar != null) {
            return cvwVar;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bcb, java.lang.Object] */
    @Override // defpackage.byd
    public final void bT(bvc bvcVar) {
        this.p.f.b(bvcVar);
        if (this.c) {
            this.g.bT(bvcVar);
        }
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        byuVar.r();
        if (((Boolean) this.F.a()).booleanValue()) {
            brx.o(byuVar, ((bnq) fh.P(this, aet.a)).h, 0L, 0L, 0.0f, null, R.styleable.AppCompatTheme_windowNoTitle);
        }
    }

    @Override // defpackage.cad
    public final void bV() {
        this.n.bV();
    }

    @Override // defpackage.byk
    public final void bX(long j) {
        this.G.d = j;
    }

    @Override // defpackage.bxj
    public final /* synthetic */ Object bY(kw kwVar) {
        return fh.ab(this, kwVar);
    }

    @Override // defpackage.bko
    public final void cd() {
        v();
        this.b.i = this.l;
        if (this.c) {
            O(this.g);
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ long cf() {
        return cai.a;
    }

    @Override // defpackage.bko
    public final /* synthetic */ void cg() {
        cbp.N(this);
    }

    @Override // defpackage.bko
    public final void ch() {
        e();
        this.b.i = null;
    }

    public final void e() {
        yqe yqeVar = this.k;
        if (yqeVar != null) {
            yqeVar.t(null);
        }
        this.k = null;
        yuj yujVar = this.f;
        if (yujVar != null) {
            yujVar.c();
        }
    }

    public final void g() {
        wn wnVar = this.h;
        if (wnVar != null) {
            this.o.i(new wo(wnVar));
            this.h = null;
        }
    }

    @Override // defpackage.bxh
    public final /* synthetic */ bxg i() {
        return bxe.a;
    }

    @Override // defpackage.bzt
    public final void l() {
        v();
    }

    @Override // defpackage.cad
    public final void m(bsr bsrVar, bss bssVar, long j) {
        this.n.m(bsrVar, bssVar, j);
    }

    @Override // defpackage.cad
    public final /* synthetic */ void n() {
        cbp.O(this);
    }

    public final void o() {
        rf rfVar = this.g;
        if (rfVar.A) {
            rfVar.g();
        }
    }

    @Override // defpackage.cae
    public final boolean q() {
        return true;
    }

    public final void r(boolean z) {
        this.F.b(Boolean.valueOf(z));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x041e A[PHI: r4
  0x041e: PHI (r4v17 afp) = 
  (r4v16 afp)
  (r4v58 afp)
  (r4v60 afp)
  (r4v61 afp)
  (r4v62 afp)
  (r4v63 afp)
  (r4v64 afp)
  (r4v65 afp)
  (r4v66 afp)
  (r4v67 afp)
  (r4v68 afp)
  (r4v69 afp)
  (r4v70 afp)
  (r4v71 afp)
  (r4v72 afp)
  (r4v73 afp)
  (r4v76 afp)
  (r4v77 afp)
  (r4v78 afp)
  (r4v79 afp)
  (r4v80 afp)
  (r4v81 afp)
  (r4v82 afp)
  (r4v83 afp)
  (r4v84 afp)
  (r4v86 afp)
  (r4v88 afp)
  (r4v89 afp)
  (r4v90 afp)
  (r4v91 afp)
  (r4v92 afp)
  (r4v95 afp)
 binds: [B:76:0x0160, B:246:0x0419, B:245:0x0416, B:242:0x040b, B:239:0x0400, B:236:0x03f5, B:233:0x03ea, B:230:0x03df, B:222:0x03c3, B:219:0x03b7, B:216:0x03ab, B:213:0x039f, B:210:0x0393, B:207:0x0387, B:204:0x037b, B:201:0x036f, B:198:0x035f, B:195:0x0353, B:192:0x0347, B:189:0x033b, B:186:0x032f, B:183:0x0323, B:180:0x0317, B:177:0x030b, B:174:0x02ff, B:166:0x02e0, B:165:0x02dc, B:162:0x02d0, B:159:0x02c4, B:156:0x02b8, B:153:0x02ac, B:143:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f A[PHI: r10
  0x015f: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v13 boolean) binds: [B:62:0x012d, B:73:0x015a, B:59:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162  */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.bry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(android.view.KeyEvent r21) {
        /*
            Method dump skipped, instructions count: 2226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajq.s(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.bry
    public final boolean t(KeyEvent keyEvent) {
        akb akbVar = this.a;
        alg algVar = this.b;
        bmh bmhVar = (bmh) fh.P(this, ccq.e);
        cvw cvwVarD = D();
        if (!chb.g(akbVar.e().d) && keyEvent.getKeyCode() == 4 && a.r(brx.a(keyEvent), 1)) {
            akb akbVar2 = algVar.a;
            if (!chb.g(akbVar2.e().d)) {
                aid aidVar = akbVar2.a;
                aidVar.a.b().c();
                ahw ahwVar = aidVar.a;
                int iA = chb.a(ahwVar.b);
                ht.q(ahwVar, iA, iA);
                aid.h(aidVar, true, 1);
            }
            algVar.C(false);
            algVar.E(alh.a);
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device == null || !device.supportsSource(513) || device.isVirtual() || !a.r(brx.a(keyEvent), 2) || keyEvent.getSource() == 257) {
            return false;
        }
        if (hv.n(keyEvent, 19)) {
            return bmhVar.h(5);
        }
        if (hv.n(keyEvent, 20)) {
            return bmhVar.h(6);
        }
        if (hv.n(keyEvent, 21)) {
            return bmhVar.h(3);
        }
        if (hv.n(keyEvent, 22)) {
            return bmhVar.h(4);
        }
        if (!hv.n(keyEvent, 23)) {
            return false;
        }
        cvwVarD.p();
        return true;
    }

    @Override // defpackage.cad
    public final /* synthetic */ boolean u() {
        return false;
    }

    public final void v() {
        cbp.Q(this, new afi(this, 15));
    }

    public final boolean w() {
        cdv cdvVar;
        return this.g.d.e().b() && (cdvVar = this.i) != null && cdvVar.d();
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        ahx ahxVarD = this.a.d();
        long j = ahxVarD.d;
        cfy cfyVar = new cfy(this.a.d().toString());
        ymp[] ympVarArr = cfk.a;
        cfm cfmVar = cfi.D;
        ymp[] ympVarArr2 = cfk.a;
        int i = 17;
        ymp ympVar = ympVarArr2[17];
        cfcVar.e(cfmVar, cfyVar);
        cfy cfyVar2 = new cfy(ahxVarD.toString());
        cfm cfmVar2 = cfi.E;
        int i2 = 18;
        ymp ympVar2 = ympVarArr2[18];
        cfcVar.e(cfmVar2, cfyVar2);
        cfm cfmVar3 = cfi.F;
        int i3 = 19;
        ymp ympVar3 = ympVarArr2[19];
        cfcVar.e(cfmVar3, new chb(j));
        if (!this.c) {
            cfk.b(cfcVar);
        }
        boolean z = this.c;
        cfm cfmVar4 = cfi.M;
        ymp ympVar4 = ympVarArr2[25];
        cfcVar.e(cfmVar4, Boolean.valueOf(z));
        bkx bkxVar = bld.a;
        cfm cfmVar5 = cfi.r;
        ymp ympVar5 = ympVarArr2[9];
        cfcVar.e(cfmVar5, bkxVar);
        int i4 = 1;
        cfcVar.e(cfb.g, new ces(null, new avf(z, this, i4)));
        cfcVar.e(cfb.a, new ces(null, new agt(this, i)));
        if (z) {
            cfcVar.e(cfb.j, new ces(null, new agt(this, i2)));
            cfcVar.e(cfb.n, new ces(null, new agt(this, i3)));
        }
        int i5 = 2;
        cfcVar.e(cfb.i, new ces(null, new age(this, i5)));
        int iA = this.d.a();
        amt amtVar = new amt(this, iA, 1);
        cfcVar.e(cfi.G, new cjz(iA));
        cfcVar.e(cfb.o, new ces(null, amtVar));
        cfk.e(cfcVar, null, new ajm(this, 0));
        cfk.v(cfcVar, new ajm(this, i5));
        if (!chb.g(j)) {
            cfcVar.e(cfb.p, new ces(null, new afi(this, 13)));
            if (this.c) {
                cfcVar.e(cfb.q, new ces(null, new afi(this, 14)));
            }
        }
        if (z) {
            cfcVar.e(cfb.r, new ces(null, new ajm(this, i4)));
        }
        if (this.c) {
            this.g.x(cfcVar);
        }
    }

    @Override // defpackage.cae
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }

    @Override // defpackage.cad
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.cae
    public final /* synthetic */ void z() {
    }

    @Override // defpackage.byk
    public final void cj(bvc bvcVar) {
    }
}
