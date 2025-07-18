package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dol implements dop, don {
    public volatile don a;
    public volatile don b;
    private final Object c;
    private final dop d;
    private doo e;
    private doo f;

    public dol(Object obj, dop dopVar) {
        doo dooVar = doo.CLEARED;
        this.e = dooVar;
        this.f = dooVar;
        this.c = obj;
        this.d = dopVar;
    }

    @Override // defpackage.dop
    public final dop a() {
        dop dopVarA;
        synchronized (this.c) {
            dop dopVar = this.d;
            dopVarA = dopVar != null ? dopVar.a() : this;
        }
        return dopVarA;
    }

    @Override // defpackage.don
    public final void b() {
        synchronized (this.c) {
            doo dooVar = this.e;
            doo dooVar2 = doo.RUNNING;
            if (dooVar != dooVar2) {
                this.e = dooVar2;
                this.a.b();
            }
        }
    }

    @Override // defpackage.don
    public final void c() {
        synchronized (this.c) {
            doo dooVar = doo.CLEARED;
            this.e = dooVar;
            this.a.c();
            if (this.f != dooVar) {
                this.f = dooVar;
                this.b.c();
            }
        }
    }

    @Override // defpackage.dop
    public final void d(don donVar) {
        synchronized (this.c) {
            if (donVar.equals(this.b)) {
                this.f = doo.FAILED;
                dop dopVar = this.d;
                if (dopVar != null) {
                    dopVar.d(this);
                }
                return;
            }
            this.e = doo.FAILED;
            doo dooVar = this.f;
            doo dooVar2 = doo.RUNNING;
            if (dooVar != dooVar2) {
                this.f = dooVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.dop
    public final void e(don donVar) {
        synchronized (this.c) {
            if (donVar.equals(this.a)) {
                this.e = doo.SUCCESS;
            } else if (donVar.equals(this.b)) {
                this.f = doo.SUCCESS;
            }
            dop dopVar = this.d;
            if (dopVar != null) {
                dopVar.e(this);
            }
        }
    }

    @Override // defpackage.don
    public final void f() {
        synchronized (this.c) {
            doo dooVar = this.e;
            doo dooVar2 = doo.RUNNING;
            if (dooVar == dooVar2) {
                this.e = doo.PAUSED;
                this.a.f();
            }
            if (this.f == dooVar2) {
                this.f = doo.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.dop
    public final boolean g(don donVar) {
        boolean z;
        synchronized (this.c) {
            dop dopVar = this.d;
            z = false;
            if ((dopVar == null || dopVar.g(this)) && donVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dop
    public final boolean h(don donVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.c) {
            dop dopVar = this.d;
            z = false;
            if (dopVar == null || dopVar.h(this)) {
                doo dooVar = this.e;
                doo dooVar2 = doo.FAILED;
                if (dooVar == dooVar2) {
                    if (donVar.equals(this.b)) {
                        doo dooVar3 = this.f;
                        if (dooVar3 != doo.SUCCESS) {
                            if (dooVar3 == dooVar2) {
                                z = true;
                            }
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else {
                        zEquals = false;
                    }
                }
                zEquals = donVar.equals(this.a);
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.dop
    public final boolean i(don donVar) {
        boolean z;
        synchronized (this.c) {
            dop dopVar = this.d;
            z = true;
            if (dopVar != null && !dopVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dop, defpackage.don
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.don
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            doo dooVar = this.e;
            doo dooVar2 = doo.CLEARED;
            z = false;
            if (dooVar == dooVar2 && this.f == dooVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.don
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            doo dooVar = this.e;
            doo dooVar2 = doo.SUCCESS;
            z = true;
            if (dooVar != dooVar2 && this.f != dooVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.don
    public final boolean m(don donVar) {
        if (donVar instanceof dol) {
            dol dolVar = (dol) donVar;
            if (this.a.m(dolVar.a) && this.b.m(dolVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.don
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            doo dooVar = this.e;
            doo dooVar2 = doo.RUNNING;
            z = true;
            if (dooVar != dooVar2 && this.f != dooVar2) {
                z = false;
            }
        }
        return z;
    }
}
