package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnf {
    public lne b;
    public int c;
    public int e;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    private final int p;
    public int d = -1;
    public int f = -1;
    public final SparseArray a = new SparseArray();

    public lnf(int i) {
        this.p = i;
    }

    private final void f(int i, int i2, int i3, int i4, int i5) {
        if (i4 != 1 || this.n == 0) {
            return;
        }
        lvd lvdVar = (lvd) this.a.get(i2);
        if (lvdVar == null) {
            krd.f(a.cf(i2, "Discarding segment for unknown itag: "));
            return;
        }
        int iMax = i - Math.max(i5, i3);
        lne lneVar = this.b;
        long j = iMax;
        lneVar.t += j;
        lneVar.u += lvdVar.c.b * j;
        lneVar.v += ((lvdVar.b.d * 1000) / this.n) * j;
    }

    public final void a() {
        this.b.k++;
    }

    public final void b(int i, int i2) {
        f(i, this.g, this.h, this.c, this.e);
        this.b.b.add(Integer.valueOf(i2));
        this.g = i2;
        this.h = i;
        lne lneVar = this.b;
        lneVar.r++;
        int i3 = this.m;
        if (i3 == 0) {
            lneVar.o = i2;
            this.m = 1;
        } else if (i3 == 1) {
            lneVar.p = i2;
            lneVar.q = i;
            this.m = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r11) {
        /*
            r10 = this;
            boolean r0 = r10.k
            r1 = 2
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L2c
            boolean r0 = r10.j
            if (r0 != 0) goto L2c
            int r0 = r10.l
            if (r0 == r2) goto L18
            r5 = 4
            if (r0 == r5) goto L14
            goto L2c
        L14:
            r10.i = r4
            r0 = r4
            goto L2d
        L18:
            boolean r0 = r10.i
            if (r0 != 0) goto L1e
            r0 = r1
            goto L2d
        L1e:
            int r0 = r10.c
            if (r0 != r4) goto L2c
            int r0 = r10.e
            int r0 = r11 - r0
            r5 = 2000(0x7d0, float:2.803E-42)
            if (r0 <= r5) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r3
        L2d:
            int r5 = r10.c
            if (r0 != r5) goto L33
            r4 = r10
            goto L89
        L33:
            int r6 = r10.e
            int r6 = r11 - r6
            if (r5 == r4) goto L64
            if (r5 == r1) goto L5d
            if (r5 == r2) goto L40
        L3d:
            r4 = r10
            r5 = r11
            goto L7f
        L40:
            int r1 = r10.p
            if (r11 > r1) goto L50
            lne r1 = r10.b
            int r2 = r1.f
            int r2 = r2 + r4
            r1.f = r2
            int r2 = r1.g
            int r2 = r2 + r6
            r1.g = r2
        L50:
            lne r1 = r10.b
            int r2 = r1.d
            int r2 = r2 + r4
            r1.d = r2
            int r2 = r1.e
            int r2 = r2 + r6
            r1.e = r2
            goto L3d
        L5d:
            r10.i = r4
            lne r1 = r10.b
            r1.c = r6
            goto L3d
        L64:
            lne r1 = r10.b
            int r2 = r1.h
            int r2 = r2 + r6
            r1.h = r2
            boolean r1 = r10.o
            if (r1 == 0) goto L72
            r10.d(r11, r3)
        L72:
            int r6 = r10.g
            int r7 = r10.h
            int r8 = r10.c
            int r9 = r10.e
            r4 = r10
            r5 = r11
            r4.f(r5, r6, r7, r8, r9)
        L7f:
            r4.c = r0
            r4.e = r5
            boolean r11 = r4.o
            if (r11 == 0) goto L89
            r4.f = r5
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnf.c(int):void");
    }

    public final void d(int i, boolean z) {
        int i2 = this.f;
        if (i2 != -1) {
            this.b.j += i - i2;
        } else if (z) {
            this.b.j += i - this.d;
        }
    }

    public final void e(int i) {
        lne lneVar;
        int i2 = this.d;
        if (i2 == -1 || (lneVar = this.b) == null) {
            krd.f("PIP mode exit without enter call");
        } else {
            lneVar.i += i - i2;
        }
    }
}
