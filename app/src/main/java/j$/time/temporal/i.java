package j$.time.temporal;

import j$.time.format.D;
import j$.time.format.E;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class i implements n {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;
    public static final /* synthetic */ i[] f;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient TemporalUnit b;
    public final transient TemporalUnit c;
    public final transient q d;
    public final transient long e;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        f = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = chronoUnit;
        this.c = chronoUnit2;
        this.d = q.f((-365243219162L) + j, 365241780471L + j);
        this.e = j;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f.clone();
    }

    @Override // j$.time.temporal.n
    public final Temporal E(Temporal temporal, long j) {
        if (this.d.e(j)) {
            return temporal.a(j$.desugar.sun.nio.fs.g.L(j, this.e), a.EPOCH_DAY);
        }
        throw new j$.time.b("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.n
    public final boolean i(k kVar) {
        return kVar.d(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.n
    public final q l(k kVar) {
        if (kVar.d(a.EPOCH_DAY)) {
            return this.d;
        }
        throw new j$.time.b("Unsupported field: ".concat(String.valueOf(this)));
    }

    @Override // j$.time.temporal.n
    public final k m(Map map, D d, E e) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.m mVarW = j$.desugar.sun.nio.fs.g.w(d);
        E e2 = E.LENIENT;
        long j = this.e;
        if (e == e2) {
            return mVarW.h(j$.desugar.sun.nio.fs.g.L(jLongValue, j));
        }
        this.d.b(jLongValue, this);
        return mVarW.h(jLongValue - j);
    }

    @Override // j$.time.temporal.n
    public final q range() {
        return this.d;
    }

    @Override // j$.time.temporal.n
    public final long t(k kVar) {
        return kVar.H(a.EPOCH_DAY) + this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
