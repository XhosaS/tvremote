package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxy extends Thread {
    public final yyh a;
    public final yns b;
    public boolean c;
    final /* synthetic */ yxz d;
    public int e;
    private final ylf f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public yxy(yxz yxzVar, int i) {
        this.d = yxzVar;
        setDaemon(true);
        setContextClassLoader(yxzVar.getClass().getClassLoader());
        this.a = new yyh();
        this.f = new ylf();
        this.e = 4;
        this.b = new yns(0, ynv.a);
        this.nextParkedWorker = yxz.a;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        c(i);
    }

    private final yyd e() {
        if (a(2) == 0) {
            yxz yxzVar = this.d;
            yyd yydVar = (yyd) yxzVar.i.z();
            return yydVar != null ? yydVar : (yyd) yxzVar.j.z();
        }
        yxz yxzVar2 = this.d;
        yyd yydVar2 = (yyd) yxzVar2.j.z();
        return yydVar2 != null ? yydVar2 : (yyd) yxzVar2.i.z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        r8 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.yyd f(int r26) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxy.f(int):yyd");
    }

    private final boolean g() {
        return this.nextParkedWorker != yxz.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yyd b(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.e
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            goto L73
        L8:
            yxz r0 = r9.d
        La:
            ynt r3 = r0.h
            long r4 = r3.b
            r6 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r6 = r6 & r4
            r8 = 42
            long r6 = r6 >> r8
            int r6 = (int) r6
            if (r6 != 0) goto L65
            yyh r10 = r9.a
        L1c:
            java.lang.Object r3 = r10.b
            ynu r3 = (defpackage.ynu) r3
            java.lang.Object r4 = r3.a
            yyd r4 = (defpackage.yyd) r4
            if (r4 != 0) goto L27
            goto L33
        L27:
            boolean r5 = r4.h
            if (r5 != r2) goto L33
            boolean r3 = r3.d(r4, r1)
            if (r3 == 0) goto L1c
            r1 = r4
            goto L53
        L33:
            java.lang.Object r3 = r10.d
            yns r3 = (defpackage.yns) r3
            int r3 = r3.b
            java.lang.Object r4 = r10.c
            yns r4 = (defpackage.yns) r4
            int r4 = r4.b
        L3f:
            if (r3 == r4) goto L53
            java.lang.Object r5 = r10.e
            yns r5 = (defpackage.yns) r5
            int r5 = r5.b
            if (r5 != 0) goto L4a
            goto L53
        L4a:
            int r4 = r4 + (-1)
            yyd r5 = r10.d(r4, r2)
            if (r5 == 0) goto L3f
            r1 = r5
        L53:
            if (r1 != 0) goto L64
            upq r10 = r0.j
            java.lang.Object r10 = r10.z()
            yyd r10 = (defpackage.yyd) r10
            if (r10 != 0) goto L63
            yyd r10 = r9.f(r2)
        L63:
            return r10
        L64:
            return r1
        L65:
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r4
            boolean r3 = r3.c(r4, r6)
            if (r3 == 0) goto La
            r9.e = r2
        L73:
            if (r10 == 0) goto La9
            yxz r10 = r9.d
            int r10 = r10.b
            int r10 = r10 + r10
            int r10 = r9.a(r10)
            if (r10 != 0) goto L81
            goto L82
        L81:
            r2 = 0
        L82:
            if (r2 == 0) goto L8b
            yyd r10 = r9.e()
            if (r10 == 0) goto L8b
            return r10
        L8b:
            yyh r10 = r9.a
            java.lang.Object r0 = r10.b
            ynu r0 = (defpackage.ynu) r0
            java.lang.Object r0 = r0.a(r1)
            yyd r0 = (defpackage.yyd) r0
            if (r0 != 0) goto L9d
            yyd r0 = r10.c()
        L9d:
            if (r0 == 0) goto La0
            return r0
        La0:
            if (r2 != 0) goto Lb0
            yyd r10 = r9.e()
            if (r10 == 0) goto Lb0
            return r10
        La9:
            yyd r10 = r9.e()
            if (r10 == 0) goto Lb0
            return r10
        Lb0:
            r10 = 3
            yyd r10 = r9.f(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxy.b(boolean):yyd");
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
            this.d.h.a(4398046511104L);
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
                yxz yxzVar = this.d;
                if (yxzVar.d() || this.e == 5) {
                    break loop0;
                }
                yyd yydVarB = b(this.c);
                long j = -2097152;
                if (yydVarB != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.e == 3) {
                        boolean z2 = yoy.a;
                        this.e = 2;
                    }
                    if (yydVarB.h) {
                        if (d(2)) {
                            yxzVar.c();
                        }
                        yxz.f(yydVarB);
                        yxzVar.h.a(-2097152L);
                        if (this.e != 5) {
                            boolean z3 = yoy.a;
                            this.e = 4;
                        }
                    } else {
                        yxz.f(yydVarB);
                    }
                } else {
                    this.c = false;
                    if (this.h == 0) {
                        long j2 = 2097151;
                        if (g()) {
                            yns ynsVar = this.b;
                            ynsVar.b = -1;
                            while (g() && ynsVar.b == -1 && !yxzVar.d() && this.e != 5) {
                                d(3);
                                Thread.interrupted();
                                if (this.g == 0) {
                                    this.g = System.nanoTime() + yxzVar.d;
                                }
                                LockSupport.parkNanos(yxzVar.d);
                                long j3 = j2;
                                if (System.nanoTime() - this.g >= 0) {
                                    this.g = 0L;
                                    yxk yxkVar = yxzVar.g;
                                    synchronized (yxkVar) {
                                        if (!yxzVar.d()) {
                                            ynt yntVar = yxzVar.h;
                                            if (((int) (yntVar.b & j3)) > yxzVar.b) {
                                                if (ynsVar.d(-1, 1)) {
                                                    int i = this.indexInArray;
                                                    c(0);
                                                    yxzVar.b(this, i, 0);
                                                    int andDecrement = (int) (ynt.a.getAndDecrement(yntVar) & j3);
                                                    if (andDecrement != i) {
                                                        Object objA = yxkVar.a(andDecrement);
                                                        objA.getClass();
                                                        yxy yxyVar = (yxy) objA;
                                                        yxkVar.b(i, yxyVar);
                                                        yxyVar.c(i);
                                                        yxzVar.b(yxyVar, andDecrement, i);
                                                    }
                                                    yxkVar.b(andDecrement, null);
                                                    this.e = 5;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3;
                            }
                        } else if (this.nextParkedWorker == yxz.a) {
                            ynt yntVar2 = yxzVar.f;
                            while (true) {
                                long j4 = yntVar2.b;
                                int i2 = this.indexInArray;
                                boolean z4 = yoy.a;
                                long j5 = j;
                                this.nextParkedWorker = yxzVar.g.a((int) (j4 & 2097151));
                                if (yntVar2.c(j4, ((2097152 + j4) & j5) | i2)) {
                                    break;
                                } else {
                                    j = j5;
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
