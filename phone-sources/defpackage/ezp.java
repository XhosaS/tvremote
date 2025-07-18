package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezp {
    public final int a;
    private final byte[] b;
    private int c;
    private int d;
    private int e;
    private zuw[] f;

    public ezp(int i) {
        this(i, 0);
    }

    public final synchronized int a() {
        return this.d * this.a;
    }

    public final synchronized void b() {
        c(0);
    }

    public final synchronized void c(int i) {
        int i2 = this.c;
        this.c = i;
        if (i < i2) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r0 < r9.e) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d() {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.c     // Catch: java.lang.Throwable -> L5d
            int r1 = r9.a     // Catch: java.lang.Throwable -> L5d
            int r0 = defpackage.edt.c(r0, r1)     // Catch: java.lang.Throwable -> L5d
            int r1 = r9.d     // Catch: java.lang.Throwable -> L5d
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)     // Catch: java.lang.Throwable -> L5d
            int r2 = r9.e     // Catch: java.lang.Throwable -> L5d
            if (r0 < r2) goto L16
            goto L4f
        L16:
            byte[] r3 = r9.b     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L51
            int r2 = r2 + (-1)
        L1c:
            if (r1 > r2) goto L46
            zuw[] r4 = r9.f     // Catch: java.lang.Throwable -> L5d
            r4 = r4[r1]     // Catch: java.lang.Throwable -> L5d
            defpackage.a.aq(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r5 = r4.b     // Catch: java.lang.Throwable -> L5d
            if (r5 != r3) goto L2c
            int r1 = r1 + 1
            goto L1c
        L2c:
            int r5 = r2 + (-1)
            zuw[] r6 = r9.f     // Catch: java.lang.Throwable -> L5d
            r6 = r6[r2]     // Catch: java.lang.Throwable -> L5d
            defpackage.a.aq(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r6.b     // Catch: java.lang.Throwable -> L5d
            if (r7 == r3) goto L3b
            r2 = r5
            goto L1c
        L3b:
            int r7 = r1 + 1
            zuw[] r8 = r9.f     // Catch: java.lang.Throwable -> L5d
            r8[r1] = r6     // Catch: java.lang.Throwable -> L5d
            r8[r2] = r4     // Catch: java.lang.Throwable -> L5d
            r2 = r5
            r1 = r7
            goto L1c
        L46:
            int r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L5d
            int r1 = r9.e     // Catch: java.lang.Throwable -> L5d
            if (r0 >= r1) goto L4f
            goto L51
        L4f:
            monitor-exit(r9)
            return
        L51:
            zuw[] r1 = r9.f     // Catch: java.lang.Throwable -> L5d
            int r2 = r9.e     // Catch: java.lang.Throwable -> L5d
            r3 = 0
            java.util.Arrays.fill(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L5d
            r9.e = r0     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r9)
            return
        L5d:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L5d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezp.d():void");
    }

    public final synchronized void e(ewt ewtVar) {
        while (ewtVar != null) {
            zuw[] zuwVarArr = this.f;
            int i = this.e;
            this.e = i + 1;
            zuw zuwVar = ewtVar.d;
            zuwVar.getClass();
            zuwVarArr[i] = zuwVar;
            this.d--;
            ewtVar = ewtVar.c;
            if (ewtVar == null || ewtVar.d == null) {
                ewtVar = null;
            }
        }
        notifyAll();
    }

    public final synchronized zuw f() {
        zuw zuwVar;
        this.d++;
        int i = this.e;
        if (i > 0) {
            zuw[] zuwVarArr = this.f;
            int i2 = i - 1;
            this.e = i2;
            zuwVar = zuwVarArr[i2];
            zuwVar.getClass();
            this.f[this.e] = null;
        } else {
            zuw zuwVar2 = new zuw(new byte[this.a], 0);
            int i3 = this.d;
            zuw[] zuwVarArr2 = this.f;
            int length = zuwVarArr2.length;
            if (i3 > length) {
                this.f = (zuw[]) Arrays.copyOf(zuwVarArr2, length + length);
                return zuwVar2;
            }
            zuwVar = zuwVar2;
        }
        return zuwVar;
    }

    public final synchronized void g(zuw zuwVar) {
        zuw[] zuwVarArr = this.f;
        int i = this.e;
        this.e = i + 1;
        zuwVarArr[i] = zuwVar;
        this.d--;
        notifyAll();
    }

    public ezp(int i, int i2) {
        a.H(i > 0);
        a.H(i2 >= 0);
        this.a = i;
        this.e = i2;
        this.f = new zuw[i2 + 100];
        if (i2 <= 0) {
            this.b = null;
            return;
        }
        this.b = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f[i3] = new zuw(this.b, i3 * i);
        }
    }
}
