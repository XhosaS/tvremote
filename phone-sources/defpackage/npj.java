package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class npj {
    public npj() {
    }

    private static long A(long j) {
        return j ^ (j >>> 47);
    }

    private static void B(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jY = j + y(bArr, i);
        long jY2 = y(bArr, i + 8);
        long jY3 = y(bArr, i + 16);
        long jY4 = y(bArr, i + 24);
        long j3 = jY2 + jY + jY3;
        long jRotateRight = Long.rotateRight(j2 + jY + jY4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jY4;
        jArr[1] = jRotateRight + jY;
    }

    public static int k(String str) {
        try {
            Integer num = (Integer) Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", String.class).invoke(null, str);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public static npk l(String str, List list, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        return new npk(list, iArr, 10000L, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, k("notificationImageSizeDimenResId"), k("castingToDeviceStringResId"), k("stopLiveStreamStringResId"), k("pauseStringResId"), k("playStringResId"), k("skipNextStringResId"), k("skipPrevStringResId"), k("forwardStringResId"), k("forward10StringResId"), k("forward30StringResId"), k("rewindStringResId"), k("rewind10StringResId"), k("rewind30StringResId"), k("disconnectStringResId"), null, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.IBinder] */
    public static now p(npd npdVar, npk npkVar, boolean z) {
        return new now("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, npdVar == null ? null : npdVar.a, npkVar, false, z);
    }

    public static int q(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 1 : 6;
        }
        return 5;
    }

    public static Map r(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return ImmutableMap.of();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                map2.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return DesugarCollections.unmodifiableMap(map2);
    }

    public static int s(int i) {
        int[] iArrAv = a.av();
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArrAv[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int t(int i) {
        int[] iArrAZ = a.aZ();
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArrAZ[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static boolean u(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static long v(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        long j = -5435081209227447693L;
        boolean z = false;
        if (length <= 32) {
            if (length > 16) {
                long jY = y(bArr2, 0) * (-5435081209227447693L);
                long jY2 = y(bArr2, 8);
                long j2 = (length + length) - 7286425919675154353L;
                long jY3 = y(bArr2, length - 8) * j2;
                return x(Long.rotateRight(jY + jY2, 43) + Long.rotateRight(jY3, 30) + (y(bArr2, length - 16) * (-7286425919675154353L)), jY + Long.rotateRight(jY2 - 7286425919675154353L, 18) + jY3, j2);
            }
            if (length >= 8) {
                long j3 = (length + length) - 7286425919675154353L;
                long jY4 = y(bArr2, 0) - 7286425919675154353L;
                long jY5 = y(bArr2, length - 8);
                return x((Long.rotateRight(jY5, 37) * j3) + jY4, (Long.rotateRight(jY4, 25) + jY5) * j3, j3);
            }
            if (length >= 4) {
                return x(length + ((w(bArr2, 0) & 4294967295L) << 3), w(bArr2, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            return A((((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L))) * (-7286425919675154353L);
        }
        char c = '@';
        if (length <= 64) {
            long jY6 = y(bArr2, 0) * (-7286425919675154353L);
            long jY7 = y(bArr2, 8);
            long j4 = (length + length) - 7286425919675154353L;
            long jY8 = y(bArr2, length - 8) * j4;
            long jY9 = y(bArr2, length - 16) * (-7286425919675154353L);
            long jRotateRight = Long.rotateRight(jY6 + jY7, 43) + Long.rotateRight(jY8, 30);
            long jRotateRight2 = Long.rotateRight(jY7 - 7286425919675154353L, 18) + jY6;
            long jY10 = y(bArr2, 16) * j4;
            long jY11 = y(bArr2, 24);
            long j5 = jRotateRight + jY9;
            long jY12 = j5 + y(bArr2, length - 32);
            long j6 = jY12 * j4;
            return x(Long.rotateRight(jY10 + jY11, 43) + Long.rotateRight(j6, 30) + ((x(j5, jRotateRight2 + jY8, j4) + y(bArr2, length - 24)) * j4), jY10 + Long.rotateRight(jY11 + jY6, 18) + j6, j4);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jY13 = y(bArr2, 0) + 95310865018149119L;
        long jA = A(-7956866745689871395L) * (-7286425919675154353L);
        long j7 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            boolean z2 = z;
            int i3 = (i2 >> 6) * 64;
            char c2 = c;
            long jRotateRight3 = Long.rotateRight(jY13 + j7 + jArr[z2 ? 1 : 0] + y(bArr2, i + 8), 37) * j;
            long jRotateRight4 = Long.rotateRight(j7 + jArr[1] + y(bArr2, i + 48), 42) * j;
            long j8 = jRotateRight3 ^ jArr2[1];
            long j9 = j;
            long jY14 = y(bArr2, i + 40) + jArr[z2 ? 1 : 0];
            long jRotateRight5 = Long.rotateRight(jA + jArr2[z2 ? 1 : 0], 33) * j9;
            int i4 = i;
            B(bArr2, i4, jArr[1] * j9, j8 + jArr2[z2 ? 1 : 0], jArr);
            long[] jArr3 = jArr;
            j7 = jRotateRight4 + jY14;
            B(bArr2, i4 + 32, jRotateRight5 + jArr2[1], y(bArr2, i4 + 16) + j7, jArr2);
            i = i4 + 64;
            if (i == i3) {
                int i5 = i2 & 63;
                int i6 = i3 + i5;
                long j10 = j8 & 255;
                long j11 = j10 + j10 + j9;
                long j12 = jArr2[z2 ? 1 : 0] + i5;
                long j13 = jArr3[z2 ? 1 : 0] + j12;
                jArr3[z2 ? 1 : 0] = j13;
                jArr2[z2 ? 1 : 0] = j12 + j13;
                long jRotateRight6 = Long.rotateRight(jRotateRight5 + j7 + j13 + y(bArr2, i6 - 55), 37) * j11;
                long jRotateRight7 = Long.rotateRight(j7 + jArr3[1] + y(bArr2, i6 - 15), 42) * j11;
                long j14 = jArr2[1] * 9;
                long jY15 = (jArr3[z2 ? 1 : 0] * 9) + y(bArr2, i6 - 23);
                long jRotateRight8 = Long.rotateRight(j8 + jArr2[z2 ? 1 : 0], 33) * j11;
                long j15 = jRotateRight6 ^ j14;
                B(bArr2, i6 - 63, jArr3[1] * j11, j15 + jArr2[z2 ? 1 : 0], jArr3);
                long j16 = jRotateRight7 + jY15;
                B(bArr2, i6 - 31, jArr2[1] + jRotateRight8, y(bArr2, i6 - 47) + j16, jArr2);
                return x(x(jArr3[z2 ? 1 : 0], jArr2[z2 ? 1 : 0], j11) + (A(j16) * (-4348849565147123417L)) + j15, x(jArr3[1], jArr2[1], j11) + jRotateRight8, j11);
            }
            bArr2 = bArr;
            c = c2;
            z = z2 ? 1 : 0;
            jA = j8;
            j = j9;
            jY13 = jRotateRight5;
            jArr = jArr3;
        }
    }

    private static int w(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    private static long x(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long y(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    public static Integer z(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                return str.equals("REPEAT_ALL_AND_SHUFFLE") ? 3 : null;
            case -962896020:
                return str.equals("REPEAT_SINGLE") ? 2 : null;
            case 1645938909:
                return str.equals("REPEAT_ALL") ? 1 : null;
            case 1645952171:
                return str.equals("REPEAT_OFF") ? 0 : null;
            default:
                return null;
        }
    }

    public void b() {
        throw null;
    }

    public npj(char[] cArr) {
    }

    public void a() {
    }

    public void j() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    public void d(int[] iArr) {
    }

    public void f(nll[] nllVarArr) {
    }

    public void g(int[] iArr) {
    }

    public void i(int[] iArr) {
    }

    public void e(int[] iArr, int i) {
    }

    public void h(List list, List list2, int i) {
    }

    public void c(String str, long j, int i, long j2, long j3) {
    }
}
