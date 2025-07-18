package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hve implements huz, hux {
    public volatile hux a;
    public volatile hux b;
    private final huz c;
    private final Object d;
    private huy e;
    private huy f;
    private boolean g;

    public hve(Object obj, huz huzVar) {
        huy huyVar = huy.CLEARED;
        this.e = huyVar;
        this.f = huyVar;
        this.d = obj;
        this.c = huzVar;
    }

    @Override // defpackage.huz
    public final huz a() {
        huz huzVarA;
        synchronized (this.d) {
            huz huzVar = this.c;
            huzVarA = huzVar != null ? huzVar.a() : this;
        }
        return huzVarA;
    }

    @Override // defpackage.hux
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != huy.SUCCESS) {
                    huy huyVar = this.f;
                    huy huyVar2 = huy.RUNNING;
                    if (huyVar != huyVar2) {
                        this.f = huyVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    huy huyVar3 = this.e;
                    huy huyVar4 = huy.RUNNING;
                    if (huyVar3 != huyVar4) {
                        this.e = huyVar4;
                        this.a.b();
                    }
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.hux
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            huy huyVar = huy.CLEARED;
            this.e = huyVar;
            this.f = huyVar;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.huz
    public final void d(hux huxVar) {
        synchronized (this.d) {
            if (!huxVar.equals(this.a)) {
                this.f = huy.FAILED;
                return;
            }
            this.e = huy.FAILED;
            huz huzVar = this.c;
            if (huzVar != null) {
                huzVar.d(this);
            }
        }
    }

    @Override // defpackage.huz
    public final void e(hux huxVar) {
        synchronized (this.d) {
            if (huxVar.equals(this.b)) {
                this.f = huy.SUCCESS;
                return;
            }
            this.e = huy.SUCCESS;
            huz huzVar = this.c;
            if (huzVar != null) {
                huzVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.hux
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = huy.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = huy.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.huz
    public final boolean g(hux huxVar) {
        boolean z;
        synchronized (this.d) {
            huz huzVar = this.c;
            z = false;
            if ((huzVar == null || huzVar.g(this)) && huxVar.equals(this.a) && this.e != huy.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.huz
    public final boolean h(hux huxVar) {
        boolean z;
        synchronized (this.d) {
            huz huzVar = this.c;
            z = false;
            if ((huzVar == null || huzVar.h(this)) && huxVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.huz
    public final boolean i(hux huxVar) {
        boolean z;
        synchronized (this.d) {
            huz huzVar = this.c;
            z = false;
            if ((huzVar == null || huzVar.i(this)) && (huxVar.equals(this.a) || this.e != huy.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.huz, defpackage.hux
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

    @Override // defpackage.hux
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == huy.CLEARED;
        }
        return z;
    }

    @Override // defpackage.hux
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == huy.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.hux
    public final boolean m(hux huxVar) {
        if (huxVar instanceof hve) {
            hve hveVar = (hve) huxVar;
            if (this.a != null ? this.a.m(hveVar.a) : hveVar.a == null) {
                if (this.b == null) {
                    if (hveVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(hveVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hux
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == huy.RUNNING;
        }
        return z;
    }
}
