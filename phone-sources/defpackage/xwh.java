package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwh implements xze {
    public final xtq b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public xzd f;
    private final Executor j;
    private final xre i = xre.a(xwh.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile ulo h = new ulo((Object) null, (Object) null);

    public xwh(Executor executor, xtq xtqVar) {
        this.j = executor;
        this.b = xtqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r3 = new defpackage.xwg(r2, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r0.a.h() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r4.d() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r3.d = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r2.g.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r4 = r2.g.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [xvk] */
    /* JADX WARN: Type inference failed for: r3v4, types: [xwr] */
    /* JADX WARN: Type inference failed for: r3v5, types: [xvk] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, xwg] */
    @Override // defpackage.xvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xvk a(defpackage.xsq r3, defpackage.xsm r4, defpackage.xpy r5, defpackage.xqe[] r6) {
        /*
            r2 = this;
            xrs r0 = new xrs     // Catch: java.lang.Throwable -> L88
            xzp r1 = new xzp     // Catch: java.lang.Throwable -> L88
            r1.<init>()     // Catch: java.lang.Throwable -> L88
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L88
            ulo r3 = r2.h     // Catch: java.lang.Throwable -> L88
        Lc:
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L18
            xwr r3 = new xwr     // Catch: java.lang.Throwable -> L88
            xtk r4 = (defpackage.xtk) r4     // Catch: java.lang.Throwable -> L88
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L88
            goto L79
        L18:
            java.lang.Object r4 = r3.b     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L37
            xrv r4 = (defpackage.xrv) r4     // Catch: java.lang.Throwable -> L88
            xrr r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L88
            xpy r5 = r0.a     // Catch: java.lang.Throwable -> L88
            boolean r1 = r5.h()     // Catch: java.lang.Throwable -> L88
            xvn r1 = defpackage.xxc.c(r4, r1)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L38
            xsq r3 = r0.c     // Catch: java.lang.Throwable -> L88
            xsm r4 = r0.b     // Catch: java.lang.Throwable -> L88
            xvk r3 = r1.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L88
            goto L79
        L37:
            r4 = 0
        L38:
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L88
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L88
            ulo r1 = r2.h     // Catch: java.lang.Throwable -> L85
            if (r3 != r1) goto L82
            xwg r3 = new xwg     // Catch: java.lang.Throwable -> L85
            r3.<init>(r2, r0, r6)     // Catch: java.lang.Throwable -> L85
            xpy r0 = r0.a     // Catch: java.lang.Throwable -> L85
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L58
            if (r4 == 0) goto L58
            boolean r0 = r4.d()     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L58
            xtk r4 = r4.c     // Catch: java.lang.Throwable -> L85
            r3.d = r4     // Catch: java.lang.Throwable -> L85
        L58:
            java.util.Collection r4 = r2.g     // Catch: java.lang.Throwable -> L85
            r4.add(r3)     // Catch: java.lang.Throwable -> L85
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L85
            java.util.Collection r4 = r2.g     // Catch: java.lang.Throwable -> L7f
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7f
            r0 = 1
            if (r4 != r0) goto L6f
            xtq r4 = r2.b     // Catch: java.lang.Throwable -> L85
            java.lang.Runnable r0 = r2.c     // Catch: java.lang.Throwable -> L85
            r4.b(r0)     // Catch: java.lang.Throwable -> L85
        L6f:
            int r4 = r6.length     // Catch: java.lang.Throwable -> L85
            r0 = 0
        L71:
            if (r0 >= r4) goto L78
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L85
            int r0 = r0 + 1
            goto L71
        L78:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L85
        L79:
            xtq r4 = r2.b
            r4.a()
            return r3
        L7f:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7f
            throw r3     // Catch: java.lang.Throwable -> L85
        L82:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L85
            r3 = r1
            goto Lc
        L85:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L85
            throw r3     // Catch: java.lang.Throwable -> L88
        L88:
            r3 = move-exception
            xtq r4 = r2.b
            r4.a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwh.a(xsq, xsm, xpy, xqe[]):xvk");
    }

    @Override // defpackage.xze
    public final Runnable b(xzd xzdVar) {
        throw null;
    }

    @Override // defpackage.xri
    public final xre c() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d(defpackage.xrv r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwh.d(xrv):void");
    }

    @Override // defpackage.xze
    public final void e(xtk xtkVar) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.a != null) {
                return;
            }
            this.h = new ulo(this.h.b, xtkVar);
            xtq xtqVar = this.b;
            xtqVar.b(new xwf(this, 3));
            if (!g() && (runnable = this.e) != null) {
                xtqVar.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }

    @Override // defpackage.xze
    public final void f(xtk xtkVar) {
        throw null;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }
}
