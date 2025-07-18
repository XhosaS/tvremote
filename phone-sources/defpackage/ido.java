package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ido {
    private static final Object[] a = new Object[0];
    private Object[] b = a;

    final synchronized void a(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i < objArr.length) {
                if (objArr[i] == obj) {
                    int i2 = i + 1;
                    if (objArr[i2] == obj2) {
                        objArr[i] = null;
                        objArr[i2] = null;
                    }
                }
                i += 2;
            }
        }
    }

    final synchronized boolean b(Object obj, Object obj2) {
        int i;
        Object[] objArr;
        int length;
        int i2 = 0;
        i = 0;
        boolean z = false;
        int i3 = -1;
        while (true) {
            objArr = this.b;
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj3 = objArr[i2];
            if (obj3 == null) {
                i3 = i2;
            }
            if (obj3 == obj) {
                i++;
                if (objArr[i2 + 1] == obj2) {
                    i3 = i2;
                    z = true;
                }
            }
            i2 += 2;
        }
        if (i3 == -1) {
            int i4 = 2;
            if (length >= 2) {
                i4 = length + length;
            }
            this.b = Arrays.copyOf(objArr, i4);
            i3 = length;
        }
        if (!z) {
            Object[] objArr2 = this.b;
            objArr2[i3] = obj;
            objArr2[i3 + 1] = obj2;
        }
        return i == 0;
    }

    final synchronized boolean c(Object obj) {
        boolean z;
        int i = 0;
        z = false;
        while (true) {
            Object[] objArr = this.b;
            if (i < objArr.length) {
                if (objArr[i] == obj) {
                    objArr[i] = null;
                    objArr[i + 1] = null;
                    z = true;
                }
                i += 2;
            }
        }
        return z;
    }
}
