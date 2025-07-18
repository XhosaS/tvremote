package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0131k implements r1 {
    public final int a;
    public final Object b;
    public final j$.desugar.sun.nio.fs.n c;
    public final j$.desugar.sun.nio.fs.n d;

    public C0131k(boolean z, b1 b1Var, Optional optional, j$.desugar.sun.nio.fs.n nVar, j$.desugar.sun.nio.fs.n nVar2) {
        this.a = (z ? 0 : a1.p) | a1.s;
        this.b = optional;
        this.c = nVar;
        this.d = nVar2;
    }

    @Override // j$.util.stream.r1
    public final Object a(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        s1 s1Var = (s1) this.d.get();
        abstractC0111a.n(spliterator, s1Var);
        Object obj = s1Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.r1
    public final Object b(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        return new C0137n(this, a1.ORDERED.t(abstractC0111a.f), abstractC0111a, spliterator).invoke();
    }

    @Override // j$.util.stream.r1
    public final int c() {
        return this.a;
    }
}
