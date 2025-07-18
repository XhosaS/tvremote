package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.widget.EdgeEffect;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.FocusableElement;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hu {
    public static final void A(ahw ahwVar, int i, int i2) {
        chb chbVar = ahwVar.c;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        ht.p(ahwVar, iMin, iMax);
        if (chbVar != null) {
            long jO = ht.o(chbVar.b, iMin, iMax, 0);
            if (chb.g(jO)) {
                ahwVar.d();
            } else {
                ahwVar.f(chb.d(jO), chb.c(jO), null);
            }
        }
    }

    public static final void B(ahw ahwVar, int i, int i2, CharSequence charSequence) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == ahwVar.a.a(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (iMax > i4 && length > i3) {
            int i5 = length - 1;
            int i6 = iMax - 1;
            if (charSequence.charAt(i5) != ahwVar.a.a(i6)) {
                break;
            }
            length = i5;
            iMax = i6;
        }
        if (i4 == iMax && i3 == length) {
            ahwVar.d();
            ahwVar.c();
        } else {
            ahwVar.e(i4, iMax, charSequence.subSequence(i3, length));
        }
        int length2 = iMin + charSequence.length();
        long jN = ccf.N(length2, length2);
        long j = chb.a;
        ahwVar.g(jN);
    }

    public static final void C(aix aixVar, int i, int i2) {
        aixVar.a(new ym(aixVar, i, i2, 3));
    }

    public static final boolean D(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }

    public static final int E(cgh cghVar, long j, cds cdsVar) {
        float fA = cdsVar != null ? cdsVar.a() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = cghVar.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= cghVar.b(iE) - fA && Float.intBitsToFloat(i) <= cghVar.a(iE) + fA) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-fA)) {
                if (Float.intBitsToFloat(i2) <= cghVar.d + fA) {
                    return iE;
                }
            }
        }
        return -1;
    }

    public static final long F(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final boolean G(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean H(int i) {
        int type;
        return (!G(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final int I(akb akbVar, HandwritingGesture handwritingGesture) {
        aid aidVar = akbVar.a;
        ahu ahuVar = akbVar.b;
        aidVar.a.b().c();
        ahw ahwVar = aidVar.a;
        ahwVar.c();
        akbVar.m(ahwVar);
        aid.h(aidVar, true, 1);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        akb.o(akbVar, fallbackText, true, 0, false, 12);
        return 5;
    }

    public static final void J(akb akbVar, long j, int i) {
        if (chb.g(j)) {
            aid aidVar = akbVar.a;
            ahu ahuVar = akbVar.b;
            aidVar.a.b().c();
            ahw ahwVar = aidVar.a;
            ahwVar.c();
            akbVar.m(ahwVar);
            aid.h(aidVar, true, 1);
            return;
        }
        long jB = akbVar.b(j);
        aid aidVar2 = akbVar.a;
        aidVar2.a.b().c();
        ahw ahwVar2 = aidVar2.a;
        int iE = chb.e(jB);
        int iA = chb.a(jB);
        if (iE >= iA) {
            throw new IllegalArgumentException(a.ce(iA, iE, "Do not set reversed or empty range: ", " > "));
        }
        ahwVar2.e = new yfw(new aie(i), new chb(ccf.N(ykn.l(iE, 0, ahwVar2.a()), ykn.l(iA, 0, ahwVar2.a()))));
        aid.h(aidVar2, true, 1);
    }

    public static final void K(akb akbVar, long j, boolean z) {
        if (z) {
            ahx ahxVarE = akbVar.e();
            int iE = chb.e(j);
            int iA = chb.a(j);
            int iCodePointBefore = iE > 0 ? Character.codePointBefore(ahxVarE, iE) : 10;
            int iCodePointAt = iA < ahxVarE.a() ? Character.codePointAt(ahxVarE, iA) : 10;
            if (H(iCodePointBefore) && (G(iCodePointAt) || a.aw(iCodePointAt))) {
                do {
                    iE -= Character.charCount(iCodePointBefore);
                    if (iE == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(ahxVarE, iE);
                    }
                } while (H(iCodePointBefore));
                j = ccf.N(iE, iA);
            } else if (H(iCodePointAt) && (G(iCodePointBefore) || a.aw(iCodePointBefore))) {
                do {
                    iA += Character.charCount(iCodePointAt);
                    if (iA == ahxVarE.a()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(ahxVarE, iA);
                    }
                } while (H(iCodePointAt));
                j = ccf.N(iE, iA);
            }
        }
        akb.n(akbVar, "", j, false, 12);
    }

    public static final int L(int i) {
        return i != 1 ? 0 : 1;
    }

    public static final boolean M(int i) {
        return (i & 1) == 1;
    }

    public static final boolean N(alj aljVar) {
        String str = aljVar.d;
        return yks.e(str, "\n") || yks.e(str, "\r\n");
    }

    public static final aid O(final String str, final long j, bao baoVar, int i, int i2) {
        final int i3 = 1;
        if (1 == (i2 & 1)) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            int length = str.length();
            j = ccf.N(length, length);
            long j2 = chb.a;
        }
        int i4 = (i & 14) ^ 6;
        Object[] objArr = new Object[0];
        ali aliVar = ali.a;
        boolean zE = baoVar.E(j) | ((i4 > 4 && baoVar.F(str)) || (i & 6) == 4);
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (zE || objT == ban.a) {
            objT = new yjk() { // from class: ckv
                @Override // defpackage.yjk
                public final Object a() {
                    if (i3 == 0) {
                        throw null;
                    }
                    bhi bhiVar = new bhi((byte[]) null, (short[]) null);
                    return new aid((String) str, j, bhiVar);
                }
            };
            basVar.ae(objT);
        }
        return (aid) bga.m(objArr, aliVar, (yjk) objT, baoVar, 48);
    }

    public static final List P(chb chbVar, bfz bfzVar) {
        if (bfzVar != null && bfzVar.b != 0) {
            return yfm.al(bfzVar.f());
        }
        if (chbVar != null) {
            long j = chbVar.b;
            if (!chb.g(j)) {
                return yfm.p(new cfx(new cgs(0L, (cji) null, (cje) null, (cjf) null, (ciy) null, 0L, (cld) null, 0L, cll.b, 61439), chb.d(j), chb.c(j)));
            }
        }
        return yhb.a;
    }

    public static final int Q(lhr lhrVar, long j, cds cdsVar) {
        bvc bvcVarK;
        long jM;
        cgh cghVar;
        int iE;
        cgz cgzVarL = lhrVar.l();
        if (cgzVarL == null || (bvcVarK = lhrVar.k()) == null || (iE = E((cghVar = cgzVarL.b), (jM = bvcVarK.m(j)), cdsVar)) == -1) {
            return -1;
        }
        return cghVar.f(bmx.e(jM, (cghVar.b(iE) + cghVar.a(iE)) / 2.0f, 1));
    }

    public static final long R(lhr lhrVar, bmy bmyVar, int i, cgx cgxVar) {
        cgz cgzVarL = lhrVar.l();
        cgh cghVar = cgzVarL != null ? cgzVarL.b : null;
        bvc bvcVarK = lhrVar.k();
        return (cghVar == null || bvcVarK == null) ? chb.a : cghVar.g(bmyVar.i(bvcVarK.m(0L)), i, cgxVar);
    }

    public static final long S(lhr lhrVar, bmy bmyVar, bmy bmyVar2, int i, cgx cgxVar) {
        long jR = R(lhrVar, bmyVar, i, cgxVar);
        if (chb.g(jR)) {
            return chb.a;
        }
        long jR2 = R(lhrVar, bmyVar2, i, cgxVar);
        if (chb.g(jR2)) {
            return chb.a;
        }
        return ccf.N(Math.min(chb.e(jR), chb.e(jR)), Math.max(chb.a(jR2), chb.a(jR2)));
    }

    public static final void T(bhi bhiVar, ahx ahxVar, ahx ahxVar2, aio aioVar, boolean z) {
        if (aioVar.a() > 1) {
            bhiVar.l(new alj(0, ahxVar.toString(), ahxVar2.toString(), ahxVar.d, ahxVar2.d, 0L, false, 32));
        } else if (aioVar.a() == 1) {
            ain ainVar = (ain) aioVar.a.a[0];
            long jN = ccf.N(ainVar.c, ainVar.d);
            long j = chb.a;
            ain ainVar2 = (ain) aioVar.a.a[0];
            long jN2 = ccf.N(ainVar2.a, ainVar2.b);
            if (chb.g(jN) && chb.g(jN2)) {
                return;
            }
            bhiVar.l(new alj(chb.d(jN), ccf.O(ahxVar, jN), ccf.O(ahxVar2, jN2), ahxVar.d, ahxVar2.d, 0L, z, 32));
        }
    }

    private static final float U(long j, bmy bmyVar) {
        if (kv.L(bmyVar, j)) {
            return 0.0f;
        }
        float fB = bmx.b(a.at(bmyVar.f(), j));
        if (fB >= Float.MAX_VALUE) {
            fB = Float.MAX_VALUE;
        }
        float f = bmyVar.d;
        float fB2 = bmx.b(a.at((Float.floatToRawIntBits(bmyVar.c) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), j));
        if (fB2 < fB) {
            fB = fB2;
        }
        float fB3 = bmx.b(a.at(bmyVar.b(), j));
        if (fB3 < fB) {
            fB = fB3;
        }
        float fB4 = bmx.b(a.at(bmyVar.c(), j));
        return fB4 < fB ? fB4 : fB;
    }

    static BiometricPrompt.Builder a(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    static BiometricPrompt b(BiometricPrompt.Builder builder) {
        return builder.build();
    }

    static void c(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    static void d(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static boolean i(int i) {
        return (i & 32768) != 0;
    }

    public static boolean j(int i) {
        int i2 = i & (-65537);
        if (i2 != 15 && i2 != 255) {
            return i2 != 32768 ? i2 != 32783 ? i2 == 33023 || i2 == 0 : Build.VERSION.SDK_INT < 28 || Build.VERSION.SDK_INT > 29 : Build.VERSION.SDK_INT >= 30;
        }
        return true;
    }

    public static boolean k(int i) {
        return (i & 255) == 255;
    }

    public static boolean l(Context context) {
        KeyguardManager keyguardManagerM = m(context);
        if (keyguardManagerM == null) {
            return false;
        }
        return keyguardManagerM.isDeviceSecure();
    }

    public static KeyguardManager m(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static final float o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
            }
        }
        return 0.0f;
    }

    public static final void p(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static final float q(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT < 31) {
            edgeEffect.onPull(f, f2);
            return f;
        }
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static final void r(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof rh)) {
            edgeEffect.onRelease();
            return;
        }
        rh rhVar = (rh) edgeEffect;
        float f2 = rhVar.b + f;
        rhVar.b = f2;
        if (Math.abs(f2) > rhVar.a) {
            rhVar.onRelease();
        }
    }

    public static final float s(EdgeEffect edgeEffect, float f, float f2, clx clxVar) {
        float f3 = rd.a;
        float fA = clxVar.a() * 386.0878f;
        double d = rd.a * fA * 160.0f * 0.84f;
        if (((float) (d * Math.exp((rd.b / rd.c) * Math.log((Math.abs(f) * 0.35f) / d)))) > o(edgeEffect) * f2) {
            return 0.0f;
        }
        p(edgeEffect, yln.v(f));
        return f;
    }

    public static final boolean t(KeyEvent keyEvent) {
        long jB = brx.b(keyEvent);
        return a.s(jB, brv.h) || a.s(jB, brv.k) || a.s(jB, brv.q) || a.s(jB, brv.j);
    }

    public static /* synthetic */ bkp u(bkp bkpVar, boolean z, String str, yjk yjkVar, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return bkpVar.a(new ClickableElement(null, null, true, 1 == ((z ? 1 : 0) | (i & 1)), str, null, yjkVar));
    }

    public static final bkp v(bkp bkpVar, boolean z, kw kwVar) {
        return bkpVar.a(z ? new FocusableElement(kwVar) : bkp.g);
    }

    public static /* synthetic */ bkp w(bkp bkpVar, kw kwVar, rn rnVar, boolean z, cez cezVar, yjk yjkVar, int i) {
        boolean z2 = z | (!((i & 4) == 0));
        if ((i & 16) != 0) {
            cezVar = null;
        }
        return x(bkpVar, kwVar, rnVar, z2, cezVar, yjkVar);
    }

    public static final bkp x(bkp bkpVar, kw kwVar, rn rnVar, boolean z, cez cezVar, yjk yjkVar) {
        return bkpVar.a(rnVar instanceof rs ? new ClickableElement(kwVar, (rs) rnVar, false, z, null, cezVar, yjkVar) : rnVar == null ? new ClickableElement(kwVar, null, false, z, null, cezVar, yjkVar) : kwVar != null ? rp.a(bkp.g, kwVar, rnVar).a(new ClickableElement(kwVar, null, false, z, null, cezVar, yjkVar)) : bdi.E(bkp.g, new qu(rnVar, z, cezVar, yjkVar)));
    }

    public static final int y(long j, bmy bmyVar, bmy bmyVar2) {
        float fU = U(j, bmyVar);
        float fU2 = U(j, bmyVar2);
        if (fU == fU2) {
            return 0;
        }
        return fU < fU2 ? -1 : 1;
    }

    public static final boolean z(bmy bmyVar, float f, float f2) {
        if (f > bmyVar.d || bmyVar.b > f) {
            return false;
        }
        return f2 <= bmyVar.e && bmyVar.c <= f2;
    }
}
