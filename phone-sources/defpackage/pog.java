package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pog {
    public static final yy a;
    public static final yy b;
    public static final float c;
    private static final float d;

    static {
        za zaVar = new za(24.0f, 8.0f, 24.0f, 8.0f);
        a = zaVar;
        new za(16.0f, 8.0f, 24.0f, 8.0f);
        d = 12.0f;
        b = new za(12.0f, zaVar.a, 12.0f, zaVar.b);
        new za(12.0f, zaVar.a, 16.0f, zaVar.b);
        c = 56.0f;
    }

    public static final bol a(bao baoVar) {
        baoVar.x(2031760353);
        bol bolVarB = pot.b(7, baoVar);
        ((bas) baoVar).aa();
        return bolVarB;
    }

    public static final arb b(long j, long j2, bao baoVar, int i) {
        baoVar.x(-1814124481);
        if ((i & 1) != 0) {
            j = rdd.R(26, baoVar);
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = rdd.R(10, baoVar);
        }
        long jR = rdd.R(18, baoVar);
        long jK = bny.k(bnq.d(jR), bnq.c(jR), bnq.b(jR), 0.1f, bnq.f(jR));
        long jR2 = rdd.R(18, baoVar);
        long jK2 = bny.k(bnq.d(jR2), bnq.c(jR2), bnq.b(jR2), 0.38f, bnq.f(jR2));
        yy yyVar = arc.a;
        arb arbVarB = arc.b(j3, j2, jK, jK2, baoVar, 0);
        ((bas) baoVar).aa();
        return arbVarB;
    }

    public static final ard c(bao baoVar) {
        baoVar.x(-2117320195);
        yy yyVar = arc.a;
        ard ardVarC = arc.c(0);
        ((bas) baoVar).aa();
        return ardVarC;
    }

    public static final arb d(bao baoVar) {
        baoVar.x(1137425277);
        long j = bnq.f;
        long jR = rdd.R(19, baoVar);
        long jR2 = rdd.R(18, baoVar);
        long jK = bny.k(bnq.d(jR2), bnq.c(jR2), bnq.b(jR2), 0.38f, bnq.f(jR2));
        yy yyVar = arc.a;
        arb arbVarB = arc.b(j, jR, j, jK, baoVar, 0);
        ((bas) baoVar).aa();
        return arbVarB;
    }

    public static final arb e(long j, bao baoVar, int i) {
        baoVar.x(1389225298);
        long j2 = (i & 1) != 0 ? bnq.f : 0L;
        if ((i & 2) != 0) {
            j = rdd.R(26, baoVar);
        }
        long j3 = j;
        long j4 = bnq.f;
        long jR = rdd.R(18, baoVar);
        long jK = bny.k(bnq.d(jR), bnq.c(jR), bnq.b(jR), 0.38f, bnq.f(jR));
        yy yyVar = arc.a;
        arb arbVarB = arc.b(j2, j3, j4, jK, baoVar, 0);
        ((bas) baoVar).aa();
        return arbVarB;
    }
}
