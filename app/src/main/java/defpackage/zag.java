package defpackage;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zag {
    private zag() {
    }

    public static int a(Iterable iterable, yqx yqxVar) {
        return zar.b(iterable.iterator(), yqxVar);
    }

    public static yqt b(Iterable iterable, yqx yqxVar) {
        Iterator it = iterable.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (yqxVar.a(next)) {
                return yqt.i(next);
            }
        }
        return ypv.a;
    }

    public static Iterable c(Iterable iterable, yqx yqxVar) {
        iterable.getClass();
        return new yzz(iterable, yqxVar);
    }

    public static Iterable d(Iterable iterable, yqi yqiVar) {
        iterable.getClass();
        return new zaa(iterable, yqiVar);
    }

    public static Object e(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object f(Iterable iterable) {
        return zar.f(iterable.iterator());
    }

    public static Object g(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? zar.f(it) : obj;
    }

    public static String h(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static boolean i(Collection collection, Iterable iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : zar.j(collection, iterable.iterator());
    }

    public static Object[] j(Iterable iterable) {
        return (iterable instanceof Collection ? (Collection) iterable : Lists.newArrayList(iterable.iterator())).toArray();
    }

    public static void k(List list, yqx yqxVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!yqxVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        m(list, yqxVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        m(list, yqxVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public static Object l(Iterable iterable) {
        return zar.e(iterable.iterator(), null);
    }

    private static void m(List list, yqx yqxVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (yqxVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }
}
