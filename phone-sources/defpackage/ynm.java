package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes3.dex */
public final class ynm implements Comparable {
    public static final long a;
    public static final long b;
    public final long c;

    static {
        int i = ynn.a;
        a = ylh.i(4611686018427387903L);
        b = ylh.i(-4611686018427387903L);
    }

    public /* synthetic */ ynm(long j) {
        this.c = j;
    }

    private static final long A(long j, long j2) {
        long jM = ylh.m(j2);
        long j3 = j + jM;
        if (j3 < -4611686018426L || j3 >= 4611686018427L) {
            return ylh.i(ykn.p(j3, -4611686018427387903L, 4611686018427387903L));
        }
        long jL = j2 - ylh.l(jM);
        int i = ynn.a;
        long jL2 = ylh.l(j3) + jL;
        return jL2 + jL2;
    }

    public static final double a(long j, yno ynoVar) {
        ynoVar.getClass();
        if (j == a) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == b) {
            return Double.NEGATIVE_INFINITY;
        }
        return ykn.z(m(j), s(j), ynoVar);
    }

    public static int b(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return yks.b(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return w(j) ? -i : i;
    }

    public static final int c(long j) {
        if (v(j)) {
            return 0;
        }
        return (int) (i(j) % 24);
    }

    public static final int d(long j) {
        if (v(j)) {
            return 0;
        }
        return (int) (p(j, yno.e) % 60);
    }

    public static final int e(long j) {
        if (v(j)) {
            return 0;
        }
        boolean z = z(j);
        long jM = m(j);
        return (int) (z ? ylh.l(jM % 1000) : jM % 1000000000);
    }

    public static final int f(long j) {
        if (v(j)) {
            return 0;
        }
        return (int) (l(j) % 60);
    }

    public static final int g(long j, yno ynoVar) {
        ynoVar.getClass();
        return (int) ykn.p(p(j, ynoVar), -2147483648L, 2147483647L);
    }

    public static final long h(long j) {
        return p(j, yno.g);
    }

    public static final long i(long j) {
        return p(j, yno.f);
    }

    public static final long j(long j) {
        return p(j, yno.b);
    }

    public static final long k(long j) {
        return (z(j) && t(j)) ? m(j) : p(j, yno.c);
    }

    public static final long l(long j) {
        return p(j, yno.d);
    }

    public static final long m(long j) {
        return j >> 1;
    }

    public static final long n(long j, long j2) {
        return o(j, q(j2));
    }

    public static final long o(long j, long j2) {
        if (v(j)) {
            if (t(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (v(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return z(j) ? A(m(j), m(j2)) : A(m(j2), m(j));
        }
        long jM = m(j) + m(j2);
        return u(j) ? ylh.k(jM) : ylh.j(jM);
    }

    public static final long p(long j, yno ynoVar) {
        ynoVar.getClass();
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == b) {
            return Long.MIN_VALUE;
        }
        return ykn.A(m(j), s(j), ynoVar);
    }

    public static final long q(long j) {
        int i = ynn.a;
        int i2 = ((int) j) & 1;
        long j2 = -m(j);
        return j2 + j2 + i2;
    }

    public static String r(long j) {
        boolean z;
        int i;
        if (j == 0) {
            return "0s";
        }
        if (j == a) {
            return "Infinity";
        }
        if (j == b) {
            return "-Infinity";
        }
        StringBuilder sb = new StringBuilder();
        boolean zW = w(j);
        if (zW) {
            sb.append('-');
        }
        if (w(j)) {
            j = q(j);
        }
        long jH = h(j);
        int i2 = 0;
        boolean z2 = jH != 0;
        int iC = c(j);
        boolean z3 = iC != 0;
        int iD = d(j);
        boolean z4 = iD != 0;
        int iF = f(j);
        int iE = e(j);
        if (iF != 0) {
            z = true;
        } else if (iE != 0) {
            z = true;
            iF = 0;
        } else {
            iE = 0;
            z = false;
            iF = 0;
        }
        if (z2) {
            sb.append(jH);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z3 || (z2 && (z4 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iC);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iD);
            sb.append('m');
            i = i4;
        }
        if (z) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iF == 0) {
                if (!z2 && !z3 && !z4) {
                    if (iE >= 1000000) {
                        y(sb, iE / 1000000, iE % 1000000, 6, "ms");
                    } else if (iE >= 1000) {
                        y(sb, iE / 1000, iE % 1000, 3, "us");
                    } else {
                        sb.append(iE);
                        sb.append("ns");
                    }
                }
                i = i5;
            } else {
                i2 = iF;
            }
            y(sb, i2, iE, 9, "s");
            i = i5;
        }
        if (zW && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final yno s(long j) {
        return u(j) ? yno.a : yno.c;
    }

    public static final boolean t(long j) {
        return !v(j);
    }

    public static final boolean u(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean v(long j) {
        return j == a || j == b;
    }

    public static final boolean w(long j) {
        return j < 0;
    }

    public static final boolean x(long j) {
        return j > 0;
    }

    public static final void y(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strW = ylh.W(String.valueOf(i2), i3);
            int i4 = -1;
            int length = strW.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strW.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) strW, 0, i6);
            } else {
                sb.append((CharSequence) strW, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    private static final boolean z(long j) {
        return (((int) j) & 1) == 1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return b(this.c, ((ynm) obj).c);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ynm) && this.c == ((ynm) obj).c;
    }

    public final int hashCode() {
        return a.k(this.c);
    }

    public final String toString() {
        return r(this.c);
    }
}
