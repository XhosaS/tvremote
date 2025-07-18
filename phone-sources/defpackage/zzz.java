package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zzz {
    private static final String a = "zzz";
    private static zzy b;

    private zzz() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:10:0x0012, B:14:0x0018, B:16:0x0024, B:19:0x002d, B:20:0x0034, B:22:0x0038, B:23:0x003f, B:24:0x0041), top: B:29:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:10:0x0012, B:14:0x0018, B:16:0x0024, B:19:0x002d, B:20:0x0034, B:22:0x0038, B:23:0x003f, B:24:0x0041), top: B:29:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.zzy a(android.content.Context r3, defpackage.zzv r4) {
        /*
            java.lang.Class<zzz> r0 = defpackage.zzz.class
            monitor-enter(r0)
            zzy r1 = defpackage.zzz.b     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L34
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L43
            r2 = 30
            if (r1 < r2) goto L34
            zzv r1 = defpackage.zzv.CRONET_SOURCE_PLATFORM     // Catch: java.lang.Throwable -> L43
            r2 = 1
            if (r4 == r1) goto L18
            zzv r1 = defpackage.zzv.CRONET_SOURCE_PLAY_SERVICES     // Catch: java.lang.Throwable -> L43
            if (r4 != r1) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            android.os.Bundle r3 = defpackage.aaaa.a(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "android.net.http.EnableTelemetry"
            boolean r3 = r3.getBoolean(r4, r2)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L34
            aabg r3 = new aabg     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L43
            defpackage.zzz.b = r3     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L43
            goto L34
        L2c:
            r3 = move-exception
            java.lang.String r4 = defpackage.zzz.a     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "Exception creating an instance of CronetLoggerImpl"
            android.util.Log.e(r4, r1, r3)     // Catch: java.lang.Throwable -> L43
        L34:
            zzy r3 = defpackage.zzz.b     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L3f
            aaaw r3 = new aaaw     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            defpackage.zzz.b = r3     // Catch: java.lang.Throwable -> L43
        L3f:
            zzy r3 = defpackage.zzz.b     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return r3
        L43:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzz.a(android.content.Context, zzv):zzy");
    }
}
