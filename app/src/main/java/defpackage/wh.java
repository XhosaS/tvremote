package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wh {
    public static final int a(wg wgVar, int i) {
        try {
            return xa.a(wgVar.a, wgVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int b(wg wgVar, Object obj, int i) {
        int i2 = wgVar.c;
        if (i2 == 0) {
            return -1;
        }
        int iA = a(wgVar, i);
        if (iA < 0 || agvy.c(obj, wgVar.b[iA])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && wgVar.a[i3] == i) {
            if (agvy.c(obj, wgVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && wgVar.a[i4] == i; i4--) {
            if (agvy.c(obj, wgVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static final void c(wg wgVar, int i) {
        wgVar.a = new int[i];
        wgVar.b = new Object[i];
    }
}
