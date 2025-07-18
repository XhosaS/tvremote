package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kq {
    public static final Object a = new Object();

    public static final Object a(kp kpVar, int i) {
        Object obj;
        int iA = ku.a(kpVar.b, kpVar.d, i);
        if (iA < 0 || (obj = kpVar.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(kp kpVar) {
        int i = kpVar.d;
        int[] iArr = kpVar.b;
        Object[] objArr = kpVar.c;
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
        kpVar.a = false;
        kpVar.d = i2;
    }
}
