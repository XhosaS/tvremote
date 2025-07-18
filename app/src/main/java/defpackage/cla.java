package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cla {
    public final long a(boolean z, int i, cah cahVar, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        long j7;
        cahVar.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j8 = j2 + 900000;
                if (j6 < j8) {
                    return j8;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = cahVar == cah.b ? j * i : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (!z2) {
            if (j2 == -1) {
                return Long.MAX_VALUE;
            }
            return j2 + j3;
        }
        if (i2 == 0) {
            j7 = j2 + j3;
            i2 = 0;
        } else {
            j7 = j2 + j5;
        }
        return (j4 == j5 || i2 != 0) ? j7 : j7 + (j5 - j4);
    }
}
