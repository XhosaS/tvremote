package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agxb extends agxa {
    public static final long a(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + ".");
    }

    public static final agwy b(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? agwy.d : new agwy(i, i2 - 1);
    }
}
