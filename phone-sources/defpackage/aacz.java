package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class aacz extends aacw {
    private static final int[] H = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] I = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] J = new long[12];
    private static final long[] K = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (i < 11) {
            j += H[i] * 86400000;
            int i2 = i + 1;
            J[i2] = j;
            j2 += I[i] * 86400000;
            K[i2] = j2;
            i = i2;
        }
    }

    public aacz(aabk aabkVar, int i) {
        super(aabkVar, i);
    }

    @Override // defpackage.aacw
    public final int T(int i, int i2) {
        int i3 = i2 - 1;
        return al(i) ? I[i3] : H[i3];
    }

    @Override // defpackage.aacw
    public final int V(long j, int i) {
        long jAg = j - ag(i);
        boolean zAl = al(i);
        int i2 = (int) (jAg >> 10);
        if (i2 < (true != zAl ? 15271875 : 15356250)) {
            if (i2 < (true != zAl ? 7593750 : 7678125)) {
                if (i2 < 2615625) {
                    return 1;
                }
                return i2 >= (true != zAl ? 4978125 : 5062500) ? 3 : 2;
            }
            if (i2 < (true != zAl ? 10125000 : 10209375)) {
                return 4;
            }
            return i2 >= (true != zAl ? 12740625 : 12825000) ? 6 : 5;
        }
        if (i2 < (true != zAl ? 23034375 : 23118750)) {
            if (i2 < (true != zAl ? 17887500 : 17971875)) {
                return 7;
            }
            return i2 >= (true != zAl ? 20503125 : 20587500) ? 9 : 8;
        }
        if (i2 < (true != zAl ? 25650000 : 25734375)) {
            return 10;
        }
        return i2 >= (true != zAl ? 28181250 : 28265625) ? 12 : 11;
    }

    @Override // defpackage.aacw
    public final long ae(int i, int i2) {
        int i3 = i2 - 1;
        return al(i) ? K[i3] : J[i3];
    }

    @Override // defpackage.aacw
    public final long af(long j, long j2) {
        int iAa = aa(j);
        int iAa2 = aa(j2);
        long jAg = j - ag(iAa);
        long jAg2 = j2 - ag(iAa2);
        if (jAg2 >= 5097600000L) {
            if (al(iAa2)) {
                if (!al(iAa)) {
                    jAg2 -= 86400000;
                }
            } else if (jAg >= 5097600000L && al(iAa)) {
                jAg -= 86400000;
            }
        }
        int i = iAa - iAa2;
        if (jAg < jAg2) {
            i--;
        }
        return i;
    }

    @Override // defpackage.aacw
    public final long aj(long j, int i) {
        int iAa = aa(j);
        int iR = R(j, iAa);
        if (iR > 59) {
            if (al(iAa)) {
                if (!al(i)) {
                    iR--;
                }
            } else if (al(i)) {
                iR++;
            }
        }
        return ah(i, 1, iR) + U(j);
    }

    @Override // defpackage.aacw
    public final boolean ak(long j) {
        return this.k.a(j) == 29 && this.m.v(j);
    }
}
