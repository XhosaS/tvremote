package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zar {
    public static int a(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        yqw.B(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static int b(Iterator it, yqx yqxVar) {
        yqxVar.getClass();
        int i = 0;
        while (it.hasNext()) {
            if (yqxVar.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static zdl c(Iterator it, yqx yqxVar) {
        it.getClass();
        yqxVar.getClass();
        return new zai(it, yqxVar);
    }

    public static zdl d(Iterator it) {
        it.getClass();
        return it instanceof zdl ? (zdl) it : new zah(it);
    }

    public static Object e(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object f(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    static Object g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static Iterator h(Iterator it, yqi yqiVar) {
        yqiVar.getClass();
        return new zaj(it, yqiVar);
    }

    static void i(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean j(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static zap k(Iterator it) {
        return it instanceof zap ? (zap) it : new zap(it);
    }
}
