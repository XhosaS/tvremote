package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfy {
    public static final int a(long j) {
        int iB = b(j, 1);
        if (iB == -21) {
            iB = b(j, 2);
        }
        int iB2 = b(j, 0);
        if (iB2 != -21 && iB2 <= iB) {
            iB = iB2;
        }
        if (e(j)) {
            return iB;
        }
        int iA = mff.a(iB);
        if (iA <= 0 || iA > 10) {
            throw new IllegalArgumentException(a.b(iA, "Invalid java priority: "));
        }
        return mff.a[iA - 1];
    }

    public static final int b(long j, int i) {
        return (((int) (j >>> ((i * 6) + 43))) & 63) - 21;
    }

    public static final boolean c(long j) {
        return ((j >>> 61) & 1) == 1;
    }

    public static final boolean d(long j) {
        return ((j >>> 62) & 1) == 1;
    }

    public static final boolean e(long j) {
        return (j >>> 63) == 1;
    }

    public static /* synthetic */ long f(long j, boolean z, boolean z2, boolean z3, int i, int i2, long j2, int i3) {
        if ((i3 & 1) != 0) {
            z = e(j);
        }
        boolean z4 = z;
        if ((i3 & 2) != 0) {
            z2 = d(j);
        }
        boolean z5 = z2;
        if ((i3 & 4) != 0) {
            z3 = c(j);
        }
        boolean z6 = z3;
        if ((i3 & 8) != 0) {
            i = b(j, 2);
        }
        return mga.a(z4, z5, z6, i, (i3 & 16) != 0 ? b(j, 1) : 0, (i3 & 32) != 0 ? b(j, 0) : i2, (i3 & 64) != 0 ? j & 8796093022207L : j2);
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
