package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yzo extends yxw {
    Object[] d;
    private int e;

    public yzo() {
        super(4);
    }

    public yzq f() {
        yzq yzqVarJ;
        int i = this.b;
        if (i == 0) {
            return zcp.b;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new zdd(obj);
        }
        if (this.d == null || yzq.g(i) != this.d.length) {
            yzqVarJ = yzq.j(this.b, this.a);
            this.b = yzqVarJ.size();
        } else {
            int i2 = this.b;
            Object[] objArrCopyOf = this.a;
            if (yzq.v(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            yzqVarJ = new zcp(objArrCopyOf, this.e, this.d, r6.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return yzqVarJ;
    }

    @Override // defpackage.yxw, defpackage.yxx
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iG = yzq.g(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (iG <= length) {
                objArr.getClass();
                int iHashCode = obj.hashCode();
                int iA = yxv.a(iHashCode);
                while (true) {
                    Object[] objArr2 = this.d;
                    int i = iA & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        super.b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iA = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void h(Object... objArr) {
        if (this.d == null) {
            a(objArr, objArr.length);
            return;
        }
        for (Object obj : objArr) {
            c(obj);
        }
    }

    public final void i(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.d(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void j(yzo yzoVar) {
        if (this.d == null) {
            a(yzoVar.a, yzoVar.b);
            return;
        }
        for (int i = 0; i < yzoVar.b; i++) {
            Object obj = yzoVar.a[i];
            obj.getClass();
            c(obj);
        }
    }

    public yzo(int i) {
        super(i);
        this.d = new Object[yzq.g(i)];
    }
}
