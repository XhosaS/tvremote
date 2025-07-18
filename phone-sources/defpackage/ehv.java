package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ehv implements ekc, eke {
    public int a;
    public long b;
    public long c;
    public boolean d;
    private final int g;
    private ekf h;
    private int i;
    private elk j;
    private ecn k;
    private ewx l;
    private dze[] m;
    private boolean o;
    private evz p;
    private ekd q;
    private final Object f = new Object();
    private final hig r = new hig();
    private long n = Long.MIN_VALUE;
    public eay e = eay.a;

    public ehv(int i) {
        this.g = i;
    }

    private final void W(long j, boolean z) {
        this.d = false;
        this.c = j;
        this.n = j;
        x(j, z);
    }

    @Override // defpackage.ekc
    public final void E() {
        a.ab(this.a == 0);
        y();
    }

    @Override // defpackage.ekc
    public final void F(dze[] dzeVarArr, ewx ewxVar, long j, long j2, evz evzVar) {
        a.ab(!this.d);
        this.l = ewxVar;
        this.p = evzVar;
        if (this.n == Long.MIN_VALUE) {
            this.n = j;
        }
        this.m = dzeVarArr;
        this.b = j2;
        D(dzeVarArr, j, j2, evzVar);
    }

    @Override // defpackage.ekc
    public final void G() {
        a.ab(this.a == 0);
        this.r.a();
        A();
    }

    @Override // defpackage.ekc
    public final void H(long j) {
        W(j, false);
    }

    @Override // defpackage.ekc
    public final void I() {
        this.d = true;
    }

    @Override // defpackage.eke
    public final void J(ekd ekdVar) {
        synchronized (this.f) {
            this.q = ekdVar;
        }
    }

    @Override // defpackage.ekc
    public final void L(eay eayVar) {
        if (Objects.equals(this.e, eayVar)) {
            return;
        }
        this.e = eayVar;
    }

    @Override // defpackage.ekc
    public final void M() {
        a.ab(this.a == 1);
        this.a = 2;
        B();
    }

    @Override // defpackage.ekc
    public final void N() {
        a.ab(this.a == 2);
        this.a = 1;
        C();
    }

    @Override // defpackage.ekc
    public final boolean O() {
        return this.n == Long.MIN_VALUE;
    }

    @Override // defpackage.ekc
    public final boolean P() {
        return this.d;
    }

    protected final boolean Q() {
        if (O()) {
            return this.d;
        }
        ewx ewxVar = this.l;
        ewxVar.getClass();
        return ewxVar.dv();
    }

    protected final dze[] R() {
        dze[] dzeVarArr = this.m;
        dzeVarArr.getClass();
        return dzeVarArr;
    }

    protected final int S(hig higVar, ehk ehkVar, int i) {
        ewx ewxVar = this.l;
        ewxVar.getClass();
        int iE = ewxVar.e(higVar, ehkVar, i);
        if (iE == -4) {
            if (ehkVar.isEndOfStream()) {
                this.n = Long.MIN_VALUE;
                return this.d ? -4 : -3;
            }
            long j = ehkVar.e + this.b;
            ehkVar.e = j;
            this.n = Math.max(this.n, j);
            return iE;
        }
        if (iE == -5) {
            Object obj = higVar.a;
            obj.getClass();
            dze dzeVar = (dze) obj;
            long j2 = dzeVar.ad;
            if (j2 != Long.MAX_VALUE) {
                dzd dzdVar = new dzd(dzeVar);
                dzdVar.r = j2 + this.b;
                higVar.a = new dze(dzdVar);
                return -5;
            }
        }
        return iE;
    }

    protected final hig T() {
        hig higVar = this.r;
        higVar.a();
        return higVar;
    }

    protected final int c(long j) {
        ewx ewxVar = this.l;
        ewxVar.getClass();
        return ewxVar.a(j - this.b);
    }

    @Override // defpackage.ekc
    public final int dj() {
        return this.a;
    }

    @Override // defpackage.ekc, defpackage.eke
    public final int dk() {
        return this.g;
    }

    @Override // defpackage.eke
    public int dl() {
        return 0;
    }

    protected final ecn dm() {
        ecn ecnVar = this.k;
        ecnVar.getClass();
        return ecnVar;
    }

    @Override // defpackage.ekc
    public /* synthetic */ long e(long j, long j2) {
        return 10000L;
    }

    @Override // defpackage.ekc
    public final long f() {
        return this.n;
    }

    protected final eii h(Throwable th, dze dzeVar, int i) {
        return i(th, dzeVar, false, i);
    }

    protected final eii i(Throwable th, dze dzeVar, boolean z, int i) {
        int iL;
        if (dzeVar == null || this.o) {
            iL = 4;
        } else {
            this.o = true;
            try {
                iL = clw.L(cJ(dzeVar));
            } catch (eii unused) {
            } finally {
                this.o = false;
            }
        }
        return new eii(1, th, i, U(), this.i, dzeVar, dzeVar == null ? 4 : iL, this.p, z);
    }

    @Override // defpackage.ekc
    public ejj j() {
        return null;
    }

    protected final ekf l() {
        ekf ekfVar = this.h;
        ekfVar.getClass();
        return ekfVar;
    }

    protected final elk m() {
        elk elkVar = this.j;
        elkVar.getClass();
        return elkVar;
    }

    @Override // defpackage.ekc
    public final ewx n() {
        return this.l;
    }

    @Override // defpackage.eke
    public final void o() {
        synchronized (this.f) {
            this.q = null;
        }
    }

    @Override // defpackage.ekc
    public final void p() {
        a.ab(this.a == 1);
        this.r.a();
        this.a = 0;
        this.l = null;
        this.m = null;
        this.d = false;
        v();
        this.p = null;
    }

    @Override // defpackage.ekc
    public final void q(ekf ekfVar, dze[] dzeVarArr, ewx ewxVar, long j, boolean z, boolean z2, long j2, long j3, evz evzVar) {
        a.ab(this.a == 0);
        this.h = ekfVar;
        this.p = evzVar;
        this.a = 1;
        w(z, z2);
        F(dzeVarArr, ewxVar, j2, j3, evzVar);
        W(j2, z);
    }

    @Override // defpackage.ekc
    public final void t(int i, elk elkVar, ecn ecnVar) {
        this.i = i;
        this.j = elkVar;
        this.k = ecnVar;
    }

    @Override // defpackage.ekc
    public final void u() {
        ewx ewxVar = this.l;
        ewxVar.getClass();
        ewxVar.b();
    }

    protected void v() {
        throw null;
    }

    protected void x(long j, boolean z) {
        throw null;
    }

    public final void z() {
        ekd ekdVar;
        synchronized (this.f) {
            ekdVar = this.q;
        }
        if (ekdVar != null) {
            synchronized (((ezd) ekdVar).b) {
                boolean z = ((ezd) ekdVar).d.aD;
            }
        }
    }

    protected void A() {
    }

    protected void B() {
    }

    protected void C() {
    }

    @Override // defpackage.ekc
    public final eke k() {
        return this;
    }

    @Override // defpackage.ekc
    public /* synthetic */ void r() {
    }

    protected void y() {
    }

    @Override // defpackage.ekc
    public /* synthetic */ void K(float f, float f2) {
    }

    @Override // defpackage.ejz
    public void s(int i, Object obj) {
    }

    protected void w(boolean z, boolean z2) {
    }

    protected void D(dze[] dzeVarArr, long j, long j2, evz evzVar) {
    }
}
