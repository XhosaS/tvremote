package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
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
        return 1;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int i(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.i(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.ERA ? j$.time.temporal.q.f(1L, 1L) : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(1, j$.time.temporal.a.ERA);
    }
}
