package defpackage;

import android.support.v7.appcompat.R;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zis extends FilterInputStream implements InputStreamRetargetInterface {
    public final int a;
    private final boolean b;
    private final byte[][] c;

    public zis(InputStream inputStream) {
        this(inputStream, wcq.ao(inputStream));
    }

    public static int a(InputStream inputStream, int i, boolean z) throws IOException {
        int i2 = inputStream.read();
        if ((i2 >>> 7) == 0) {
            return i2;
        }
        if (i2 == 128) {
            return -1;
        }
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i2 == 255) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i3 = i2 & 127;
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i4 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i4 = (i4 << 8) + i6;
            i5++;
        } while (i5 < i3);
        if (i4 < i || z) {
            return i4;
        }
        throw new IOException(a.ce(i, i4, "corrupted stream - out of bounds length found: ", " >= "));
    }

    public static int b(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if (i3 < 31) {
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i4 = i3 & 127;
        if (i4 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((i3 & 128) != 0) {
            if ((i4 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            int i5 = i4 << 7;
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i4 = i5 | (i6 & 127);
            i3 = i6;
        }
        return i4;
    }

    public static zjh e(int i, zlc zlcVar, byte[][] bArr) throws IOException {
        try {
            switch (i) {
                case 1:
                    return zif.b(g(zlcVar, bArr));
                case 2:
                    return new ziu(zlcVar.a());
                case 3:
                    return zic.h(zlcVar.a());
                case 4:
                    return new zkn(zlcVar.a());
                case 5:
                    if (zlcVar.a().length == 0) {
                        return zkm.a;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    zjb.j(zlcVar.b);
                    return zjb.g(g(zlcVar, bArr), true);
                case 7:
                    return new ziy(new zip(zlcVar.a()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException(a.cd(i, "unknown tag ", " encountered"));
                case 10:
                    return zik.f(g(zlcVar, bArr), true);
                case 12:
                    return new zju(zlcVar.a());
                case 13:
                    zjj.f(zlcVar.b);
                    byte[] bArrG = g(zlcVar, bArr);
                    zjj.f(bArrG.length);
                    zjj zjjVar = (zjj) zjj.a.get(new zja(bArrG));
                    if (zjjVar != null) {
                        return zjjVar;
                    }
                    if (zjj.i(bArrG)) {
                        return new zjj(vxr.bd(bArrG));
                    }
                    throw new IllegalArgumentException("invalid relative OID contents");
                case 14:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case 34:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    throw new IOException(a.cd(i, "unsupported tag ", " encountered"));
                case 18:
                    return new ziw(zlcVar.a());
                case 19:
                    return new zji(zlcVar.a());
                case 20:
                    return new zjq(zlcVar.a());
                case 21:
                    return new zjw(zlcVar.a());
                case 22:
                    return new zir(zlcVar.a());
                case 23:
                    return new zjt(zlcVar.a());
                case 24:
                    return new zio(zlcVar.a());
                case 25:
                    return new zip(zlcVar.a());
                case 26:
                    return new zjx(zlcVar.a());
                case 27:
                    return new zin(zlcVar.a());
                case 28:
                    byte[] bArrA = zlcVar.a();
                    int i2 = zjv.b;
                    return new zjv(bArrA);
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    int i3 = zlcVar.b;
                    if ((i3 & 1) != 0) {
                        throw new IOException("malformed BMPString encoding encountered");
                    }
                    int i4 = i3 / 2;
                    char[] cArr = new char[i4];
                    byte[] bArr2 = new byte[8];
                    int i5 = 0;
                    int i6 = 0;
                    while (i3 >= 8) {
                        if (vxr.aP(zlcVar, bArr2, 8) != 8) {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                        cArr[i6] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                        cArr[i6 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                        cArr[i6 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                        cArr[i6 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                        i3 -= 8;
                        i6 += 4;
                    }
                    if (i3 > 0) {
                        if (vxr.aP(zlcVar, bArr2, i3) != i3) {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                        do {
                            int i7 = i5 + 1;
                            int i8 = bArr2[i5] << 8;
                            i5 += 2;
                            cArr[i6] = (char) ((bArr2[i7] & 255) | i8);
                            i6++;
                        } while (i5 < i3);
                    }
                    if (zlcVar.b == 0 && i4 == i6) {
                        return new zia(cArr);
                    }
                    throw new IllegalStateException();
            }
        } catch (IllegalArgumentException e) {
            throw new zil(e.getMessage(), e);
        } catch (IllegalStateException e2) {
            throw new zil(e2.getMessage(), e2);
        }
    }

    private static byte[] g(zlc zlcVar, byte[][] bArr) throws IOException {
        int i = zlcVar.b;
        int length = bArr.length;
        if (i >= 11) {
            return zlcVar.a();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        int length2 = bArr2.length;
        if (i != length2) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i == 0) {
            return bArr2;
        }
        int i2 = zlcVar.d;
        if (i >= i2) {
            throw new IOException(a.ce(i2, i, "corrupted stream - out of bounds length found: ", " >= "));
        }
        int iAP = i - vxr.aP(zlcVar.c, bArr2, length2);
        zlcVar.b = iAP;
        if (iAP == 0) {
            zlcVar.b();
            return bArr2;
        }
        throw new EOFException("DEF length " + zlcVar.a + " object truncated by " + zlcVar.b);
    }

    final zii c() {
        zjh zjhVarF = f();
        if (zjhVarF == null) {
            return new zii(0);
        }
        zii ziiVar = new zii();
        do {
            ziiVar.b(zjhVarF);
            zjhVarF = f();
        } while (zjhVarF != null);
        return ziiVar;
    }

    final zii d(zlc zlcVar) {
        int i = zlcVar.b;
        return i <= 0 ? new zii(0) : new zis(zlcVar, i, this.b, this.c).c();
    }

    public final zjh f() {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iB = b(this, i);
        int i2 = this.a;
        int i3 = 0;
        int iA = a(this, i2, false);
        if (iA < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            int i4 = i & 192;
            int i5 = this.a;
            eph ephVar = new eph(new zle(this, i5), i5, this.c);
            if (i4 != 0) {
                return ephVar.G(i4, iB);
            }
            if (iB == 3) {
                return zjz.a(ephVar);
            }
            if (iB == 4) {
                return zko.a(ephVar);
            }
            if (iB == 8) {
                return zke.c(ephVar);
            }
            if (iB == 16) {
                return zke.b(ephVar);
            }
            if (iB == 17) {
                return zke.a(ephVar);
            }
            throw new IOException("unknown BER object encountered");
        }
        try {
            zlc zlcVar = new zlc(this, iA, i2);
            if ((i & 224) == 0) {
                return e(iB, zlcVar, this.c);
            }
            int i6 = i & 192;
            if (i6 != 0) {
                return (i & 32) == 0 ? zjr.h(i6, iB, zlcVar.a()) : zjr.g(i6, iB, d(zlcVar));
            }
            if (iB == 3) {
                zii ziiVarD = d(zlcVar);
                int i7 = ziiVarD.c;
                zic[] zicVarArr = new zic[i7];
                while (i3 != i7) {
                    zih zihVarA = ziiVarD.a(i3);
                    if (!(zihVarA instanceof zic)) {
                        throw new zil("unknown object encountered in constructed BIT STRING: ".concat(String.valueOf(String.valueOf(zihVarA.getClass()))));
                    }
                    zicVarArr[i3] = (zic) zihVarA;
                    i3++;
                }
                return new zjy(zicVarArr);
            }
            if (iB != 4) {
                if (iB == 8) {
                    return new zkv(zkw.a(d(zlcVar)));
                }
                if (iB == 16) {
                    return zlcVar.b <= 0 ? zkw.a : this.b ? new zlg(zlcVar.a()) : zkw.a(d(zlcVar));
                }
                if (iB == 17) {
                    return zkw.b(d(zlcVar));
                }
                throw new IOException(a.cd(iB, "unknown tag ", " encountered"));
            }
            zii ziiVarD2 = d(zlcVar);
            int i8 = ziiVarD2.c;
            zjd[] zjdVarArr = new zjd[i8];
            while (i3 != i8) {
                zih zihVarA2 = ziiVarD2.a(i3);
                if (!(zihVarA2 instanceof zjd)) {
                    throw new zil("unknown object encountered in constructed OCTET STRING: ".concat(String.valueOf(String.valueOf(zihVarA2.getClass()))));
                }
                zjdVarArr[i3] = (zjd) zihVarA2;
                i3++;
            }
            return new zkb(zjdVarArr);
        } catch (IllegalArgumentException e) {
            throw new zil("corrupted stream detected", e);
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public zis(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public zis(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    private zis(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = bArr;
    }

    public zis(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public zis(byte[] bArr, byte[] bArr2) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }
}
