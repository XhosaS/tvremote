package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfz implements RandomAccess {
    public Object[] a;
    public int b;
    private List c;

    public bfz(Object[] objArr, int i) {
        this.a = objArr;
        this.b = i;
    }

    public static final void r() {
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int a(Object obj) {
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (yks.e(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final Object b() {
        if (this.b != 0) {
            return this.a[0];
        }
        r();
        throw new yfs();
    }

    public final Object c() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        r();
        throw new yfs();
    }

    public final Object d(int i) {
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = this.b;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.b - 1;
        this.b = i4;
        objArr[i4] = null;
        return obj;
    }

    public final Object e(int i, Object obj) {
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List f() {
        List list = this.c;
        if (list != null) {
            return list;
        }
        bfw bfwVar = new bfw(this, 0);
        this.c = bfwVar;
        return bfwVar;
    }

    public final void g(int i, Object obj) {
        int i2 = this.b + 1;
        if (this.a.length < i2) {
            j(i2);
        }
        Object[] objArr = this.a;
        int i3 = this.b;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.b++;
    }

    public final void h() {
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.b = 0;
    }

    public final void i(int i, int i2) {
        if (i2 > i) {
            int i3 = this.b;
            if (i2 < i3) {
                Object[] objArr = this.a;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.a[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.b = i5;
        }
    }

    public final void j(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length + length)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }

    public final void k(Comparator comparator) {
        yfm.aF(this.a, comparator, 0, this.b);
    }

    public final boolean l(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.b + size;
        if (this.a.length < i3) {
            j(i3);
        }
        Object[] objArr = this.a;
        int i4 = this.b;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                yfm.w();
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.b += size;
        return true;
    }

    public final boolean m(Object obj) {
        int i = this.b - 1;
        if (i >= 0) {
            for (int i2 = 0; !yks.e(this.a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean n(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        d(iA);
        return true;
    }

    public final void o(Object obj) {
        int i = this.b + 1;
        if (this.a.length < i) {
            j(i);
        }
        Object[] objArr = this.a;
        int i2 = this.b;
        objArr[i2] = obj;
        this.b = i2 + 1;
    }

    public final void p(int i, bfz bfzVar) {
        int i2 = bfzVar.b;
        if (i2 == 0) {
            return;
        }
        int i3 = this.b + i2;
        if (this.a.length < i3) {
            j(i3);
        }
        Object[] objArr = this.a;
        int i4 = this.b;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(bfzVar.a, 0, objArr, i, i2);
        this.b += i2;
    }

    public final void q(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.b + size;
        if (this.a.length < i2) {
            j(i2);
        }
        Object[] objArr = this.a;
        int i3 = this.b;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.b += size;
    }
}
