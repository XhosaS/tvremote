package defpackage;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgh extends ffr {
    public static final fki a = new fki();
    private final fki b;

    public fgh(fki fkiVar) {
        this.b = fkiVar;
    }

    private static int d(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int e(byte[] bArr, int i, int i2) {
        int iF = f(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iF;
        }
        while (true) {
            int length = bArr.length;
            if (iF >= length - 1) {
                return length;
            }
            int i3 = iF + 1;
            if ((iF - i) % 2 == 0 && bArr[i3] == 0) {
                return iF;
            }
            iF = f(bArr, i3);
        }
    }

    private static int f(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int g(edi ediVar, int i) {
        byte[] bArr = ediVar.a;
        int i2 = ediVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    private static ImmutableList h(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int iE = e(bArr, i2, i);
        while (i2 < iE) {
            builder.add((ImmutableList.Builder) new String(bArr, i2, iE - i2, k(i)));
            i2 = d(i) + iE;
            iE = e(bArr, i2, i);
        }
        ImmutableList immutableListBuild = builder.build();
        return immutableListBuild.isEmpty() ? ImmutableList.of("") : immutableListBuild;
    }

    private static String i(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String j(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static Charset k(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:3:0x0006, B:7:0x0013, B:18:0x003b, B:21:0x0046, B:23:0x0068, B:27:0x006e, B:39:0x008a, B:40:0x008c, B:43:0x0092, B:46:0x009c, B:29:0x0078, B:33:0x007f, B:8:0x0020), top: B:53:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:3:0x0006, B:7:0x0013, B:18:0x003b, B:21:0x0046, B:23:0x0068, B:27:0x006e, B:39:0x008a, B:40:0x008c, B:43:0x0092, B:46:0x009c, B:29:0x0078, B:33:0x007f, B:8:0x0020), top: B:53:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean l(defpackage.edi r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> La6
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La2
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r1.e()     // Catch: java.lang.Throwable -> La6
            long r8 = r1.r()     // Catch: java.lang.Throwable -> La6
            int r10 = r1.n()     // Catch: java.lang.Throwable -> La6
            goto L2a
        L20:
            int r7 = r1.l()     // Catch: java.lang.Throwable -> La6
            int r8 = r1.l()     // Catch: java.lang.Throwable -> La6
            long r8 = (long) r8     // Catch: java.lang.Throwable -> La6
            r10 = r6
        L2a:
            r11 = 0
            if (r7 != 0) goto L36
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L36
            if (r10 != 0) goto L36
            goto La2
        L36:
            r7 = 4
            if (r0 != r7) goto L66
            if (r24 != 0) goto L66
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L46
        L43:
            r4 = r6
            goto La2
        L46:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L66:
            if (r0 != r7) goto L76
            r3 = r10 & 64
            if (r3 == 0) goto L6d
            goto L6e
        L6d:
            r4 = r6
        L6e:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L88
        L76:
            if (r0 != r3) goto L86
            r3 = r10 & 32
            if (r3 == 0) goto L7e
            r3 = r4
            goto L7f
        L7e:
            r3 = r6
        L7f:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L84
            goto L88
        L84:
            r4 = r6
            goto L88
        L86:
            r3 = r6
            r4 = r3
        L88:
            if (r4 == 0) goto L8c
            int r3 = r3 + 4
        L8c:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La6
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L92
            goto L43
        L92:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> La6
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La6
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9c
            goto L43
        L9c:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> La6
            r1.L(r3)     // Catch: java.lang.Throwable -> La6
            goto L6
        La2:
            r1.K(r2)
            return r4
        La6:
            r0 = move-exception
            r1.K(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgh.l(edi, int, int, boolean):boolean");
    }

    private static byte[] m(byte[] bArr, int i, int i2) {
        return i2 <= i ? edt.b : Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0293 A[Catch: all -> 0x0157, Exception -> 0x0301, OutOfMemoryError -> 0x0304, TryCatch #5 {all -> 0x0157, blocks: (B:82:0x0100, B:84:0x012c, B:87:0x013a, B:104:0x0178, B:108:0x01ac, B:117:0x01d9, B:130:0x020b, B:132:0x0222, B:153:0x0281, B:155:0x0293, B:162:0x02d7, B:164:0x02ed, B:159:0x02b5, B:161:0x02cd, B:180:0x031d, B:187:0x0360, B:190:0x038f, B:193:0x03a0, B:194:0x03a8, B:196:0x03ac, B:198:0x03b3, B:199:0x03b7, B:206:0x03d6, B:210:0x03fb, B:212:0x0406, B:213:0x0436, B:214:0x0443, B:216:0x0447, B:218:0x044e, B:219:0x0452, B:223:0x0468, B:231:0x047a, B:233:0x04a4, B:234:0x04b3, B:236:0x04bf), top: B:252:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b5 A[Catch: all -> 0x0157, Exception -> 0x0301, OutOfMemoryError -> 0x0304, TryCatch #5 {all -> 0x0157, blocks: (B:82:0x0100, B:84:0x012c, B:87:0x013a, B:104:0x0178, B:108:0x01ac, B:117:0x01d9, B:130:0x020b, B:132:0x0222, B:153:0x0281, B:155:0x0293, B:162:0x02d7, B:164:0x02ed, B:159:0x02b5, B:161:0x02cd, B:180:0x031d, B:187:0x0360, B:190:0x038f, B:193:0x03a0, B:194:0x03a8, B:196:0x03ac, B:198:0x03b3, B:199:0x03b7, B:206:0x03d6, B:210:0x03fb, B:212:0x0406, B:213:0x0436, B:214:0x0443, B:216:0x0447, B:218:0x044e, B:219:0x0452, B:223:0x0468, B:231:0x047a, B:233:0x04a4, B:234:0x04b3, B:236:0x04bf), top: B:252:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.fgi n(int r33, defpackage.edi r34, boolean r35, int r36, defpackage.fki r37) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgh.n(int, edi, boolean, int, fki):fgi");
    }

    @Override // defpackage.ffr
    protected final ead b(ffq ffqVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ead c(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgh.c(byte[], int):ead");
    }

    public fgh() {
        this(null);
    }
}
