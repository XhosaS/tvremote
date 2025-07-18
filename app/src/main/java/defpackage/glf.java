package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glf implements glg {
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/logging/memory/InteractorMemoryLoggerImpl");
    private static final Duration e;
    public final eyw a;
    public final ztw b;
    public Instant c;
    private final ActivityManager f;
    private final Context g;
    private final ahbt h;
    private final fkp i;
    private final agow j;
    private final lzb k;
    private final ghr l;
    private int m;

    static {
        Duration durationOfHours = Duration.ofHours(24L);
        durationOfHours.getClass();
        e = durationOfHours;
    }

    public glf(ActivityManager activityManager, eyw eywVar, Context context, ahbt ahbtVar, fkp fkpVar, agow agowVar, lzb lzbVar, ztw ztwVar, ghr ghrVar) {
        activityManager.getClass();
        eywVar.getClass();
        context.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        lzbVar.getClass();
        ztwVar.getClass();
        ghrVar.getClass();
        this.f = activityManager;
        this.a = eywVar;
        this.g = context;
        this.h = ahbtVar;
        this.i = fkpVar;
        this.j = agowVar;
        this.k = lzbVar;
        this.b = ztwVar;
        this.l = ghrVar;
        this.m = -1;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.c = instant;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yea r10, defpackage.agsw r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glf.a(yea, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yea r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.gle
            if (r0 == 0) goto L13
            r0 = r9
            gle r0 = (defpackage.gle) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gle r0 = new gle
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            j$.time.Instant r8 = r0.d
            defpackage.agpl.b(r9)
            goto L85
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            j$.time.Instant r8 = r0.d
            defpackage.agpl.b(r9)
            goto L99
        L3d:
            j$.time.Instant r8 = r0.d
            defpackage.agpl.b(r9)
            goto Lab
        L44:
            defpackage.agpl.b(r9)
            ztw r9 = r7.b
            j$.time.Instant r9 = r9.a()
            r9.getClass()
            int r2 = r8.ordinal()
            if (r2 == r5) goto L9c
            if (r2 == r4) goto L88
            r4 = 4
            if (r2 == r4) goto L76
            zdy r0 = defpackage.glf.d
            zeo r0 = r0.d()
            r1 = 80
            java.lang.String r2 = "InteractorMemoryLoggerImpl.kt"
            java.lang.String r3 = "com/google/android/apps/tvsearch/logging/memory/InteractorMemoryLoggerImpl"
            java.lang.String r4 = "shouldLog"
            zeo r0 = r0.q(r3, r4, r1, r2)
            zdv r0 = (defpackage.zdv) r0
            java.lang.String r1 = "logProcessMemoryUsage with unknown state %s."
            r0.x(r1, r8)
            r8 = r9
            goto Lb0
        L76:
            fkp r8 = r7.i
            r0.d = r9
            r0.c = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 == r1) goto Lc7
            r6 = r9
            r9 = r8
            r8 = r6
        L85:
            j$.time.Instant r9 = (j$.time.Instant) r9
            goto Lad
        L88:
            r7.c = r9
            fkp r8 = r7.i
            r0.d = r9
            r0.c = r4
            java.lang.Object r8 = r8.c(r0)
            if (r8 == r1) goto Lc7
            r6 = r9
            r9 = r8
            r8 = r6
        L99:
            j$.time.Instant r9 = (j$.time.Instant) r9
            goto Lad
        L9c:
            fkp r8 = r7.i
            r0.d = r9
            r0.c = r5
            java.lang.Object r8 = r8.b(r0)
            if (r8 == r1) goto Lc7
            r6 = r9
            r9 = r8
            r8 = r6
        Lab:
            j$.time.Instant r9 = (j$.time.Instant) r9
        Lad:
            r6 = r9
            r9 = r8
            r8 = r6
        Lb0:
            j$.time.Duration r0 = defpackage.glf.e
            j$.time.Instant r8 = r8.plus(r0)
            int r8 = r9.compareTo(r8)
            if (r8 >= 0) goto Lc2
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        Lc2:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glf.b(yea, agsw):java.lang.Object");
    }

    @Override // defpackage.glg
    public final void c(yea yeaVar) {
        yeaVar.getClass();
        ahal.e(this.h, null, 0, new glc(this, yeaVar, null), 3);
    }
}
