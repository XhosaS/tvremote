package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqw {
    private yqw() {
    }

    public static void A(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void B(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void C(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(yro.a(str, Character.valueOf(c)));
        }
    }

    public static void D(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(yro.a(str, Integer.valueOf(i)));
        }
    }

    public static void E(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(yro.a(str, Long.valueOf(j)));
        }
    }

    public static void F(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(yro.a(str, obj));
        }
    }

    public static void G(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(yro.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void H(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(yro.a(str, Long.valueOf(j), obj));
        }
    }

    public static void I(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalArgumentException(yro.a(str, obj, Integer.valueOf(i)));
        }
    }

    public static void J(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(yro.a(str, obj, obj2));
        }
    }

    public static void K(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? an(i, i3, "start index") : (i2 < 0 || i2 > i3) ? an(i2, i3, "end index") : yro.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void L(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void M(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void N(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void O(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Character.valueOf(c)));
        }
    }

    public static void P(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Integer.valueOf(i)));
        }
    }

    public static void Q(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Long.valueOf(j)));
        }
    }

    public static void R(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, obj));
        }
    }

    public static void S(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, objArr));
        }
    }

    public static void T(boolean z, String str, char c, char c2) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Character.valueOf(c), Character.valueOf(c2)));
        }
    }

    public static void U(boolean z, String str, char c, int i) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Character.valueOf(c), Integer.valueOf(i)));
        }
    }

    public static void V(boolean z, String str, char c, long j) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Character.valueOf(c), Long.valueOf(j)));
        }
    }

    public static void W(boolean z, String str, char c, Object obj) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Character.valueOf(c), obj));
        }
    }

    public static void X(boolean z, String str, int i, char c) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Integer.valueOf(i), Character.valueOf(c)));
        }
    }

    public static void Y(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void Z(boolean z, String str, int i, long j) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Integer.valueOf(i), Long.valueOf(j)));
        }
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void aa(boolean z, String str, int i, Object obj) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Integer.valueOf(i), obj));
        }
    }

    public static void ab(boolean z, String str, long j, char c) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Long.valueOf(j), Character.valueOf(c)));
        }
    }

    public static void ac(boolean z, String str, long j, int i) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    public static void ad(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static void ae(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, Long.valueOf(j), obj));
        }
    }

    public static void af(boolean z, String str, Object obj, char c) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, obj, Character.valueOf(c)));
        }
    }

    public static void ag(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, obj, Integer.valueOf(i)));
        }
    }

    public static void ah(boolean z, String str, Object obj, long j) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, obj, Long.valueOf(j)));
        }
    }

    public static void ai(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, obj, obj2));
        }
    }

    public static void aj(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, obj, obj2, obj3));
        }
    }

    public static void ak(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalStateException(yro.a(str, obj, obj2, obj3, obj4));
        }
    }

    public static void al(int i, int i2) {
        String strA;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strA = yro.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.b(i2, "negative size: "));
                }
                strA = yro.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void am(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(an(i, i2, "index"));
        }
    }

    private static String an(int i, int i2, String str) {
        if (i < 0) {
            return yro.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return yro.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.b(i2, "negative size: "));
    }

    public static Object b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static Object d(Object obj, String str, char c) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Character.valueOf(c)));
    }

    public static Object e(Object obj, String str, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Integer.valueOf(i)));
    }

    public static Object f(Object obj, String str, long j) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Long.valueOf(j)));
    }

    public static Object g(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, obj2));
    }

    public static Object h(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, objArr));
    }

    public static Object i(Object obj, String str, char c, char c2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Character.valueOf(c), Character.valueOf(c2)));
    }

    public static Object j(Object obj, String str, char c, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Character.valueOf(c), Integer.valueOf(i)));
    }

    public static Object k(Object obj, String str, char c, long j) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Character.valueOf(c), Long.valueOf(j)));
    }

    public static Object l(Object obj, String str, char c, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Character.valueOf(c), obj2));
    }

    public static Object m(Object obj, String str, int i, char c) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Integer.valueOf(i), Character.valueOf(c)));
    }

    public static Object n(Object obj, String str, int i, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static Object o(Object obj, String str, int i, long j) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Integer.valueOf(i), Long.valueOf(j)));
    }

    public static Object p(Object obj, String str, int i, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Integer.valueOf(i), obj2));
    }

    public static Object q(Object obj, String str, long j, char c) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Long.valueOf(j), Character.valueOf(c)));
    }

    public static Object r(Object obj, String str, long j, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Long.valueOf(j), Integer.valueOf(i)));
    }

    public static Object s(Object obj, String str, long j, long j2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static Object t(Object obj, String str, long j, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, Long.valueOf(j), obj2));
    }

    public static Object u(Object obj, String str, Object obj2, char c) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, obj2, Character.valueOf(c)));
    }

    public static Object v(Object obj, String str, Object obj2, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, obj2, Integer.valueOf(i)));
    }

    public static Object w(Object obj, String str, Object obj2, long j) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, obj2, Long.valueOf(j)));
    }

    public static Object x(Object obj, String str, Object obj2, Object obj3) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, obj2, obj3));
    }

    public static Object y(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, obj2, obj3, obj4));
    }

    public static Object z(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(yro.a(str, obj2, obj3, obj4, obj5));
    }
}
