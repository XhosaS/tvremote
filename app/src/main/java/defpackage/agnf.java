package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnf {
    public static final boolean a;
    public static final int b;
    static final AtomicReference c = new AtomicReference();
    static final Map d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[LOOP:0: B:14:0x003f->B:24:0x0073, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026 A[PHI: r1
  0x0026: PHI (r1v7 boolean) = (r1v2 boolean), (r1v2 boolean), (r1v9 boolean) binds: [B:10:0x002f, B:26:0x0026, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            defpackage.agnf.c = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.agnf.d = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r2 = r0.containsKey(r1)
            r3 = 1
            if (r2 == 0) goto L28
            java.lang.String r1 = r0.getProperty(r1)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r1 == 0) goto L26
            goto L29
        L26:
            r0 = r3
            goto L39
        L28:
            r1 = r3
        L29:
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L26
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.NumberFormatException -> L26
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L26
        L39:
            defpackage.agnf.a = r1
            defpackage.agnf.b = r0
            if (r1 == 0) goto L77
        L3f:
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.agnf.c
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            if (r0 == 0) goto L4a
            goto L77
        L4a:
            agna r0 = new agna
            java.lang.String r1 = "RxSchedulerPurge"
            r0.<init>(r1)
            java.util.concurrent.ScheduledExecutorService r4 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r0)
        L55:
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.agnf.c
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r4)
            if (r1 == 0) goto L6d
            agne r5 = new agne
            r5.<init>()
            int r0 = defpackage.agnf.b
            long r6 = (long) r0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r8 = r6
            r4.scheduleAtFixedRate(r5, r6, r8, r10)
            return
        L6d:
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L55
            r4.shutdownNow()
            goto L3f
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agnf.<clinit>():void");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        return scheduledExecutorServiceNewScheduledThreadPool;
    }
}
