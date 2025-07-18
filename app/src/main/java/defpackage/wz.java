package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wz {
    public static final Object a = new Object();

    public static final Object a(wy wyVar, int i) {
        Object obj;
        int iA = xa.a(wyVar.b, wyVar.d, i);
        if (iA < 0 || (obj = wyVar.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(wy wyVar, int i) {
        int iA = xa.a(wyVar.b, wyVar.d, i);
        if (iA >= 0) {
            Object[] objArr = wyVar.c;
            Object obj = objArr[iA];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                wyVar.a = true;
            }
        }
    }

    public static final void c(wy wyVar) {
        int i = wyVar.d;
        int[] iArr = wyVar.b;
        Object[] objArr = wyVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        wyVar.a = false;
        wyVar.d = i2;
    }
}
