package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class K implements n {
    public static final K BE;
    public static final K BEFORE_BE;
    public static final /* synthetic */ K[] a;

    static {
        K k = new K("BEFORE_BE", 0);
        BEFORE_BE = k;
        K k2 = new K("BE", 1);
        BE = k2;
        a = new K[]{k, k2};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) a.clone();
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
