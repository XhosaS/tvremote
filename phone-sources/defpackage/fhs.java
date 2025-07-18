package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhs {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = edt.ar("OpusHead");

    public static int a(int i) {
        return i & 16777215;
    }

    public static int b(int i) {
        return (i >> 24) & 255;
    }

    public static int c(edi ediVar) {
        ediVar.K(16);
        return ediVar.e();
    }

    public static ead d(edi ediVar) {
        short sC = ediVar.C();
        ediVar.L(2);
        String strY = ediVar.y(sC);
        int iMax = Math.max(strY.lastIndexOf(43), strY.lastIndexOf(45));
        try {
            return new ead(new edz(Float.parseFloat(strY.substring(0, iMax)), Float.parseFloat(strY.substring(iMax, strY.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static eea e(edi ediVar) {
        long jQ;
        long jQ2;
        ediVar.K(8);
        if (b(ediVar.e()) == 0) {
            jQ = ediVar.r();
            jQ2 = ediVar.r();
        } else {
            jQ = ediVar.q();
            jQ2 = ediVar.q();
        }
        return new eea(jQ, jQ2, ediVar.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.fif f(defpackage.fic r43, defpackage.edw r44, defpackage.fdx r45) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 1605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhs.f(fic, edw, fdx):fif");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0d6c  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0d77 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List g(defpackage.edw r74, defpackage.fdx r75, long r76, defpackage.dza r78, boolean r79, boolean r80, defpackage.tsl r81) {
        /*
            Method dump skipped, instructions count: 3459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhs.g(edw, fdx, long, dza, boolean, boolean, tsl):java.util.List");
    }

    public static void h(edi ediVar) {
        int i = ediVar.b;
        ediVar.L(4);
        if (ediVar.e() != 1751411826) {
            i += 4;
        }
        ediVar.K(i);
    }

    private static int i(edi ediVar) {
        int iJ = ediVar.j();
        int i = iJ & 127;
        while ((iJ & 128) == 128) {
            iJ = ediVar.j();
            i = (i << 7) | (iJ & 127);
        }
        return i;
    }

    private static Pair j(edi ediVar, int i, int i2) throws eaf {
        Integer num;
        fid fidVar;
        Pair pairCreate;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = ediVar.b;
        while (i5 - i < i2) {
            ediVar.K(i5);
            int iE = ediVar.e();
            fki.W(iE > 0, "childAtomSize must be positive");
            if (ediVar.e() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strY = null;
                while (i6 - i5 < iE) {
                    ediVar.K(i6);
                    int iE2 = ediVar.e();
                    int iE3 = ediVar.e();
                    if (iE3 == 1718775137) {
                        numValueOf = Integer.valueOf(ediVar.e());
                    } else if (iE3 == 1935894637) {
                        ediVar.L(4);
                        strY = ediVar.y(4);
                    } else if (iE3 == 1935894633) {
                        i8 = i6;
                        i7 = iE2;
                    }
                    i6 += iE2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strY) || "cbc1".equals(strY) || "cens".equals(strY) || "cbcs".equals(strY)) {
                    fki.W(numValueOf != null, "frma atom is mandatory");
                    fki.W(i8 != -1, "schi atom is mandatory");
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            fidVar = null;
                            break;
                        }
                        ediVar.K(i9);
                        int iE4 = ediVar.e();
                        if (ediVar.e() == 1952804451) {
                            int iB = b(ediVar.e());
                            ediVar.L(1);
                            if (iB == 0) {
                                ediVar.L(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iJ = ediVar.j();
                                i3 = iJ & 15;
                                i4 = (iJ & 240) >> 4;
                            }
                            if (ediVar.j() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iJ2 = ediVar.j();
                            byte[] bArr2 = new byte[16];
                            ediVar.F(bArr2, 0, 16);
                            if (z && iJ2 == 0) {
                                int iJ3 = ediVar.j();
                                byte[] bArr3 = new byte[iJ3];
                                ediVar.F(bArr3, 0, iJ3);
                                bArr = bArr3;
                            }
                            num = num2;
                            fidVar = new fid(z, strY, iJ2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iE4;
                        }
                    }
                    fki.W(fidVar != null, "tenc atom is mandatory");
                    String str = edt.a;
                    pairCreate = Pair.create(num, fidVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.dyt k(defpackage.edi r19) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhs.k(edi):dyt");
    }

    private static fhk l(edi ediVar, int i) {
        ediVar.K(i + 8);
        ediVar.L(4);
        return new fhk(ediVar.r(), ediVar.r());
    }

    private static fhm m(edi ediVar, int i) {
        ediVar.K(i + 12);
        ediVar.L(1);
        i(ediVar);
        ediVar.L(2);
        int iJ = ediVar.j();
        if ((iJ & 128) != 0) {
            ediVar.L(2);
        }
        if ((iJ & 64) != 0) {
            ediVar.L(ediVar.j());
        }
        if ((iJ & 32) != 0) {
            ediVar.L(2);
        }
        ediVar.L(1);
        i(ediVar);
        String strG = eae.g(ediVar.j());
        if ("audio/mpeg".equals(strG) || "audio/vnd.dts".equals(strG) || "audio/vnd.dts.hd".equals(strG)) {
            return new fhm(strG, null, -1L, -1L);
        }
        ediVar.L(4);
        long jR = ediVar.r();
        long jR2 = ediVar.r();
        ediVar.L(1);
        int i2 = i(ediVar);
        long j = jR2;
        byte[] bArr = new byte[i2];
        ediVar.F(bArr, 0, i2);
        if (j <= 0) {
            j = -1;
        }
        return new fhm(strG, bArr, j, jR > 0 ? jR : -1L);
    }

    private static ByteBuffer n() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0570 A[PHI: r8 r41
  0x0570: PHI (r8v94 int) = (r8v79 int), (r8v75 int) binds: [B:359:0x0699, B:261:0x056d] A[DONT_GENERATE, DONT_INLINE]
  0x0570: PHI (r41v6 int) = (r41v4 int), (r41v7 int) binds: [B:359:0x0699, B:261:0x056d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x080b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(defpackage.edi r44, int r45, int r46, int r47, int r48, java.lang.String r49, boolean r50, defpackage.dza r51, defpackage.fhp r52, int r53) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 2920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhs.o(edi, int, int, int, int, java.lang.String, boolean, dza, fhp, int):void");
    }
}
