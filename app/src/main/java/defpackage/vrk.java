package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vrk implements Runnable {
    Runnable a;
    final /* synthetic */ vrl b;

    public vrk(vrl vrlVar) {
        this.b = vrlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r3 = r3 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        r7.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        r7.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[Catch: all -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0056, blocks: (B:3:0x0001, B:18:0x002b, B:34:0x004e, B:35:0x0055, B:5:0x0007, B:6:0x000b, B:21:0x0034, B:24:0x003f, B:28:0x0046, B:29:0x0048, B:32:0x004b, B:23:0x003a, B:8:0x000e, B:12:0x0016, B:13:0x001c, B:15:0x0026, B:16:0x0028, B:20:0x0033), top: B:50:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0026 A[EDGE_INSN: B:53:0x0026->B:15:0x0026 BREAK  A[LOOP:0: B:47:0x0007->B:24:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            r0 = 1
            defpackage.uea.c()     // Catch: java.lang.Throwable -> L56
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            vrl r4 = r7.b     // Catch: java.lang.Throwable -> L43
            java.util.Deque r5 = r4.a     // Catch: java.lang.Throwable -> L43
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L43
            if (r2 != 0) goto L1c
            int r2 = r4.b     // Catch: java.lang.Throwable -> L49
            r6 = 2
            if (r2 != r6) goto L15
            r2 = r0
            goto L16
        L15:
            r2 = r1
        L16:
            defpackage.yqw.L(r2)     // Catch: java.lang.Throwable -> L49
            r2 = 3
            r4.b = r2     // Catch: java.lang.Throwable -> L49
        L1c:
            java.lang.Object r2 = r5.poll()     // Catch: java.lang.Throwable -> L49
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L49
            r7.a = r2     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L33
            r4.b = r0     // Catch: java.lang.Throwable -> L49
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L32
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r1.interrupt()     // Catch: java.lang.Throwable -> L56
        L32:
            return
        L33:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L43
            r3 = r3 | r2
            r2 = 0
            java.lang.Runnable r4 = r7.a     // Catch: java.lang.Throwable -> L45
            r4.run()     // Catch: java.lang.Throwable -> L45
            r7.a = r2     // Catch: java.lang.Throwable -> L43
            r2 = r0
            goto L7
        L43:
            r1 = move-exception
            goto L4c
        L45:
            r1 = move-exception
            r7.a = r2     // Catch: java.lang.Throwable -> L43
            throw r1     // Catch: java.lang.Throwable -> L43
        L49:
            r1 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L43
        L4c:
            if (r3 == 0) goto L55
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r2.interrupt()     // Catch: java.lang.Throwable -> L56
        L55:
            throw r1     // Catch: java.lang.Throwable -> L56
        L56:
            r1 = move-exception
            vrl r2 = r7.b
            java.util.Deque r3 = r2.a
            monitor-enter(r3)
            r2.b = r0     // Catch: java.lang.Throwable -> L60
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L60
            throw r1
        L60:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L60
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrk.run():void");
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return a.t(runnable, "SequentialExecutorWorker{running=", "}");
        }
        int i = this.b.b;
        return a.e(i != 1 ? i != 2 ? i != 3 ? "null" : "RUNNING" : "QUEUED" : "IDLE", "SequentialExecutorWorker{state=", "}");
    }
}
