package defpackage;

import java.lang.ref.Reference;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvk implements wwq, wzq {
    public final wwq a;
    public Thread b;
    public wza c;
    private final wzp d;
    private final wzr e;

    private wvk(wzp wzpVar, wvk wvkVar, wwl wwlVar) {
        this.d = wzpVar;
        this.e = wvkVar.e;
        this.a = wvkVar;
        wza wzaVar = wwlVar.e;
        if (wzaVar == null) {
            this.c = null;
            this.b = Thread.currentThread();
        } else {
            this.c = wzaVar;
            this.b = null;
        }
    }

    @Override // defpackage.wwq
    public final wwq a() {
        return this.a;
    }

    @Override // defpackage.wwq
    public final wza b() {
        return this.c;
    }

    @Override // defpackage.wzq
    public final int c() {
        return this.d.f;
    }

    @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        wum.m(this);
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.wwq
    public final String d() {
        return this.d.c;
    }

    @Override // defpackage.wwq
    public final String e() {
        return this.e.c;
    }

    @Override // defpackage.wwq
    public final Thread f() {
        return this.b;
    }

    @Override // defpackage.wwq
    public final UUID g() {
        return this.e.b;
    }

    @Override // defpackage.wzq
    public final wyv h() {
        wyv wyvVarB;
        wzr wzrVar = this.e;
        synchronized (wzrVar) {
            wyvVarB = wzrVar.b();
        }
        return wyvVarB;
    }

    @Override // defpackage.wwq
    public final wvy j(wvz wvzVar) {
        return wwc.i(wvzVar, k());
    }

    @Override // defpackage.wwq
    public final wwc k() {
        wzp wzpVar = this.d;
        return wwc.d(wzpVar.e, wzpVar.b());
    }

    @Override // defpackage.wwq
    public final long l() {
        return this.e.a() / 1000000;
    }

    @Override // defpackage.wwq
    public final wwc n() {
        throw null;
    }

    @Override // defpackage.wwq
    public final void o(wvz wvzVar, Object obj) {
        wzp wzpVar;
        wzl wzlVar;
        wzm wzmVarA;
        wzm wzmVar = new wzm(wvzVar, obj);
        do {
            wzpVar = this.d;
            wzlVar = wzp.a;
            wzmVarA = wzlVar.a(wzpVar);
            if (wzmVarA != null) {
                wzmVar.c = wzmVarA;
            }
        } while (!wzlVar.b(wzpVar, wzmVarA, wzmVar));
        Reference.reachabilityFence(this);
    }

    @Override // defpackage.wwq
    public final void p(boolean z) {
        long jA = this.e.a();
        wzp wzpVar = this.d;
        long j = jA - wzpVar.d;
        yqw.L(!wzpVar.c());
        wzpVar.i = (j & 4611686018427387903L) | (true != z ? 0L : 4611686018427387904L) | Long.MIN_VALUE;
        Reference.reachabilityFence(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r9 = new defpackage.wvk(r2, r8, r11);
        r10 = r9.a;
        r11 = defpackage.wum.a;
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r9.b != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r9.c == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        defpackage.yqw.M(r11, "isSynchronousChild should not be called if the trace has been closed on its creation thread.");
        r11 = r9.c;
        r10 = (defpackage.wvk) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r11 != r10.c) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r10.b != r9.b) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r2.h = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        return r9;
     */
    @Override // defpackage.wwq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wwq q(java.lang.String r9, defpackage.wwc r10, defpackage.wwl r11) {
        /*
            r8 = this;
            wzr r1 = r8.e
            long r5 = r1.a()
            wzp r2 = new wzp
            wzp r3 = r8.d
            r4 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r7)
        Lf:
            java.util.concurrent.atomic.AtomicReference r9 = r1.e
            java.lang.Object r10 = r9.get()
            wzp r10 = (defpackage.wzp) r10
            int r0 = r10.f
            r3 = 1
            int r0 = r0 + r3
            wxv r4 = r1.a
            int r4 = r4.e
            if (r0 < r4) goto L34
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f = r9
            r9 = 0
            r2.g = r9
            monitor-enter(r1)
            int r9 = r1.g     // Catch: java.lang.Throwable -> L30
            int r9 = r9 + r3
            r1.g = r9     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            goto L45
        L30:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r9
        L34:
            r2.f = r0
            r2.g = r10
        L38:
            boolean r0 = r9.compareAndSet(r10, r2)
            if (r0 != 0) goto L45
            java.lang.Object r0 = r9.get()
            if (r0 == r10) goto L38
            goto Lf
        L45:
            wvk r9 = new wvk
            r9.<init>(r2, r8, r11)
            wwq r10 = r9.a
            boolean r11 = defpackage.wum.a
            r10.getClass()
            java.lang.Thread r11 = r9.b
            r0 = 0
            if (r11 != 0) goto L5d
            wza r11 = r9.c
            if (r11 == 0) goto L5b
            goto L5d
        L5b:
            r11 = r0
            goto L5e
        L5d:
            r11 = r3
        L5e:
            java.lang.String r1 = "isSynchronousChild should not be called if the trace has been closed on its creation thread."
            defpackage.yqw.M(r11, r1)
            wza r11 = r9.c
            wvk r10 = (defpackage.wvk) r10
            if (r11 == 0) goto L6e
            wza r10 = r10.c
            if (r11 != r10) goto L75
            goto L76
        L6e:
            java.lang.Thread r10 = r10.b
            java.lang.Thread r11 = r9.b
            if (r10 != r11) goto L75
            goto L76
        L75:
            r3 = r0
        L76:
            r2.h = r3
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvk.q(java.lang.String, wwc, wwl):wwq");
    }

    @Override // defpackage.wwq
    public final void t() {
        this.d.j = 3;
    }

    public final String toString() {
        return wum.l(this);
    }

    public wvk(wzp wzpVar, wzr wzrVar, wwl wwlVar) {
        this.d = wzpVar;
        this.e = wzrVar;
        Thread threadCurrentThread = null;
        this.a = null;
        wza wzaVar = wwlVar.e;
        if (wzaVar == null) {
            this.c = null;
            threadCurrentThread = Thread.currentThread();
        } else {
            this.c = wzaVar;
        }
        this.b = threadCurrentThread;
    }

    @Override // defpackage.wwq
    public final void r() {
    }
}
