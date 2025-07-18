package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qg extends bxw implements cad, bry, cae, cak, bxu, bzt {
    public static final hq h = new hq(null);
    private boolean D;
    private final Object E;
    private kw F;
    public boolean a;
    public yjk b;
    public rs c;
    public ws d;
    public wn e;
    public bts f;
    public final jj g;
    public kw i;
    private rs j;
    private boolean k;
    private String l;
    private cez m;
    private final rf n;
    private bxv o;
    private long p;

    public qg(kw kwVar, rs rsVar, boolean z, boolean z2, String str, cez cezVar, yjk yjkVar) {
        this.i = kwVar;
        this.j = rsVar;
        this.k = z;
        this.l = str;
        this.m = cezVar;
        this.a = z2;
        this.b = yjkVar;
        this.n = new rf(this.i, 0, new ahf((Object) this, 1, (byte[]) null));
        int i = jk.a;
        this.g = new jj((byte[]) null);
        this.p = 0L;
        this.F = this.i;
        this.D = D();
        this.E = h;
    }

    private final boolean D() {
        return this.F == null;
    }

    protected abstract void A(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(defpackage.kw r3, defpackage.rs r4, boolean r5, boolean r6, java.lang.String r7, defpackage.cez r8, defpackage.yjk r9) {
        /*
            r2 = this;
            kw r0 = r2.F
            boolean r0 = defpackage.yks.e(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.f()
            r2.F = r3
            r2.i = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            rs r0 = r2.j
            boolean r0 = defpackage.yks.e(r0, r4)
            if (r0 != 0) goto L1e
            r2.j = r4
            r3 = r1
        L1e:
            boolean r4 = r2.k
            if (r4 == r5) goto L2a
            r2.k = r5
            if (r5 == 0) goto L2b
            r2.l()
            goto L2b
        L2a:
            r1 = r3
        L2b:
            boolean r3 = r2.a
            if (r3 == r6) goto L44
            if (r6 == 0) goto L37
            rf r3 = r2.n
            r2.O(r3)
            goto L3f
        L37:
            rf r3 = r2.n
            r2.N(r3)
            r2.f()
        L3f:
            defpackage.cbp.M(r2)
            r2.a = r6
        L44:
            java.lang.String r3 = r2.l
            boolean r3 = defpackage.yks.e(r3, r7)
            if (r3 != 0) goto L51
            r2.l = r7
            defpackage.cbp.M(r2)
        L51:
            cez r3 = r2.m
            boolean r3 = defpackage.yks.e(r3, r8)
            if (r3 != 0) goto L5e
            r2.m = r8
            defpackage.cbp.M(r2)
        L5e:
            r2.b = r9
            boolean r3 = r2.D
            boolean r4 = r2.D()
            if (r3 == r4) goto L75
            boolean r3 = r2.D()
            r2.D = r3
            if (r3 != 0) goto L75
            bxv r3 = r2.o
            if (r3 != 0) goto L75
            goto L77
        L75:
            if (r1 == 0) goto L7a
        L77:
            r2.o()
        L7a:
            rf r3 = r2.n
            kw r4 = r2.i
            r3.m(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg.C(kw, rs, boolean, boolean, java.lang.String, cez, yjk):void");
    }

    public abstract Object b(bte bteVar, yih yihVar);

    @Override // defpackage.cad
    public final void bV() {
        wn wnVar;
        kw kwVar = this.i;
        if (kwVar != null && (wnVar = this.e) != null) {
            kwVar.i(new wo(wnVar));
        }
        this.e = null;
        bts btsVar = this.f;
        if (btsVar != null) {
            btsVar.bV();
        }
    }

    @Override // defpackage.bko
    public final void cd() {
        l();
        if (!this.D) {
            g();
        }
        if (this.a) {
            O(this.n);
        }
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
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
        f();
        if (this.F == null) {
            this.i = null;
        }
        bxv bxvVar = this.o;
        if (bxvVar != null) {
            N(bxvVar);
        }
        this.o = null;
    }

    @Override // defpackage.cak
    public final Object ci() {
        return this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r17 = this;
            r0 = r17
            kw r1 = r0.i
            if (r1 == 0) goto L6a
            ws r2 = r0.d
            if (r2 == 0) goto L12
            wr r3 = new wr
            r3.<init>(r2)
            r1.i(r3)
        L12:
            wn r2 = r0.e
            if (r2 == 0) goto L1e
            wo r3 = new wo
            r3.<init>(r2)
            r1.i(r3)
        L1e:
            jj r2 = r0.g
            java.lang.Object[] r3 = r2.c
            long[] r2 = r2.a
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6a
            r5 = 0
            r6 = r5
        L2b:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L65
            int r9 = r6 - r4
            r10 = r5
        L3e:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L5f
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            ws r11 = (defpackage.ws) r11
            wr r13 = new wr
            r13.<init>(r11)
            r1.i(r13)
        L5f:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L3e
        L63:
            if (r11 != r12) goto L6a
        L65:
            if (r6 == r4) goto L6a
            int r6 = r6 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.d = r1
            r0.e = r1
            jj r1 = r0.g
            r1.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg.f():void");
    }

    public final void g() {
        if (this.o != null) {
            return;
        }
        rs rsVar = this.k ? this.c : this.j;
        if (rsVar != null) {
            if (this.i == null) {
                this.i = new kw((byte[]) null, (byte[]) null);
            }
            this.n.m(this.i);
            kw kwVar = this.i;
            kwVar.getClass();
            bxv bxvVarB = rsVar.b(kwVar);
            O(bxvVarB);
            this.o = bxvVarB;
        }
    }

    @Override // defpackage.bzt
    public final void l() {
        if (this.k) {
            cbp.Q(this, new fg(this, 11));
        }
    }

    @Override // defpackage.cad
    public final void m(bsr bsrVar, bss bssVar, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.p = (Float.floatToRawIntBits(cmf.b(j2)) & 4294967295L) | (Float.floatToRawIntBits(cmf.a(j2)) << 32);
        g();
        if (this.a && bssVar == bss.b) {
            int i = bsrVar.d;
            if (a.r(i, 4)) {
                ykr.q(F(), null, 0, new qf(this, (yih) null, 1, (byte[]) null), 3);
            } else if (a.r(i, 5)) {
                ykr.q(F(), null, 0, new qf(this, (yih) null, 0), 3);
            }
        }
        if (this.f == null) {
            qi qiVar = new qi(this, 1);
            bsr bsrVar2 = btm.a;
            bts btsVar = new bts(null, null, qiVar);
            O(btsVar);
            this.f = btsVar;
        }
        bts btsVar2 = this.f;
        if (btsVar2 != null) {
            btsVar2.m(bsrVar, bssVar, j);
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ void n() {
        cbp.O(this);
    }

    public final void o() {
        bxv bxvVar = this.o;
        if (bxvVar == null && this.D) {
            return;
        }
        if (bxvVar != null) {
            N(bxvVar);
        }
        this.o = null;
        g();
    }

    @Override // defpackage.cae
    public final boolean q() {
        return true;
    }

    protected abstract boolean r(KeyEvent keyEvent);

    @Override // defpackage.bry
    public final boolean s(KeyEvent keyEvent) {
        boolean z;
        g();
        long jB = brx.b(keyEvent);
        if (this.a && a.r(brx.a(keyEvent), 2) && hu.t(keyEvent)) {
            jj jjVar = this.g;
            if (jjVar.b(jB)) {
                z = false;
            } else {
                ws wsVar = new ws(this.p);
                jjVar.e(jB, wsVar);
                if (this.i != null) {
                    ykr.q(F(), null, 0, new qd(this, wsVar, (yih) null, 3, (byte[]) null), 3);
                }
                z = true;
            }
            return r(keyEvent) || z;
        }
        if (!this.a || !a.r(brx.a(keyEvent), 1) || !hu.t(keyEvent)) {
            return false;
        }
        ws wsVar2 = (ws) this.g.c(jB);
        if (wsVar2 != null) {
            if (this.i != null) {
                ykr.q(F(), null, 0, new qd(this, wsVar2, (yih) null, 4, (char[]) null), 3);
            }
            A(keyEvent);
        }
        return wsVar2 != null;
    }

    @Override // defpackage.bry
    public final boolean t(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.cad
    public final /* synthetic */ boolean u() {
        return false;
    }

    protected final Object v(uz uzVar, long j, yih yihVar) {
        Object objK;
        kw kwVar = this.i;
        return (kwVar == null || (objK = yoz.k(new qe(uzVar, j, kwVar, this, null), yihVar)) != yio.a) ? ygi.a : objK;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        cez cezVar = this.m;
        if (cezVar != null) {
            cfk.k(cfcVar, cezVar.a);
        }
        cfk.e(cfcVar, this.l, new fg(this, 12));
        if (this.a) {
            this.n.x(cfcVar);
        } else {
            cfk.b(cfcVar);
        }
        w(cfcVar);
    }

    @Override // defpackage.cae
    public final /* synthetic */ void B() {
    }

    public void h() {
    }

    @Override // defpackage.cad
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.cae
    public final /* synthetic */ void z() {
    }

    public void w(cfc cfcVar) {
    }
}
