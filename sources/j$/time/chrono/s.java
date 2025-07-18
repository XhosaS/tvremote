package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s implements n {
    public static final s AH;
    public static final /* synthetic */ s[] a;

    static {
        s sVar = new s("AH", 0);
        AH = sVar;
        a = new s[]{sVar};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) a.clone();
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.p(this, pVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.k(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.ERA ? j$.time.temporal.t.f(1L, 1L) : j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.t(this, bVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(1, j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ long x(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.m(this, pVar);
    }
}
