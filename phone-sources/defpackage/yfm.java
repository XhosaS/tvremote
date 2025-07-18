package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfm {
    public static List A(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            I(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static void B(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void C(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static Object D(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object E(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(q(list));
    }

    public static Collection F(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : al(iterable);
    }

    public static int G(List list, int i) {
        return q(list) - i;
    }

    public static List H(List list) {
        list.getClass();
        return new yhj(list);
    }

    public static void I(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void J(Collection collection, Object[] objArr) {
        objArr.getClass();
        collection.addAll(aC(objArr));
    }

    public static void K(Iterable iterable, yjv yjvVar) {
        iterable.getClass();
        bx(iterable, yjvVar, true);
    }

    public static void L(List list, yjv yjvVar) {
        int iQ;
        list.getClass();
        int iQ2 = q(list);
        int i = 0;
        if (iQ2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) yjvVar.a(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iQ2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iQ = q(list))) {
            return;
        }
        while (true) {
            list.remove(iQ);
            if (iQ == i) {
                return;
            } else {
                iQ--;
            }
        }
    }

    public static void M(Iterable iterable, yjv yjvVar) {
        bx(iterable, yjvVar, false);
    }

    public static List N(Iterable iterable, Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int O(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                w();
            }
            if (yks.e(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int P(List list, Object obj) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static Comparable Q(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object R(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return S((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object S(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object T(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object U(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object V(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static Object W(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(q(list));
    }

    public static Object X(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Object Y(Iterable iterable, Comparator comparator) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Object Z(List list) {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final int a(String[] strArr) {
        return strArr.length >> 1;
    }

    public static final void aA(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(a.cn(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static boolean aB(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        int length = objArr.length;
        if (length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!aB((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    if ((obj instanceof ygc) && (obj2 instanceof ygc)) {
                        throw null;
                    }
                    if ((obj instanceof ygg) && (obj2 instanceof ygg)) {
                        throw null;
                    }
                    if ((obj instanceof ygd) && (obj2 instanceof ygd)) {
                        throw null;
                    }
                    if ((obj instanceof yge) && (obj2 instanceof yge)) {
                        throw null;
                    }
                    if (!yks.e(obj, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static List aC(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static void aD(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void aE(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        comparator.getClass();
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void aF(Object[] objArr, Comparator comparator, int i, int i2) {
        objArr.getClass();
        comparator.getClass();
        Arrays.sort(objArr, i, i2, comparator);
    }

    public static byte[] aG(byte[] bArr, int i, int i2) {
        bArr.getClass();
        aA(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] aH(Object[] objArr, int i, int i2) {
        objArr.getClass();
        aA(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static Object[] aI(Object[] objArr, Object obj) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    public static int aJ(int[] iArr) {
        iArr.getClass();
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int aK(int[] iArr) {
        return iArr.length - 1;
    }

    public static int aL(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int aM(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static int aN(byte[] bArr, byte b) {
        for (int i = 0; i < bArr.length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int aO(char[] cArr, char c) {
        for (int i = 0; i < cArr.length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int aP(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int aQ(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int aR(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (yks.e(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int aS(short[] sArr, short s) {
        for (int i = 0; i < sArr.length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static Object aT(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object aU(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Object aV(Object[] objArr, int i) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static List aW(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List aX(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? aY(objArr) : p(objArr[0]) : yhb.a;
    }

    public static List aY(Object[] objArr) {
        return new ArrayList(new ygw(objArr, false));
    }

    public static Set aZ(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return yhd.a;
        }
        if (length == 1) {
            return wcq.aj(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(e(length));
        bt(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List aa(Iterable iterable, int i) {
        iterable.getClass();
        if (i <= 0) {
            throw new IllegalArgumentException(a.cd(i, "size ", " must be greater than zero."));
        }
        if (!(iterable instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            it.getClass();
            Iterator itE = !it.hasNext() ? yha.a : ykr.e(new yhl(i, i, it, null));
            while (itE.hasNext()) {
                arrayList.add((List) itE.next());
            }
            return arrayList;
        }
        int size = iterable.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int iK = ykn.k(i, size - i2);
            ArrayList arrayList3 = new ArrayList(iK);
            for (int i3 = 0; i3 < iK; i3++) {
                arrayList3.add(iterable.get(i3 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static List ab(Iterable iterable) {
        return al(ap(iterable));
    }

    public static List ac(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List ad(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        Collection collectionF = F(iterable2);
        if (collectionF.isEmpty()) {
            return al(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionF.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List ae(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(z(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && yks.e(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List af(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
        arrayList.addAll(collection);
        arrayList.addAll(iterable);
        return arrayList;
    }

    public static List ag(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List ah(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return al(iterable);
        }
        List listAm = am(iterable);
        Collections.reverse(listAm);
        return listAm;
    }

    public static List ai(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listAm = am(iterable);
            B(listAm);
            return listAm;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return al(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return aC(array);
    }

    public static List aj(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listAm = am(iterable);
            C(listAm, comparator);
            return listAm;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return al(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        aE(array, comparator);
        return aC(array);
    }

    public static List ak(Iterable iterable, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.cd(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return yhb.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return al(iterable);
            }
            if (i == 1) {
                return p(R(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return u(arrayList);
    }

    public static List al(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return u(am(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return yhb.a;
        }
        if (size != 1) {
            return an(collection);
        }
        return p(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List am(Iterable iterable) {
        if (iterable instanceof Collection) {
            return an((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        ay(iterable, arrayList);
        return arrayList;
    }

    public static List an(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static Set ao(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set setAp = ap(iterable);
        setAp.retainAll(F(iterable2));
        return setAp;
    }

    public static Set ap(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ay(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set aq(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ay(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : wcq.aj(linkedHashSet.iterator().next()) : yhd.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return yhd.a;
        }
        if (size2 == 1) {
            return wcq.aj(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(e(collection.size()));
        ay(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static ymw ar(Iterable iterable) {
        iterable.getClass();
        return new cxb(iterable, 2);
    }

    public static boolean as(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : O(iterable, obj) >= 0;
    }

    public static int[] at(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static long[] au(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List av(Iterable iterable) {
        int size = iterable.size() - 1;
        if (size <= 0) {
            return yhb.a;
        }
        if (size == 1) {
            return p(W(iterable));
        }
        ArrayList arrayList = new ArrayList(size);
        if (iterable instanceof RandomAccess) {
            int size2 = iterable.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(iterable.get(i));
            }
        } else {
            ListIterator listIterator = iterable.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static void aw(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, yjv yjvVar) throws IOException {
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
            a.E(appendable, next, yjvVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String ax(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, yjv yjvVar, int i) throws IOException {
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
        aw(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : yjvVar);
        return sb.toString();
    }

    public static void ay(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final String b(int i, String[] strArr) {
        int i2 = i + i;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static ymd ba(int[] iArr) {
        return new ymd(0, aK(iArr));
    }

    public static boolean bb(int[] iArr, int i) {
        return aP(iArr, i) >= 0;
    }

    public static boolean bc(long[] jArr, long j) {
        return aQ(jArr, j) >= 0;
    }

    public static boolean bd(Object[] objArr, Object obj) {
        return aR(objArr, obj) >= 0;
    }

    public static void be(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void bf(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void bg(float[] fArr, float[] fArr2, int i) {
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, 0, fArr2, 0, i);
    }

    public static void bh(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void bi(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void bj(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void bl(float[] fArr, float[] fArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = fArr.length;
        }
        bg(fArr, fArr2, i);
    }

    public static /* synthetic */ void bm(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        bh(iArr, iArr2, i, 0, i2);
    }

    public static void bo(long[] jArr, long j, int i) {
        jArr.getClass();
        Arrays.fill(jArr, 0, i, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence, java.lang.Object] */
    public static /* synthetic */ String bs(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, yjv yjvVar, int i) throws IOException {
        bArr.getClass();
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        charSequence2.getClass();
        if ((i & 4) != 0) {
            charSequence3 = "";
        }
        charSequence3.getClass();
        String str = (i & 16) != 0 ? "..." : null;
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c2 = (i & 8) != 0 ? (char) 65535 : (char) 0;
            if (i2 >= bArr.length) {
                c = c2;
                break;
            }
            byte b = bArr[i2];
            i3++;
            if (i3 > 1) {
                sb.append(1 != (i & 1) ? charSequence : ", ");
            }
            if (c2 >= 0 && i3 > 0) {
                break;
            }
            yjv yjvVar2 = (i & 32) != 0 ? null : yjvVar;
            if (yjvVar2 != null) {
                sb.append((CharSequence) yjvVar2.a(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
            i2++;
        }
        if (c >= 0 && i3 > 0) {
            sb.append((CharSequence) str);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static void bt(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static /* synthetic */ void bu(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        bj(objArr, objArr2, 0, i, i2);
    }

    public static final int bv(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if ((-2147483639) + i3 <= 0) {
            return i3;
        }
        if (i2 > 2147483639) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return 2147483639;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    public static final void bw(String str, String str2, upq upqVar) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
            }
        }
        while (true) {
            ?? r0 = upqVar.b;
            if (i >= r0.size()) {
                r0.add(str);
                r0.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((String) r0.get(i))) {
                    r0.remove(i);
                    r0.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    private static void bx(Iterable iterable, yjv yjvVar, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) yjvVar.a(it.next())).booleanValue() == z) {
                it.remove();
            }
        }
    }

    public static final String c(int i, String[] strArr) {
        int i2 = i + i + 1;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? "OUTBOUND" : "INBOUND";
    }

    public static int e(int i) {
        return i >= 0 ? i < 3 ? i + 1 : i >= 1073741824 ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) ((i / 0.75f) + 1.0f) : i;
    }

    public static Map f(yfw yfwVar) {
        yfwVar.getClass();
        Map mapSingletonMap = Collections.singletonMap(yfwVar.a, yfwVar.b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Object g(Map map, Object obj) {
        map.getClass();
        if (map instanceof yhh) {
            return ((yhh) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(a.cj(obj, "Key ", " is missing in the map."));
    }

    public static Map h(yfw... yfwVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(e(yfwVarArr.length));
        n(linkedHashMap, yfwVarArr);
        return linkedHashMap;
    }

    public static Map i(yfw... yfwVarArr) {
        yfwVarArr.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(e(yfwVarArr.length));
        n(linkedHashMap, yfwVarArr);
        return linkedHashMap;
    }

    public static Map j(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map k(Iterable iterable) {
        int size = iterable.size();
        if (size == 0) {
            return yhc.a;
        }
        if (size == 1) {
            return f((yfw) iterable.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e(iterable.size()));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfw yfwVar = (yfw) it.next();
            linkedHashMap.put(yfwVar.a, yfwVar.b);
        }
        return linkedHashMap;
    }

    public static Map l(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return yhc.a;
        }
        if (size != 1) {
            return m(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Map m(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static void n(Map map, yfw[] yfwVarArr) {
        for (yfw yfwVar : yfwVarArr) {
            map.put(yfwVar.a, yfwVar.b);
        }
    }

    public static final List o(List list) {
        yhp yhpVar = (yhp) list;
        yhpVar.h();
        yhpVar.d = true;
        return yhpVar.c > 0 ? list : yhp.a;
    }

    public static final List p(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static int q(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static ArrayList r(Object... objArr) {
        return new ArrayList(new ygw(objArr, true));
    }

    public static List s(Object... objArr) {
        objArr.getClass();
        return objArr.length > 0 ? aC(objArr) : yhb.a;
    }

    public static List t(Object... objArr) {
        return new ArrayList(new ygw(objArr, true));
    }

    public static List u(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : p(list.get(0)) : yhb.a;
    }

    public static void v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static /* synthetic */ int x(List list, Comparable comparable) {
        int size = list.size();
        int size2 = list.size();
        if (size < 0) {
            throw new IllegalArgumentException(a.cd(size, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(a.cn(size2, size, "toIndex (", ") is greater than size (", ")."));
        }
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iY = wcq.Y((Comparable) list.get(i3), comparable);
            if (iY < 0) {
                i2 = i3 + 1;
            } else {
                if (iY <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void y(int i, Object[] objArr) {
        objArr.getClass();
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static int z(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
