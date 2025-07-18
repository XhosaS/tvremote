package defpackage;

import com.google.common.collect.Sets;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yzq extends yxy implements Set, j$.util.Set {
    private static final long serialVersionUID = 912559;
    private transient yyk b;

    static int g(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            yqw.B(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static yzo i(int i) {
        ywl.b(i, "expectedSize");
        return new yzo(i);
    }

    public static yzq j(int i, Object... objArr) {
        if (i == 0) {
            return zcp.b;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zdd(obj);
        }
        int iG = g(i);
        Object[] objArr2 = new Object[iG];
        int i2 = iG - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zbw.a(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iA = yxv.a(iHashCode);
            while (true) {
                int i6 = iA & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zdd(obj4);
        }
        if (g(i4) < iG / 2) {
            return j(i4, objArr);
        }
        if (v(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zcp(objArr, i3, objArr2, i2, i4);
    }

    public static yzq n(Iterable iterable) {
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zcp.b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new zdd(next);
        }
        yzo yzoVar = new yzo();
        yzoVar.c(next);
        it.getClass();
        while (it.hasNext()) {
            yzoVar.c(it.next());
        }
        return yzoVar.f();
    }

    public static yzq o(Collection collection) {
        if ((collection instanceof yzq) && !(collection instanceof SortedSet)) {
            yzq yzqVar = (yzq) collection;
            if (!yzqVar.l()) {
                return yzqVar;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static yzq p(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? j(length, (Object[]) objArr.clone()) : new zdd(objArr[0]) : zcp.b;
    }

    public static yzq q(Object obj, Object obj2) {
        return j(2, obj, obj2);
    }

    public static yzq r(Object obj, Object obj2, Object obj3) {
        return j(3, obj, obj2, obj3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static yzq s(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(4, obj, obj2, obj3, obj4);
    }

    public static yzq t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return j(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static yzq u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return j(i, objArr2);
    }

    public static boolean v(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean c() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof yzq) && c() && ((yzq) obj).c() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.yxy
    public yyk f() {
        yyk yykVar = this.b;
        if (yykVar != null) {
            return yykVar;
        }
        yyk yykVarH = h();
        this.b = yykVarH;
        return yykVarH;
    }

    public yyk h() {
        Object[] array = toArray(yxy.a);
        int i = yyk.e;
        return yyk.h(array, array.length);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.a(this);
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public abstract zdl iterator();

    @Override // defpackage.yxy
    public Object writeReplace() {
        return new yzp(toArray(yxy.a));
    }
}
