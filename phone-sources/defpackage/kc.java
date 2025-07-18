package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kc {
    public Object[] a;
    public int b;
    private bfw c;

    public kc() {
        this((byte[]) null);
    }

    public final int a(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.a;
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Object b() {
        if (f()) {
            kv.d("ObjectList is empty.");
        }
        return this.a[0];
    }

    public final Object c(int i) {
        if (i < 0 || i >= this.b) {
            d(i);
        }
        return this.a[i];
    }

    public final void d(int i) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        kv.c(sb.toString());
    }

    public final boolean e(Object obj) {
        return a(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kc) {
            kc kcVar = (kc) obj;
            int i = kcVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = kcVar.a;
                ymd ymdVarR = ykn.r(0, i2);
                int i3 = ymdVarR.a;
                int i4 = ymdVarR.b;
                if (i3 > i4) {
                    return true;
                }
                while (yks.e(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.b == 0;
    }

    public final boolean g() {
        return this.b != 0;
    }

    public final Object h(int i) {
        if (i < 0 || i >= this.b) {
            d(i);
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = this.b;
        if (i != i2 - 1) {
            yfm.bj(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final Object i(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            d(i);
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List j() {
        bfw bfwVar = this.c;
        if (bfwVar != null) {
            return bfwVar;
        }
        bfw bfwVar2 = new bfw(this, 1);
        this.c = bfwVar2;
        return bfwVar2;
    }

    public final void k() {
        yfm.aD(this.a, null, 0, this.b);
        this.b = 0;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            kv.c("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
        }
        if (i2 < i) {
            kv.a("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            int i4 = this.b;
            if (i2 < i4) {
                Object[] objArr = this.a;
                yfm.bj(objArr, objArr, i, i2, i4);
            }
            int i5 = this.b;
            int i6 = i5 - (i2 - i);
            yfm.aD(this.a, null, i6, i5);
            this.b = i6;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        yfm.bj(objArr, objArr2, 0, 0, length);
        this.a = objArr2;
    }

    public final void n(int i) {
        kv.c("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean o(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        h(iA);
        return true;
    }

    public final void p(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void q(List list) {
        int i = this.b;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b += list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        int i = 0;
        kb kbVar = new kb(this, i);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i2 = this.b;
        while (true) {
            if (i >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) kbVar.a(obj));
            i++;
        }
        return sb.toString();
    }

    public /* synthetic */ kc(byte[] bArr) {
        this(16);
    }

    public kc(int i) {
        this.a = i == 0 ? kd.a : new Object[i];
    }
}
