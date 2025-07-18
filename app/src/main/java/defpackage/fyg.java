package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fyg extends agtu implements agvb {
    int a;
    final /* synthetic */ fyh b;
    final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyg(fyh fyhVar, Intent intent, agsw agswVar) {
        super(2, agswVar);
        this.b = fyhVar;
        this.c = intent;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fyg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r6 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r5.a
            r2 = 1
            defpackage.agpl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L30
        Ld:
            fyh r6 = r5.b
            r5.a = r2
            fjn r6 = r6.b
            java.lang.Object r6 = r6.b(r5)
            if (r6 == r0) goto Lbb
        L19:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L3c
            fyh r6 = r5.b
            r1 = 2
            r5.a = r1
            fxv r6 = r6.c
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L30
            goto Lbb
        L30:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L3c
            j$.time.Duration r6 = defpackage.fyh.a
            goto Lb9
        L3c:
            android.content.Intent r6 = r5.c
            java.lang.String r6 = r6.getAction()
            if (r6 == 0) goto L78
            int r0 = r6.hashCode()
            r1 = -1297564431(0xffffffffb2a8bcf1, float:-1.9643695E-8)
            if (r0 == r1) goto L6c
            r1 = -998129106(0xffffffffc481c22e, float:-1038.0681)
            if (r0 == r1) goto L63
            r1 = 1750624572(0x6858693c, float:4.0878896E24)
            if (r0 == r1) goto L58
            goto L78
        L58:
            java.lang.String r0 = "com.google.android.apps.tvsearch.fcm.REGISTER_FCM_SOON_ACTION"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L78
            j$.time.Duration r6 = defpackage.fyh.a
            goto L95
        L63:
            java.lang.String r0 = "com.google.android.apps.tvsearch.fcm.REGISTRATION_NEEDED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L78
            goto L75
        L6c:
            java.lang.String r0 = "com.google.android.apps.tvsearch.setup.share.ASSISTANT_ENABLED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L75
            goto L78
        L75:
            j$.time.Duration r6 = j$.time.Duration.ZERO
            goto L95
        L78:
            j$.util.concurrent.ThreadLocalRandom r6 = j$.util.concurrent.ThreadLocalRandom.current()
            r6.getClass()
            r0 = 1
            j$.time.Duration r0 = j$.time.Duration.ofHours(r0)
            r0.getClass()
            r3 = 6
            j$.time.Duration r1 = j$.time.Duration.ofHours(r3)
            r1.getClass()
            j$.time.Duration r6 = defpackage.feq.b(r6, r0, r1)
        L95:
            r6.getClass()
            fyh r0 = r5.b
            android.app.job.JobInfo$Builder r1 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r3 = defpackage.irm.a
            r3 = 14
            android.content.ComponentName r4 = defpackage.irm.j
            r1.<init>(r3, r4)
            android.app.job.JobInfo$Builder r6 = defpackage.feq.a(r1, r6)
            android.app.job.JobInfo$Builder r6 = r6.setRequiredNetworkType(r2)
            android.app.job.JobInfo r6 = r6.build()
            r6.getClass()
            android.app.job.JobScheduler r0 = r0.d
            r0.schedule(r6)
        Lb9:
            r6 = 0
            return r6
        Lbb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fyg(this.b, this.c, agswVar);
    }
}
