package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eee {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static int a(int i, int i2, int i3, int i4) {
        return i - ((i2 == 1 ? 2 : 1) * (i3 + i4));
    }

    public static int b(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    public static int c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        a.ab(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            g(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            g(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            g(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    g(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static int d(dze dzeVar) {
        String str = dzeVar.Y;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, "video/hevc") || eae.k(dzeVar.U, "video/hevc")) ? 2 : 0;
    }

    public static int e(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    int length = iArr.length;
                    if (length <= i4) {
                        d = Arrays.copyOf(iArr, length + length);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = d[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0167 A[PHI: r3
  0x0167: PHI (r3v4 int) = (r3v3 int), (r3v3 int), (r3v3 int), (r3v3 int), (r3v3 int), (r3v7 int) binds: [B:73:0x0152, B:75:0x0156, B:77:0x015a, B:79:0x015e, B:81:0x0162, B:83:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d A[PHI: r3
  0x016d: PHI (r3v6 int) = (r3v4 int), (r3v3 int) binds: [B:85:0x0169, B:82:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eed f(byte[] r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eee.f(byte[], int, int):eed");
    }

    public static void g(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean h(byte[] bArr, int i, dze dzeVar) {
        String str = dzeVar.Y;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) != 0) {
                return true;
            }
            int i2 = b2 & 31;
            return (i2 == 1 || i2 == 9 || i2 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            tqr tqrVarK = k(new iex(bArr, 4, i + 4));
            int i3 = tqrVarK.b;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && tqrVarK.c == dzeVar.ap - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eeb i(defpackage.iex r18, boolean r19, int r20, defpackage.eeb r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L3c
            r2 = 2
            int r2 = r0.a(r2)
            boolean r7 = r0.j()
            r8 = 5
            int r8 = r0.a(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.j()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.a(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
            goto L49
        L3c:
            if (r2 == 0) goto L4f
            int r3 = r2.a
            boolean r7 = r2.b
            int r8 = r2.c
            int r10 = r2.d
            int[] r4 = r2.e
            r12 = r3
        L49:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.a(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.j()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.j()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.g(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.g(r5)
        L79:
            eeb r11 = new eeb
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eee.i(iex, boolean, int, eeb):eeb");
    }

    public static rzg j(byte[] bArr, int i) {
        iex iexVar = new iex(bArr, 4, i);
        int iB = iexVar.b();
        int iB2 = iexVar.b();
        iexVar.f();
        return new rzg(iB, iB2, iexVar.j());
    }

    public static tqr k(iex iexVar) {
        iexVar.f();
        return new tqr(iexVar.a(6), iexVar.a(6), iexVar.a(3) - 1, (char[]) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eec l(byte[] r32, int r33, int r34, defpackage.iom r35) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eee.l(byte[], int, int, iom):eec");
    }

    private static void m(iex iexVar) {
        int iB = iexVar.b() + 1;
        iexVar.g(8);
        for (int i = 0; i < iB; i++) {
            iexVar.b();
            iexVar.b();
            iexVar.f();
        }
        iexVar.g(20);
    }
}
