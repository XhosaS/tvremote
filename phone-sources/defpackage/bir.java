package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bir extends bit {
    private final yjv a;
    private int b;

    public bir(long j, bja bjaVar, yjv yjvVar) {
        super(j, bjaVar);
        this.a = yjvVar;
        this.b = 1;
    }

    @Override // defpackage.bit
    public final bit b(yjv yjvVar) {
        bjb.w(this);
        return new bip(this.i, this.h, bjb.p(yjvVar, this.a, true), this);
    }

    @Override // defpackage.bit
    public final void d() {
        if (this.j) {
            return;
        }
        g();
        super.d();
    }

    @Override // defpackage.bit
    public final void f() {
        this.b++;
    }

    @Override // defpackage.bit
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            y();
        }
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
