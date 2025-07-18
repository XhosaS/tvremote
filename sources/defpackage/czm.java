package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czm extends FilterInputStream implements InputStreamRetargetInterface {
    public final int a;
    private final boolean b;
    private final byte[][] c;

    public czm(InputStream inputStream) {
        this(inputStream, dnx.ak(inputStream));
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
        throw new IOException(b.f(i, i4, "corrupted stream - out of bounds length found: ", " >= "));
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

    public static dab e(int i, dbw dbwVar, byte[][] bArr) throws IOException {
        try {
            switch (i) {
                case 1:
                    return cyz.b(g(dbwVar, bArr));
                case 2:
                    return new czo(dbwVar.a());
                case 3:
                    return cyw.h(dbwVar.a());
                case 4:
                    return new dbh(dbwVar.a());
                case 5:
                    if (dbwVar.a().length == 0) {
                        return dbg.a;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    czv.j(dbwVar.b);
                    return czv.g(g(dbwVar, bArr), true);
                case 7:
                    return new czs(new czj(dbwVar.a()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException(b.h(i, "unknown tag ", " encountered"));
                case 10:
                    return cze.f(g(dbwVar, bArr), true);
                case 12:
                    return new dao(dbwVar.a());
                case 13:
                    dad.f(dbwVar.b);
                    byte[] bArrG = g(dbwVar, bArr);
                    dad.f(bArrG.length);
                    dad dadVar = (dad) dad.a.get(new czu(bArrG));
                    if (dadVar != null) {
                        return dadVar;
                    }
                    if (dad.i(bArrG)) {
                        return new dad(dos.p(bArrG));
                    }
                    throw new IllegalArgumentException("invalid relative OID contents");
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException(b.h(i, "unsupported tag ", " encountered"));
                case 18:
                    return new czq(dbwVar.a());
                case 19:
                    return new dac(dbwVar.a());
                case 20:
                    return new dak(dbwVar.a());
                case 21:
                    return new daq(dbwVar.a());
                case 22:
                    return new czl(dbwVar.a());
                case 23:
                    return new dan(dbwVar.a());
                case 24:
                    return new czi(dbwVar.a());
                case 25:
                    return new czj(dbwVar.a());
                case 26:
                    return new dar(dbwVar.a());
                case 27:
                    return new czh(dbwVar.a());
                case 28:
                    byte[] bArrA = dbwVar.a();
                    int i2 = dap.b;
                    return new dap(bArrA);
                case 30:
                    int i3 = dbwVar.b;
                    if ((i3 & 1) != 0) {
                        throw new IOException("malformed BMPString encoding encountered");
                    }
                    int i4 = i3 / 2;
                    char[] cArr = new char[i4];
                    byte[] bArr2 = new byte[8];
                    int i5 = 0;
                    int i6 = 0;
                    while (i3 >= 8) {
                        if (dos.b(dbwVar, bArr2, 8) != 8) {
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
                        if (dos.b(dbwVar, bArr2, i3) != i3) {
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
                    if (dbwVar.b == 0 && i4 == i6) {
                        return new cyu(cArr);
                    }
                    throw new IllegalStateException();
            }
        } catch (IllegalArgumentException e) {
            throw new czf(e.getMessage(), e);
        } catch (IllegalStateException e2) {
            throw new czf(e2.getMessage(), e2);
        }
    }

    private static byte[] g(dbw dbwVar, byte[][] bArr) throws IOException {
        int i = dbwVar.b;
        int length = bArr.length;
        if (i >= 11) {
            return dbwVar.a();
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
        int i2 = dbwVar.d;
        if (i >= i2) {
            throw new IOException(b.f(i2, i, "corrupted stream - out of bounds length found: ", " >= "));
        }
        int iB = i - dos.b(dbwVar.c, bArr2, length2);
        dbwVar.b = iB;
        if (iB == 0) {
            dbwVar.b();
            return bArr2;
        }
        throw new EOFException("DEF length " + dbwVar.a + " object truncated by " + dbwVar.b);
    }

    final czc c() {
        dab dabVarF = f();
        if (dabVarF == null) {
            return new czc(0);
        }
        czc czcVar = new czc();
        do {
            czcVar.b(dabVarF);
            dabVarF = f();
        } while (dabVarF != null);
        return czcVar;
    }

    final czc d(dbw dbwVar) {
        int i = dbwVar.b;
        return i <= 0 ? new czc(0) : new czm(dbwVar, i, this.b, this.c).c();
    }

    public final dab f() {
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
            bda bdaVar = new bda(new dby(this, i5), i5, this.c);
            if (i4 != 0) {
                return bdaVar.f(i4, iB);
            }
            if (iB == 3) {
                return dat.a(bdaVar);
            }
            if (iB == 4) {
                return dbi.a(bdaVar);
            }
            if (iB == 8) {
                return day.c(bdaVar);
            }
            if (iB == 16) {
                return day.b(bdaVar);
            }
            if (iB == 17) {
                return day.a(bdaVar);
            }
            throw new IOException("unknown BER object encountered");
        }
        try {
            dbw dbwVar = new dbw(this, iA, i2);
            if ((i & 224) == 0) {
                return e(iB, dbwVar, this.c);
            }
            int i6 = i & 192;
            if (i6 != 0) {
                return (i & 32) == 0 ? dal.h(i6, iB, dbwVar.a()) : dal.g(i6, iB, d(dbwVar));
            }
            if (iB == 3) {
                czc czcVarD = d(dbwVar);
                int i7 = czcVarD.c;
                cyw[] cywVarArr = new cyw[i7];
                while (i3 != i7) {
                    czb czbVarA = czcVarD.a(i3);
                    if (!(czbVarA instanceof cyw)) {
                        throw new czf("unknown object encountered in constructed BIT STRING: ".concat(String.valueOf(String.valueOf(czbVarA.getClass()))));
                    }
                    cywVarArr[i3] = (cyw) czbVarA;
                    i3++;
                }
                return new das(cywVarArr);
            }
            if (iB != 4) {
                if (iB == 8) {
                    return new dbp(dbq.a(d(dbwVar)));
                }
                if (iB == 16) {
                    return dbwVar.b <= 0 ? dbq.a : this.b ? new dca(dbwVar.a()) : dbq.a(d(dbwVar));
                }
                if (iB == 17) {
                    return dbq.b(d(dbwVar));
                }
                throw new IOException(b.h(iB, "unknown tag ", " encountered"));
            }
            czc czcVarD2 = d(dbwVar);
            int i8 = czcVarD2.c;
            czx[] czxVarArr = new czx[i8];
            while (i3 != i8) {
                czb czbVarA2 = czcVarD2.a(i3);
                if (!(czbVarA2 instanceof czx)) {
                    throw new czf("unknown object encountered in constructed OCTET STRING: ".concat(String.valueOf(String.valueOf(czbVarA2.getClass()))));
                }
                czxVarArr[i3] = (czx) czbVarA2;
                i3++;
            }
            return new dav(czxVarArr);
        } catch (IllegalArgumentException e) {
            throw new czf("corrupted stream detected", e);
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public czm(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public czm(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    private czm(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = bArr;
    }

    public czm(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public czm(byte[] bArr, byte[] bArr2) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }
}
