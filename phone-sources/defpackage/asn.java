package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asn {
    public static final yy a = new za(12.0f, 0.0f, 12.0f, 0.0f);

    public static final aso a(arl arlVar) {
        aso asoVar = arlVar.ac;
        if (asoVar != null) {
            return asoVar;
        }
        long jE = arm.e(arlVar, 18);
        long jE2 = arm.e(arlVar, 19);
        long jE3 = arm.e(arlVar, 19);
        long jE4 = arm.e(arlVar, 18);
        long jK = bny.k(bnq.d(jE4), bnq.c(jE4), bnq.b(jE4), 0.38f, bnq.f(jE4));
        long jE5 = arm.e(arlVar, 18);
        long jK2 = bny.k(bnq.d(jE5), bnq.c(jE5), bnq.b(jE5), 0.38f, bnq.f(jE5));
        long jE6 = arm.e(arlVar, 18);
        aso asoVar2 = new aso(jE, jE2, jE3, jK, jK2, bny.k(bnq.d(jE6), bnq.c(jE6), bnq.b(jE6), 0.38f, bnq.f(jE6)));
        arlVar.ac = asoVar2;
        return asoVar2;
    }

    public static final aso b(long j, long j2, long j3, long j4, long j5, long j6, bao baoVar, int i) {
        long j7 = (i & 1) != 0 ? bnq.g : j;
        long j8 = (i & 2) != 0 ? bnq.g : j2;
        long j9 = (i & 4) != 0 ? bnq.g : j3;
        long j10 = (i & 8) != 0 ? bnq.g : j4;
        long j11 = (i & 16) != 0 ? bnq.g : j5;
        long j12 = (i & 32) != 0 ? bnq.g : j6;
        aso asoVarA = a(wv.K(baoVar));
        if (j7 == 16) {
            j7 = asoVarA.a;
        }
        if (j8 == 16) {
            j8 = asoVarA.b;
        }
        if (j9 == 16) {
            j9 = asoVarA.c;
        }
        if (j10 == 16) {
            j10 = asoVarA.d;
        }
        if (j11 == 16) {
            j11 = asoVarA.e;
        }
        if (j12 == 16) {
            j12 = asoVarA.f;
        }
        return new aso(j7, j8, j9, j10, j11, j12);
    }
}
