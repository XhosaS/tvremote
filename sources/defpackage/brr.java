package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brr implements brt {
    private static final cbt a = cbt.k("com/google/android/tv/remote/service/bleremote/protocol/AdpcmDecoder");
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private int c;
    private int d;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032 A[PHI: r2
  0x0032: PHI (r2v5 int) = (r2v4 int), (r2v6 int) binds: [B:17:0x0030, B:14:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(byte r5) {
        /*
            r4 = this;
            int[] r0 = defpackage.brr.b
            int r1 = r4.d
            r0 = r0[r1]
            int r2 = r0 >> 3
            r3 = r5 & 1
            if (r3 == 0) goto Lf
            int r3 = r0 >> 2
            int r2 = r2 + r3
        Lf:
            r3 = r5 & 2
            if (r3 == 0) goto L16
            int r3 = r0 >> 1
            int r2 = r2 + r3
        L16:
            r3 = r5 & 4
            if (r3 == 0) goto L1b
            int r2 = r2 + r0
        L1b:
            r0 = r5 & 8
            if (r0 == 0) goto L29
            int r0 = r4.c
            int r0 = r0 - r2
            r4.c = r0
            r2 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 >= r2) goto L34
            goto L32
        L29:
            int r0 = r4.c
            int r0 = r0 + r2
            r4.c = r0
            r2 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r2) goto L34
        L32:
            r4.c = r2
        L34:
            if (r3 != 0) goto L38
            r5 = -1
            goto L3d
        L38:
            r5 = r5 & 3
            int r5 = r5 + 1
            int r5 = r5 + r5
        L3d:
            int r1 = r1 + r5
            r4.d = r1
            if (r1 >= 0) goto L46
            r5 = 0
        L43:
            r4.d = r5
            return
        L46:
            r5 = 89
            if (r1 < r5) goto L4d
            r5 = 88
            goto L43
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brr.c(byte):void");
    }

    @Override // defpackage.brt
    public final byte[] a(ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iLimit = (byteBuffer.limit() - iArrayOffset) * 4;
        byte[] bArr = new byte[iLimit];
        for (int i = 0; i < iLimit; i += 4) {
            byte b2 = bArrArray[iArrayOffset];
            c((byte) (b2 >> 4));
            int i2 = this.c;
            bArr[i] = (byte) (i2 & 255);
            bArr[i + 1] = (byte) ((i2 >> 8) & 255);
            c(b2);
            int i3 = this.c;
            bArr[i + 2] = (byte) (i3 & 255);
            bArr[i + 3] = (byte) ((i3 >> 8) & 255);
            iArrayOffset++;
        }
        return bArr;
    }

    @Override // defpackage.brt
    public final void b(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.remaining() < 3) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/protocol/AdpcmDecoder", "setState", 129, "AdpcmDecoder.java")).p("Not enough data to set the state");
            return;
        }
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        short s = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        if (this.c != s) {
            if (z) {
                ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/protocol/AdpcmDecoder", "setState", 137, "AdpcmDecoder.java")).I(this.c, s);
            }
            this.c = s;
        }
        if (this.d != b2) {
            if (z) {
                ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/protocol/AdpcmDecoder", "setState", 144, "AdpcmDecoder.java")).v("Unexpected predicted Step Index %d (expected: %d)", this.d, b2);
            }
            if (b2 < 0) {
                this.d = 0;
            } else if (b2 >= 89) {
                this.d = 88;
            } else {
                this.d = b2;
            }
        }
    }
}
