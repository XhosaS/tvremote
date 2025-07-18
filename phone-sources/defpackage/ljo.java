package defpackage;

import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljo implements idb {
    private static final tui a = tui.l("com/google/android/apps/play/movies/common/service/pinning/InternetConnectionCondition");
    private final URL b;

    public ljo(URL url) {
        this.b = url;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // defpackage.idb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "InternetConnectionCondition.java"
            r1 = 0
            r2 = 0
            java.net.URL r3 = r8.b     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r3.setInstanceFollowRedirects(r2)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L56
            r1 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r1)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L56
            r3.setReadTimeout(r1)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L56
            r3.setUseCaches(r2)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L56
            int r0 = r3.getResponseCode()     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L56
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L23
            r2 = 1
        L23:
            if (r3 == 0) goto L28
            r3.disconnect()
        L28:
            return r2
        L29:
            r1 = move-exception
            goto L31
        L2b:
            r0 = move-exception
            goto L58
        L2d:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
        L31:
            tui r4 = defpackage.ljo.a     // Catch: java.lang.Throwable -> L56
            tuv r4 = r4.g()     // Catch: java.lang.Throwable -> L56
            tug r4 = (defpackage.tug) r4     // Catch: java.lang.Throwable -> L56
            tuv r1 = r4.i(r1)     // Catch: java.lang.Throwable -> L56
            tug r1 = (defpackage.tug) r1     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "com/google/android/apps/play/movies/common/service/pinning/InternetConnectionCondition"
            java.lang.String r5 = "applies"
            r6 = 37
            tuv r0 = r1.j(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L56
            tug r0 = (defpackage.tug) r0     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "Connection to 204 server failed"
            r0.s(r1)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L55
            r3.disconnect()
        L55:
            return r2
        L56:
            r0 = move-exception
            r1 = r3
        L58:
            if (r1 == 0) goto L5d
            r1.disconnect()
        L5d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljo.a():boolean");
    }
}
