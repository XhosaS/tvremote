package defpackage;

import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.compose.foundation.BackgroundElement;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureElement;
import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hq {
    public hq() {
    }

    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }

    public static ic e(bv bvVar, boolean z) {
        dxd activity = z ? bvVar.getActivity() : null;
        if (activity == null) {
            activity = bvVar.getParentFragment();
        }
        if (activity != null) {
            return (ic) new dxa(activity).a(ic.class);
        }
        throw new IllegalStateException("view model not found");
    }

    public static bkp f(bkp bkpVar, long j, bol bolVar) {
        return bkpVar.a(new BackgroundElement(j, null, bolVar, 2));
    }

    public static /* synthetic */ bkp g(bkp bkpVar, bnn bnnVar, bol bolVar, int i) {
        if ((i & 2) != 0) {
            bolVar = boh.a;
        }
        return bkpVar.a(new BackgroundElement(0L, bnnVar, bolVar, 1));
    }

    public static long i(pq pqVar) {
        return (pqVar.f() + pqVar.g()) * 1000000;
    }

    public static ne j(pn pnVar, ne neVar, ne neVar2, ne neVar3) {
        return pnVar.d(pnVar.a(neVar, neVar2, neVar3), neVar, neVar2, neVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(defpackage.rld r6, defpackage.cr r7) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq.k(rld, cr):void");
    }

    public static rld l(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!hu.j(i)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            int i2 = (-65537) & i;
            sb.append(i2 != 15 ? i2 != 255 ? i2 != 32768 ? i2 != 32783 ? i2 != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb.toString());
        }
        boolean zI = hu.i(i);
        if (TextUtils.isEmpty(charSequence3) && !zI) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty(charSequence3) || !zI) {
            return new rld(charSequence, charSequence2, charSequence3, i);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    public static boolean m(agj agjVar) {
        return agjVar == agn.b;
    }

    public static boolean n(cha chaVar) {
        return chaVar == null || chaVar.a == null;
    }

    public static boolean o(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static int p(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static int q(String str, int i) {
        dhg dhgVar = dhg.a;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static int r(String str, int i) {
        dhg dhgVar = dhg.a;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static int s(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int t(CharSequence charSequence, int i) {
        while (i > 0) {
            int i2 = i - 1;
            if (charSequence.charAt(i2) == '\n') {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public static void u(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            wv.c(a.cn(i2, i, "both minLines ", " and maxLines ", " must be greater than zero"));
        }
        if (i <= i2) {
            return;
        }
        wv.c("minLines 1 must be less than or equal to maxLines 0");
    }

    public static void v(alg algVar, boolean z, yjz yjzVar, bao baoVar, int i) {
        int i2;
        bkp textContextMenuGestureElement;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-579239002);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(algVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            baoVarD.x(1069749380);
            if (z) {
                baoVarD.x(1069793524);
                boolean zH = baoVarD.H(algVar);
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (zH || objT == ban.a) {
                    objT = new afm(algVar, (yih) null, 0);
                    basVar.ae(objT);
                }
                textContextMenuGestureElement = new TextContextMenuGestureElement((yjv) objT);
                basVar.aa();
            } else {
                baoVarD.x(1069962164);
                ((bas) baoVarD).aa();
                textContextMenuGestureElement = bkp.g;
            }
            ht.v(textContextMenuGestureElement, yjzVar, baoVarD, (i2 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            ((bas) baoVarD).aa();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aly(algVar, z, yjzVar, i, 1);
        }
    }

    public hq(byte[] bArr) {
    }

    public void b() {
    }

    public void d() {
    }

    public void c(CharSequence charSequence) {
    }
}
