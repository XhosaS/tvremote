package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjp extends bin {
    public yjv l;
    public yjv m;
    public final long n;
    private final bin o;
    private final boolean p;
    private final boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    public bjp(bin binVar, yjv yjvVar, yjv yjvVar2, boolean z, boolean z2) {
        yjv yjvVarK;
        yjv yjvVarI;
        yjv yjvVar3 = bjb.a;
        super(0L, bja.a, bjb.p(yjvVar, (binVar == null || (yjvVarI = binVar.i()) == null) ? bjb.h.a : yjvVarI, z), bjb.q(yjvVar2, (binVar == null || (yjvVarK = binVar.k()) == null) ? bjb.h.b : yjvVarK));
        this.o = binVar;
        this.p = z;
        this.q = z2;
        this.l = this.a;
        this.m = this.b;
        this.n = a.bL();
    }

    private final bin F() {
        bin binVar = this.o;
        return binVar == null ? bjb.h : binVar;
    }

    @Override // defpackage.bit
    public final void A(bja bjaVar) {
        bcm.r();
        throw new yfs();
    }

    @Override // defpackage.bit
    public final void B(long j) {
        bcm.r();
        throw new yfs();
    }

    @Override // defpackage.bin
    public final bin a(yjv yjvVar, yjv yjvVar2) {
        yjv yjvVarP = bjb.p(yjvVar, this.l, true);
        yjv yjvVarQ = bjb.q(yjvVar2, this.m);
        return !this.p ? new bjp(F().a(null, yjvVarQ), yjvVarP, yjvVarQ, false, true) : F().a(yjvVarP, yjvVarQ);
    }

    @Override // defpackage.bin, defpackage.bit
    public final bit b(yjv yjvVar) {
        yjv yjvVarP = bjb.p(yjvVar, this.l, true);
        return !this.p ? bjb.a(F().b(null), yjvVarP, true) : F().b(yjvVarP);
    }

    @Override // defpackage.bin
    public final bix c() {
        return F().c();
    }

    @Override // defpackage.bin, defpackage.bit
    public final void d() {
        bin binVar;
        D();
        if (!this.q || (binVar = this.o) == null) {
            return;
        }
        binVar.d();
    }

    @Override // defpackage.bin, defpackage.bit
    public final void e() {
        F().e();
    }

    @Override // defpackage.bin, defpackage.bit
    public final /* synthetic */ void f() {
        bcm.E();
    }

    @Override // defpackage.bin, defpackage.bit
    public final /* synthetic */ void g() {
        bcm.E();
    }

    @Override // defpackage.bin, defpackage.bit
    public final int h() {
        return F().h();
    }

    @Override // defpackage.bin, defpackage.bit
    public final /* synthetic */ yjv i() {
        return this.l;
    }

    @Override // defpackage.bin
    /* renamed from: j */
    public final yjv i() {
        return this.l;
    }

    @Override // defpackage.bin, defpackage.bit
    public final yjv k() {
        return this.m;
    }

    @Override // defpackage.bin, defpackage.bit
    public final void n(bjk bjkVar) {
        F().n(bjkVar);
    }

    @Override // defpackage.bin, defpackage.bit
    public final void q(int i) {
        F().q(i);
    }

    @Override // defpackage.bin, defpackage.bit
    public final boolean r() {
        F().r();
        return false;
    }

    @Override // defpackage.bin
    public final kk s() {
        return F().s();
    }

    @Override // defpackage.bin
    public final void u(kk kkVar) {
        bcm.r();
        throw new yfs();
    }

    @Override // defpackage.bit
    public final long v() {
        return F().v();
    }

    @Override // defpackage.bit
    public final bja x() {
        return F().x();
    }
}
