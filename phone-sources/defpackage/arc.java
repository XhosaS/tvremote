package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arc {
    public static final yy a;
    public static final yy b;
    public static final float c;
    public static final float d;
    private static final float e;

    static {
        za zaVar = new za(24.0f, 8.0f, 24.0f, 8.0f);
        a = zaVar;
        new za(16.0f, 8.0f, 24.0f, 8.0f);
        e = 12.0f;
        b = new za(12.0f, zaVar.a, 12.0f, zaVar.b);
        new za(12.0f, zaVar.a, 16.0f, zaVar.b);
        c = 58.0f;
        d = 40.0f;
    }

    public static final arb a(arl arlVar) {
        arb arbVar = arlVar.W;
        if (arbVar != null) {
            return arbVar;
        }
        long jE = arm.e(arlVar, 26);
        long jE2 = arm.e(arlVar, 10);
        long jE3 = arm.e(arlVar, 18);
        long jK = bny.k(bnq.d(jE3), bnq.c(jE3), bnq.b(jE3), 0.1f, bnq.f(jE3));
        long jE4 = arm.e(arlVar, 19);
        arb arbVar2 = new arb(jE, jE2, jK, bny.k(bnq.d(jE4), bnq.c(jE4), bnq.b(jE4), 0.38f, bnq.f(jE4)));
        arlVar.W = arbVar2;
        return arbVar2;
    }

    public static final arb b(long j, long j2, long j3, long j4, bao baoVar, int i) {
        if ((i & 1) != 0) {
            j = bnq.g;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = bnq.g;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = bnq.g;
        }
        return a(wv.K(baoVar)).c(j5, j6, j3, (i & 8) != 0 ? bnq.g : j4);
    }

    public static final ard c(int i) {
        return new ard((i & 8) != 0 ? 1.0f : 0.0f);
    }
}
