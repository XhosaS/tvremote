package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocu {
    private static String a;
    private static int b;
    private static Boolean c;

    public static String a() {
        BufferedReader bufferedReader;
        String strCd;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int iMyPid = b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        strCd = a.cd(iMyPid, "/proc/", "/cmdline");
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(strCd));
                        try {
                            String line = bufferedReader.readLine();
                            ocv.aF(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            ocs.b(bufferedReader2);
                            throw th;
                        }
                        ocs.b(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                a = strTrim;
            }
        }
        return a;
    }

    public static boolean b() {
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            if (ocv.g()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objAP = ocv.aP(Process.class, "isIsolated", new rbi[0]);
                    sij.k(objAP);
                    boolValueOf = (Boolean) objAP;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = false;
                }
            }
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
