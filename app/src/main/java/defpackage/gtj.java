package defpackage;

import android.content.Context;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtj implements gtg {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/phenotype/PhenotypeManagerImpl");
    private static final Duration c;
    public final wey a;
    private final Context d;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        c = durationOfSeconds;
    }

    public gtj(Context context, wey weyVar) {
        context.getClass();
        this.d = context;
        this.a = weyVar;
        rfr.f(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gtg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.gth
            if (r0 == 0) goto L13
            r0 = r7
            gth r0 = (defpackage.gth) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gth r0 = new gth
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r7)     // Catch: defpackage.ahem -> L28
            goto L45
        L28:
            r7 = move-exception
            goto L48
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.agpl.b(r7)
            j$.time.Duration r7 = defpackage.gtj.c     // Catch: defpackage.ahem -> L28
            gti r2 = new gti     // Catch: defpackage.ahem -> L28
            r2.<init>(r6, r4)     // Catch: defpackage.ahem -> L28
            r0.c = r3     // Catch: defpackage.ahem -> L28
            java.lang.Object r7 = defpackage.zty.b(r7, r2, r0)     // Catch: defpackage.ahem -> L28
            if (r7 != r1) goto L45
            return r1
        L45:
            java.util.Map r7 = (java.util.Map) r7     // Catch: defpackage.ahem -> L28
            goto L69
        L48:
            zdy r0 = defpackage.gtj.b
            zeo r0 = r0.b()
            zdv r0 = (defpackage.zdv) r0
            zeo r7 = r0.p(r7)
            java.lang.String r0 = "com/google/android/apps/tvsearch/phenotype/PhenotypeManagerImpl"
            java.lang.String r1 = "getServerTokens"
            r2 = 45
            java.lang.String r3 = "PhenotypeManagerImpl.kt"
            zeo r7 = r7.q(r0, r1, r2, r3)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r0 = "Failed to retrieve server tokens."
            r7.u(r0)
            agre r7 = defpackage.agre.a
        L69:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L71:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r2 = r6.d
            java.lang.String r3 = defpackage.aejq.a
            if (r3 != 0) goto L9f
            java.lang.Class<aejq> r5 = defpackage.aejq.class
            monitor-enter(r5)
            java.lang.String r3 = defpackage.aejq.a     // Catch: java.lang.Throwable -> L9c
            if (r3 != 0) goto L9a
            java.lang.String r3 = "com.google.android.katniss.device"
            java.lang.String r2 = defpackage.rff.c(r2, r3)     // Catch: java.lang.Throwable -> L9c
            defpackage.aejq.a = r2     // Catch: java.lang.Throwable -> L9c
            r3 = r2
        L9a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9c
            goto L9f
        L9c:
            r7 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9c
            throw r7
        L9f:
            r1.getClass()
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L71
            goto Laa
        La9:
            r0 = r4
        Laa:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto Lb5
            java.lang.Object r7 = r0.getValue()
            r4 = r7
            java.lang.String r4 = (java.lang.String) r4
        Lb5:
            rjx r7 = defpackage.aeoy.b
            java.lang.Object r7 = r7.eV()
            java.lang.String r7 = (java.lang.String) r7
            if (r4 != 0) goto Lc1
            java.lang.String r4 = ""
        Lc1:
            java.lang.String[] r7 = new java.lang.String[]{r4, r7}
            java.util.List r7 = defpackage.agqq.d(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtj.a(agsw):java.lang.Object");
    }
}
