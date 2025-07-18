package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drk implements dva, dtn {
    public byte a;
    public drj b;
    public dww c;
    public dri d;
    public Drawable e;
    public String f;
    public boolean g;

    @Override // defpackage.dva
    public final void A(int i, float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void B(int i, int i2) {
        throw null;
    }

    @Override // defpackage.dva
    public final void C() {
        throw null;
    }

    public final drj D() {
        if (this.b == null) {
            this.b = new drj();
        }
        return this.b;
    }

    public final dva E() {
        if (this.d == null) {
            this.d = new dri();
        }
        return this.d;
    }

    public final dww F() {
        if (this.c == null) {
            this.c = new dww();
        }
        return this.c;
    }

    @Override // defpackage.dtn
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        drk drkVar = (drk) obj;
        if (this == drkVar) {
            return true;
        }
        return drkVar != null && this.a == drkVar.a && this.g == drkVar.g && eca.a(this.e, drkVar.e) && drm.b(this.b, drkVar.b) && drm.b(this.c, drkVar.c) && drm.b(this.d, drkVar.d) && drm.a(this.f, drkVar.f) && drm.a(null, null);
    }

    @Override // defpackage.dva
    public final void b(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void c(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void d(int i) {
        throw null;
    }

    @Override // defpackage.dva
    public final void e(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void f(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void g(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void h(int i) {
        throw null;
    }

    @Override // defpackage.dva
    public final void i(eny enyVar) {
        throw null;
    }

    @Override // defpackage.dva
    public final void j(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void k(int i) {
        throw null;
    }

    @Override // defpackage.dva
    public final void l(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void m(int i) {
        throw null;
    }

    @Override // defpackage.dva
    public final void n(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void o(int i) {
        throw null;
    }

    @Override // defpackage.dva
    public final void p(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void q(int i) {
        throw null;
    }

    @Override // defpackage.dva
    public final void r(float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void s(int i) {
        throw null;
    }

    @Override // defpackage.dva
    public final void t(int i) {
        throw null;
    }

    @Override // defpackage.dva
    public final void u(int i) {
        throw null;
    }

    @Override // defpackage.dva
    public final void v(int i, float f) {
        int i2 = i - 1;
        dva dvaVarE = E();
        if (i2 == 0) {
            ((dri) dvaVarE).z = f;
            return;
        }
        dri driVar = (dri) dvaVarE;
        if (i2 != 1) {
            driVar.B = f;
        } else {
            driVar.A = f;
        }
    }

    @Override // defpackage.dva
    public final void w(int i, float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void x(int i, int i2) {
        throw null;
    }

    @Override // defpackage.dva
    public final void y(int i, float f) {
        throw null;
    }

    @Override // defpackage.dva
    public final void z(int i, int i2) {
        throw null;
    }
}
