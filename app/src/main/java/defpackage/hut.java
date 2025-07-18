package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hut implements hup {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/web/webview/WebViewInitializerImpl");
    public final Context b;
    private final ahbt c;
    private final ahni d;
    private ahdl e;

    public hut(Context context, ahbt ahbtVar) {
        context.getClass();
        ahbtVar.getClass();
        this.b = context;
        this.c = ahbtVar;
        this.d = new ahnm(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.hur
            if (r0 == 0) goto L13
            r0 = r7
            hur r0 = (defpackage.hur) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hur r0 = new hur
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.agpl.b(r7)
            ahni r7 = r6.d
            r0.a = r7
            r0.d = r3
            java.lang.Object r0 = r7.b(r0)
            if (r0 == r1) goto La0
            r0 = r7
        L41:
            ahdl r7 = r6.e     // Catch: java.lang.Throwable -> L9b
            if (r7 == 0) goto L4a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L9b
            goto L97
        L4a:
            android.content.Context r7 = r6.b     // Catch: java.lang.Throwable -> L9b
            int r1 = defpackage.bxc.a     // Catch: java.lang.Throwable -> L9b
            android.content.pm.PackageInfo r1 = defpackage.al$$ExternalSyntheticApiModelOutline0.m()     // Catch: java.lang.Throwable -> L9b
            r2 = 0
            r4 = 0
            if (r1 == 0) goto L57
            goto L76
        L57:
            java.lang.String r1 = "android.webkit.WebViewUpdateService"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L9b
            java.lang.String r5 = "getCurrentWebViewPackageName"
            java.lang.reflect.Method r1 = r1.getMethod(r5, r4)     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.invoke(r4, r4)     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L9b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L9b
            if (r1 != 0) goto L6c
            goto L75
        L6c:
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L9b
            android.content.pm.PackageInfo r1 = r7.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L9b
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 != 0) goto L7d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L9b
            goto L97
        L7d:
            ahbt r7 = r6.c     // Catch: java.lang.Throwable -> L9b
            hus r1 = new hus     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r6, r4)     // Catch: java.lang.Throwable -> L9b
            r5 = 3
            ahdl r7 = defpackage.ahal.e(r7, r4, r2, r1, r5)     // Catch: java.lang.Throwable -> L9b
            huq r1 = new huq     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            r7.w(r1)     // Catch: java.lang.Throwable -> L9b
            r6.e = r7     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L9b
        L97:
            r0.d()
            return r7
        L9b:
            r7 = move-exception
            r0.d()
            throw r7
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hut.a(agsw):java.lang.Object");
    }
}
