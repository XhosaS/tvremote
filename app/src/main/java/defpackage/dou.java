package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dou implements dop, don {
    public volatile don a;
    public volatile don b;
    private final dop c;
    private final Object d;
    private doo e;
    private doo f;
    private boolean g;

    public dou(Object obj, dop dopVar) {
        doo dooVar = doo.CLEARED;
        this.e = dooVar;
        this.f = dooVar;
        this.d = obj;
        this.c = dopVar;
    }

    @Override // defpackage.dop
    public final dop a() {
        dop dopVarA;
        synchronized (this.d) {
            dop dopVar = this.c;
            dopVarA = dopVar != null ? dopVar.a() : this;
        }
        return dopVarA;
    }

    @Override // defpackage.don
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != doo.SUCCESS) {
                    doo dooVar = this.f;
                    doo dooVar2 = doo.RUNNING;
                    if (dooVar != dooVar2) {
                        this.f = dooVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    doo dooVar3 = this.e;
                    doo dooVar4 = doo.RUNNING;
                    if (dooVar3 != dooVar4) {
                        this.e = dooVar4;
                        this.a.b();
                    }
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.don
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            doo dooVar = doo.CLEARED;
            this.e = dooVar;
            this.f = dooVar;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.dop
    public final void d(don donVar) {
        synchronized (this.d) {
            if (!donVar.equals(this.a)) {
                this.f = doo.FAILED;
                return;
            }
            this.e = doo.FAILED;
            dop dopVar = this.c;
            if (dopVar != null) {
                dopVar.d(this);
            }
        }
    }

    @Override // defpackage.dop
    public final void e(don donVar) {
        synchronized (this.d) {
            if (donVar.equals(this.b)) {
                this.f = doo.SUCCESS;
                return;
            }
            this.e = doo.SUCCESS;
            dop dopVar = this.c;
            if (dopVar != null) {
                dopVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.don
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = doo.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = doo.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.dop
    public final boolean g(don donVar) {
        boolean z;
        synchronized (this.d) {
            dop dopVar = this.c;
            z = false;
            if ((dopVar == null || dopVar.g(this)) && donVar.equals(this.a) && this.e != doo.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dop
    public final boolean h(don donVar) {
        boolean z;
        synchronized (this.d) {
            dop dopVar = this.c;
            z = false;
            if ((dopVar == null || dopVar.h(this)) && donVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dop
    public final boolean i(don donVar) {
        boolean z;
        synchronized (this.d) {
            dop dopVar = this.c;
            z = false;
            if ((dopVar == null || dopVar.i(this)) && (donVar.equals(this.a) || this.e != doo.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dop, defpackage.don
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.don
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == doo.CLEARED;
        }
        return z;
    }

    @Override // defpackage.don
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == doo.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.don
    public final boolean m(don donVar) {
        if (donVar instanceof dou) {
            dou douVar = (dou) donVar;
            if (this.a != null ? this.a.m(douVar.a) : douVar.a == null) {
                if (this.b == null) {
                    if (douVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(douVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.don
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == doo.RUNNING;
        }
        return z;
    }
}
