package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbj {
    public static final /* synthetic */ int a = 0;

    static {
        abzy abzyVar = abzy.a;
        abzx abzxVar = new abzx();
        if ((abzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar.y();
        }
        ((abzy) abzxVar.b).b = -62135596800L;
        if ((abzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar.y();
        }
        ((abzy) abzxVar.b).c = 0;
        abzx abzxVar2 = new abzx();
        if ((abzxVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar2.y();
        }
        ((abzy) abzxVar2.b).b = 253402300799L;
        if ((abzxVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar2.y();
        }
        ((abzy) abzxVar2.b).c = 999999999;
        abzx abzxVar3 = new abzx();
        if ((abzxVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar3.y();
        }
        ((abzy) abzxVar3.b).b = 0L;
        if ((abzxVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar3.y();
        }
        ((abzy) abzxVar3.b).c = 0;
        new acbi();
        h("now");
        h("getEpochSecond");
        h("getNano");
    }

    public static long a(abzy abzyVar) {
        f(abzyVar);
        return ztc.a(ztc.b(abzyVar.b, 1000L), abzyVar.c / 1000000);
    }

    public static long b(abzy abzyVar) {
        f(abzyVar);
        return ztc.a(ztc.b(abzyVar.b, 1000000000L), abzyVar.c);
    }

    public static abzy c(long j) {
        return e(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static abzy d(long j) {
        return e(j / 1000000000, (int) (j % 1000000000));
    }

    public static abzy e(long j, int i) {
        if (!g(j)) {
            throw new IllegalArgumentException(yro.a("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j)));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = ztc.a(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = ztc.c(j, 1L);
        }
        abzy abzyVar = abzy.a;
        abzx abzxVar = new abzx();
        if ((abzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar.y();
        }
        ((abzy) abzxVar.b).b = j;
        if ((abzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar.y();
        }
        ((abzy) abzxVar.b).c = i;
        abzy abzyVar2 = (abzy) abzxVar.v();
        f(abzyVar2);
        return abzyVar2;
    }

    public static void f(abzy abzyVar) {
        long j = abzyVar.b;
        boolean zG = g(j);
        int i = abzyVar.c;
        if (!zG || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(yro.a("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    private static boolean g(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }

    private static void h(String str) throws NoSuchMethodException, SecurityException {
        try {
            Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
        }
    }
}
