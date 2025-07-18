package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abva {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static int a(byte[] bArr, int i, abuz abuzVar) {
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a;
        if (i2 < 0) {
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iR) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            abuzVar.c = abvo.b;
            return iR;
        }
        abuzVar.c = abvo.u(bArr, iR, i2);
        return iR + i2;
    }

    static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int c(abzj abzjVar, byte[] bArr, int i, int i2, int i3, abuz abuzVar) {
        Object objE = abzjVar.e();
        int iV = v(objE, abzjVar, bArr, i, i2, i3, abuzVar);
        abzjVar.g(objE);
        abuzVar.c = objE;
        return iV;
    }

    static int d(abzj abzjVar, byte[] bArr, int i, int i2, abuz abuzVar) {
        Object objE = abzjVar.e();
        int iW = w(objE, abzjVar, bArr, i, i2, abuzVar);
        abzjVar.g(objE);
        abuzVar.c = objE;
        return iW;
    }

    static int e(abzj abzjVar, int i, byte[] bArr, int i2, int i3, abxs abxsVar, abuz abuzVar) {
        int iD = d(abzjVar, bArr, i2, i3, abuzVar);
        abxsVar.add(abuzVar.c);
        while (iD < i3) {
            int iR = r(bArr, iD, abuzVar);
            if (i != abuzVar.a) {
                break;
            }
            iD = d(abzjVar, bArr, iR, i3, abuzVar);
            abxsVar.add(abuzVar.c);
        }
        return iD;
    }

    static int f(byte[] bArr, int i, abxs abxsVar, abuz abuzVar) {
        abve abveVar = (abve) abxsVar;
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a + iR;
        while (iR < i2) {
            iR = u(bArr, iR, abuzVar);
            abveVar.e(abuzVar.b != 0);
        }
        if (iR == i2) {
            return iR;
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(byte[] bArr, int i, abxs abxsVar, abuz abuzVar) {
        abwd abwdVar = (abwd) abxsVar;
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a;
        int i3 = iR + i2;
        if (i3 > bArr.length) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = abwdVar.c + (i2 / 8);
        int length = abwdVar.b.length;
        if (i4 > length) {
            if (length == 0) {
                abwdVar.b = new double[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = abwd.e(length);
                }
                abwdVar.b = Arrays.copyOf(abwdVar.b, length);
            }
        }
        while (iR < i3) {
            abwdVar.f(Double.longBitsToDouble(y(bArr, iR)));
            iR += 8;
        }
        if (iR == i3) {
            return iR;
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int h(byte[] bArr, int i, abxs abxsVar, abuz abuzVar) {
        abxe abxeVar = (abxe) abxsVar;
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a;
        int i3 = iR + i2;
        if (i3 > bArr.length) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = abxeVar.c + (i2 / 4);
        int length = abxeVar.b.length;
        if (i4 > length) {
            if (length == 0) {
                abxeVar.b = new int[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = abxe.f(length);
                }
                abxeVar.b = Arrays.copyOf(abxeVar.b, length);
            }
        }
        while (iR < i3) {
            abxeVar.h(b(bArr, iR));
            iR += 4;
        }
        if (iR == i3) {
            return iR;
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, abxs abxsVar, abuz abuzVar) {
        abyf abyfVar = (abyf) abxsVar;
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a;
        int i3 = iR + i2;
        if (i3 > bArr.length) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = abyfVar.c + (i2 / 8);
        int length = abyfVar.b.length;
        if (i4 > length) {
            if (length == 0) {
                abyfVar.b = new long[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = abyf.g(length);
                }
                abyfVar.b = Arrays.copyOf(abyfVar.b, length);
            }
        }
        while (iR < i3) {
            abyfVar.f(y(bArr, iR));
            iR += 8;
        }
        if (iR == i3) {
            return iR;
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int j(byte[] bArr, int i, abxs abxsVar, abuz abuzVar) {
        abwt abwtVar = (abwt) abxsVar;
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a;
        int i3 = iR + i2;
        if (i3 > bArr.length) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = abwtVar.d + (i2 / 4);
        int length = abwtVar.c.length;
        if (i4 > length) {
            if (length == 0) {
                abwtVar.c = new float[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = abwt.e(length);
                }
                abwtVar.c = Arrays.copyOf(abwtVar.c, length);
            }
        }
        while (iR < i3) {
            abwtVar.g(Float.intBitsToFloat(b(bArr, iR)));
            iR += 4;
        }
        if (iR == i3) {
            return iR;
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int k(byte[] bArr, int i, abxs abxsVar, abuz abuzVar) {
        abxe abxeVar = (abxe) abxsVar;
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a + iR;
        while (iR < i2) {
            iR = r(bArr, iR, abuzVar);
            abxeVar.h(abvt.H(abuzVar.a));
        }
        if (iR == i2) {
            return iR;
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int l(byte[] bArr, int i, abxs abxsVar, abuz abuzVar) {
        abyf abyfVar = (abyf) abxsVar;
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a + iR;
        while (iR < i2) {
            iR = u(bArr, iR, abuzVar);
            abyfVar.f(abvt.J(abuzVar.b));
        }
        if (iR == i2) {
            return iR;
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int m(byte[] bArr, int i, abxs abxsVar, abuz abuzVar) {
        abxe abxeVar = (abxe) abxsVar;
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a + iR;
        while (iR < i2) {
            iR = r(bArr, iR, abuzVar);
            abxeVar.h(abuzVar.a);
        }
        if (iR == i2) {
            return iR;
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(byte[] bArr, int i, abxs abxsVar, abuz abuzVar) {
        abyf abyfVar = (abyf) abxsVar;
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a + iR;
        while (iR < i2) {
            iR = u(bArr, iR, abuzVar);
            abyfVar.f(abuzVar.b);
        }
        if (iR == i2) {
            return iR;
        }
        throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int o(byte[] bArr, int i, abuz abuzVar) {
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a;
        if (i2 < 0) {
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            abuzVar.c = "";
            return iR;
        }
        abuzVar.c = new String(bArr, iR, i2, abxt.a);
        return iR + i2;
    }

    static int p(byte[] bArr, int i, abuz abuzVar) {
        int iR = r(bArr, i, abuzVar);
        int i2 = abuzVar.a;
        if (i2 < 0) {
            throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            abuzVar.c = "";
            return iR;
        }
        abuzVar.c = acam.a.c(bArr, iR, i2);
        return iR + i2;
    }

    static int q(int i, byte[] bArr, int i2, int i3, acab acabVar, abuz abuzVar) {
        if ((i >>> 3) == 0) {
            throw new abxv("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iU = u(bArr, i2, abuzVar);
            acabVar.e(i, Long.valueOf(abuzVar.b));
            return iU;
        }
        if (i4 == 1) {
            acabVar.e(i, Long.valueOf(y(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iR = r(bArr, i2, abuzVar);
            int i5 = abuzVar.a;
            if (i5 < 0) {
                throw new abxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iR) {
                throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                acabVar.e(i, abvo.b);
            } else {
                acabVar.e(i, abvo.u(bArr, iR, i5));
            }
            return iR + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new abxv("Protocol message contained an invalid tag (zero).");
            }
            acabVar.e(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        acab acabVar2 = new acab();
        int i6 = (i & (-8)) | 4;
        int i7 = abuzVar.e + 1;
        abuzVar.e = i7;
        z(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iR2 = r(bArr, i2, abuzVar);
            int i9 = abuzVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iR2;
                break;
            }
            i2 = q(i9, bArr, iR2, i3, acabVar2, abuzVar);
            i8 = i9;
        }
        abuzVar.e--;
        if (i2 > i3 || i8 != i6) {
            throw new abxv("Failed to parse the message.");
        }
        acabVar.e(i, acabVar2);
        return i2;
    }

    static int r(byte[] bArr, int i, abuz abuzVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return s(b2, bArr, i2, abuzVar);
        }
        abuzVar.a = b2;
        return i2;
    }

    static int s(int i, byte[] bArr, int i2, abuz abuzVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            abuzVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            abuzVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            abuzVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            abuzVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                abuzVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int t(int i, byte[] bArr, int i2, int i3, abxs abxsVar, abuz abuzVar) {
        abxe abxeVar = (abxe) abxsVar;
        int iR = r(bArr, i2, abuzVar);
        abxeVar.h(abuzVar.a);
        while (iR < i3) {
            int iR2 = r(bArr, iR, abuzVar);
            if (i != abuzVar.a) {
                break;
            }
            iR = r(bArr, iR2, abuzVar);
            abxeVar.h(abuzVar.a);
        }
        return iR;
    }

    static int u(byte[] bArr, int i, abuz abuzVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            abuzVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        abuzVar.b = j2;
        return i3;
    }

    static int v(Object obj, abzj abzjVar, byte[] bArr, int i, int i2, int i3, abuz abuzVar) {
        int i4 = abuzVar.e + 1;
        abuzVar.e = i4;
        z(i4);
        int iC = ((abyt) abzjVar).c(obj, bArr, i, i2, i3, abuzVar);
        abuzVar.e--;
        abuzVar.c = obj;
        return iC;
    }

    static int w(Object obj, abzj abzjVar, byte[] bArr, int i, int i2, abuz abuzVar) {
        int iS = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iS = s(i3, bArr, iS, abuzVar);
            i3 = abuzVar.a;
        }
        int i4 = iS;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = abuzVar.e + 1;
        abuzVar.e = i5;
        z(i5);
        int i6 = i4 + i3;
        abzjVar.j(obj, bArr, i4, i6, abuzVar);
        abuzVar.e--;
        abuzVar.c = obj;
        return i6;
    }

    static int x(int i, byte[] bArr, int i2, int i3, abuz abuzVar) {
        if ((i >>> 3) == 0) {
            throw new abxv("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return u(bArr, i2, abuzVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return r(bArr, i2, abuzVar) + abuzVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new abxv("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = r(bArr, i2, abuzVar);
            i6 = abuzVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = x(i6, bArr, i2, i3, abuzVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new abxv("Failed to parse the message.");
        }
        return i2;
    }

    static long y(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void z(int i) throws abxv {
        if (i >= b) {
            throw new abxv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
