package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
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

    @Override // j$.time.temporal.m
    public final /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.p(this, pVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.k(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.t(this, bVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ long x(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.m(this, pVar);
    }
}
