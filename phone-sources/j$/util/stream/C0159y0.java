package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0159y0 extends AbstractC0153v0 {
    @Override // j$.util.stream.AbstractC0153v0, j$.util.stream.r1
    public final Object a(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        return a1.SIZED.t(abstractC0111a.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.a(abstractC0111a, spliterator);
    }

    @Override // j$.util.stream.AbstractC0153v0, j$.util.stream.r1
    public final Object b(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        return a1.SIZED.t(abstractC0111a.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC0111a, spliterator);
    }

    @Override // j$.util.stream.r1
    public final int c() {
        return a1.p;
    }

    @Override // j$.util.stream.AbstractC0153v0
    public final InterfaceC0161z0 v() {
        return new B0();
    }
}
