package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vsn {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(s(bArr, i));
    }

    static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    static int c(byte[] bArr, int i, vsm vsmVar) {
        int iL = l(bArr, i, vsmVar);
        int i2 = vsmVar.a;
        if (i2 < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iL) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            vsmVar.c = vsz.b;
            return iL;
        }
        vsmVar.c = vsz.r(bArr, iL, i2);
        return iL + i2;
    }

    static int d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int e(vvy vvyVar, byte[] bArr, int i, int i2, int i3, vsm vsmVar) {
        Object objE = vvyVar.e();
        int iP = p(objE, vvyVar, bArr, i, i2, i3, vsmVar);
        vvyVar.g(objE);
        vsmVar.c = objE;
        return iP;
    }

    static int f(vvy vvyVar, byte[] bArr, int i, int i2, vsm vsmVar) {
        Object objE = vvyVar.e();
        int iQ = q(objE, vvyVar, bArr, i, i2, vsmVar);
        vvyVar.g(objE);
        vsmVar.c = objE;
        return iQ;
    }

    static int g(vvy vvyVar, int i, byte[] bArr, int i2, int i3, vun vunVar, vsm vsmVar) {
        int iF = f(vvyVar, bArr, i2, i3, vsmVar);
        vunVar.add(vsmVar.c);
        while (iF < i3) {
            int iL = l(bArr, iF, vsmVar);
            if (i != vsmVar.a) {
                break;
            }
            iF = f(vvyVar, bArr, iL, i3, vsmVar);
            vunVar.add(vsmVar.c);
        }
        return iF;
    }

    static int h(byte[] bArr, int i, vun vunVar, vsm vsmVar) {
        vud vudVar = (vud) vunVar;
        int iL = l(bArr, i, vsmVar);
        int i2 = vsmVar.a + iL;
        while (iL < i2) {
            iL = l(bArr, iL, vsmVar);
            vudVar.g(vsmVar.a);
        }
        if (iL == i2) {
            return iL;
        }
        throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, vsm vsmVar) {
        int iL = l(bArr, i, vsmVar);
        int i2 = vsmVar.a;
        if (i2 < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            vsmVar.c = "";
            return iL;
        }
        vsmVar.c = new String(bArr, iL, i2, vuo.a);
        return iL + i2;
    }

    static int j(byte[] bArr, int i, vsm vsmVar) {
        int iL = l(bArr, i, vsmVar);
        int i2 = vsmVar.a;
        if (i2 < 0) {
            throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            vsmVar.c = "";
            return iL;
        }
        int i3 = vwn.a;
        vsmVar.c = vxr.n(bArr, iL, i2);
        return iL + i2;
    }

    static int k(int i, byte[] bArr, int i2, int i3, vwh vwhVar, vsm vsmVar) {
        if (vwq.a(i) == 0) {
            throw new vuq("Protocol message contained an invalid tag (zero).");
        }
        int iB = vwq.b(i);
        if (iB == 0) {
            int iO = o(bArr, i2, vsmVar);
            vwhVar.e(i, Long.valueOf(vsmVar.b));
            return iO;
        }
        if (iB == 1) {
            vwhVar.e(i, Long.valueOf(s(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int iL = l(bArr, i2, vsmVar);
            int i4 = vsmVar.a;
            if (i4 < 0) {
                throw new vuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i4 > bArr.length - iL) {
                throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i4 == 0) {
                vwhVar.e(i, vsz.b);
            } else {
                vwhVar.e(i, vsz.r(bArr, iL, i4));
            }
            return iL + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new vuq("Protocol message contained an invalid tag (zero).");
            }
            vwhVar.e(i, Integer.valueOf(d(bArr, i2)));
            return i2 + 4;
        }
        vwh vwhVar2 = new vwh();
        int i5 = (i & (-8)) | 4;
        int i6 = vsmVar.e + 1;
        vsmVar.e = i6;
        t(i6);
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iL2 = l(bArr, i2, vsmVar);
            int i8 = vsmVar.a;
            if (i8 == i5) {
                i7 = i8;
                i2 = iL2;
                break;
            }
            i2 = k(i8, bArr, iL2, i3, vwhVar2, vsmVar);
            i7 = i8;
        }
        vsmVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new vuq("Failed to parse the message.");
        }
        vwhVar.e(i, vwhVar2);
        return i2;
    }

    static int l(byte[] bArr, int i, vsm vsmVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return m(b2, bArr, i2, vsmVar);
        }
        vsmVar.a = b2;
        return i2;
    }

    static int m(int i, byte[] bArr, int i2, vsm vsmVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            vsmVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            vsmVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            vsmVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            vsmVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                vsmVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int n(int i, byte[] bArr, int i2, int i3, vun vunVar, vsm vsmVar) {
        vud vudVar = (vud) vunVar;
        int iL = l(bArr, i2, vsmVar);
        vudVar.g(vsmVar.a);
        while (iL < i3) {
            int iL2 = l(bArr, iL, vsmVar);
            if (i != vsmVar.a) {
                break;
            }
            iL = l(bArr, iL2, vsmVar);
            vudVar.g(vsmVar.a);
        }
        return iL;
    }

    static int o(byte[] bArr, int i, vsm vsmVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            vsmVar.b = j;
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
        vsmVar.b = j2;
        return i3;
    }

    static int p(Object obj, vvy vvyVar, byte[] bArr, int i, int i2, int i3, vsm vsmVar) {
        int i4 = vsmVar.e + 1;
        vsmVar.e = i4;
        t(i4);
        int iC = ((vvm) vvyVar).c(obj, bArr, i, i2, i3, vsmVar);
        vsmVar.e--;
        vsmVar.c = obj;
        return iC;
    }

    static int q(Object obj, vvy vvyVar, byte[] bArr, int i, int i2, vsm vsmVar) {
        int iM = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM = m(i3, bArr, iM, vsmVar);
            i3 = vsmVar.a;
        }
        int i4 = iM;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = vsmVar.e + 1;
        vsmVar.e = i5;
        t(i5);
        int i6 = i4 + i3;
        vvyVar.i(obj, bArr, i4, i6, vsmVar);
        vsmVar.e--;
        vsmVar.c = obj;
        return i6;
    }

    static int r(int i, byte[] bArr, int i2, int i3, vsm vsmVar) {
        if (vwq.a(i) == 0) {
            throw new vuq("Protocol message contained an invalid tag (zero).");
        }
        int iB = vwq.b(i);
        if (iB == 0) {
            return o(bArr, i2, vsmVar);
        }
        if (iB == 1) {
            return i2 + 8;
        }
        if (iB == 2) {
            return l(bArr, i2, vsmVar) + vsmVar.a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i2 + 4;
            }
            throw new vuq("Protocol message contained an invalid tag (zero).");
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = l(bArr, i2, vsmVar);
            i5 = vsmVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = r(i5, bArr, i2, i3, vsmVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw new vuq("Failed to parse the message.");
        }
        return i2;
    }

    static long s(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void t(int i) throws vuq {
        if (i >= b) {
            throw new vuq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
