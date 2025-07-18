package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ht {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object A(defpackage.btq r7, defpackage.yih r8) {
        /*
            boolean r0 = r8 instanceof defpackage.agp
            if (r0 == 0) goto L13
            r0 = r8
            agp r0 = (defpackage.agp) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            agp r0 = new agp
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            btq r7 = r0.c
            defpackage.ybn.f(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r8)
        L34:
            r0.c = r7
            r0.b = r3
            java.lang.Object r8 = defpackage.bny.I(r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            bsr r8 = (defpackage.bsr) r8
            int r2 = r8.c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r2) goto L61
            java.lang.Object r6 = r8.get(r5)
            bsz r6 = (defpackage.bsz) r6
            boolean r6 = defpackage.bny.C(r6)
            if (r6 != 0) goto L5e
            goto L34
        L5e:
            int r5 = r5 + 1
            goto L4f
        L61:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht.A(btq, yih):java.lang.Object");
    }

    static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }

    public static String d(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", a.cf(i, "Unknown error code: "));
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static boolean e(Context context, String str, int i) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Context context, String str, int i) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return f(context, str, R.array.hide_fingerprint_instantly_prefixes);
    }

    public static void h(long j, uv uvVar) {
        if (uvVar == uv.a) {
            if (clv.a(j) != Integer.MAX_VALUE) {
                return;
            }
            wv.d("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else if (clv.b(j) == Integer.MAX_VALUE) {
            wv.d("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static void i(bkp bkpVar, yjv yjvVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-932836462);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            zy.k(bga.s(bkpVar, yjvVar), baoVarD);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(bkpVar, yjvVar, i, 0);
        }
    }

    public static qs j(long j) {
        return new qs(new bon(j));
    }

    public static long k(long j, float f) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public static bkp l(bkp bkpVar, float f, long j, bol bolVar) {
        return m(bkpVar, f, new bon(j), bolVar);
    }

    public static bkp m(bkp bkpVar, float f, bnn bnnVar, bol bolVar) {
        return bkpVar.a(new BorderModifierNodeElement(f, bnnVar, bolVar));
    }

    public static CharSequence n(ahx ahxVar) {
        long j = ahxVar.d;
        return ahxVar.subSequence(chb.d(j), chb.c(j));
    }

    public static long o(long j, int i, int i2, int i3) {
        int i4;
        int iD = chb.d(j);
        int iC = chb.c(j);
        if (iC < i) {
            return j;
        }
        if (iD > i || i2 > iC) {
            if (iD > i && iC < i2) {
                i += i3;
                iD = i;
            } else if (iD >= i2) {
                int i5 = i3 - (i2 - i);
                i = iC + i5;
                iD += i5;
            } else if (i < iD) {
                iD = i + i3;
                i4 = i3 - (i2 - i);
            }
            return ccf.N(iD, i);
        }
        i4 = i3 - (i2 - i);
        if (iD == iC) {
            iD += i4;
        }
        i = iC + i4;
        return ccf.N(iD, i);
    }

    public static void p(ahw ahwVar, int i, int i2) {
        ahwVar.e(i, i2, "");
    }

    public static void q(ahw ahwVar, int i, int i2) {
        long jN = ccf.N(ykn.l(i, 0, ahwVar.a()), ykn.l(i2, 0, ahwVar.a()));
        long j = chb.a;
        ahwVar.g(jN);
    }

    public static ahl r(ykc ykcVar, bao baoVar, int i) {
        int i2 = 6;
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !baoVar.F(ykcVar)) && (i & 6) != 4) {
            z = false;
        }
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (z || objT == ban.a) {
            objT = new ahl(ykcVar);
            basVar.ae(objT);
        }
        ahl ahlVar = (ahl) objT;
        boolean zF = baoVar.F(ahlVar);
        Object objT2 = basVar.T();
        if (zF || objT2 == ban.a) {
            objT2 = new agt(ahlVar, i2);
            basVar.ae(objT2);
        }
        bbn.c(ahlVar, (yjv) objT2, baoVar);
        return ahlVar;
    }

    public static void s(bkp bkpVar, bcp bcpVar, ykc ykcVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-714464401);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bcpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(ykcVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (baoVarD.L((i2 & 1171) != 1170, i2 & 1)) {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                bci bciVar = new bci(null, bcz.b);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            ahl ahlVarR = r(ykcVar, baoVarD, (i2 >> 6) & 14);
            bcm.i(bcpVar.c(ahlVarR), bga.k(274270255, new awe(bkpVar, (bcb) objT, yjzVar, ahlVarR, 1), baoVarD), baoVarD, 56);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(bkpVar, bcpVar, ykcVar, yjzVar, i, 0);
        }
    }

    public static agk t(bxv bxvVar) {
        bhi bhiVar = new bhi((char[]) null, (byte[]) null);
        cbp.I(bxvVar, ahe.a, new agt(new agt(bhiVar, 5), 4));
        kc kcVar = new kc((byte[]) null);
        kc kcVar2 = (kc) bhiVar.a;
        Object[] objArr = kcVar2.a;
        int i = kcVar2.b;
        agj agjVar = null;
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            agj agjVar2 = (agj) objArr[i2];
            if (z && agjVar2 == agn.b) {
                z = true;
            } else {
                if (hq.m(agjVar2) && hq.m(agjVar)) {
                    z = false;
                    break;
                    break;
                }
                if (!hq.m(agjVar2)) {
                    kc kcVar3 = (kc) bhiVar.b;
                    Object[] objArr2 = kcVar3.a;
                    int i3 = kcVar3.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (!((Boolean) ((yjv) objArr2[i4]).a(agjVar2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                kcVar.p(agjVar2);
                z = false;
                agjVar = agjVar2;
            }
        }
        if (hq.m((agj) (kcVar.f() ? null : kcVar.a[kcVar.b - 1]))) {
            kcVar.h(kcVar.b - 1);
        }
        return new agk(kcVar.j());
    }

    public static void u(bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(790527681);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(null, bcz.b);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new afi(bcbVar, 8);
                basVar.ae(objT2);
            }
            yjk yjkVar = (yjk) objT2;
            ahl ahlVarR = r(agv.b, baoVarD, 6);
            bcm.j(new bcq[]{ahp.b.c(y(yjkVar, baoVarD)), ahp.a.c(ahlVarR)}, bga.k(1070596993, new asl(bkpVar, bcbVar, yjzVar, ahlVarR, yjkVar, 1), baoVarD), baoVarD, 56);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(bkpVar, yjzVar, i, 9);
        }
    }

    public static void v(bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(155925518);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            boolean z = baoVarD.f(ahp.a) != null;
            boolean z2 = baoVarD.f(ahp.b) != null;
            if (z && z2) {
                baoVarD.x(-1977156178);
                bvt bvtVarA = xo.a(bkb.a, true);
                int iK = a.k(zy.p(baoVarD));
                bas basVar = (bas) baoVarD;
                bhu bhuVarAi = basVar.ai();
                bkp bkpVarC = bdi.C(baoVarD, bkpVar);
                yjk yjkVar = bxt.a;
                baoVarD.z();
                if (basVar.w) {
                    baoVarD.k(yjkVar);
                } else {
                    baoVarD.B();
                }
                beb.a(baoVarD, bvtVarA, bxt.d);
                beb.a(baoVarD, bhuVarAi, bxt.c);
                yjz yjzVar2 = bxt.e;
                if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                    Integer numValueOf = Integer.valueOf(iK);
                    basVar.ae(numValueOf);
                    baoVarD.i(numValueOf, yjzVar2);
                }
                beb.a(baoVarD, bkpVarC, bxt.b);
                yjzVar.a(baoVarD, Integer.valueOf((i2 >> 3) & 14));
                baoVarD.o();
                basVar.aa();
            } else {
                int i4 = (i2 & 14) | (i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                if (z) {
                    baoVarD.x(-1976965962);
                    x(bkpVar, yjzVar, baoVarD, i4);
                    ((bas) baoVarD).aa();
                } else if (z2) {
                    baoVarD.x(-1976815178);
                    agy.d(bkpVar, yjzVar, baoVarD, i4);
                    ((bas) baoVarD).aa();
                } else {
                    baoVarD.x(-1976684761);
                    u(bkpVar, yjzVar, baoVarD, i4);
                    ((bas) baoVarD).aa();
                }
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(bkpVar, yjzVar, i, 10);
        }
    }

    public static void w(bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(771959668);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        int i4 = 6;
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(null, bcz.b);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new afi(bcbVar, i4);
                basVar.ae(objT2);
            }
            bcm.i(ahp.b.c(y((yjk) objT2, baoVarD)), bga.k(-291176396, new ano(bkpVar, bcbVar, yjzVar, 1), baoVarD), baoVarD, 56);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(bkpVar, yjzVar, i, 6);
        }
    }

    public static void x(bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(2064964257);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            w(bkpVar, yjzVar, baoVarD, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(bkpVar, yjzVar, i, 5);
        }
    }

    public static aho y(yjk yjkVar, bao baoVar) {
        View view = (View) baoVar.f(AndroidCompositionLocals_androidKt.f);
        boolean zF = baoVar.F(view);
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (zF || objT == ban.a) {
            objT = new ags(view, yjkVar);
            basVar.ae(objT);
        }
        ags agsVar = (ags) objT;
        boolean zH = baoVar.H(agsVar);
        Object objT2 = basVar.T();
        if (zH || objT2 == ban.a) {
            objT2 = new agt(agsVar, 1);
            basVar.ae(objT2);
        }
        bbn.c(agsVar, (yjv) objT2, baoVar);
        return agsVar;
    }

    public static /* synthetic */ void z(ago agoVar, ahn ahnVar, yjk yjkVar, bao baoVar, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVar.F(agoVar) : baoVar.H(agoVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVar.F(ahnVar) : baoVar.H(ahnVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVar.H(yjkVar) ? 128 : 256;
        }
        if (baoVar.L((i2 & 1171) != 1170, i2 & 1)) {
            agy.c(agoVar, ahnVar, yjkVar, baoVar, i2 & 1022);
        } else {
            baoVar.t();
        }
    }

    public void c() {
    }

    public void B(zuw zuwVar) {
    }

    public void b(int i, CharSequence charSequence) {
    }
}
