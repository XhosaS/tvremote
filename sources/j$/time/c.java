package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c implements j$.time.temporal.m, j$.time.temporal.n {
    public static final c FRIDAY;
    public static final c MONDAY;
    public static final c SATURDAY;
    public static final c SUNDAY;
    public static final c THURSDAY;
    public static final c TUESDAY;
    public static final c WEDNESDAY;
    public static final c[] a;
    public static final /* synthetic */ c[] b;

    static {
        c cVar = new c("MONDAY", 0);
        MONDAY = cVar;
        c cVar2 = new c("TUESDAY", 1);
        TUESDAY = cVar2;
        c cVar3 = new c("WEDNESDAY", 2);
        WEDNESDAY = cVar3;
        c cVar4 = new c("THURSDAY", 3);
        THURSDAY = cVar4;
        c cVar5 = new c("FRIDAY", 4);
        FRIDAY = cVar5;
        c cVar6 = new c("SATURDAY", 5);
        SATURDAY = cVar6;
        c cVar7 = new c("SUNDAY", 6);
        SUNDAY = cVar7;
        b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        a = values();
    }

    public static c D(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        throw new C0003b("Invalid value for DayOfWeek: " + i);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) b.clone();
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.DAY_OF_WEEK : pVar != null && pVar.i(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.DAY_OF_WEEK ? pVar.k() : j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.q.c ? j$.time.temporal.b.DAYS : j$.time.temporal.q.c(this, bVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
        return pVar.l(this);
    }
}
