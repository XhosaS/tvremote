package j$.time;

import android.support.v7.appcompat.R;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j implements j$.time.temporal.k, j$.time.temporal.l {
    public static final j APRIL;
    public static final j AUGUST;
    public static final j DECEMBER;
    public static final j FEBRUARY;
    public static final j JANUARY;
    public static final j JULY;
    public static final j JUNE;
    public static final j MARCH;
    public static final j MAY;
    public static final j NOVEMBER;
    public static final j OCTOBER;
    public static final j SEPTEMBER;
    public static final j[] a;
    public static final /* synthetic */ j[] b;

    static {
        j jVar = new j("JANUARY", 0);
        JANUARY = jVar;
        j jVar2 = new j("FEBRUARY", 1);
        FEBRUARY = jVar2;
        j jVar3 = new j("MARCH", 2);
        MARCH = jVar3;
        j jVar4 = new j("APRIL", 3);
        APRIL = jVar4;
        j jVar5 = new j("MAY", 4);
        MAY = jVar5;
        j jVar6 = new j("JUNE", 5);
        JUNE = jVar6;
        j jVar7 = new j("JULY", 6);
        JULY = jVar7;
        j jVar8 = new j("AUGUST", 7);
        AUGUST = jVar8;
        j jVar9 = new j("SEPTEMBER", 8);
        SEPTEMBER = jVar9;
        j jVar10 = new j("OCTOBER", 9);
        OCTOBER = jVar10;
        j jVar11 = new j("NOVEMBER", 10);
        NOVEMBER = jVar11;
        j jVar12 = new j("DECEMBER", 11);
        DECEMBER = jVar12;
        b = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12};
        a = values();
    }

    public static j N(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        throw new b("Invalid value for MonthOfYear: " + i);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) b.clone();
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (nVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return nVar.m(this);
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.b ? j$.time.chrono.t.c : nVar == j$.time.temporal.o.c ? ChronoUnit.MONTHS : j$.time.temporal.o.c(this, nVar);
    }

    public final int K(boolean z) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 60;
            case 3:
                return (z ? 1 : 0) + 91;
            case 4:
                return (z ? 1 : 0) + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            case 5:
                return (z ? 1 : 0) + 152;
            case 6:
                return (z ? 1 : 0) + 182;
            case 7:
                return (z ? 1 : 0) + 213;
            case 8:
                return (z ? 1 : 0) + 244;
            case 9:
                return (z ? 1 : 0) + 274;
            case 10:
                return (z ? 1 : 0) + 305;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int L(boolean z) {
        int iOrdinal = ordinal();
        return iOrdinal != 1 ? (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31 : z ? 29 : 28;
    }

    public final int M() {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            return (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        }
        return 29;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.MONTH_OF_YEAR : nVar != null && nVar.i(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.MONTH_OF_YEAR ? nVar.range() : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        if (!j$.desugar.sun.nio.fs.g.w(temporal).equals(j$.time.chrono.t.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.a(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
