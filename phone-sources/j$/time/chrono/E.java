package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class E implements n {
    public static final E BEFORE_ROC;
    public static final E ROC;
    public static final /* synthetic */ E[] a;

    static {
        E e = new E("BEFORE_ROC", 0);
        BEFORE_ROC = e;
        E e2 = new E("ROC", 1);
        ROC = e2;
        a = new E[]{e, e2};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) a.clone();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ long C(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.j(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.p(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.l(this, nVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int i(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.i(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }
}
