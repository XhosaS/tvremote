package defpackage;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaww {
    public static final Charset a;
    public static final aawv b;
    private static final zpp c;
    private final aaxq d;

    static {
        zpp zppVar = zpp.a;
        zpo zpoVar = new zpo();
        if ((zpoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpoVar.y();
        }
        zpp zppVar2 = (zpp) zpoVar.b;
        zppVar2.b |= 1;
        zppVar2.c = 0L;
        if ((zpoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpoVar.y();
        }
        zpp zppVar3 = (zpp) zpoVar.b;
        zppVar3.b |= 2;
        zppVar3.d = 0;
        if ((zpoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpoVar.y();
        }
        zpp zppVar4 = (zpp) zpoVar.b;
        zppVar4.b |= 4;
        zppVar4.e = 0;
        c = (zpp) zpoVar.v();
        a = Charset.forName("UTF-8");
        b = aawv.d().a();
    }

    public aaww(String str, String str2) {
        aaxu aaxuVar = aaxu.a;
        aaxt aaxtVar = new aaxt();
        if ((aaxtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aaxtVar.y();
        }
        aaxu aaxuVar2 = (aaxu) aaxtVar.b;
        str.getClass();
        aaxuVar2.b |= 1;
        aaxuVar2.c = str;
        if (str2 != null) {
            if ((aaxtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aaxtVar.y();
            }
            aaxu aaxuVar3 = (aaxu) aaxtVar.b;
            aaxuVar3.b |= 2;
            aaxuVar3.d = str2;
        }
        aaxq aaxqVar = aaxq.a;
        aaxp aaxpVar = new aaxp();
        if ((aaxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aaxpVar.y();
        }
        aaxq aaxqVar2 = (aaxq) aaxpVar.b;
        aaxu aaxuVar4 = (aaxu) aaxtVar.v();
        aaxuVar4.getClass();
        aaxqVar2.c = aaxuVar4;
        aaxqVar2.b |= 1;
        aayc aaycVar = aayc.a;
        aaya aayaVar = new aaya();
        if ((aayaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aayaVar.y();
        }
        aayc aaycVar2 = (aayc) aayaVar.b;
        aaycVar2.c = 0;
        aaycVar2.b |= 1;
        if ((aaxpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aaxpVar.y();
        }
        aaxq aaxqVar3 = (aaxq) aaxpVar.b;
        aayc aaycVar3 = (aayc) aayaVar.v();
        aaycVar3.getClass();
        aaxqVar3.d = aaycVar3;
        aaxqVar3.b |= 2;
        this.d = (aaxq) aaxpVar.v();
    }

    public static Object a(zfp zfpVar, zer zerVar) {
        return zfpVar.c().c(zerVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.aaxv c(defpackage.zpr r8, int r9, defpackage.aawv r10, java.lang.Object... r11) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaww.c(zpr, int, aawv, java.lang.Object[]):aaxv");
    }

    public final aaxv b(zfp zfpVar, int i, aawv aawvVar) {
        String name;
        int i2;
        zpr zprVar;
        ahqu ahquVar;
        if (zfpVar.c().c(qrl.a) != null) {
            zpr zprVar2 = zpr.a;
            zpq zpqVar = new zpq();
            zpp zppVar = c;
            if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar.y();
            }
            zpr zprVar3 = (zpr) zpqVar.b;
            zppVar.getClass();
            zprVar3.c = zppVar;
            zprVar3.b |= 1;
            int iIntValue = zfpVar.g().intValue();
            if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar.y();
            }
            zpr zprVar4 = (zpr) zpqVar.b;
            zprVar4.b |= 4;
            zprVar4.e = iIntValue;
            String strB = zfpVar.b().b();
            if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar.y();
            }
            zpr zprVar5 = (zpr) zpqVar.b;
            strB.getClass();
            zprVar5.b |= 8;
            zprVar5.f = strB;
            String strE = zfpVar.b().e();
            if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar.y();
            }
            zpr zprVar6 = (zpr) zpqVar.b;
            strE.getClass();
            zprVar6.b |= 16;
            zprVar6.g = strE;
            int iA = zfpVar.b().a();
            if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar.y();
            }
            zpr zprVar7 = (zpr) zpqVar.b;
            zprVar7.b |= 32;
            zprVar7.h = iA;
            String strD = zfpVar.b().d();
            if (strD != null) {
                if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpqVar.y();
                }
                zpr zprVar8 = (zpr) zpqVar.b;
                zprVar8.b |= 64;
                zprVar8.i = strD;
            }
            String str = (String) zfpVar.c().c(qrl.b);
            if (str != null) {
                if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpqVar.y();
                }
                zpr zprVar9 = (zpr) zpqVar.b;
                zprVar9.b |= 2;
                zprVar9.d = str;
            } else {
                if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpqVar.y();
                }
                zpr zprVar10 = (zpr) zpqVar.b;
                zprVar10.b |= 2;
                zprVar10.d = "Unknown native thread";
            }
            zgu zguVarD = zfpVar.d();
            if (zguVarD != null) {
                if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpqVar.y();
                }
                String str2 = zguVarD.b;
                zpr zprVar11 = (zpr) zpqVar.b;
                zprVar11.b |= 256;
                zprVar11.j = str2;
            } else {
                String string = zfpVar.e().toString();
                if ((zpqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpqVar.y();
                }
                zpr zprVar12 = (zpr) zpqVar.b;
                string.getClass();
                zprVar12.b |= 256;
                zprVar12.j = string;
            }
            zprVar = (zpr) zpqVar.v();
            i2 = Integer.MIN_VALUE;
        } else {
            zgu zguVarD2 = zfpVar.d();
            if (zguVarD2 != null) {
                name = zguVarD2.b;
            } else {
                Object objE = zfpVar.e();
                name = objE instanceof String ? (String) objE : objE != null ? objE.getClass().getName() : "null";
            }
            Throwable th = i == 2 ? (Throwable) a(zfpVar, zed.a) : null;
            zei zeiVarB = zfpVar.b();
            Level levelG = zfpVar.g();
            String strB2 = zeiVarB.b();
            String strE2 = zeiVarB.e();
            int iA2 = zeiVarB.a();
            zpr zprVar13 = zpr.a;
            zpq zpqVar2 = new zpq();
            zpp zppVar2 = c;
            if ((zpqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar2.y();
            }
            zpr zprVar14 = (zpr) zpqVar2.b;
            zppVar2.getClass();
            zprVar14.c = zppVar2;
            zprVar14.b |= 1;
            String name2 = Thread.currentThread().getName();
            if ((zpqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar2.y();
            }
            zpr zprVar15 = (zpr) zpqVar2.b;
            name2.getClass();
            i2 = Integer.MIN_VALUE;
            zprVar15.b |= 2;
            zprVar15.d = name2;
            int iIntValue2 = levelG.intValue();
            if ((zpqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar2.y();
            }
            zpr zprVar16 = (zpr) zpqVar2.b;
            zprVar16.b |= 4;
            zprVar16.e = iIntValue2;
            if ((zpqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar2.y();
            }
            zpr zprVar17 = (zpr) zpqVar2.b;
            strB2.getClass();
            zprVar17.b |= 8;
            zprVar17.f = strB2;
            if ((zpqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar2.y();
            }
            zpr zprVar18 = (zpr) zpqVar2.b;
            strE2.getClass();
            zprVar18.b |= 16;
            zprVar18.g = strE2;
            if ((zpqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpqVar2.y();
            }
            zpr zprVar19 = (zpr) zpqVar2.b;
            zprVar19.b |= 32;
            zprVar19.h = iA2;
            if (name != null) {
                if ((zpqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpqVar2.y();
                }
                zpr zprVar20 = (zpr) zpqVar2.b;
                zprVar20.b |= 256;
                zprVar20.j = name;
            }
            if (th != null) {
                zpw zpwVarA = ((aawr) aawvVar).c ? zsx.a(th, false) : zsx.c(th);
                if ((zpqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zpqVar2.y();
                }
                zpr zprVar21 = (zpr) zpqVar2.b;
                zqb zqbVar = (zqb) zpwVarA.v();
                zqbVar.getClass();
                zprVar21.k = zqbVar;
                zprVar21.b |= 1024;
            }
            zprVar = (zpr) zpqVar2.v();
        }
        aaxv aaxvVarC = zfpVar.d() != null ? c(zprVar, i, aawvVar, zfpVar.i()) : c(zprVar, i, aawvVar, new Object[0]);
        if (i == 2 && ((aawr) aawvVar).a && (ahquVar = (ahqu) a(zfpVar, aawy.b)) != null) {
            if ((aaxvVarC.b.memoizedSerializedSize & i2) == 0) {
                aaxvVarC.y();
            }
            aaxz aaxzVar = (aaxz) aaxvVarC.b;
            aaxz aaxzVar2 = aaxz.a;
            aaxzVar.e = ahquVar;
            aaxzVar.b |= 4;
        }
        return aaxvVarC;
    }
}
