package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bip extends bit {
    private final yjv a;
    private final bit b;

    public bip(long j, bja bjaVar, yjv yjvVar, bit bitVar) {
        super(j, bjaVar);
        this.a = yjvVar;
        this.b = bitVar;
        bitVar.f();
    }

    @Override // defpackage.bit
    public final /* bridge */ /* synthetic */ bit b(yjv yjvVar) {
        return new bip(this.i, this.h, bjb.p(yjvVar, this.a, true), this.b);
    }

    @Override // defpackage.bit
    public final void d() {
        if (this.j) {
            return;
        }
        long j = this.i;
        bit bitVar = this.b;
        if (j != bitVar.v()) {
            y();
        }
        bitVar.g();
        super.d();
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
    public final /* bridge */ /* synthetic */ void n(bjk bjkVar) {
        bjb.A();
        throw new yfs();
    }

    @Override // defpackage.bit
    public final boolean r() {
        return true;
    }

    @Override // defpackage.bit
    public final void e() {
    }
}
