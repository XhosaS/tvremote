package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byw {
    public final bys a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public bzd p;
    public int q = 5;
    public final bzh o = new bzh(this);

    public byw(bys bysVar) {
        this.a = bysVar;
    }

    public final bzq a() {
        return this.a.t.d;
    }

    public final clv b() {
        bzh bzhVar = this.o;
        if (bzhVar.j) {
            return new clv(bzhVar.d);
        }
        return null;
    }

    public final clv c() {
        bzd bzdVar = this.p;
        if (bzdVar != null) {
            return bzdVar.l;
        }
        return null;
    }

    public final void d() {
        this.o.x = true;
        bzd bzdVar = this.p;
        if (bzdVar != null) {
            bzdVar.r = true;
        }
    }

    public final void e() {
        this.e = true;
        this.f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r4 = this;
            bys r0 = r4.a
            int r0 = r0.av()
            r1 = 3
            r2 = 4
            r3 = 1
            if (r0 == r1) goto Le
            if (r0 != r2) goto L1b
            r0 = r2
        Le:
            bzh r1 = r4.o
            boolean r1 = r1.y
            if (r1 == 0) goto L18
            r4.j(r3)
            goto L1b
        L18:
            r4.i(r3)
        L1b:
            if (r0 != r2) goto L2c
            bzd r0 = r4.p
            if (r0 == 0) goto L29
            boolean r0 = r0.s
            if (r0 != r3) goto L29
            r4.l(r3)
            return
        L29:
            r4.k(r3)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byw.f():void");
    }

    public final void g(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            bys bysVarJ = this.a.j();
            byw bywVar = bysVarJ != null ? bysVarJ.u : null;
            if (bywVar != null) {
                if (i == 0) {
                    bywVar.g(bywVar.k - 1);
                } else {
                    bywVar.g(bywVar.k + 1);
                }
            }
        }
    }

    public final void h(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            bys bysVarJ = this.a.j();
            byw bywVar = bysVarJ != null ? bysVarJ.u : null;
            if (bywVar != null) {
                if (i == 0) {
                    bywVar.h(bywVar.n - 1);
                } else {
                    bywVar.h(bywVar.n + 1);
                }
            }
        }
    }

    public final void i(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z) {
                if (this.i) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (this.i) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void j(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (z) {
                if (this.j) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (this.j) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void k(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z) {
                if (this.l) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (this.l) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z) {
                if (this.m) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (this.m) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void m() {
        bzh bzhVar = this.o;
        if ((bzhVar.r != null || bzhVar.q().g() != null) && bzhVar.q) {
            bzhVar.q = false;
            bzhVar.r = bzhVar.q().g();
            bys bysVarJ = this.a.j();
            if (bysVarJ != null) {
                bys.aq(bysVarJ, false, 7);
            }
        }
        bzd bzdVar = this.p;
        if (bzdVar != null) {
            if (bzdVar.u == null) {
                bza bzaVarB = bzdVar.r().B();
                bzaVarB.getClass();
                if (bzaVarB.g() == null) {
                    return;
                }
            }
            if (bzdVar.t) {
                bzdVar.t = false;
                bza bzaVarB2 = bzdVar.r().B();
                bzaVarB2.getClass();
                bzdVar.u = bzaVarB2.g();
                bys bysVar = this.a;
                if (cbp.V(bysVar)) {
                    bys bysVarJ2 = bysVar.j();
                    if (bysVarJ2 != null) {
                        bys.aq(bysVarJ2, false, 7);
                        return;
                    }
                    return;
                }
                bys bysVarJ3 = bysVar.j();
                if (bysVarJ3 != null) {
                    bys.ao(bysVarJ3, false, 7);
                }
            }
        }
    }

    public final boolean n() {
        return this.o.v;
    }
}
