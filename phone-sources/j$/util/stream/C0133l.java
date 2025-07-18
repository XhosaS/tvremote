package j$.util.stream;

import j$.util.Optional;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0133l extends AbstractC0135m {
    public static final C0131k c;

    static {
        b1 b1Var = b1.REFERENCE;
        c = new C0131k(true, b1Var, Optional.empty(), new j$.desugar.sun.nio.fs.n(19), new j$.desugar.sun.nio.fs.n(20));
        new C0131k(false, b1Var, Optional.empty(), new j$.desugar.sun.nio.fs.n(19), new j$.desugar.sun.nio.fs.n(20));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
