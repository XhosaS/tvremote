package defpackage;

import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rax {
    private static volatile yqt a;
    private static volatile yqt b;

    public static yqt a() {
        yqt yqtVarI;
        yqt yqtVarI2;
        yqt yqtVarI3;
        yqt yqtVar = a;
        if (yqtVar != null) {
            return yqtVar;
        }
        long jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        long j = 0;
        yqt yqtVarI4 = jSysconf > 0 ? yqt.i(Long.valueOf(jSysconf)) : ypv.a;
        if (yqtVarI4.g()) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            byte[] bArr = new byte[440];
            boolean z = false;
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                    try {
                        int i = fileInputStream.read(bArr);
                        fileInputStream.close();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        yqtVarI = yqt.i(ByteBuffer.wrap(bArr, 0, i));
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    ypv ypvVar = ypv.a;
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    yqtVarI = ypvVar;
                }
                if (yqtVarI.g()) {
                    Object objC = yqtVarI.c();
                    long jLongValue = ((Long) yqtVarI4.c()).longValue();
                    while (true) {
                        ByteBuffer byteBuffer = (ByteBuffer) objC;
                        if (byteBuffer.remaining() <= 17) {
                            break;
                        }
                        if (byteBuffer.get() == 40) {
                            int i2 = 16;
                            while (true) {
                                if (i2 < 0) {
                                    break;
                                }
                                if (byteBuffer.get(byteBuffer.position() + i2) == 41) {
                                    byteBuffer.position(byteBuffer.position() + i2 + 1);
                                    if (byteBuffer.get() == 32 && b(byteBuffer, 1) && b(byteBuffer, 18)) {
                                        while (true) {
                                            if (!byteBuffer.hasRemaining()) {
                                                break;
                                            }
                                            byte b2 = byteBuffer.get();
                                            if (b2 == 32) {
                                                if (z) {
                                                    yqtVarI2 = yqt.i(Long.valueOf(j));
                                                }
                                            } else {
                                                if (b2 < 48 || b2 > 57 || j > 922337203685477580L) {
                                                    break;
                                                }
                                                j = (j * 10) + (b2 - 48);
                                                z = true;
                                            }
                                        }
                                        yqtVarI2 = ypv.a;
                                    }
                                } else {
                                    i2--;
                                }
                            }
                        }
                    }
                    yqtVarI2 = ypv.a;
                    yqtVarI3 = !yqtVarI2.g() ? ypv.a : yqt.i(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) yqtVarI2.c()).longValue()) / jLongValue));
                } else {
                    yqtVarI3 = ypv.a;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        } else {
            yqtVarI3 = ypv.a;
        }
        a = yqtVarI3;
        return yqtVarI3;
    }

    private static boolean b(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i <= 0) {
                return true;
            }
            if (byteBuffer.get() == 32) {
                i--;
            }
        }
        return i == 0;
    }
}
