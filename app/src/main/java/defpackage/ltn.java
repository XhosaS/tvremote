package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ltn {
    private static final Object a;
    private static Method b;
    private static boolean c;

    static {
        int i = kcy.c;
        a = new Object();
        b = null;
        c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: all -> 0x00a9, TryCatch #3 {, blocks: (B:4:0x0012, B:7:0x0017, B:12:0x0039, B:13:0x003e, B:15:0x0040, B:17:0x0043, B:23:0x004f, B:25:0x0053, B:28:0x0081, B:31:0x0093, B:32:0x0098, B:34:0x009a, B:35:0x00a8, B:10:0x0023), top: B:45:0x0012, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x00a9, TryCatch #3 {, blocks: (B:4:0x0012, B:7:0x0017, B:12:0x0039, B:13:0x003e, B:15:0x0040, B:17:0x0043, B:23:0x004f, B:25:0x0053, B:28:0x0081, B:31:0x0093, B:32:0x0098, B:34:0x009a, B:35:0x00a8, B:10:0x0023), top: B:45:0x0012, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r12) {
        /*
            java.lang.String r0 = "Context must not be null"
            defpackage.kkk.l(r12, r0)
            r0 = 11925000(0xb5f608, float:1.6710484E-38)
            defpackage.kdu.b(r12, r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r2 = defpackage.ltn.a
            monitor-enter(r2)
            boolean r3 = defpackage.ltn.c     // Catch: java.lang.Throwable -> La9
            r4 = 0
            if (r3 != 0) goto L40
            kmu r3 = defpackage.kmv.d     // Catch: defpackage.kmr -> L22 java.lang.Throwable -> La9
            java.lang.String r5 = "com.google.android.gms.providerinstaller.dynamite"
            kmv r3 = defpackage.kmv.d(r12, r3, r5)     // Catch: defpackage.kmr -> L22 java.lang.Throwable -> La9
            android.content.Context r3 = r3.e     // Catch: defpackage.kmr -> L22 java.lang.Throwable -> La9
            goto L37
        L22:
            r3 = move-exception
            java.lang.String r5 = "ProviderInstaller"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = "Failed to load providerinstaller module: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = r6.concat(r3)     // Catch: java.lang.Throwable -> La9
            android.util.Log.w(r5, r3)     // Catch: java.lang.Throwable -> La9
            r3 = r4
        L37:
            if (r3 == 0) goto L40
            java.lang.String r12 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            b(r3, r12)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La9
            goto L99
        L40:
            boolean r3 = defpackage.ltn.c     // Catch: java.lang.Throwable -> La9
            r5 = 3
            java.lang.String r6 = "com.google.android.gms"
            android.content.Context r6 = r12.createPackageContext(r6, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a java.lang.Throwable -> La9
            goto L4b
        L4a:
            r6 = r4
        L4b:
            if (r6 != 0) goto L4e
            goto L91
        L4e:
            r7 = 1
            defpackage.ltn.c = r7     // Catch: java.lang.Throwable -> La9
            if (r3 != 0) goto L90
            long r8 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            kou[] r5 = new defpackage.kou[r5]     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            kou r11 = new kou     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            r11.<init>(r10, r12)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            r12 = 0
            r5[r12] = r11     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            kot r12 = defpackage.kot.a(r0)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            r5[r7] = r12     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            kot r12 = defpackage.kot.a(r8)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            r0 = 2
            r5[r0] = r12     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            java.lang.String r12 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r0 = "reportRequestStats2"
            java.lang.Class r12 = r3.loadClass(r12)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            defpackage.kov.a(r12, r0, r4, r5)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La9
            goto L90
        L80:
            r12 = move-exception
            java.lang.String r0 = "ProviderInstaller"
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = "Failed to report request stats: "
            java.lang.String r12 = r1.concat(r12)     // Catch: java.lang.Throwable -> La9
            android.util.Log.w(r0, r12)     // Catch: java.lang.Throwable -> La9
        L90:
            r4 = r6
        L91:
            if (r4 == 0) goto L9a
            java.lang.String r12 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            b(r4, r12)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La9
        L99:
            return
        L9a:
            java.lang.String r12 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r12, r0)     // Catch: java.lang.Throwable -> La9
            kdr r12 = new kdr     // Catch: java.lang.Throwable -> La9
            r0 = 8
            r12.<init>(r0)     // Catch: java.lang.Throwable -> La9
            throw r12     // Catch: java.lang.Throwable -> La9
        La9:
            r12 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La9
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ltn.a(android.content.Context):void");
    }

    private static void b(Context context, String str) throws IllegalAccessException, kdr, IllegalArgumentException, InvocationTargetException {
        try {
            if (b == null) {
                b = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            b.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new kdr(8);
        }
    }
}
