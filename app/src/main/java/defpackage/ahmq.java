package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahmq {
    public ahmr[] b;
    public final agzw c = new agzw(0, agzz.a);

    private final void e(int i, int i2) {
        ahmr[] ahmrVarArr = this.b;
        ahmrVarArr.getClass();
        ahmr ahmrVar = ahmrVarArr[i2];
        ahmrVar.getClass();
        ahmr ahmrVar2 = ahmrVarArr[i];
        ahmrVar2.getClass();
        ahmrVarArr[i] = ahmrVar;
        ahmrVarArr[i2] = ahmrVar2;
        ahmrVar.e(i);
        ahmrVar2.e(i2);
    }

    public final ahmr a() {
        ahmr[] ahmrVarArr = this.b;
        if (ahmrVarArr != null) {
            return ahmrVarArr[0];
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ahmr b(int r9) {
        /*
            r8 = this;
            boolean r0 = defpackage.ahbx.a
            ahmr[] r0 = r8.b
            r0.getClass()
            agzw r1 = r8.c
            int r2 = r1.c
            r3 = -1
            int r2 = r2 + r3
            r1.c = r2
            int r2 = r1.c
            if (r9 >= r2) goto L75
            int r2 = r1.c
            r8.e(r9, r2)
            int r2 = r9 + (-1)
            if (r9 <= 0) goto L37
            int r2 = r2 / 2
            r4 = r0[r9]
            r4.getClass()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L37
            r8.e(r9, r2)
            r8.c(r2)
            goto L75
        L37:
            int r2 = r9 + r9
            int r4 = r2 + 1
            int r5 = r1.c
            if (r4 >= r5) goto L75
            ahmr[] r5 = r8.b
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.c
            if (r2 >= r6) goto L5d
            r6 = r5[r2]
            r6.getClass()
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L5d
            goto L5e
        L5d:
            r2 = r4
        L5e:
            r4 = r5[r9]
            r4.getClass()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 <= 0) goto L75
            r8.e(r9, r2)
            r9 = r2
            goto L37
        L75:
            int r9 = r1.c
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.e(r3)
            int r1 = r1.c
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmq.b(int):ahmr");
    }

    public final void c(int i) {
        while (i > 0) {
            ahmr[] ahmrVarArr = this.b;
            ahmrVarArr.getClass();
            int i2 = (i - 1) >> 1;
            ahmr ahmrVar = ahmrVarArr[i2];
            ahmrVar.getClass();
            ahmr ahmrVar2 = ahmrVarArr[i];
            ahmrVar2.getClass();
            if (((Comparable) ahmrVar).compareTo(ahmrVar2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final boolean d() {
        return this.c.c == 0;
    }
}
