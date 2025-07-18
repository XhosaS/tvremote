package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ckk {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(s(bArr, i));
    }

    static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    static int c(byte[] bArr, int i, ckj ckjVar) {
        int iL = l(bArr, i, ckjVar);
        int i2 = ckjVar.a;
        if (i2 < 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iL) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            ckjVar.c = ckv.b;
            return iL;
        }
        ckjVar.c = ckv.q(bArr, iL, i2);
        return iL + i2;
    }

    static int d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int e(cno cnoVar, byte[] bArr, int i, int i2, int i3, ckj ckjVar) {
        Object objE = cnoVar.e();
        int iP = p(objE, cnoVar, bArr, i, i2, i3, ckjVar);
        cnoVar.g(objE);
        ckjVar.c = objE;
        return iP;
    }

    static int f(cno cnoVar, byte[] bArr, int i, int i2, ckj ckjVar) {
        Object objE = cnoVar.e();
        int iQ = q(objE, cnoVar, bArr, i, i2, ckjVar);
        cnoVar.g(objE);
        ckjVar.c = objE;
        return iQ;
    }

    static int g(cno cnoVar, int i, byte[] bArr, int i2, int i3, cme cmeVar, ckj ckjVar) {
        int iF = f(cnoVar, bArr, i2, i3, ckjVar);
        cmeVar.add(ckjVar.c);
        while (iF < i3) {
            int iL = l(bArr, iF, ckjVar);
            if (i != ckjVar.a) {
                break;
            }
            iF = f(cnoVar, bArr, iL, i3, ckjVar);
            cmeVar.add(ckjVar.c);
        }
        return iF;
    }

    static int h(byte[] bArr, int i, cme cmeVar, ckj ckjVar) {
        clu cluVar = (clu) cmeVar;
        int iL = l(bArr, i, ckjVar);
        int i2 = ckjVar.a + iL;
        while (iL < i2) {
            iL = l(bArr, iL, ckjVar);
            cluVar.g(ckjVar.a);
        }
        if (iL == i2) {
            return iL;
        }
        throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, ckj ckjVar) {
        int iL = l(bArr, i, ckjVar);
        int i2 = ckjVar.a;
        if (i2 < 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            ckjVar.c = "";
            return iL;
        }
        ckjVar.c = new String(bArr, iL, i2, cmf.a);
        return iL + i2;
    }

    static int j(byte[] bArr, int i, ckj ckjVar) {
        int iL = l(bArr, i, ckjVar);
        int i2 = ckjVar.a;
        if (i2 < 0) {
            throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            ckjVar.c = "";
            return iL;
        }
        int i3 = cof.a;
        ckjVar.c = dnx.bq(bArr, iL, i2);
        return iL + i2;
    }

    static int k(int i, byte[] bArr, int i2, int i3, cny cnyVar, ckj ckjVar) {
        if (coi.a(i) == 0) {
            throw new cmh("Protocol message contained an invalid tag (zero).");
        }
        int iB = coi.b(i);
        if (iB == 0) {
            int iO = o(bArr, i2, ckjVar);
            cnyVar.e(i, Long.valueOf(ckjVar.b));
            return iO;
        }
        if (iB == 1) {
            cnyVar.e(i, Long.valueOf(s(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int iL = l(bArr, i2, ckjVar);
            int i4 = ckjVar.a;
            if (i4 < 0) {
                throw new cmh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i4 > bArr.length - iL) {
                throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i4 == 0) {
                cnyVar.e(i, ckv.b);
            } else {
                cnyVar.e(i, ckv.q(bArr, iL, i4));
            }
            return iL + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new cmh("Protocol message contained an invalid tag (zero).");
            }
            cnyVar.e(i, Integer.valueOf(d(bArr, i2)));
            return i2 + 4;
        }
        cny cnyVar2 = new cny();
        int i5 = (i & (-8)) | 4;
        int i6 = ckjVar.e + 1;
        ckjVar.e = i6;
        t(i6);
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iL2 = l(bArr, i2, ckjVar);
            int i8 = ckjVar.a;
            if (i8 == i5) {
                i7 = i8;
                i2 = iL2;
                break;
            }
            i2 = k(i8, bArr, iL2, i3, cnyVar2, ckjVar);
            i7 = i8;
        }
        ckjVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new cmh("Failed to parse the message.");
        }
        cnyVar.e(i, cnyVar2);
        return i2;
    }

    static int l(byte[] bArr, int i, ckj ckjVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return m(b2, bArr, i2, ckjVar);
        }
        ckjVar.a = b2;
        return i2;
    }

    static int m(int i, byte[] bArr, int i2, ckj ckjVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            ckjVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            ckjVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            ckjVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            ckjVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ckjVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int n(int i, byte[] bArr, int i2, int i3, cme cmeVar, ckj ckjVar) {
        clu cluVar = (clu) cmeVar;
        int iL = l(bArr, i2, ckjVar);
        cluVar.g(ckjVar.a);
        while (iL < i3) {
            int iL2 = l(bArr, iL, ckjVar);
            if (i != ckjVar.a) {
                break;
            }
            iL = l(bArr, iL2, ckjVar);
            cluVar.g(ckjVar.a);
        }
        return iL;
    }

    static int o(byte[] bArr, int i, ckj ckjVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            ckjVar.b = j;
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
        ckjVar.b = j2;
        return i3;
    }

    static int p(Object obj, cno cnoVar, byte[] bArr, int i, int i2, int i3, ckj ckjVar) {
        int i4 = ckjVar.e + 1;
        ckjVar.e = i4;
        t(i4);
        int iC = ((cnc) cnoVar).c(obj, bArr, i, i2, i3, ckjVar);
        ckjVar.e--;
        ckjVar.c = obj;
        return iC;
    }

    static int q(Object obj, cno cnoVar, byte[] bArr, int i, int i2, ckj ckjVar) {
        int iM = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM = m(i3, bArr, iM, ckjVar);
            i3 = ckjVar.a;
        }
        int i4 = iM;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = ckjVar.e + 1;
        ckjVar.e = i5;
        t(i5);
        int i6 = i4 + i3;
        cnoVar.i(obj, bArr, i4, i6, ckjVar);
        ckjVar.e--;
        ckjVar.c = obj;
        return i6;
    }

    static int r(int i, byte[] bArr, int i2, int i3, ckj ckjVar) {
        if (coi.a(i) == 0) {
            throw new cmh("Protocol message contained an invalid tag (zero).");
        }
        int iB = coi.b(i);
        if (iB == 0) {
            return o(bArr, i2, ckjVar);
        }
        if (iB == 1) {
            return i2 + 8;
        }
        if (iB == 2) {
            return l(bArr, i2, ckjVar) + ckjVar.a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i2 + 4;
            }
            throw new cmh("Protocol message contained an invalid tag (zero).");
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = l(bArr, i2, ckjVar);
            i5 = ckjVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = r(i5, bArr, i2, i3, ckjVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw new cmh("Failed to parse the message.");
        }
        return i2;
    }

    static long s(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void t(int i) throws cmh {
        if (i >= b) {
            throw new cmh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
