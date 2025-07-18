package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jri {
    public int a;
    public float b;
    public final jrh c;
    public final jrh d;
    public final jrh e;
    public final jrh f;
    public final jrh g;
    public final jrh h;
    public final jrh i;
    public final jrh j;
    public final jrh k;

    public jri(jrh jrhVar, jrh jrhVar2, jrh jrhVar3, jrh jrhVar4, jrh jrhVar5, jrh jrhVar6, jrh jrhVar7, jrh jrhVar8, jrh jrhVar9) {
        this.c = jrhVar;
        this.d = jrhVar2;
        this.e = jrhVar3;
        this.f = jrhVar4;
        this.g = jrhVar5;
        this.h = jrhVar6;
        this.i = jrhVar7;
        this.j = jrhVar8;
        this.k = jrhVar9;
    }

    public final void a(float f, float f2, float f3, int i) {
        this.c.e(f);
        this.d.e(f2);
        this.i.e(f3);
        this.e.e(4.0f);
        this.f.e(0.0f);
        this.g.e(0.0f);
        this.j.e(0.0f);
        this.h.e(0.0f);
        this.a = i;
    }

    public final void b(boolean z) {
        this.d.f(!z);
    }

    public final void c(boolean z) {
        this.g.f(!z);
    }

    public final void d(boolean z) {
        this.c.f(!z);
    }

    public final void e(boolean z) {
        this.e.f(!z);
    }

    public final void f(float f, float f2) {
        jrh jrhVar = this.c;
        float f3 = jrhVar.f;
        jrh jrhVar2 = this.d;
        float fCos = f3 * ((float) Math.cos(jrhVar2.f));
        jrh jrhVar3 = this.f;
        float f4 = fCos + jrhVar3.f;
        float fSin = jrhVar.f * ((float) Math.sin(jrhVar2.f));
        jrh jrhVar4 = this.g;
        float f5 = fSin + jrhVar4.f;
        jrhVar2.e(f);
        jrhVar.e(f2);
        float fCos2 = jrhVar.f * ((float) Math.cos(jrhVar2.f));
        float fSin2 = jrhVar.f * ((float) Math.sin(jrhVar2.f));
        jrhVar3.e(f4 - fCos2);
        jrhVar4.e(f5 - fSin2);
    }

    public final boolean g() {
        return this.k.f > 0.001f;
    }

    public final boolean h() {
        return this.i.f > 0.001f;
    }
}
