package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmw extends Thread {
    public final ahng a;
    public final agzw b;
    public boolean c;
    final /* synthetic */ ahmx d;
    public int e;
    private final agwh f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public ahmw(ahmx ahmxVar, int i) {
        this.d = ahmxVar;
        setDaemon(true);
        setContextClassLoader(ahmxVar.getClass().getClassLoader());
        this.a = new ahng();
        this.f = new agwh();
        this.e = 4;
        this.b = new agzw(0, agzz.a);
        this.nextParkedWorker = ahmx.a;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        c(i);
    }

    private final ahnc e() {
        if (a(2) == 0) {
            ahmx ahmxVar = this.d;
            ahnc ahncVar = (ahnc) ahmxVar.f.b();
            return ahncVar != null ? ahncVar : (ahnc) ahmxVar.g.b();
        }
        ahmx ahmxVar2 = this.d;
        ahnc ahncVar2 = (ahnc) ahmxVar2.g.b();
        return ahncVar2 != null ? ahncVar2 : (ahnc) ahmxVar2.f.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        r8 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.ahnc f(int r26) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmw.f(int):ahnc");
    }

    private final boolean g() {
        return this.nextParkedWorker != ahmx.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ahnc b(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.e
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7
            goto L6a
        L7:
            ahmx r0 = r9.d
        L9:
            agzx r3 = r0.j
            long r4 = r3.c
            r6 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r6 = r6 & r4
            r8 = 42
            long r6 = r6 >> r8
            int r6 = (int) r6
            if (r6 != 0) goto L5c
            ahng r10 = r9.a
        L1b:
            agzy r3 = r10.a
            java.lang.Object r4 = r3.a
            ahnc r4 = (defpackage.ahnc) r4
            if (r4 != 0) goto L24
            goto L30
        L24:
            boolean r5 = r4.h
            if (r5 != r2) goto L30
            boolean r3 = r3.d(r4, r1)
            if (r3 == 0) goto L1b
            r1 = r4
            goto L4a
        L30:
            agzw r3 = r10.c
            int r3 = r3.c
            agzw r4 = r10.b
            int r4 = r4.c
        L38:
            if (r3 == r4) goto L4a
            agzw r5 = r10.d
            int r5 = r5.c
            if (r5 != 0) goto L41
            goto L4a
        L41:
            int r4 = r4 + (-1)
            ahnc r5 = r10.d(r4, r2)
            if (r5 == 0) goto L38
            r1 = r5
        L4a:
            if (r1 != 0) goto L5b
            ahna r10 = r0.g
            java.lang.Object r10 = r10.b()
            ahnc r10 = (defpackage.ahnc) r10
            if (r10 != 0) goto L5a
            ahnc r10 = r9.f(r2)
        L5a:
            return r10
        L5b:
            return r1
        L5c:
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r4
            boolean r3 = r3.a(r4, r6)
            if (r3 == 0) goto L9
            r9.e = r2
        L6a:
            if (r10 == 0) goto L9e
            ahmx r10 = r9.d
            int r10 = r10.b
            int r10 = r10 + r10
            int r10 = r9.a(r10)
            if (r10 != 0) goto L78
            goto L79
        L78:
            r2 = 0
        L79:
            if (r2 == 0) goto L82
            ahnc r10 = r9.e()
            if (r10 == 0) goto L82
            return r10
        L82:
            ahng r10 = r9.a
            agzy r0 = r10.a
            java.lang.Object r0 = r0.a(r1)
            ahnc r0 = (defpackage.ahnc) r0
            if (r0 != 0) goto L92
            ahnc r0 = r10.c()
        L92:
            if (r0 == 0) goto L95
            return r0
        L95:
            if (r2 != 0) goto La5
            ahnc r10 = r9.e()
            if (r10 == 0) goto La5
            return r10
        L9e:
            ahnc r10 = r9.e()
            if (r10 == 0) goto La5
            return r10
        La5:
            r10 = 3
            ahnc r10 = r9.f(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmw.b(boolean):ahnc");
    }

    public final void c(int i) {
        String strValueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(this.d.e + "-worker-" + strValueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = i2 == 1;
        if (z) {
            agzx.a.addAndGet(this.d.j, 4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                ahmx ahmxVar = this.d;
                agzv agzvVar = ahmxVar.k;
                int i = 5;
                if (agzvVar.b() || this.e == 5) {
                    break loop0;
                }
                ahnc ahncVarB = b(this.c);
                long j = -2097152;
                int i2 = 3;
                long j2 = 0;
                if (ahncVarB != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.e == 3) {
                        boolean z2 = ahbx.a;
                        this.e = 2;
                    }
                    if (ahncVarB.h) {
                        if (d(2)) {
                            ahmxVar.d();
                        }
                        ahmxVar.c(ahncVarB);
                        agzx.a.addAndGet(ahmxVar.j, -2097152L);
                        if (this.e != 5) {
                            boolean z3 = ahbx.a;
                            this.e = 4;
                        }
                    } else {
                        ahmxVar.c(ahncVarB);
                    }
                } else {
                    this.c = false;
                    if (this.h == 0) {
                        long j3 = 2097151;
                        if (g()) {
                            agzw agzwVar = this.b;
                            int i3 = -1;
                            agzwVar.c = -1;
                            while (g() && agzwVar.c == i3 && !agzvVar.b() && this.e != i) {
                                d(i2);
                                Thread.interrupted();
                                long j4 = j3;
                                if (this.g == j2) {
                                    this.g = System.nanoTime() + ahmxVar.d;
                                }
                                LockSupport.parkNanos(ahmxVar.d);
                                if (System.nanoTime() - this.g >= j2) {
                                    this.g = j2;
                                    ahmb ahmbVar = ahmxVar.i;
                                    synchronized (ahmbVar) {
                                        if (!agzvVar.b()) {
                                            agzx agzxVar = ahmxVar.j;
                                            if (((int) (agzxVar.c & j4)) > ahmxVar.b) {
                                                if (agzwVar.a(-1, 1)) {
                                                    int i4 = this.indexInArray;
                                                    c(0);
                                                    ahmxVar.b(this, i4, 0);
                                                    int andDecrement = (int) (agzx.a.getAndDecrement(agzxVar) & j4);
                                                    if (andDecrement != i4) {
                                                        Object objA = ahmbVar.a(andDecrement);
                                                        objA.getClass();
                                                        ahmw ahmwVar = (ahmw) objA;
                                                        ahmbVar.b(i4, ahmwVar);
                                                        ahmwVar.c(i4);
                                                        ahmxVar.b(ahmwVar, andDecrement, i4);
                                                    }
                                                    ahmbVar.b(andDecrement, null);
                                                    this.e = 5;
                                                    i3 = -1;
                                                    j3 = j4;
                                                    i = 5;
                                                    i2 = 3;
                                                    j2 = 0;
                                                } else {
                                                    i3 = -1;
                                                    j3 = j4;
                                                    i = 5;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j4;
                                i = 5;
                                i3 = -1;
                            }
                        } else if (this.nextParkedWorker == ahmx.a) {
                            agzx agzxVar2 = ahmxVar.h;
                            while (true) {
                                long j5 = agzxVar2.c;
                                int i5 = this.indexInArray;
                                boolean z4 = ahbx.a;
                                long j6 = j;
                                this.nextParkedWorker = ahmxVar.i.a((int) (j5 & 2097151));
                                if (agzxVar2.a(j5, ((2097152 + j5) & j6) | i5)) {
                                    break;
                                } else {
                                    j = j6;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            d(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
        }
        d(5);
    }
}
