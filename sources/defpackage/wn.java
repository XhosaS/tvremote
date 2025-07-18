package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wn {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e = 3;
    public int f;
    public int g;
    public int h;
    public boolean i;

    public wn() {
        c();
    }

    final int a() {
        if (!this.i) {
            return (int) ((this.f * 50.0f) / 100.0f);
        }
        int i = this.f;
        return i - ((int) ((i * 50.0f) / 100.0f));
    }

    public final int b(int i) {
        int i2;
        int i3;
        int i4 = this.f;
        int iA = a();
        boolean zG = g();
        boolean zF = f();
        if (!zG) {
            int i5 = this.g;
            int i6 = iA - i5;
            if (this.i ? (this.e & 2) != 0 : (this.e & 1) != 0) {
                int i7 = this.b;
                if (i - i7 <= i6) {
                    int i8 = i7 - i5;
                    return (zF || i8 <= (i3 = this.c)) ? i8 : i3;
                }
            }
        }
        if (!zF) {
            int i9 = this.h;
            int i10 = (i4 - iA) - i9;
            if (this.i ? (this.e & 1) != 0 : (this.e & 2) != 0) {
                int i11 = this.a;
                if (i11 - i <= i10) {
                    int i12 = i11 - (i4 - i9);
                    return (zG || i12 >= (i2 = this.d)) ? i12 : i2;
                }
            }
        }
        return i - iA;
    }

    public final void c() {
        this.b = Integer.MIN_VALUE;
        this.a = Integer.MAX_VALUE;
    }

    public final void d(int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r6.d = r7 - r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            r6.b = r7
            r6.a = r8
            int r0 = r6.f
            int r1 = r6.g
            int r0 = r0 - r1
            int r2 = r6.h
            int r0 = r0 - r2
            int r2 = r6.a()
            boolean r3 = r6.g()
            boolean r4 = r6.f()
            if (r3 != 0) goto L33
            boolean r5 = r6.i
            if (r5 != 0) goto L25
            int r5 = r6.e
            r5 = r5 & 1
            if (r5 == 0) goto L2f
            goto L2b
        L25:
            int r5 = r6.e
            r5 = r5 & 2
            if (r5 == 0) goto L2f
        L2b:
            int r7 = r7 - r1
            r6.d = r7
            goto L33
        L2f:
            int r7 = r9 - r2
            r6.d = r7
        L33:
            if (r4 != 0) goto L9a
            boolean r7 = r6.i
            if (r7 != 0) goto L40
            int r4 = r6.e
            r4 = r4 & 2
            if (r4 == 0) goto L4b
            goto L46
        L40:
            int r4 = r6.e
            r4 = r4 & 1
            if (r4 == 0) goto L4b
        L46:
            int r8 = r8 - r1
            int r8 = r8 - r0
            r6.c = r8
            goto L4f
        L4b:
            int r8 = r10 - r2
            r6.c = r8
        L4f:
            if (r3 != 0) goto L9a
            if (r7 != 0) goto L76
            int r7 = r6.e
            r10 = r7 & 1
            if (r10 == 0) goto L62
            int r7 = r6.d
            int r7 = java.lang.Math.max(r7, r8)
            r6.c = r7
            return
        L62:
            r7 = r7 & 2
            if (r7 == 0) goto L9a
            int r9 = r9 - r2
            int r7 = java.lang.Math.max(r8, r9)
            r6.c = r7
            int r8 = r6.d
            int r7 = java.lang.Math.min(r8, r7)
            r6.d = r7
            return
        L76:
            int r7 = r6.e
            r9 = r7 & 1
            if (r9 == 0) goto L85
            int r7 = r6.d
            int r7 = java.lang.Math.min(r7, r8)
            r6.d = r7
            return
        L85:
            r7 = r7 & 2
            if (r7 == 0) goto L9a
            int r10 = r10 - r2
            int r7 = r6.d
            int r7 = java.lang.Math.min(r7, r10)
            r6.d = r7
            int r8 = r6.c
            int r7 = java.lang.Math.max(r7, r8)
            r6.c = r7
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn.e(int, int, int, int):void");
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
