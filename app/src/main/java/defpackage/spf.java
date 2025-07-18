package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spf {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater");
    public final sud b;
    private final ahbt c;

    public spf(sud sudVar, ahbt ahbtVar) {
        ahbtVar.getClass();
        this.b = sudVar;
        this.c = ahbtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.sds r5, defpackage.agsw r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.spb
            if (r0 == 0) goto L13
            r0 = r6
            spb r0 = (defpackage.spb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            spb r0 = new spb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.agpl.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.agpl.b(r6)
            zyd r5 = r5.a()     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = defpackage.ahkr.b(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L41
            return r1
        L41:
            yqt r6 = (defpackage.yqt) r6     // Catch: java.lang.Throwable -> L27
            goto L48
        L44:
            java.lang.Object r6 = defpackage.agpl.a(r5)
        L48:
            java.lang.Throwable r5 = defpackage.agpk.a(r6)
            if (r5 != 0) goto L51
            yqt r6 = (defpackage.yqt) r6
            goto L74
        L51:
            zdy r5 = defpackage.spf.a
            zeo r5 = r5.d()
            zer r6 = defpackage.zfi.a
            java.lang.String r0 = "ALT.SessionMicUpdater"
            zeo r5 = r5.o(r6, r0)
            r6 = 215(0xd7, float:3.01E-43)
            java.lang.String r0 = "AudioSessionToMicStateUpdater.kt"
            java.lang.String r1 = "com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater"
            java.lang.String r2 = "audioRecordIdAwait"
            zeo r5 = r5.q(r1, r2, r6, r0)
            zdv r5 = (defpackage.zdv) r5
            java.lang.String r6 = "#audio# unable to retrieve audio record ID"
            r5.u(r6)
            ypv r6 = defpackage.ypv.a
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spf.a(sds, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.rux r6, defpackage.yqt r7, java.lang.String r8, defpackage.agsw r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spf.b(rux, yqt, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.rux r6, defpackage.yqt r7, java.lang.String r8, defpackage.agsw r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spf.c(rux, yqt, java.lang.String, agsw):java.lang.Object");
    }

    public final String d(int i) {
        if (i != -1) {
            return a.b(i, "arc_active:");
        }
        return "arc_inactive:" + ((stw) this.b).e.a.incrementAndGet();
    }

    public final void e(rux ruxVar, int i, sds sdsVar) {
        sdsVar.getClass();
        ahal.e(this.c, null, 0, new spc(this, i, sdsVar, ruxVar, null), 3);
    }
}
