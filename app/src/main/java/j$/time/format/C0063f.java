package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* renamed from: j$.time.format.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0063f extends i {
    public final boolean g;

    public C0063f(j$.time.temporal.n nVar, int i, int i2, boolean z) {
        this(nVar, i, i2, z, 0);
        Objects.a(nVar, "field");
        j$.time.temporal.q qVarRange = nVar.range();
        if (qVarRange.a != qVarRange.b || qVarRange.c != qVarRange.d) {
            throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(nVar)));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        return vVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new C0063f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new C0063f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i, j$.time.format.InterfaceC0062e
    public final boolean i(y yVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lA = yVar.a(nVar);
        if (lA == null) {
            return false;
        }
        C c = yVar.b.c;
        long jLongValue = lA.longValue();
        j$.time.temporal.q qVarRange = nVar.range();
        qVarRange.b(jLongValue, nVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(qVarRange.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(qVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            c.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                c.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                c.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i, j$.time.format.InterfaceC0062e
    public final int l(v vVar, CharSequence charSequence, int i) {
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        int i2 = (z || b(vVar)) ? this.b : 0;
        int i3 = (vVar.c || b(vVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i);
                dateTimeFormatter.c.getClass();
                if (cCharAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = i4;
            int i7 = 0;
            while (true) {
                if (i6 >= iMin) {
                    break;
                }
                int i8 = i6 + 1;
                char cCharAt2 = charSequence.charAt(i6);
                dateTimeFormatter.c.getClass();
                int i9 = cCharAt2 - '0';
                if (i9 < 0 || i9 > 9) {
                    i9 = -1;
                }
                if (i9 >= 0) {
                    i7 = (i7 * 10) + i9;
                    i6 = i8;
                } else if (i8 < i5) {
                    return ~i4;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i7).movePointLeft(i6 - i4);
            j$.time.temporal.q qVarRange = this.a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(qVarRange.a);
            return vVar.f(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(qVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i6);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    @Override // j$.time.format.i
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }

    public C0063f(j$.time.temporal.n nVar, int i, int i2, boolean z, int i3) {
        super(nVar, i, i2, F.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
