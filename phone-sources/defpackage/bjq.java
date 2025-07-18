package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjq extends bit {
    public yjv a;
    public final long b;
    private final bit c;
    private final boolean d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjq(bit bitVar, yjv yjvVar, boolean z, boolean z2) {
        yjv yjvVarI;
        super(0L, bja.a);
        yjv yjvVar2 = bjb.a;
        this.c = bitVar;
        this.d = z;
        this.e = z2;
        this.a = bjb.p(yjvVar, (bitVar == null || (yjvVarI = bitVar.i()) == null) ? bjb.h.a : yjvVarI, z);
        this.b = a.bL();
    }

    private final bit a() {
        bit bitVar = this.c;
        return bitVar == null ? bjb.h : bitVar;
    }

    @Override // defpackage.bit
    public final bit b(yjv yjvVar) {
        yjv yjvVarP = bjb.p(yjvVar, this.a, true);
        return !this.d ? bjb.a(a().b(null), yjvVarP, true) : a().b(yjvVarP);
    }

    @Override // defpackage.bit
    public final void d() {
        bit bitVar;
        D();
        if (!this.e || (bitVar = this.c) == null) {
            return;
        }
        bitVar.d();
    }

    @Override // defpackage.bit
    public final void e() {
        a().e();
    }

    @Override // defpackage.bit
    public final /* synthetic */ void f() {
        bcm.E();
    }

    @Override // defpackage.bit
    public final /* synthetic */ void g() {
        bcm.E();
    }

    @Override // defpackage.bit
    public final /* synthetic */ yjv i() {
        return this.a;
    }

    @Override // defpackage.bit
    public final yjv k() {
        return null;
    }

    @Override // defpackage.bit
    public final void n(bjk bjkVar) {
        a().n(bjkVar);
    }

    @Override // defpackage.bit
    public final boolean r() {
        return a().r();
    }

    @Override // defpackage.bit
    public final long v() {
        return a().v();
    }

    @Override // defpackage.bit
    public final bja x() {
        return a().x();
    }
}
