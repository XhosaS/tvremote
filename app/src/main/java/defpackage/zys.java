package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zys implements Runnable {
    Runnable a;
    final /* synthetic */ zyt b;

    public zys(zyt zytVar) {
        this.b = zytVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        r0 = java.lang.Thread.currentThread();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        defpackage.zyt.a.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r11.a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x002d A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            zyt r3 = r11.b     // Catch: java.lang.Throwable -> L4a
            java.util.Deque r4 = r3.b     // Catch: java.lang.Throwable -> L4a
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L23
            int r0 = r3.d     // Catch: java.lang.Throwable -> L7c
            r5 = 4
            if (r0 != r5) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L39
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L89
        L16:
            r0.interrupt()     // Catch: java.lang.Error -> L89
            goto L39
        L1a:
            long r6 = r3.c     // Catch: java.lang.Throwable -> L7c
            r8 = 1
            long r6 = r6 + r8
            r3.c = r6     // Catch: java.lang.Throwable -> L7c
            r3.d = r5     // Catch: java.lang.Throwable -> L7c
        L23:
            java.lang.Object r0 = r4.poll()     // Catch: java.lang.Throwable -> L7c
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L7c
            r11.a = r0     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L3a
            zyt r0 = r11.b     // Catch: java.lang.Throwable -> L7c
            r0.d = r2     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L39
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L89
            goto L16
        L39:
            return
        L3a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7c
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4a
            r1 = r1 | r0
            r3 = 0
            java.lang.Runnable r0 = r11.a     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r0.run()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r11.a = r3     // Catch: java.lang.Throwable -> L4a
        L48:
            r0 = r2
            goto L2
        L4a:
            r0 = move-exception
            goto L7f
        L4c:
            r0 = move-exception
            goto L79
        L4e:
            r0 = move-exception
            r9 = r0
            zyc r0 = defpackage.zyt.a     // Catch: java.lang.Throwable -> L4c
            java.util.logging.Logger r4 = r0.a()     // Catch: java.lang.Throwable -> L4c
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r7 = "workOnQueue"
            java.lang.Runnable r0 = r11.a     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r10 = "Exception while executing runnable "
            r8.append(r10)     // Catch: java.lang.Throwable -> L4c
            r8.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L4c
            r4.logp(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4c
            r11.a = r3     // Catch: java.lang.Throwable -> L4a
            goto L48
        L79:
            r11.a = r3     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.Throwable -> L4a
        L7c:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7c
            throw r0     // Catch: java.lang.Throwable -> L4a
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L89
            r1.interrupt()     // Catch: java.lang.Error -> L89
        L88:
            throw r0     // Catch: java.lang.Error -> L89
        L89:
            r0 = move-exception
            zyt r1 = r11.b
            java.util.Deque r3 = r1.b
            monitor-enter(r3)
            r1.d = r2     // Catch: java.lang.Throwable -> L93
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L93
            throw r0
        L93:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L93
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zys.run():void");
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return a.t(runnable, "SequentialExecutorWorker{running=", "}");
        }
        int i = this.b.d;
        return a.e(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE", "SequentialExecutorWorker{state=", "}");
    }
}
