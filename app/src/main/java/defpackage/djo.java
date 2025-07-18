package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djo implements czv {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x01a4: RETURN (r16 I:int) A[SYNTHETIC] (LINE:746), block:B:115:? */
    private final int g(djm djmVar, ddx ddxVar) throws Throwable {
        int i;
        short s;
        short sB;
        ByteOrder byteOrder;
        short s2;
        short s3 = -1;
        try {
            int iA = djmVar.a();
            if ((iA & 65496) != 65496 && iA != 19789 && iA != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.b(iA, "Parser doesn't handle magic number: "));
                }
                return -1;
            }
            int iH = h(djmVar, 225);
            if (iH == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            try {
                byte[] bArr = (byte[]) ddxVar.a(iH, byte[].class);
                try {
                    int iB = djmVar.b(bArr, iH);
                    if (iB != iH) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", a.k(iB, iH, "Unable to read exif segment data, length: ", ", actually read: "));
                        }
                        sB = -1;
                    } else {
                        try {
                            if (k(bArr, iH, a)) {
                                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(iH);
                                short sB2 = djk.b(6, byteBuffer);
                                if (sB2 != 18761) {
                                    if (sB2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", a.b(sB2, "Unknown endianness = "));
                                    }
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                } else {
                                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                                }
                                byteBuffer.order(byteOrder);
                                int iA2 = djk.a(10, byteBuffer);
                                short sB3 = djk.b(iA2 + 6, byteBuffer);
                                int i2 = 0;
                                while (i2 < sB3) {
                                    int i3 = iA2 + 8 + (i2 * 12);
                                    if (djk.b(i3, byteBuffer) == 274) {
                                        short sB4 = djk.b(i3 + 2, byteBuffer);
                                        if (sB4 <= 0 || sB4 > 12) {
                                            s2 = s3;
                                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                Log.d("DfltImageHeaderParser", a.b(sB4, "Got invalid format code = "));
                                            }
                                        } else {
                                            int iA3 = djk.a(i3 + 4, byteBuffer);
                                            if (iA3 < 0) {
                                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                    Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                                }
                                                s2 = s3;
                                            } else {
                                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                    StringBuilder sb = new StringBuilder();
                                                    s2 = s3;
                                                    sb.append("Got tagIndex=");
                                                    sb.append(i2);
                                                    sb.append(" tagType=");
                                                    sb.append(274);
                                                    sb.append(" formatCode=");
                                                    sb.append((int) sB4);
                                                    sb.append(" componentCount=");
                                                    sb.append(iA3);
                                                    Log.d("DfltImageHeaderParser", sb.toString());
                                                } else {
                                                    s2 = s3;
                                                }
                                                int i4 = iA3 + c[sB4];
                                                if (i4 <= 4) {
                                                    int i5 = i3 + 8;
                                                    if (i5 >= 0 && i5 <= byteBuffer.remaining()) {
                                                        if (i4 >= 0 && i4 + i5 <= byteBuffer.remaining()) {
                                                            sB = djk.b(i5, byteBuffer);
                                                            break;
                                                        }
                                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                            Log.d("DfltImageHeaderParser", a.b(274, "Illegal number of bytes for TI tag data tagType="));
                                                        }
                                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                        Log.d("DfltImageHeaderParser", a.k(274, i5, "Illegal tagValueOffset=", " tagType="));
                                                    }
                                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                    Log.d("DfltImageHeaderParser", a.b(sB4, "Got byte count > 4, not orientation, continuing, formatCode="));
                                                }
                                            }
                                        }
                                    } else {
                                        s2 = s3;
                                    }
                                    i2++;
                                    s3 = s2;
                                }
                                s = s3;
                            } else {
                                s = -1;
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                                }
                            }
                            sB = s;
                        } catch (Throwable th) {
                            th = th;
                            ddxVar.c(bArr);
                            throw th;
                        }
                    }
                    ddxVar.c(bArr);
                    return sB;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (djl unused) {
                return i;
            }
        } catch (djl unused2) {
            return -1;
        }
    }

    private final int h(djm djmVar, int i) {
        short sD;
        int iA;
        long j;
        long jC;
        do {
            short sD2 = djmVar.d();
            if (sD2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.b(sD2, "Unknown segmentId="));
                }
                return -1;
            }
            sD = djmVar.d();
            if (sD == 218) {
                return -1;
            }
            if (sD == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.a(i, "Found MARKER_EOI in ", " segment"));
                }
                return -1;
            }
            iA = djmVar.a() - 2;
            if (sD == i) {
                return iA;
            }
            j = iA;
            jC = djmVar.c(j);
        } while (jC == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sD) + ", wanted to skip: " + iA + ", but actually skipped: " + jC);
        }
        return -1;
    }

    private final ImageHeaderParser$ImageType i(djm djmVar) {
        try {
            int iA = djmVar.a();
            if (iA == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iA << 8) | djmVar.d();
            if (iD == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | djmVar.d();
            if (iD2 == -1991225785) {
                djmVar.c(21L);
                try {
                    return djmVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (djl unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                djmVar.c(4L);
                if (((djmVar.a() << 16) | djmVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iA2 = (djmVar.a() << 16) | djmVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i == 88) {
                    djmVar.c(4L);
                    short sD = djmVar.d();
                    return (sD & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sD & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                djmVar.c(4L);
                return (djmVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((djmVar.a() << 16) | djmVar.a()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iA3 = (djmVar.a() << 16) | djmVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            boolean z = iA3 == 1635150182;
            djmVar.c(4L);
            int i2 = iD2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int iA4 = (djmVar.a() << 16) | djmVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    z |= !(iA4 != 1635150182);
                    i2 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (djl unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    private final boolean j(djm djmVar, ddx ddxVar) {
        if (i(djmVar) != ImageHeaderParser$ImageType.JPEG) {
            return false;
        }
        int iH = h(djmVar, 226);
        while (iH > 0) {
            byte[] bArr = (byte[]) ddxVar.a(iH, byte[].class);
            try {
                int iB = djmVar.b(bArr, iH);
                if (iB != iH) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", a.k(iB, iH, "Unable to read APP2 segment data, length: ", ", actually read: "));
                    }
                } else if (k(bArr, iH, b)) {
                    ddxVar.c(bArr);
                    return true;
                }
                ddxVar.c(bArr);
                iH = h(djmVar, 226);
            } catch (Throwable th) {
                ddxVar.c(bArr);
                throw th;
            }
        }
        if (!Log.isLoggable("DfltImageHeaderParser", 2)) {
            return false;
        }
        Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
        return false;
    }

    private final boolean k(byte[] bArr, int i, byte[] bArr2) {
        boolean z = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    @Override // defpackage.czv
    public final int a(InputStream inputStream, ddx ddxVar) {
        return g(new djn(inputStream), ddxVar);
    }

    @Override // defpackage.czv
    public final int b(ByteBuffer byteBuffer, ddx ddxVar) {
        return g(new djj(byteBuffer), ddxVar);
    }

    @Override // defpackage.czv
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return i(new djn(inputStream));
    }

    @Override // defpackage.czv
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        return i(new djj(byteBuffer));
    }

    @Override // defpackage.czv
    public final boolean e(InputStream inputStream, ddx ddxVar) {
        return j(new djn(inputStream), ddxVar);
    }

    @Override // defpackage.czv
    public final boolean f(ByteBuffer byteBuffer, ddx ddxVar) {
        return j(new djj(byteBuffer), ddxVar);
    }
}
