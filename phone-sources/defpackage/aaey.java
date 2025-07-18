package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaey {
    private final ArrayList a = new ArrayList();
    private Object b;

    private final Object G() {
        Object aaelVar = this.b;
        if (aaelVar == null) {
            ArrayList arrayList = this.a;
            if (arrayList.size() == 2) {
                Object obj = arrayList.get(0);
                Object obj2 = arrayList.get(1);
                if (obj == null) {
                    aaelVar = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    aaelVar = obj;
                }
            }
            if (aaelVar == null) {
                aaelVar = new aael(arrayList);
            }
            this.b = aaelVar;
        }
        return aaelVar;
    }

    private static final void H(aafg aafgVar) {
        if (aafgVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private static final boolean I(Object obj) {
        if (obj instanceof aaff) {
            return ((obj instanceof aael) && ((aael) obj).b == null) ? false : true;
        }
        return false;
    }

    static void b(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    static boolean c(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    static boolean d(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = charSequence.length() - i;
        int length2 = str.length();
        if (length < length2) {
            return false;
        }
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt = charSequence.charAt(i + i2);
            char cCharAt2 = str.charAt(i2);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    public final void A(int i) {
        n(aabo.t, i, 2);
    }

    public final void B(int i) {
        n(aabo.h, i, 2);
    }

    public final void C(int i) {
        n(aabo.v, i, 2);
    }

    public final void D(int i) {
        n(aabo.l, i, 2);
    }

    public final void E(int i, int i2) {
        t(aabo.k, i, i2);
    }

    public final void F(int i, int i2) {
        t(aabo.f, i, i2);
    }

    public final aaej a() {
        Object objG = G();
        aafh aafhVar = (!(objG instanceof aafh) || ((objG instanceof aael) && ((aael) objG).a == null)) ? null : (aafh) objG;
        aaff aaffVar = I(objG) ? (aaff) objG : null;
        if (aafhVar == null && aaffVar == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new aaej(aafhVar, aaffVar);
    }

    public final aafg e() {
        Object objG = G();
        if (I(objG)) {
            return aafg.b((aaff) objG);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final void f(Object obj) {
        this.b = null;
        ArrayList arrayList = this.a;
        arrayList.add(obj);
        arrayList.add(obj);
    }

    public final void g(aafh aafhVar, aaff aaffVar) {
        this.b = null;
        ArrayList arrayList = this.a;
        arrayList.add(aafhVar);
        arrayList.add(aaffVar);
    }

    public final void h(aabo aaboVar) {
        f(new aaes(aaboVar, true));
    }

    public final void i(aabo aaboVar) {
        f(new aaes(aaboVar, false));
    }

    public final void j(boolean z) {
        f(new aaev(null, "Z", z, 2));
    }

    public final void k(aaej aaejVar) {
        if (aaejVar == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        g(aaejVar.a, aaejVar.b);
    }

    public final void l(aafg aafgVar) {
        H(aafgVar);
        g(null, aafc.b(aafgVar));
    }

    public final void m(aafg[] aafgVarArr) {
        int length = aafgVarArr.length;
        aaff[] aaffVarArr = new aaff[length];
        int i = 0;
        while (i < length - 1) {
            aaff aaffVarB = aafc.b(aafgVarArr[i]);
            aaffVarArr[i] = aaffVarB;
            if (aaffVarB == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i++;
        }
        aaffVarArr[i] = aafc.b(aafgVarArr[i]);
        g(null, new aaeo(aaffVarArr));
    }

    public final void n(aabo aaboVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new aaex(aaboVar, i2, false));
                    return;
                } else {
                    f(new aaeq(aaboVar, i2, false, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void o(aabo aaboVar, int i) {
        f(new aaem(aaboVar, i));
    }

    public final void p(aabo aaboVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                f(new aaen(aaboVar, i, i2));
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void q(char c) {
        f(new aaek(c));
    }

    public final void r(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                f(new aaer(str));
            } else {
                f(new aaek(str.charAt(0)));
            }
        }
    }

    public final void s(aafg aafgVar) {
        H(aafgVar);
        g(null, new aaeo(new aaff[]{aafc.b(aafgVar), null}));
    }

    public final void t(aabo aaboVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new aaex(aaboVar, i2, true));
                    return;
                } else {
                    f(new aaeq(aaboVar, i2, true, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void u(String str, boolean z, int i) {
        f(new aaev(str, str, z, i));
    }

    public final void v(int i) {
        n(aabo.i, i, 2);
    }

    public final void w(int i) {
        n(aabo.m, i, 1);
    }

    public final void x(int i) {
        n(aabo.g, i, 3);
    }

    public final void y(int i, int i2) {
        p(aabo.u, i, i2);
    }

    public final void z(int i) {
        n(aabo.r, i, 2);
    }
}
