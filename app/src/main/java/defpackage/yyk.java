package defpackage;

import com.google.common.collect.Lists;
import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yyk extends yxy implements List, RandomAccess, j$.util.List {
    private static final zdm b = new yyg(zcg.b, 0);
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = -889275714;

    public static yyf g(int i) {
        ywl.b(i, "expectedSize");
        return new yyf(i);
    }

    public static yyk h(Object[] objArr, int i) {
        return i == 0 ? zcg.b : new zcg(objArr, i);
    }

    public static yyk i(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return j((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zcg.b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return o(next);
        }
        yyf yyfVar = new yyf(4);
        yyfVar.g(next);
        yyfVar.i(it);
        return yyfVar.f();
    }

    public static yyk j(Collection collection) {
        if (!(collection instanceof yxy)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zbw.b(array, length);
            return h(array, length);
        }
        yyk yykVarF = ((yxy) collection).f();
        if (!yykVarF.l()) {
            return yykVarF;
        }
        Object[] array2 = yykVarF.toArray(yxy.a);
        return h(array2, array2.length);
    }

    public static yyk n(Object[] objArr) {
        if (objArr.length == 0) {
            return zcg.b;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zbw.b(objArr2, length);
        return h(objArr2, length);
    }

    public static yyk o(Object obj) {
        Object[] objArr = {obj};
        zbw.b(objArr, 1);
        return h(objArr, 1);
    }

    public static yyk p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zbw.b(objArr, 2);
        return h(objArr, 2);
    }

    public static yyk q(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zbw.b(objArr, 3);
        return h(objArr, 3);
    }

    public static yyk r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zbw.b(objArr, 5);
        return h(objArr, 5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static yyk s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zbw.b(objArr, 6);
        return h(objArr, 6);
    }

    public static yyk t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7};
        zbw.b(objArr, 7);
        return h(objArr, 7);
    }

    @SafeVarargs
    public static yyk u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zbw.b(objArr2, i);
        return h(objArr2, i);
    }

    public yyk a() {
        return size() <= 1 ? this : new yyh(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yxy
    public int b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yyk subList(int i, int i2) {
        yqw.K(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zcg.b : new yyj(this, i, i3);
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return Lists.d(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final zdm listIterator(int i) {
        yqw.am(i, size());
        return isEmpty() ? b : new yyg(this, i);
    }

    @Override // defpackage.yxy
    public Object writeReplace() {
        return new yyi(toArray(yxy.a));
    }

    @Override // defpackage.yxy
    @Deprecated
    public final yyk f() {
        return this;
    }
}
