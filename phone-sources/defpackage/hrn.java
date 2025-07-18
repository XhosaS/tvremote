package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrn implements hky {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final ImageHeaderParser$ImageType g(hrl hrlVar) {
        try {
            int iA = hrlVar.a();
            if (iA == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iA << 8) | hrlVar.d();
            if (iD == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | hrlVar.d();
            if (iD2 == -1991225785) {
                hrlVar.c(21L);
                try {
                    return hrlVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (hrk unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                hrlVar.c(4L);
                if (((hrlVar.a() << 16) | hrlVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iA2 = (hrlVar.a() << 16) | hrlVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i == 88) {
                    hrlVar.c(4L);
                    short sD = hrlVar.d();
                    return (sD & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sD & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                hrlVar.c(4L);
                return (hrlVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((hrlVar.a() << 16) | hrlVar.a()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iA3 = (hrlVar.a() << 16) | hrlVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            boolean z = iA3 == 1635150182;
            hrlVar.c(4L);
            int i2 = iD2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int iA4 = (hrlVar.a() << 16) | hrlVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    z |= !(iA4 != 1635150182);
                    i2 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (hrk unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    private static final boolean h(byte[] bArr, int i, byte[] bArr2) {
        boolean z = bArr2 != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    private static final int i(hrl hrlVar, int i) {
        short sD;
        while (hrlVar.d() == 255 && (sD = hrlVar.d()) != 218 && sD != 217) {
            int iA = hrlVar.a() - 2;
            if (sD == i) {
                return iA;
            }
            long j = iA;
            if (hrlVar.c(j) != j) {
                return -1;
            }
        }
        return -1;
    }

    private static final int j(hrl hrlVar, hok hokVar) {
        short sK;
        int iJ;
        int i;
        int i2;
        short sK2;
        try {
            int iA = hrlVar.a();
            if ((iA & 65496) != 65496 && iA != 19789 && iA != 18761) {
                return -1;
            }
            int i3 = i(hrlVar, 225);
            if (i3 == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) hokVar.a(i3, byte[].class);
            try {
                if (hrlVar.b(bArr, i3) == i3 && h(bArr, i3, a)) {
                    ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i3);
                    short sK3 = hju.k(6, byteBuffer);
                    byteBuffer.order(sK3 != 18761 ? sK3 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                    int iJ2 = hju.j(10, byteBuffer);
                    short sK4 = hju.k(iJ2 + 6, byteBuffer);
                    for (int i4 = 0; i4 < sK4; i4++) {
                        int i5 = iJ2 + 8 + (i4 * 12);
                        if (hju.k(i5, byteBuffer) == 274 && (sK = hju.k(i5 + 2, byteBuffer)) > 0 && sK <= 12 && (iJ = hju.j(i5 + 4, byteBuffer)) >= 0 && (i = iJ + c[sK]) <= 4 && (i2 = i5 + 8) >= 0 && i2 <= byteBuffer.remaining() && i >= 0 && i + i2 <= byteBuffer.remaining()) {
                            sK2 = hju.k(i2, byteBuffer);
                            break;
                        }
                    }
                    sK2 = -1;
                } else {
                    sK2 = -1;
                }
                return sK2;
            } finally {
                hokVar.c(bArr);
            }
        } catch (hrk unused) {
            return -1;
        }
    }

    private static final int k(hrl hrlVar) {
        return i(hrlVar, 226);
    }

    private static final boolean l(hrl hrlVar, hok hokVar) {
        if (g(hrlVar) != ImageHeaderParser$ImageType.JPEG) {
            return false;
        }
        int iK = k(hrlVar);
        while (iK > 0) {
            byte[] bArr = (byte[]) hokVar.a(iK, byte[].class);
            try {
                if (hrlVar.b(bArr, iK) == iK && h(bArr, iK, b)) {
                    hokVar.c(bArr);
                    return true;
                }
                hokVar.c(bArr);
                iK = k(hrlVar);
            } catch (Throwable th) {
                hokVar.c(bArr);
                throw th;
            }
        }
        return false;
    }

    @Override // defpackage.hky
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        hju.p(inputStream);
        return g(new hrm(inputStream, 0));
    }

    @Override // defpackage.hky
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        hju.p(byteBuffer);
        return g(new hrm(byteBuffer, 1));
    }

    @Override // defpackage.hky
    public final int c(InputStream inputStream, hok hokVar) {
        hju.p(inputStream);
        hrm hrmVar = new hrm(inputStream, 0);
        hju.p(hokVar);
        return j(hrmVar, hokVar);
    }

    @Override // defpackage.hky
    public final int d(ByteBuffer byteBuffer, hok hokVar) {
        hju.p(byteBuffer);
        hrm hrmVar = new hrm(byteBuffer, 1);
        hju.p(hokVar);
        return j(hrmVar, hokVar);
    }

    @Override // defpackage.hky
    public final boolean e(InputStream inputStream, hok hokVar) {
        hju.p(inputStream);
        hrm hrmVar = new hrm(inputStream, 0);
        hju.p(hokVar);
        return l(hrmVar, hokVar);
    }

    @Override // defpackage.hky
    public final boolean f(ByteBuffer byteBuffer, hok hokVar) {
        hju.p(byteBuffer);
        hrm hrmVar = new hrm(byteBuffer, 1);
        hju.p(hokVar);
        return l(hrmVar, hokVar);
    }
}
