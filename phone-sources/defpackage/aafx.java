package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aafx {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public aafx(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            throw new IllegalArgumentException("Unknown mode: " + c);
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    private final long d(aabk aabkVar, long j) {
        int i = this.c;
        if (i >= 0) {
            return ((aacs) aabkVar).k.h(j, i);
        }
        aacs aacsVar = (aacs) aabkVar;
        return aacsVar.k.e(aacsVar.m.e(aacsVar.k.h(j, 1), 1), i);
    }

    public final long a(aabk aabkVar, long j) {
        try {
            return d(aabkVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                aacs aacsVar = (aacs) aabkVar;
                if (aacsVar.n.v(j)) {
                    return d(aabkVar, j);
                }
                j = aacsVar.n.e(j, 1);
            }
        }
    }

    public final long b(aabk aabkVar, long j) {
        try {
            return d(aabkVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                aacs aacsVar = (aacs) aabkVar;
                if (aacsVar.n.v(j)) {
                    return d(aabkVar, j);
                }
                j = aacsVar.n.e(j, -1);
            }
        }
    }

    public final long c(aabk aabkVar, long j) {
        aacs aacsVar = (aacs) aabkVar;
        int iA = this.d - aacsVar.j.a(j);
        if (iA == 0) {
            return j;
        }
        if (this.e) {
            if (iA < 0) {
                iA += 7;
            }
        } else if (iA > 0) {
            iA -= 7;
        }
        return aacsVar.j.e(j, iA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aafx) {
            aafx aafxVar = (aafx) obj;
            if (this.a == aafxVar.a && this.b == aafxVar.b && this.c == aafxVar.c && this.d == aafxVar.d && this.e == aafxVar.e && this.f == aafxVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Character.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        return "[OfYear]\nMode: " + this.a + "\nMonthOfYear: " + this.b + "\nDayOfMonth: " + this.c + "\nDayOfWeek: " + this.d + "\nAdvanceDayOfWeek: " + this.e + "\nMillisOfDay: " + this.f + "\n";
    }
}
