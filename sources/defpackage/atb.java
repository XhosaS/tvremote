package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Trace;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atb {
    public static volatile ActivityManager a;
    static volatile boolean b;
    private static volatile String c;

    private atb() {
    }

    public static atc a(Context context, String str) {
        atc atcVar;
        try {
            Trace.beginSection(str);
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                int i = bzs.d;
                atcVar = new atc(false, cax.a);
            } else {
                atcVar = new atc(true, bzs.o(runningAppProcesses));
            }
            return atcVar;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b() throws java.lang.Throwable {
        /*
            java.lang.String r0 = defpackage.atb.c
            if (r0 == 0) goto L5
            goto L40
        L5:
            int r0 = android.os.Process.myPid()
            r1 = 0
            if (r0 > 0) goto Ld
            goto L3c
        Ld:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            java.lang.String r4 = "/proc/"
            java.lang.String r5 = "/cmdline"
            java.lang.String r0 = defpackage.b.h(r0, r4, r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L39
            r0.getClass()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L39
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L39
        L2a:
            r2.close()     // Catch: java.io.IOException -> L3c
            goto L3c
        L2e:
            r0 = move-exception
            r1 = r2
            goto L32
        L31:
            r0 = move-exception
        L32:
            if (r1 == 0) goto L37
            r1.close()     // Catch: java.io.IOException -> L37
        L37:
            throw r0
        L38:
            r2 = r1
        L39:
            if (r2 == 0) goto L3c
            goto L2a
        L3c:
            if (r1 == 0) goto L40
            defpackage.atb.c = r1
        L40:
            java.lang.String r0 = defpackage.atb.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atb.b():java.lang.String");
    }

    public static String c(String str, String str2) {
        if (str2 == null || str == null || !str2.startsWith(str)) {
            return str2;
        }
        int length = str.length();
        if (str2.length() == length) {
            return null;
        }
        return str2.substring(length + 1);
    }

    public static boolean d(Context context, atc atcVar) {
        if (!atcVar.a) {
            return false;
        }
        bzs<ActivityManager.RunningAppProcessInfo> bzsVarA = atcVar.a();
        String packageName = context.getPackageName();
        String strValueOf = String.valueOf(packageName);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : bzsVarA) {
            if (runningAppProcessInfo.importance == 100) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(strValueOf.concat(":"))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
