package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abcd extends abbd {
    static final abcd a = new abcd();

    private abcd() {
    }

    public final void b(abdz abdzVar, abar abarVar) throws IOException {
        if (abarVar == null || (abarVar instanceof abat)) {
            abdzVar.h();
            return;
        }
        if (!(abarVar instanceof abax)) {
            if (abarVar instanceof abaq) {
                abdzVar.e();
                abdzVar.i(1, '[');
                Iterator it = ((abaq) abarVar).a.iterator();
                while (it.hasNext()) {
                    b(abdzVar, (abar) it.next());
                }
                abdzVar.g(1, 2, ']');
                return;
            }
            if (!(abarVar instanceof abau)) {
                throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(String.valueOf(abarVar.getClass()))));
            }
            abdzVar.e();
            abdzVar.i(3, '{');
            abbk abbkVar = new abbk((abbl) abarVar.f().a.entrySet());
            while (abbkVar.hasNext()) {
                abbp abbpVarA = abbkVar.a();
                String str = (String) abbpVarA.f;
                str.getClass();
                if (abdzVar.d != null) {
                    throw new IllegalStateException("Already wrote a name, expecting a value.");
                }
                int iA = abdzVar.a();
                if (iA != 3 && iA != 5) {
                    throw new IllegalStateException("Please begin an object before writing a name.");
                }
                abdzVar.d = str;
                b(abdzVar, (abar) abbpVarA.h);
            }
            abdzVar.g(3, 5, '}');
            return;
        }
        abax abaxVar = (abax) abarVar;
        Object obj = abaxVar.a;
        if (!(obj instanceof Number)) {
            if (obj instanceof Boolean) {
                boolean zE = abaxVar.e();
                abdzVar.e();
                abdzVar.b();
                abdzVar.b.write(true != zE ? "false" : "true");
                return;
            }
            String strC = abaxVar.c();
            if (strC == null) {
                abdzVar.h();
                return;
            }
            abdzVar.e();
            abdzVar.b();
            abdzVar.d(strC);
            return;
        }
        Number numberH = abaxVar.h();
        abdzVar.e();
        Class<?> cls = numberH.getClass();
        String string = numberH.toString();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (abdzVar.f != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(string)));
                }
            } else if (cls != Float.class && cls != Double.class && !abdz.a.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + string);
            }
        }
        abdzVar.b();
        abdzVar.b.append((CharSequence) string);
    }

    public final abar c(abdx abdxVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return new abax(abdxVar.g());
        }
        if (i2 == 6) {
            return new abax(new abbi(abdxVar.g()));
        }
        if (i2 == 7) {
            return new abax(Boolean.valueOf(abdxVar.o()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(abdy.a(i)));
        }
        abdxVar.m();
        return abat.a;
    }

    public final abar d(abdx abdxVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            abdxVar.i();
            return new abaq();
        }
        if (i2 != 2) {
            return null;
        }
        abdxVar.j();
        return new abau();
    }
}
