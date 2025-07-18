package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndl {
    public final ndk a;
    public final ndi b;
    public final ndk c;
    public final ndk d;
    public final ndk e;
    public final ndj f;
    public final ndj g;
    public final ndj h;
    public final ndj i;
    public final ndj j;
    public int k;
    public int l;
    public float m;

    public ndl(ndk ndkVar, ndi ndiVar, ndk ndkVar2, ndk ndkVar3, ndk ndkVar4, ndj ndjVar, ndj ndjVar2, ndj ndjVar3, ndj ndjVar4, ndj ndjVar5) {
        this.a = ndkVar;
        this.b = ndiVar;
        this.c = ndkVar2;
        this.d = ndkVar3;
        this.e = ndkVar4;
        this.f = ndjVar;
        this.g = ndjVar2;
        this.h = ndjVar3;
        this.i = ndjVar4;
        this.j = ndjVar5;
    }

    public final float a() {
        return this.b.c;
    }

    public final float b() {
        return this.i.c;
    }

    public final float c() {
        return this.e.c;
    }

    public final float d() {
        return this.c.c;
    }

    public final float e() {
        return this.b.b;
    }

    public final float f() {
        return this.g.c;
    }

    public final void g(float f) {
        this.b.c(f);
    }

    public final void h(float f) {
        this.f.c(f);
    }

    public final void i(float f) {
        this.d.c(f);
    }

    public final void j(float f) {
        this.e.c(f);
    }

    public final void k(float f) {
        this.a.c(f);
    }

    public final void l(float f) {
        this.j.c(f);
    }

    public final void m(float f) {
        this.c.c(f);
    }

    public final void n(float f) {
        this.g.c(f);
    }

    public final void o(int i) {
        this.i.c(i);
    }

    public final void p(int i) {
        this.h.c(i);
    }

    public final void q(float f) {
        this.b.b(f);
    }

    public final void r(boolean z) {
        this.b.h(!z);
    }

    public final void s(boolean z) {
        this.e.h(!z);
    }

    public final void t(boolean z) {
        this.a.h(!z);
    }

    public final void u(boolean z) {
        this.c.h(!z);
    }

    public final void v(boolean z) {
        this.b.a = z;
    }

    public final void w(float f, float f2) {
        ndk ndkVar = this.a;
        float f3 = ndkVar.c;
        ndi ndiVar = this.b;
        float fCos = f3 * ((float) Math.cos(ndiVar.c));
        ndk ndkVar2 = this.d;
        float f4 = fCos + ndkVar2.c;
        float fSin = ndkVar.c * ((float) Math.sin(ndiVar.c));
        ndk ndkVar3 = this.e;
        float f5 = fSin + ndkVar3.c;
        ndiVar.e(f);
        ndkVar.e(f2);
        float fCos2 = ndkVar.c * ((float) Math.cos(ndiVar.c));
        float fSin2 = ndkVar.c * ((float) Math.sin(ndiVar.c));
        ndkVar2.e(f4 - fCos2);
        ndkVar3.e(f5 - fSin2);
    }

    public final boolean x() {
        return this.i.c > 0.001f;
    }

    public final boolean y() {
        return this.g.c > 0.001f;
    }

    public final void z(float f, float f2, float f3, int i) {
        this.a.e(f);
        this.b.e(f2);
        this.g.e(f3);
        this.c.e(4.0f);
        this.d.e(0.0f);
        this.e.e(0.0f);
        this.h.e(0.0f);
        this.f.e(0.0f);
        this.j.e(1.0f);
        this.k = i;
        this.l = -12828605;
    }
}
