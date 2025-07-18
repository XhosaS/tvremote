package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nye extends nxu {
    public final it e;
    private final nzg g;

    public nye(nzp nzpVar, nzg nzgVar) {
        super(nzpVar, nvj.a);
        this.e = new it();
        this.g = nzgVar;
        this.f.c("ConnectionlessLifecycleHelper", this);
    }

    private final void m() {
        if (this.e.isEmpty()) {
            return;
        }
        this.g.f(this);
    }

    @Override // defpackage.nxu
    protected final void e(nve nveVar, int i) {
        this.g.d(nveVar, i);
    }

    @Override // defpackage.nxu
    protected final void f() {
        this.g.e();
    }

    @Override // defpackage.nzo
    public final void h() {
        m();
    }

    @Override // defpackage.nzo
    public final void i() {
        this.a = true;
        m();
    }

    @Override // defpackage.nzo
    public final void j() {
        this.a = false;
        Object obj = nzg.c;
        nzg nzgVar = this.g;
        synchronized (obj) {
            if (nzgVar.m == this) {
                nzgVar.m = null;
                nzgVar.n.clear();
            }
        }
    }
}
