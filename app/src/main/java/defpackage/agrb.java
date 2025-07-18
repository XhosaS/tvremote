package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class agrb extends agqz {
    public static final Set A(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            agqq.H(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return agrf.a;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            setSingleton.getClass();
            return setSingleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return agrf.a;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(agrj.b(collection.size()));
            agqq.H(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        setSingleton2.getClass();
        return setSingleton2;
    }

    public static final Set B(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set setZ = agqq.z(iterable);
        agqq.k(setZ, iterable2);
        return setZ;
    }

    public static final agxs C(Iterable iterable) {
        iterable.getClass();
        return new agra(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean D(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable.contains(obj);
    }

    public static final int[] E(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static final void F(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, agux aguxVar) throws IOException {
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            agyv.a(appendable, next, aguxVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String G(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, agux aguxVar, int i) {
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        agqq.F(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : aguxVar);
        return sb.toString();
    }

    public static final void H(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final Object m(Iterable iterable) {
        if (iterable instanceof List) {
            return agqq.n((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object n(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final Object o(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object p(List list, int i) {
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static final Object q(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(agqq.c(list));
    }

    public static final Object r(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final List s(Iterable iterable) {
        iterable.getClass();
        return agqq.x(agqq.z(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List t(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
        arrayList.addAll(collection);
        arrayList.addAll(iterable);
        return arrayList;
    }

    public static final List u(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List v(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return agqq.x(iterable);
        }
        Object[] array = iterable.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return agqj.c(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List w(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return agqq.x(iterable);
        }
        Object[] array = iterable.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return agqj.c(array);
    }

    public static final List x(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList();
            agqq.H(iterable, arrayList);
            return agqq.f(arrayList);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return agrd.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        List listSingletonList = Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Set y(Iterable iterable, Iterable iterable2) {
        Set setZ = agqq.z(iterable);
        setZ.retainAll(iterable2);
        return setZ;
    }

    public static final Set z(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        agqq.H(iterable, linkedHashSet);
        return linkedHashSet;
    }
}
