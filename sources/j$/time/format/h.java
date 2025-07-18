package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class h extends j {
    public final boolean g;

    public h(j$.time.temporal.p pVar, int i, int i2, boolean z, int i3) {
        super(pVar, i, i2, v.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // j$.time.format.j
    public final j a() {
        if (this.e == -1) {
            return this;
        }
        return new h(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j b(int i) {
        return new h(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb) {
        j$.time.temporal.p pVar = this.a;
        Long lA = qVar.a(pVar);
        if (lA == null) {
            return false;
        }
        t tVar = qVar.b.c;
        long jLongValue = lA.longValue();
        j$.time.temporal.t tVarK = pVar.k();
        tVarK.b(jLongValue, pVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(tVarK.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(tVarK.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
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
            tVar.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                tVar.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                tVar.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }
}
