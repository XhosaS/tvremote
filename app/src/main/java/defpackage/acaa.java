package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class acaa {
    private static volatile int a = 100;

    public abstract Object a(Object obj);

    public abstract Object b();

    public abstract void c(Object obj, int i, int i2);

    public abstract void d(Object obj, int i, long j);

    public abstract void e(Object obj, int i, Object obj2);

    public abstract void f(Object obj, int i, abvo abvoVar);

    public abstract void g(Object obj, int i, long j);

    public abstract void h(Object obj);

    final boolean i(Object obj, abzd abzdVar, int i) throws abxv {
        abvu abvuVar = (abvu) abzdVar;
        int i2 = abvuVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            g(obj, i3, abzdVar.k());
            return true;
        }
        if (i4 == 1) {
            d(obj, i3, abzdVar.j());
            return true;
        }
        if (i4 == 2) {
            f(obj, i3, abzdVar.o());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new abxv("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new abxu();
            }
            c(obj, i3, abzdVar.e());
            return true;
        }
        Object objB = b();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= a) {
            throw new abxv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (abzdVar.c() != Integer.MAX_VALUE && i(objB, abzdVar, i6)) {
        }
        if ((i5 | 4) != abvuVar.b) {
            throw new abxv("Protocol message end-group tag did not match expected tag.");
        }
        j(objB);
        e(obj, i3, objB);
        return true;
    }

    public abstract void j(Object obj);
}
