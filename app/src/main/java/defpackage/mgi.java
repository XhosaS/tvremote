package defpackage;

import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgi {
    private static final zdy a = zdy.h("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils");

    public static mgj a(File file) {
        File file2;
        mgj mgfVar;
        FileInputStream fileInputStream;
        if (file.isDirectory()) {
            return mgj.d;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        byte[] bArr = new byte[62];
        try {
            try {
                file2 = file;
            } catch (IOException | ParseException e) {
                e = e;
                file2 = file;
            }
            try {
                fileInputStream = new FileInputStream(file2);
            } catch (IOException e2) {
                e = e2;
                ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).x("Failed to read SchedStat for thread %s", file2.getName());
                mgfVar = mgj.d;
                return mgfVar;
            } catch (ParseException e3) {
                e = e3;
                ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).x("Failed to read SchedStat for thread %s", file2.getName());
                mgfVar = mgj.d;
                return mgfVar;
            }
            try {
                int iC = zkn.c(fileInputStream, bArr, 62);
                int i = 0;
                long j = -1;
                long j2 = -1;
                long j3 = 0;
                int i2 = 0;
                boolean z = false;
                while (i2 < iC) {
                    int i3 = i2 + 1;
                    byte b = bArr[i2];
                    if (b != 32) {
                        if (b < 48 || b > 57 || j3 > 922337203685477580L) {
                            break;
                        }
                        j3 = (j3 * 10) + (b - 48);
                        z = true;
                        i2 = i3;
                    } else {
                        if (!z) {
                            break;
                        }
                        if (i != 0) {
                            if (i != 1) {
                                break;
                            }
                            j2 = j3;
                        } else {
                            j = j3;
                        }
                        i++;
                        z = false;
                        i2 = i3;
                        j3 = 0;
                    }
                    return mgfVar;
                }
                if (i != 2) {
                    throw new ParseException("Failed to parse SchedStat", i);
                }
                mgj mgjVar = mgj.d;
                mgfVar = new mgf(j, j2, j3);
                fileInputStream.close();
                return mgfVar;
            } finally {
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
