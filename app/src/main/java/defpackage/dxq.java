package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxq implements Runnable {
    Runnable a;
    final /* synthetic */ dxr b;

    public dxq(dxr dxrVar) {
        this.b = dxrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r1 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r0 = java.lang.Thread.currentThread();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        r10.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        r10.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x002d A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            dxr r3 = r10.b     // Catch: java.lang.Throwable -> L48
            java.util.Deque r4 = r3.a     // Catch: java.lang.Throwable -> L48
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L23
            int r0 = r3.c     // Catch: java.lang.Throwable -> L51
            r5 = 4
            if (r0 != r5) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L37
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L5e
        L16:
            r0.interrupt()     // Catch: java.lang.Error -> L5e
            return
        L1a:
            long r6 = r3.b     // Catch: java.lang.Throwable -> L51
            r8 = 1
            long r6 = r6 + r8
            r3.b = r6     // Catch: java.lang.Throwable -> L51
            r3.c = r5     // Catch: java.lang.Throwable -> L51
        L23:
            java.lang.Object r0 = r4.poll()     // Catch: java.lang.Throwable -> L51
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L51
            r10.a = r0     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L38
            r3.c = r2     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L37
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L5e
            goto L16
        L37:
            return
        L38:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L48
            r1 = r1 | r0
            r0 = 0
            java.lang.Runnable r3 = r10.a     // Catch: java.lang.Throwable -> L4a java.lang.RuntimeException -> L4c
            r3.run()     // Catch: java.lang.Throwable -> L4a java.lang.RuntimeException -> L4c
            r10.a = r0     // Catch: java.lang.Throwable -> L48
            r0 = r2
            goto L2
        L48:
            r0 = move-exception
            goto L54
        L4a:
            r3 = move-exception
            goto L4e
        L4c:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L4a
        L4e:
            r10.a = r0     // Catch: java.lang.Throwable -> L48
            throw r3     // Catch: java.lang.Throwable -> L48
        L51:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.Throwable -> L48
        L54:
            if (r1 == 0) goto L5d
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L5e
            r1.interrupt()     // Catch: java.lang.Error -> L5e
        L5d:
            throw r0     // Catch: java.lang.Error -> L5e
        L5e:
            r0 = move-exception
            dxr r1 = r10.b
            java.util.Deque r3 = r1.a
            monitor-enter(r3)
            r1.c = r2     // Catch: java.lang.Throwable -> L68
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L68
            throw r0
        L68:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L68
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxq.run():void");
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return a.t(runnable, "SequentialLithoHandler{running=", "}");
        }
        int i = this.b.c;
        return a.e(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE", "SequentialLithoHandler{state=", "}");
    }
}
