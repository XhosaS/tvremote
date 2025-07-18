package com.google.common.collect;

import defpackage.a;
import defpackage.sij;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ObjectArrays {
    private ObjectArrays() {
    }

    static Object checkElementNotNull(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a.cf(i, "at index "));
    }

    static Object[] checkElementsNotNull(Object... objArr) {
        checkElementsNotNull(objArr, objArr.length);
        return objArr;
    }

    public static <T> T[] concat(T t, T[] tArr) {
        int length = tArr.length;
        T[] tArr2 = (T[]) newArray(tArr, length + 1);
        tArr2[0] = t;
        System.arraycopy(tArr, 0, tArr2, 1, length);
        return tArr2;
    }

    static Object[] copyAsObjectArray(Object[] objArr, int i, int i2) {
        sij.w(i, i + i2, objArr.length);
        if (i2 == 0) {
            return new Object[0];
        }
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, i, objArr2, 0, i2);
        return objArr2;
    }

    private static Object[] fillArray(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public static <T> T[] newArray(Class<T> cls, int i) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
    }

    static void swap(Object[] objArr, int i, int i2) {
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }

    static Object[] toArrayImpl(Collection<?> collection) {
        Object[] objArr = new Object[collection.size()];
        fillArray(collection, objArr);
        return objArr;
    }

    static Object[] checkElementsNotNull(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            checkElementNotNull(objArr[i2], i2);
        }
        return objArr;
    }

    public static <T> T[] newArray(T[] tArr, int i) {
        return (T[]) Platform.newArray(tArr, i);
    }

    static <T> T[] toArrayImpl(Collection collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) newArray(tArr, size);
        }
        fillArray(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public static <T> T[] concat(T[] tArr, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) newArray(cls, length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    static <T> T[] toArrayImpl(Object[] objArr, int i, int i2, T[] tArr) {
        sij.w(i, i + i2, objArr.length);
        int length = tArr.length;
        if (length < i2) {
            tArr = (T[]) newArray(tArr, i2);
        } else if (length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }
}
