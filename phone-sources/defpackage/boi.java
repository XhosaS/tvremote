package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boi implements clx {
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public long f;
    public long g;
    public float h;
    public float i;
    public long j;
    public bol k;
    public boolean l;
    public int m;
    public long n;
    public clx o;
    public cmi p;
    public int q;
    public boe r;

    public boi() {
        long j = bnw.a;
        this.f = j;
        this.g = j;
        this.i = 8.0f;
        this.j = bop.a;
        this.k = boh.a;
        this.m = 0;
        this.n = 9205357640488583168L;
        this.o = new cly(1.0f, 1.0f);
        this.p = cmi.a;
        this.q = 3;
    }

    public final void A() {
        if (yks.e(null, null)) {
            return;
        }
        this.a |= 131072;
    }

    @Override // defpackage.clx
    public final float a() {
        return this.o.a();
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.o.b();
    }

    @Override // defpackage.cmd
    public final /* synthetic */ float cn(long j) {
        return cme.e(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float co(float f) {
        return cme.g(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cp(int i) {
        return cme.h(this, i);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cq(long j) {
        return cme.i(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cr(float f) {
        return cme.j(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ int cu(float f) {
        return cme.k(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cv(long j) {
        return cme.l(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cw(long j) {
        return cme.m(this, j);
    }

    @Override // defpackage.cmd
    public final /* synthetic */ long cx(float f) {
        return cme.f(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cy(float f) {
        return cme.n(this, f);
    }

    public final void m(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void n(long j) {
        long j2 = this.f;
        long j3 = bnq.a;
        if (a.s(j2, j)) {
            return;
        }
        this.a |= 64;
        this.f = j;
    }

    public final void o(int i) {
        if (a.r(this.q, i)) {
            return;
        }
        this.a |= 524288;
        this.q = i;
    }

    public final void p(float f) {
        if (this.i == f) {
            return;
        }
        this.a |= RecyclerView.ItemAnimator.FLAG_MOVED;
        this.i = f;
    }

    public final void q(boolean z) {
        if (this.l != z) {
            this.a |= 16384;
            this.l = z;
        }
    }

    public final void r(int i) {
        if (a.r(this.m, i)) {
            return;
        }
        this.a |= 32768;
        this.m = i;
    }

    public final void s(float f) {
        if (this.h == f) {
            return;
        }
        this.a |= 1024;
        this.h = f;
    }

    public final void t(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void u(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void v(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 32;
        this.e = f;
    }

    public final void w(bol bolVar) {
        if (yks.e(this.k, bolVar)) {
            return;
        }
        this.a |= 8192;
        this.k = bolVar;
    }

    public final void x(long j) {
        long j2 = this.g;
        long j3 = bnq.a;
        if (a.s(j2, j)) {
            return;
        }
        this.a |= 128;
        this.g = j;
    }

    public final void y(long j) {
        long j2 = this.j;
        long j3 = bop.a;
        if (a.s(j2, j)) {
            return;
        }
        this.a |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.j = j;
    }

    public final void z() {
        if (yks.e(null, null)) {
            return;
        }
        this.a |= 262144;
    }
}
