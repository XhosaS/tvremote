package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgp<E> extends bgi<E> implements List<E>, bge {
    public static final bgp a = new bgp(new Object[0]);
    private final Object[] b;

    public bgp(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.bgf
    public final bgf b(Object obj) {
        if (a() >= 32) {
            return new bgk(this.b, bga.e(obj), a() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, a() + 1);
        objArrCopyOf.getClass();
        objArrCopyOf[a()] = obj;
        return new bgp(objArrCopyOf);
    }

    @Override // defpackage.bgf
    public final bgf c(int i, Object obj) {
        a.aB(i, a());
        if (i == a()) {
            return b(obj);
        }
        int i2 = i + 1;
        if (a() >= 32) {
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            yfm.bj(objArr, objArrCopyOf, i2, i, a() - 1);
            objArrCopyOf[i] = obj;
            return new bgk(objArrCopyOf, bga.e(objArr[31]), a() + 1, 0);
        }
        int iA = a() + 1;
        Object[] objArr2 = this.b;
        Object[] objArr3 = new Object[iA];
        yfm.bu(objArr2, objArr3, 0, i, 6);
        yfm.bj(objArr2, objArr3, i2, i, a());
        objArr3[i] = obj;
        return new bgp(objArr3);
    }

    @Override // defpackage.bgi, defpackage.bgf
    public final bgf d(Collection collection) {
        if (a() + collection.size() > 32) {
            bgl bglVarJ = j();
            bglVarJ.addAll(collection);
            return bglVarJ.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, a() + collection.size());
        objArrCopyOf.getClass();
        int iA = a();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[iA] = it.next();
            iA++;
        }
        return new bgp(objArrCopyOf);
    }

    @Override // defpackage.bgf
    public final bgf g(yjv yjvVar) {
        Object[] objArr = this.b;
        int iA = a();
        int iA2 = a();
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < iA2; i++) {
            Object obj = objArr[i];
            if (((Boolean) yjvVar.a(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    objArrCopyOf.getClass();
                    z = true;
                    iA = i;
                }
            } else if (z) {
                objArrCopyOf[iA] = obj;
                iA++;
            }
        }
        return iA == a() ? this : iA == 0 ? a : new bgp(yfm.aH(objArrCopyOf, 0, iA));
    }

    @Override // defpackage.ygp, java.util.List
    public final E get(int i) {
        a.aA(i, a());
        return (E) this.b[i];
    }

    @Override // defpackage.bgf
    public final bgf h(int i) {
        a.aA(i, a());
        if (a() == 1) {
            return a;
        }
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, a() - 1);
        objArrCopyOf.getClass();
        yfm.bj(objArr, objArrCopyOf, i, i + 1, a());
        return new bgp(objArrCopyOf);
    }

    @Override // defpackage.bgf
    public final bgf i(int i, Object obj) {
        a.aA(i, a());
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = obj;
        return new bgp(objArrCopyOf);
    }

    @Override // defpackage.ygp, java.util.List
    public final int indexOf(Object obj) {
        return yfm.aR(this.b, obj);
    }

    @Override // defpackage.bgf
    public final bgl j() {
        return new bgl(this, null, this.b, 0);
    }

    @Override // defpackage.ygp, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (yks.e(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    @Override // defpackage.ygp, java.util.List
    public final ListIterator<E> listIterator(int i) {
        a.aB(i, a());
        return new bgj(this.b, i, a());
    }
}
