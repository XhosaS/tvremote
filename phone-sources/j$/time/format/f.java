package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes4.dex */
public final class f extends h {
    public final boolean g;

    public f(j$.time.temporal.n nVar, int i, int i2, boolean z, int i3) {
        super(nVar, i, i2, s.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // j$.time.format.h
    public final h a() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.h
    public final h b(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.h, j$.time.format.e
    public final boolean i(o oVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lA = oVar.a(nVar);
        if (lA == null) {
            return false;
        }
        q qVar = oVar.b.c;
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
            qVar.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                qVar.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                qVar.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.h
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }
}
