package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yxu {
    private final yns a = new yns(0, ynv.a);
    public yxv[] b;

    private final void h(int i, int i2) {
        yxv[] yxvVarArr = this.b;
        yxvVarArr.getClass();
        yxv yxvVar = yxvVarArr[i2];
        yxvVar.getClass();
        yxv yxvVar2 = yxvVarArr[i];
        yxvVar2.getClass();
        yxvVarArr[i] = yxvVar;
        yxvVarArr[i2] = yxvVar2;
        yxvVar.e(i);
        yxvVar2.e(i2);
    }

    public final int a() {
        return this.a.b;
    }

    public final yxv b() {
        yxv[] yxvVarArr = this.b;
        if (yxvVarArr != null) {
            return yxvVarArr[0];
        }
        return null;
    }

    public final yxv c() {
        yxv yxvVarB;
        synchronized (this) {
            yxvVarB = b();
        }
        return yxvVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yxv d(int r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.yoy.a
            yxv[] r0 = r7.b
            r0.getClass()
            int r1 = r7.a()
            r2 = -1
            int r1 = r1 + r2
            r7.e(r1)
            int r1 = r7.a()
            if (r8 >= r1) goto L7e
            int r1 = r7.a()
            r7.h(r8, r1)
            int r1 = r8 + (-1)
            if (r8 <= 0) goto L3c
            int r1 = r1 / 2
            r3 = r0[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.h(r8, r1)
            r7.f(r1)
            goto L7e
        L3c:
            int r1 = r8 + r8
            int r3 = r1 + 1
            int r4 = r7.a()
            if (r3 >= r4) goto L7e
            yxv[] r4 = r7.b
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.a()
            if (r1 >= r5) goto L66
            r5 = r4[r1]
            r5.getClass()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L66
            goto L67
        L66:
            r1 = r3
        L67:
            r3 = r4[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L7e
            r7.h(r8, r1)
            r8 = r1
            goto L3c
        L7e:
            int r8 = r7.a()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.d(r1)
            r8.e(r2)
            int r2 = r7.a()
            r0[r2] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxu.d(int):yxv");
    }

    public final void e(int i) {
        this.a.b = i;
    }

    public final void f(int i) {
        while (i > 0) {
            yxv[] yxvVarArr = this.b;
            yxvVarArr.getClass();
            int i2 = (i - 1) >> 1;
            yxv yxvVar = yxvVarArr[i2];
            yxvVar.getClass();
            yxv yxvVar2 = yxvVarArr[i];
            yxvVar2.getClass();
            if (((Comparable) yxvVar).compareTo(yxvVar2) <= 0) {
                return;
            }
            h(i, i2);
            i = i2;
        }
    }

    public final boolean g() {
        return a() == 0;
    }
}
