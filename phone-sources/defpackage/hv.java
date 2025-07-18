package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.biometrics.BiometricPrompt;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hv {
    static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }

    public static final float c(ii iiVar) {
        return ((ij) iiVar.a).b;
    }

    public static final float d(ii iiVar) {
        return ((ij) iiVar.a).a;
    }

    public static final void e(ii iiVar) {
        if (!iiVar.c()) {
            iiVar.a(0, 0, 0, 0);
            return;
        }
        float fC = c(iiVar);
        float fD = d(iiVar);
        int iCeil = (int) Math.ceil(ik.a(fC, fD, iiVar.b()));
        int iCeil2 = (int) Math.ceil(ik.b(fC, fD, iiVar.b()));
        iiVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static boolean f(Context context) {
        return (context == null || context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(final defpackage.bqh r15, final java.lang.String r16, defpackage.bkp r17, defpackage.bkd r18, defpackage.buo r19, float r20, defpackage.bao r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv.g(bqh, java.lang.String, bkp, bkd, buo, float, bao, int, int):void");
    }

    public static final long i(long j) {
        return ccf.N(chb.a(j), chb.e(j));
    }

    public static /* synthetic */ String j(int i) {
        return i != 1 ? "End" : "Start";
    }

    public static final void k(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof ahx) {
            k(((ahx) charSequence).c, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    public static final long l(long j, bmy bmyVar) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = bmyVar.b;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            fIntBitsToFloat2 = bmyVar.d;
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        float fIntBitsToFloat3 = bmyVar.c;
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= fIntBitsToFloat3) {
            fIntBitsToFloat3 = bmyVar.e;
            if (Float.intBitsToFloat(i2) <= fIntBitsToFloat3) {
                fIntBitsToFloat3 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat3));
    }

    public static final boolean m(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final boolean n(KeyEvent keyEvent, int i) {
        return ((int) (brx.b(keyEvent) >> 32)) == i;
    }

    public static final long o(long j, ira iraVar, ajc ajcVar) {
        long jN;
        long jN2;
        boolean zG = chb.g(j);
        long jI = iraVar.i(chb.e(j));
        long jI2 = zG ? jI : iraVar.i(chb.a(j));
        int i = 0;
        int i2 = ajcVar != null ? ajcVar.a : 0;
        if (chb.g(j)) {
            i = i2;
        } else if (ajcVar != null) {
            i = ajcVar.b;
        }
        if (i2 != 0 && !chb.g(jI)) {
            if (i2 - 1 != 0) {
                int iA = chb.a(jI);
                jN2 = ccf.N(iA, iA);
            } else {
                int iE = chb.e(jI);
                jN2 = ccf.N(iE, iE);
            }
            jI = jN2;
        }
        if (i != 0 && !chb.g(jI2)) {
            if (i - 1 != 0) {
                int iA2 = chb.a(jI2);
                jN = ccf.N(iA2, iA2);
            } else {
                int iE2 = chb.e(jI2);
                jN = ccf.N(iE2, iE2);
            }
            jI2 = jN;
        }
        int iMin = Math.min(chb.d(jI), chb.d(jI2));
        int iMax = Math.max(chb.c(jI), chb.c(jI2));
        return chb.h(j) ? ccf.N(iMax, iMin) : ccf.N(iMin, iMax);
    }

    public static final long p(akb akbVar, alg algVar, lhr lhrVar, long j) {
        int iE;
        long jA = algVar.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L || akbVar.e().a() == 0) {
            return 9205357640488583168L;
        }
        long j2 = akbVar.e().d;
        afo afoVarC = algVar.c();
        if (afoVarC == null) {
            return 9205357640488583168L;
        }
        int iOrdinal = afoVarC.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            iE = chb.e(j2);
        } else {
            if (iOrdinal != 2) {
                throw new yfu();
            }
            iE = chb.a(j2);
        }
        cgz cgzVarL = lhrVar.l();
        if (cgzVarL == null) {
            return 9205357640488583168L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        int iG = cgzVarL.g(iE);
        float fB = cgzVarL.b(iG);
        float fC = cgzVarL.c(iG);
        float fI = ykn.i(fIntBitsToFloat, Math.min(fB, fC), Math.max(fB, fC));
        if (!a.s(j, 0L) && Math.abs(fIntBitsToFloat - fI) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        float fD = cgzVarL.d(iG);
        float fA = ((cgzVarL.a(iG) - fD) / 2.0f) + fD;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fI);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fA);
        bvc bvcVarK = lhrVar.k();
        long jL = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
        bmx bmxVar = null;
        if (bvcVarK != null) {
            if (true != bvcVarK.s()) {
                bvcVarK = null;
            }
            if (bvcVarK != null) {
                jL = l(jL, kv.K(bvcVarK));
            }
        }
        bvc bvcVarK2 = lhrVar.k();
        if (bvcVarK2 == null) {
            return jL;
        }
        if (true != bvcVarK2.s()) {
            bvcVarK2 = null;
        }
        if (bvcVarK2 == null) {
            return jL;
        }
        bvc bvcVarI = lhrVar.i();
        if (bvcVarI != null) {
            if (true != bvcVarI.s()) {
                bvcVarI = null;
            }
            if (bvcVarI != null) {
                bmxVar = new bmx(bvcVarI.i(bvcVarK2, jL));
            }
        }
        return bmxVar != null ? bmxVar.a : jL;
    }

    public static final long q(lhr lhrVar, long j) {
        bmx bmxVar;
        bvc bvcVarK = lhrVar.k();
        if (bvcVarK != null) {
            bvc bvcVarJ = lhrVar.j();
            if (bvcVarJ != null) {
                bmxVar = new bmx((bvcVarK.s() && bvcVarJ.s()) ? bvcVarK.i(bvcVarJ, j) : j);
            } else {
                bmxVar = null;
            }
            if (bmxVar != null) {
                return bmxVar.a;
            }
        }
        return j;
    }

    public static final void r(bhi bhiVar, Resources resources, alg algVar, aga agaVar, boolean z, alh alhVar, yjk yjkVar, yjk yjkVar2) {
        nw nwVar = new nw(yjkVar2, yjkVar, algVar, alhVar, 5);
        if (z) {
            ((kc) bhiVar.a).p(new agl(agaVar.f, resources.getString(agaVar.g), agaVar.h, nwVar));
        }
    }

    public static final void s(bhi bhiVar, yow yowVar, Resources resources, alg algVar, aga agaVar, boolean z, yjv yjvVar) {
        t(bhiVar, resources, algVar, agaVar, z, new qm(yowVar, yjvVar, 14, null));
    }

    public static /* synthetic */ void t(bhi bhiVar, Resources resources, alg algVar, aga agaVar, boolean z, yjk yjkVar) {
        r(bhiVar, resources, algVar, agaVar, z, alh.a, null, yjkVar);
    }
}
