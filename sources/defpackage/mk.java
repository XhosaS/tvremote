package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mk {
    public static final Object a = new Object();

    public static final Object a(mj mjVar, int i) {
        Object obj;
        int iA = ml.a(mjVar.b, mjVar.d, i);
        if (iA < 0 || (obj = mjVar.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(mj mjVar) {
        int i = mjVar.d;
        int[] iArr = mjVar.b;
        Object[] objArr = mjVar.c;
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
        mjVar.a = false;
        mjVar.d = i2;
    }
}
