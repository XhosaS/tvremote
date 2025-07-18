package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybw {
    private static final Logger a = Logger.getLogger(ybw.class.getName());
    private static final byte[] b = "-bin".getBytes(StandardCharsets.US_ASCII);

    private ybw() {
    }

    public static byte[][] a(xsm xsmVar) {
        int i;
        Charset charset = xrg.a;
        int iA = xsmVar.a();
        byte[][] bArr = new byte[iA][];
        Object[] objArr = xsmVar.e;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, xsmVar.a());
        } else {
            for (int i2 = 0; i2 < xsmVar.f; i2++) {
                int i3 = i2 + i2;
                bArr[i3] = xsmVar.j(i2);
                bArr[i3 + 1] = xsmVar.k(i2);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < iA; i5 += 2) {
            byte[] bArr2 = bArr[i5];
            byte[] bArr3 = bArr[i5 + 1];
            if (c(bArr2, b)) {
                i = i4 + 2;
                bArr[i4] = bArr2;
                bArr[i4 + 1] = xrg.b.i(bArr3).getBytes(StandardCharsets.US_ASCII);
            } else {
                for (byte b2 : bArr3) {
                    if (b2 < 32 || b2 > 126) {
                        a.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + new String(bArr2, StandardCharsets.US_ASCII) + ", value=" + Arrays.toString(bArr3) + " contains invalid ASCII characters");
                        break;
                    }
                }
                i = i4 + 2;
                bArr[i4] = bArr2;
                bArr[i4 + 1] = bArr3;
            }
            i4 = i;
        }
        return i4 == iA ? bArr : (byte[][]) Arrays.copyOfRange(bArr, 0, i4);
    }

    public static byte[][] b(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            byte[] bArr4 = b;
            if (c(bArr2, bArr4)) {
                for (byte b2 : bArr3) {
                    if (b2 == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr5 = bArr[i];
                            byte[] bArr6 = bArr[i + 1];
                            if (c(bArr5, bArr4)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i4 <= length) {
                                        if (i4 == length || bArr6[i4] == 44) {
                                            byte[] bArrJ = tzs.d.j(new String(bArr6, i5, i4 - i5, StandardCharsets.US_ASCII));
                                            arrayList.add(bArr5);
                                            arrayList.add(bArrJ);
                                            i5 = i4 + 1;
                                        }
                                        i4++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = tzs.d.j(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i += 2;
        }
        return bArr;
    }

    private static boolean c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
