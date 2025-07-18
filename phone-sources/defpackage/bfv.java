package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class bfv {
    public final ki a;

    public /* synthetic */ bfv(ki kiVar) {
        this.a = kiVar;
    }

    public static final Object a(ki kiVar, Object obj) {
        Object objA = kiVar.a(obj);
        if (objA == null) {
            return null;
        }
        if (!(objA instanceof kc)) {
            kiVar.g(obj);
            return objA;
        }
        kc kcVar = (kc) objA;
        if (kcVar.f()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = kcVar.b - 1;
        Object objC = kcVar.c(i);
        kcVar.h(i);
        objC.getClass();
        if (kcVar.f()) {
            kiVar.g(obj);
        }
        if (kcVar.b != 1) {
            return objC;
        }
        kiVar.j(obj, kcVar.b());
        return objC;
    }

    public static final void b(ki kiVar, Object obj, Object obj2) {
        int iF = kiVar.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : kiVar.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof kc) {
                kc kcVar = (kc) obj3;
                kcVar.p(obj2);
                obj2 = kcVar;
            } else {
                obj2 = kd.c(obj3, obj2);
            }
        }
        if (!z) {
            kiVar.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        kiVar.b[i] = obj;
        kiVar.c[i] = obj2;
    }

    public static final void c(ki kiVar, Object obj, yjv yjvVar) {
        Object objA = kiVar.a(obj);
        if (objA != null) {
            if (!(objA instanceof kc)) {
                if (((Boolean) yjvVar.a(objA)).booleanValue()) {
                    kiVar.g(obj);
                    return;
                }
                return;
            }
            kc kcVar = (kc) objA;
            int i = kcVar.b;
            Object[] objArr = kcVar.a;
            int i2 = 0;
            ymd ymdVarR = ykn.r(0, i);
            int i3 = ymdVarR.a;
            int i4 = ymdVarR.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) yjvVar.a(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            yfm.aD(objArr, null, i - i2, i);
            kcVar.b -= i2;
            if (kcVar.f()) {
                kiVar.g(obj);
            }
            if (kcVar.b == 0) {
                kiVar.j(obj, kcVar.b());
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bfv) && yks.e(this.a, ((bfv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
