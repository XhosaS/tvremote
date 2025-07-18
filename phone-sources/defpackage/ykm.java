package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykm {
    private static final Object[] a = new Object[0];

    @yfp
    public static final Object[] a(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            objArrCopyOf[i] = it.next();
            i++;
            if (i >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i2 = ((i * 3) + 1) >>> 1;
                if (i2 <= i) {
                    i2 = 2147483645;
                    if (i >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                objArrCopyOf.getClass();
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i);
                objArrCopyOf2.getClass();
                return objArrCopyOf2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @defpackage.yfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object[] b(java.util.Collection r4, java.lang.Object[] r5) throws java.lang.NegativeArraySizeException {
        /*
            r5.getClass()
            int r0 = r4.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lf
            int r4 = r5.length
            if (r4 <= 0) goto L1e
            goto L1c
        Lf:
            java.util.Iterator r4 = r4.iterator()
            boolean r3 = r4.hasNext()
            if (r3 != 0) goto L1f
            int r4 = r5.length
            if (r4 <= 0) goto L1e
        L1c:
            r5[r2] = r1
        L1e:
            return r5
        L1f:
            int r3 = r5.length
            if (r0 > r3) goto L24
            r0 = r5
            goto L35
        L24:
            java.lang.Class r3 = r5.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L35:
            java.lang.Object r3 = r4.next()
            r0[r2] = r3
            int r2 = r2 + 1
            int r3 = r0.length
            if (r2 < r3) goto L63
            boolean r3 = r4.hasNext()
            if (r3 != 0) goto L47
            return r0
        L47:
            int r3 = r2 * 3
            int r3 = r3 + 1
            int r3 = r3 >>> 1
            if (r3 > r2) goto L5b
            r3 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r3) goto L55
            goto L5b
        L55:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L5b:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            r0.getClass()
            goto L35
        L63:
            boolean r3 = r4.hasNext()
            if (r3 != 0) goto L35
            if (r0 != r5) goto L6e
            r5[r2] = r1
            return r5
        L6e:
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykm.b(java.util.Collection, java.lang.Object[]):java.lang.Object[]");
    }
}
