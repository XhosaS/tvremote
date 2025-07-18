package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abax extends abar {
    public final Object a;

    public abax(Object obj) {
        this.a = obj;
    }

    private static boolean k(abax abaxVar) {
        Object obj = abaxVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.abar
    public final int a() {
        return this.a instanceof Number ? h().intValue() : Integer.parseInt(c());
    }

    @Override // defpackage.abar
    public final String c() {
        Object obj = this.a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return h().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public final double d() {
        return this.a instanceof Number ? h().doubleValue() : Double.parseDouble(c());
    }

    @Override // defpackage.abar
    public final boolean e() {
        Object obj = this.a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abax abaxVar = (abax) obj;
        if (k(this) && k(abaxVar)) {
            return ((this.a instanceof BigInteger) || (abaxVar.a instanceof BigInteger)) ? j().equals(abaxVar.j()) : h().longValue() == abaxVar.h().longValue();
        }
        Object obj2 = this.a;
        if (obj2 instanceof Number) {
            Object obj3 = abaxVar.a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return i().compareTo(abaxVar.i()) == 0;
                }
                double d = d();
                double d2 = abaxVar.d();
                if (d != d2) {
                    return Double.isNaN(d) && Double.isNaN(d2);
                }
                return true;
            }
        }
        return obj2.equals(abaxVar.a);
    }

    public final long g() {
        return this.a instanceof Number ? h().longValue() : Long.parseLong(c());
    }

    public final Number h() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new abbi((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (k(this)) {
            jDoubleToLongBits = h().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(h().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final BigDecimal i() {
        Object obj = this.a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : abbr.a(c());
    }

    public final BigInteger j() {
        Object obj = this.a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (k(this)) {
            return BigInteger.valueOf(h().longValue());
        }
        String strC = c();
        abbr.b(strC);
        return new BigInteger(strC);
    }

    public abax(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.abar
    public final /* bridge */ /* synthetic */ abar b() {
        return this;
    }
}
