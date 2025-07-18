package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgk<E> extends bgi<E> implements List<E>, bgf {
    private final Object[] a;
    private final Object[] b;
    private final int c;
    private final int d;

    public bgk(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i <= 32) {
            bcm.a("Trie-based persistent vector should have at least 33 elements, got " + i);
        }
        int length = objArr2.length;
    }

    private final int l() {
        return bga.d(this.c);
    }

    private final bgf m(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf.getClass();
            int i5 = i4 - 1;
            if (i3 < i5) {
                yfm.bj(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new bgk(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                objArr.getClass();
            }
            return new bgp(objArr);
        }
        nxb nxbVar = new nxb((Object) null);
        Object[] objArrS = s(objArr, i2, i - 1, nxbVar);
        objArrS.getClass();
        Object obj = nxbVar.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrS[1] != null) {
            return new bgk(objArrS, objArr3, i, i2);
        }
        Object obj2 = objArrS[0];
        obj2.getClass();
        return new bgk((Object[]) obj2, objArr3, i, i2 - 5);
    }

    private final bgk n(Object[] objArr, int i, Object obj) {
        int i2 = this.c;
        int iL = i2 - l();
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf.getClass();
        int i3 = i + 1;
        if (iL < 32) {
            yfm.bj(objArr2, objArrCopyOf, i3, i, iL);
            objArrCopyOf[i] = obj;
            return new bgk(objArr, objArrCopyOf, i2 + 1, this.d);
        }
        Object obj2 = objArr2[31];
        yfm.bj(objArr2, objArrCopyOf, i3, i, iL - 1);
        objArrCopyOf[i] = obj;
        return o(objArr, objArrCopyOf, bga.e(obj2));
    }

    private final bgk o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i + 1;
        int i3 = this.d;
        if ((i >> 5) <= (1 << i3)) {
            return new bgk(p(objArr, i3, objArr2), objArr3, i2, i3);
        }
        int i4 = i3 + 5;
        return new bgk(p(bga.e(objArr), i4, objArr2), objArr3, i2, i4);
    }

    private final Object[] p(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArrCopyOf;
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            objArrCopyOf.getClass();
        } else {
            objArrCopyOf = new Object[32];
        }
        int iC = bga.c(this.c - 1, i);
        if (i == 5) {
            objArrCopyOf[iC] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iC] = p((Object[]) objArrCopyOf[iC], i - 5, objArr2);
        return objArrCopyOf;
    }

    private final Object[] q(Object[] objArr, int i, int i2, Object obj) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        int iC = bga.c(i2, i);
        if (i == 0) {
            objArrCopyOf[iC] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iC];
        obj2.getClass();
        objArrCopyOf[iC] = q((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    private final Object[] r(Object[] objArr, int i, int i2, Object obj, nxb nxbVar) {
        Object[] objArrCopyOf;
        int iC = bga.c(i2, i);
        if (i == 0) {
            if (iC == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            yfm.bj(objArr, objArrCopyOf, iC + 1, iC, 31);
            nxbVar.a = objArr[31];
            objArrCopyOf[iC] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i3 = i - 5;
        Object obj2 = objArr[iC];
        obj2.getClass();
        objArrCopyOf2[iC] = r((Object[]) obj2, i3, i2, obj, nxbVar);
        while (true) {
            iC++;
            if (iC >= 32 || objArrCopyOf2[iC] == null) {
                break;
            }
            Object obj3 = objArr[iC];
            obj3.getClass();
            objArrCopyOf2[iC] = r((Object[]) obj3, i3, 0, nxbVar.a, nxbVar);
        }
        return objArrCopyOf2;
    }

    private final Object[] s(Object[] objArr, int i, int i2, nxb nxbVar) {
        Object[] objArrS;
        int iC = bga.c(i2, i);
        if (i == 5) {
            nxbVar.a = objArr[iC];
            objArrS = null;
        } else {
            Object obj = objArr[iC];
            obj.getClass();
            objArrS = s((Object[]) obj, i - 5, i2, nxbVar);
        }
        if (objArrS == null && iC == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[iC] = objArrS;
        return objArrCopyOf;
    }

    private final Object[] t(Object[] objArr, int i, int i2, nxb nxbVar) {
        Object[] objArrCopyOf;
        int iC = bga.c(i2, i);
        if (i == 0) {
            if (iC == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            yfm.bj(objArr, objArrCopyOf, iC, iC + 1, 32);
            objArrCopyOf[31] = nxbVar.a;
            nxbVar.a = objArr[iC];
            return objArrCopyOf;
        }
        int iC2 = objArr[31] == null ? bga.c(l() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i3 = i - 5;
        int i4 = iC + 1;
        if (i4 <= iC2) {
            while (true) {
                Object obj = objArrCopyOf2[iC2];
                obj.getClass();
                objArrCopyOf2[iC2] = t((Object[]) obj, i3, 0, nxbVar);
                if (iC2 == i4) {
                    break;
                }
                iC2--;
            }
        }
        Object obj2 = objArrCopyOf2[iC];
        obj2.getClass();
        objArrCopyOf2[iC] = t((Object[]) obj2, i3, i2, nxbVar);
        return objArrCopyOf2;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bgf
    public final bgf b(Object obj) {
        int i = this.c;
        int iL = i - l();
        if (iL >= 32) {
            return o(this.a, this.b, bga.e(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[iL] = obj;
        return new bgk(this.a, objArrCopyOf, i + 1, this.d);
    }

    @Override // defpackage.bgf
    public final bgf c(int i, Object obj) {
        int i2 = this.c;
        a.aB(i, i2);
        if (i == i2) {
            return b(obj);
        }
        int iL = l();
        if (i >= iL) {
            return n(this.a, i - iL, obj);
        }
        nxb nxbVar = new nxb((Object) null);
        return n(r(this.a, this.d, i, obj, nxbVar), 0, nxbVar.a);
    }

    @Override // defpackage.bgf
    public final bgf g(yjv yjvVar) {
        bgl bglVarJ = j();
        bglVarJ.e(yjvVar);
        return bglVarJ.c();
    }

    @Override // defpackage.ygp, java.util.List
    public final E get(int i) {
        Object[] objArr;
        a.aA(i, this.c);
        if (l() <= i) {
            objArr = this.b;
        } else {
            objArr = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object obj = objArr[bga.c(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // defpackage.bgf
    public final bgf h(int i) {
        a.aA(i, this.c);
        int iL = l();
        if (i >= iL) {
            return m(this.a, iL, this.d, i - iL);
        }
        Object[] objArr = this.a;
        int i2 = this.d;
        return m(t(objArr, i2, i, new nxb(this.b[0])), iL, i2, 0);
    }

    @Override // defpackage.bgf
    public final bgf i(int i, Object obj) {
        int i2 = this.c;
        a.aA(i, i2);
        if (l() > i) {
            Object[] objArr = this.a;
            int i3 = this.d;
            return new bgk(q(objArr, i3, i, obj), this.b, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[i & 31] = obj;
        return new bgk(this.a, objArrCopyOf, i2, this.d);
    }

    @Override // defpackage.bgf
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final bgl j() {
        return new bgl(this, this.a, this.b, this.d);
    }

    @Override // defpackage.ygp, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i2 = this.c;
        a.aB(i, i2);
        return new bgm(this.a, this.b, i, i2, (this.d / 5) + 1);
    }
}
