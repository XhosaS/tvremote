package defpackage;

import android.os.SystemClock;
import android.support.v7.appcompat.R;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fay {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static long a() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], R.styleable.AppCompatTheme_windowFixedWidthMinor);
                bArr2[b3] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    Long.signum(j);
                    long j2 = jCurrentTimeMillis - (j * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j3 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j3 >> 24);
                    bArr[41] = (byte) (j3 >> 16);
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j5 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b4 = bArr3[b2];
                    int i3 = b4 >> 6;
                    int i4 = b4 & 7;
                    int i5 = bArr3[1] & 255;
                    long jD = d(bArr3, 24);
                    long jD2 = d(bArr3, 32);
                    long jD3 = d(bArr3, 40);
                    if ((i3 & 3) == 3) {
                        throw new IOException("SNTP: Unsynchronized server");
                    }
                    if (i4 != 4 && i4 != 5) {
                        throw new IOException(a.cf(i4, "SNTP: Untrusted mode: "));
                    }
                    if (i5 == 0 || i5 > 15) {
                        throw new IOException(a.cf(i5, "SNTP: Untrusted stratum: "));
                    }
                    if (jD3 == 0) {
                        throw new IOException("SNTP: Zero transmitTime");
                    }
                    long j6 = (j5 + (((jD2 - jD) + (jD3 - j5)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j6;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i6 = i2 + 1;
                    if (i2 >= 10) {
                        break;
                    }
                    i++;
                    i2 = i6;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static boolean b() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    private static long c(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = i2 & 128;
        int i4 = i + 3;
        int i5 = i + 2;
        int i6 = bArr[i + 1];
        int i7 = bArr[i5];
        int i8 = bArr[i4];
        if (i3 == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        if ((i7 & 128) == 128) {
            i7 = (i7 & 127) + 128;
        }
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        return (i2 << 24) + (i6 << 16) + (i7 << 8) + i8;
    }

    private static long d(byte[] bArr, int i) {
        long jC = c(bArr, i);
        long jC2 = c(bArr, i + 4);
        if (jC == 0) {
            if (jC2 == 0) {
                return 0L;
            }
            jC = 0;
        }
        return ((jC - 2208988800L) * 1000) + ((jC2 * 1000) / 4294967296L);
    }
}
