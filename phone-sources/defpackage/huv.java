package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huv implements huz, hux {
    public volatile hux a;
    public volatile hux b;
    private final Object c;
    private final huz d;
    private huy e;
    private huy f;

    public huv(Object obj, huz huzVar) {
        huy huyVar = huy.CLEARED;
        this.e = huyVar;
        this.f = huyVar;
        this.c = obj;
        this.d = huzVar;
    }

    @Override // defpackage.huz
    public final huz a() {
        huz huzVarA;
        synchronized (this.c) {
            huz huzVar = this.d;
            huzVarA = huzVar != null ? huzVar.a() : this;
        }
        return huzVarA;
    }

    @Override // defpackage.hux
    public final void b() {
        synchronized (this.c) {
            huy huyVar = this.e;
            huy huyVar2 = huy.RUNNING;
            if (huyVar != huyVar2) {
                this.e = huyVar2;
                this.a.b();
            }
        }
    }

    @Override // defpackage.hux
    public final void c() {
        synchronized (this.c) {
            huy huyVar = huy.CLEARED;
            this.e = huyVar;
            this.a.c();
            if (this.f != huyVar) {
                this.f = huyVar;
                this.b.c();
            }
        }
    }

    @Override // defpackage.huz
    public final void d(hux huxVar) {
        synchronized (this.c) {
            if (huxVar.equals(this.b)) {
                this.f = huy.FAILED;
                huz huzVar = this.d;
                if (huzVar != null) {
                    huzVar.d(this);
                }
                return;
            }
            this.e = huy.FAILED;
            huy huyVar = this.f;
            huy huyVar2 = huy.RUNNING;
            if (huyVar != huyVar2) {
                this.f = huyVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.huz
    public final void e(hux huxVar) {
        synchronized (this.c) {
            if (huxVar.equals(this.a)) {
                this.e = huy.SUCCESS;
            } else if (huxVar.equals(this.b)) {
                this.f = huy.SUCCESS;
            }
            huz huzVar = this.d;
            if (huzVar != null) {
                huzVar.e(this);
            }
        }
    }

    @Override // defpackage.hux
    public final void f() {
        synchronized (this.c) {
            huy huyVar = this.e;
            huy huyVar2 = huy.RUNNING;
            if (huyVar == huyVar2) {
                this.e = huy.PAUSED;
                this.a.f();
            }
            if (this.f == huyVar2) {
                this.f = huy.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.huz
    public final boolean g(hux huxVar) {
        boolean z;
        synchronized (this.c) {
            huz huzVar = this.d;
            z = false;
            if ((huzVar == null || huzVar.g(this)) && huxVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.huz
    public final boolean h(hux huxVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.c) {
            huz huzVar = this.d;
            z = false;
            if (huzVar == null || huzVar.h(this)) {
                huy huyVar = this.e;
                huy huyVar2 = huy.FAILED;
                if (huyVar == huyVar2) {
                    if (huxVar.equals(this.b)) {
                        huy huyVar3 = this.f;
                        if (huyVar3 != huy.SUCCESS) {
                            if (huyVar3 == huyVar2) {
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
                zEquals = huxVar.equals(this.a);
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.huz
    public final boolean i(hux huxVar) {
        boolean z;
        synchronized (this.c) {
            huz huzVar = this.d;
            z = true;
            if (huzVar != null && !huzVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.huz, defpackage.hux
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

    @Override // defpackage.hux
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            huy huyVar = this.e;
            huy huyVar2 = huy.CLEARED;
            z = false;
            if (huyVar == huyVar2 && this.f == huyVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.hux
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            huy huyVar = this.e;
            huy huyVar2 = huy.SUCCESS;
            z = true;
            if (huyVar != huyVar2 && this.f != huyVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hux
    public final boolean m(hux huxVar) {
        if (huxVar instanceof huv) {
            huv huvVar = (huv) huxVar;
            if (this.a.m(huvVar.a) && this.b.m(huvVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hux
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            huy huyVar = this.e;
            huy huyVar2 = huy.RUNNING;
            z = true;
            if (huyVar != huyVar2 && this.f != huyVar2) {
                z = false;
            }
        }
        return z;
    }
}
