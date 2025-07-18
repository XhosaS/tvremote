package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ahmj {
    public static final long a(String str, long j, long j2, long j3) {
        String strA = ahmi.a(str);
        if (strA == null) {
            return j;
        }
        Long lE = agyv.e(strA);
        if (lE == null) {
            throw new IllegalStateException(a.n(strA, str, "System property '", "' has unrecognized value '", "'"));
        }
        long jLongValue = lE.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + "'");
    }

    public static final boolean b(String str, boolean z) {
        String strA = ahmi.a(str);
        return strA != null ? Boolean.parseBoolean(strA) : z;
    }

    public static /* synthetic */ int c(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) a(str, i, i5, i3);
    }
}
