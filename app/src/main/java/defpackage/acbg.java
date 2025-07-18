package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbg {
    public static final abwf a;

    static {
        abwf abwfVar = abwf.a;
        abwe abweVar = new abwe();
        if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar.y();
        }
        ((abwf) abweVar.b).b = -315576000000L;
        if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar.y();
        }
        ((abwf) abweVar.b).c = -999999999;
        abwe abweVar2 = new abwe();
        if ((abweVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar2.y();
        }
        ((abwf) abweVar2.b).b = 315576000000L;
        if ((abweVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar2.y();
        }
        ((abwf) abweVar2.b).c = 999999999;
        abwe abweVar3 = new abwe();
        if ((abweVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar3.y();
        }
        ((abwf) abweVar3.b).b = 0L;
        if ((abweVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar3.y();
        }
        ((abwf) abweVar3.b).c = 0;
        a = (abwf) abweVar3.v();
    }

    public static long a(abwf abwfVar) {
        e(abwfVar);
        return abwfVar.b / 3600;
    }

    public static long b(abwf abwfVar) {
        e(abwfVar);
        return ztc.a(ztc.b(abwfVar.b, 1000L), abwfVar.c / 1000000);
    }

    public static abwf c(long j) {
        return d(j / 1000000000, (int) (j % 1000000000));
    }

    public static abwf d(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = ztc.a(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        abwf abwfVar = abwf.a;
        abwe abweVar = new abwe();
        if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar.y();
        }
        ((abwf) abweVar.b).b = j;
        if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abweVar.y();
        }
        ((abwf) abweVar.b).c = i;
        abwf abwfVar2 = (abwf) abweVar.v();
        e(abwfVar2);
        return abwfVar2;
    }

    public static void e(abwf abwfVar) {
        long j = abwfVar.b;
        int i = abwfVar.c;
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return;
            }
            if (j <= 0 && i <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(yro.a("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
