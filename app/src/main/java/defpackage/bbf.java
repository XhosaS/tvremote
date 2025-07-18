package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbf {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e = 3;
    public int f = 0;
    public float g = 50.0f;
    public int h;
    public int i;
    public int j;
    public boolean k;

    public bbf() {
        d();
    }

    final int a() {
        if (this.k) {
            int i = this.f;
            int i2 = i >= 0 ? this.h - i : -i;
            float f = this.g;
            return f != -1.0f ? i2 - ((int) ((this.h * f) / 100.0f)) : i2;
        }
        int i3 = this.f;
        if (i3 < 0) {
            i3 += this.h;
        }
        float f2 = this.g;
        return f2 != -1.0f ? i3 + ((int) ((this.h * f2) / 100.0f)) : i3;
    }

    public final int b() {
        return (this.h - this.i) - this.j;
    }

    public final int c(int i) {
        int i2;
        int i3;
        int i4 = this.h;
        int iA = a();
        boolean zG = g();
        boolean zF = f();
        if (!zG) {
            int i5 = this.i;
            int i6 = iA - i5;
            if (this.k ? (this.e & 2) != 0 : (this.e & 1) != 0) {
                int i7 = this.b;
                if (i - i7 <= i6) {
                    int i8 = i7 - i5;
                    return (zF || i8 <= (i3 = this.c)) ? i8 : i3;
                }
            }
        }
        if (!zF) {
            int i9 = this.j;
            int i10 = (i4 - iA) - i9;
            if (this.k ? (this.e & 1) != 0 : (this.e & 2) != 0) {
                int i11 = this.a;
                if (i11 - i <= i10) {
                    int i12 = i11 - (i4 - i9);
                    return (zG || i12 >= (i2 = this.d)) ? i12 : i2;
                }
            }
        }
        return i - iA;
    }

    public final void d() {
        this.b = Integer.MIN_VALUE;
        this.a = Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r5.d = r6 - r5.i;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            r5.b = r6
            r5.a = r7
            int r0 = r5.b()
            int r1 = r5.a()
            boolean r2 = r5.g()
            boolean r3 = r5.f()
            if (r2 != 0) goto L31
            boolean r4 = r5.k
            if (r4 != 0) goto L21
            int r4 = r5.e
            r4 = r4 & 1
            if (r4 == 0) goto L2d
            goto L27
        L21:
            int r4 = r5.e
            r4 = r4 & 2
            if (r4 == 0) goto L2d
        L27:
            int r4 = r5.i
            int r6 = r6 - r4
            r5.d = r6
            goto L31
        L2d:
            int r6 = r8 - r1
            r5.d = r6
        L31:
            if (r3 != 0) goto L9a
            boolean r6 = r5.k
            if (r6 != 0) goto L3e
            int r3 = r5.e
            r3 = r3 & 2
            if (r3 == 0) goto L4b
            goto L44
        L3e:
            int r3 = r5.e
            r3 = r3 & 1
            if (r3 == 0) goto L4b
        L44:
            int r3 = r5.i
            int r7 = r7 - r3
            int r7 = r7 - r0
            r5.c = r7
            goto L4f
        L4b:
            int r7 = r9 - r1
            r5.c = r7
        L4f:
            if (r2 != 0) goto L9a
            if (r6 != 0) goto L76
            int r6 = r5.e
            r9 = r6 & 1
            if (r9 == 0) goto L62
            int r6 = r5.d
            int r6 = java.lang.Math.max(r6, r7)
            r5.c = r6
            return
        L62:
            r6 = r6 & 2
            if (r6 == 0) goto L9a
            int r8 = r8 - r1
            int r6 = java.lang.Math.max(r7, r8)
            r5.c = r6
            int r7 = r5.d
            int r6 = java.lang.Math.min(r7, r6)
            r5.d = r6
            return
        L76:
            int r6 = r5.e
            r8 = r6 & 1
            if (r8 == 0) goto L85
            int r6 = r5.d
            int r6 = java.lang.Math.min(r6, r7)
            r5.d = r6
            return
        L85:
            r6 = r6 & 2
            if (r6 == 0) goto L9a
            int r9 = r9 - r1
            int r6 = r5.d
            int r6 = java.lang.Math.min(r6, r9)
            r5.d = r6
            int r7 = r5.c
            int r6 = java.lang.Math.max(r6, r7)
            r5.c = r6
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbf.e(int, int, int, int):void");
    }

    public final boolean f() {
        return this.a == Integer.MAX_VALUE;
    }

    public final boolean g() {
        return this.b == Integer.MIN_VALUE;
    }

    public final String toString() {
        return " min:" + this.b + " " + this.d + " max:" + this.a + " " + this.c;
    }
}
