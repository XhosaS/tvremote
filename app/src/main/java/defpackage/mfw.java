package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfw {
    public final Queue a;
    private final Executor b;
    private final AtomicReference c;
    private final mfv d;
    private Throwable e;

    public mfw(Executor executor) {
        executor.getClass();
        this.b = executor;
        this.c = new AtomicReference();
        this.a = new ConcurrentLinkedQueue();
        this.d = new mfv();
    }

    public final zyd a(Executor executor, zvh zvhVar) {
        final zyd zydVarL = zxn.l(wyo.b(zvhVar), new mfl(this));
        return zxn.k(wyo.i(new Callable() { // from class: mfn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(zydVarL);
            }
        }), executor);
    }

    public final Object b(zvh zvhVar) {
        return c(zxn.l(zvhVar, new mfl(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
    
        if (defpackage.mfy.b(r14, r10) <= defpackage.mfx.a(r4)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fc, code lost:
    
        r0 = r11;
        r10 = defpackage.mfy.f(r14, false, false, false, 0, defpackage.mfx.a(r4), 0, 95);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0215, code lost:
    
        if (defpackage.mfy.d(r14) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021b, code lost:
    
        if (r12.compareAndSet(r14, r10) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021d, code lost:
    
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0220, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0221, code lost:
    
        r0 = r26;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0226, code lost:
    
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
    
        if (defpackage.mfy.a(r14) != defpackage.mfy.a(r10)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0236, code lost:
    
        if (r12.compareAndSet(r14, r10) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0239, code lost:
    
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0254, code lost:
    
        if (r12.compareAndSet(r14, defpackage.mfy.f(r10, false, true, false, 0, 0, 0, 125)) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0256, code lost:
    
        r6.a(defpackage.mfy.a(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025e, code lost:
    
        r26 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0260, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0262, code lost:
    
        java.util.concurrent.locks.LockSupport.park(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0269, code lost:
    
        if (r17.get() != r13) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0275, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x027d, code lost:
    
        r7 = r7 | java.lang.Thread.interrupted();
        r11 = r17;
        r4 = r24;
        r0 = r26;
        r9 = true;
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0288, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x028d, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0290, code lost:
    
        if (r7 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0292, code lost:
    
        r3.a.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0297, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0056, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0185, code lost:
    
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0186, code lost:
    
        r12 = r3.f;
        r14 = r12.get();
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a4, code lost:
    
        if (r12.compareAndSet(r14, defpackage.mfy.f(r14, false, false, true, 0, 0, 0, 123)) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a8, code lost:
    
        if (r3.c == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        r4 = defpackage.mfy.a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01af, code lost:
    
        r4 = android.os.Process.getThreadPriority(r3.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b5, code lost:
    
        r5 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bd, code lost:
    
        if (defpackage.mfu.a(r5) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c1, code lost:
    
        if ((r5 >> 2) > r4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ce, code lost:
    
        if (r0.compareAndSet(r5, defpackage.mfu.c(r5, r4, r9, r10, 4)) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d0, code lost:
    
        r4 = defpackage.mfx.b(r4, r0.b);
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d8, code lost:
    
        if (r6.c == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01da, code lost:
    
        r12 = r6.f;
        r14 = r12.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e6, code lost:
    
        if ((r14 & r24) != (r4 & r24)) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
    
        r26 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f0, code lost:
    
        if (defpackage.mfy.b(r14, r10) == (-21)) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.zyd r38) throws java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfw.c(zyd):java.lang.Object");
    }

    public final void d(Runnable runnable) {
        runnable.getClass();
        this.a.add(runnable);
    }
}
