package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jwi {
    public final AtomicLong a = new AtomicLong(-1);
    private final yrp b;

    private jwi(final Context context) {
        final kku kkuVar = new kku("auth:gau");
        this.b = yru.a(new yrp() { // from class: jwg
            @Override // defpackage.yrp
            public final Object eV() {
                return new klb(context, kkuVar);
            }
        });
    }

    public static jwi a(Context context) {
        rfr.f(context);
        return new jwi(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if ((r2 - r0.get()) > java.util.concurrent.TimeUnit.MINUTES.toMillis(30)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(int r19, int r20, long r21, long r23, long r25) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L85
            aerz r0 = defpackage.aerz.a     // Catch: java.lang.Throwable -> L85
            aesa r0 = r0.eV()     // Catch: java.lang.Throwable -> L85
            double r4 = r0.a()     // Catch: java.lang.Throwable -> L85
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            float r0 = r0.nextFloat()     // Catch: java.lang.Throwable -> L85
            double r6 = (double) r0     // Catch: java.lang.Throwable -> L85
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L20
            goto L83
        L20:
            java.util.concurrent.atomic.AtomicLong r0 = r1.a     // Catch: java.lang.Throwable -> L85
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L85
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L2d
            goto L3f
        L2d:
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L85
            long r4 = r2 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L85
            r6 = 30
            long r6 = r0.toMillis(r6)     // Catch: java.lang.Throwable -> L85
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L83
        L3f:
            yrp r0 = r1.b     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r0.eV()     // Catch: java.lang.Throwable -> L85
            kkt r0 = (defpackage.kkt) r0     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L85
            r5 = 1
            com.google.android.gms.common.internal.MethodInvocation[] r5 = new com.google.android.gms.common.internal.MethodInvocation[r5]     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.common.internal.MethodInvocation r6 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L85
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L85
            long r7 = r7 - r25
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L85
            r9 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r8 = r20
            r10 = r21
            r12 = r23
            r17 = r7
            r7 = r19
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L85
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L85
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L85
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L85
            lvf r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L85
            jwh r4 = new jwh     // Catch: java.lang.Throwable -> L85
            r4.<init>()     // Catch: java.lang.Throwable -> L85
            java.util.concurrent.Executor r2 = defpackage.lvm.a     // Catch: java.lang.Throwable -> L85
            lvn r0 = (defpackage.lvn) r0     // Catch: java.lang.Throwable -> L85
            r0.m(r2, r4)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r18)
            return
        L83:
            monitor-exit(r18)
            return
        L85:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L85
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwi.b(int, int, long, long, long):void");
    }
}
