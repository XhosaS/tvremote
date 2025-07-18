package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.support.v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.EdgeEffect;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class czu {
    public static float a(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        return (!(callback instanceof dac) || Build.VERSION.SDK_INT < 26) ? callback : ((dac) callback).a;
    }

    public static ActionMode.Callback e(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof dac) || callback == null) ? callback : new dac(callback, textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.cud f(android.widget.TextView r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            cud r0 = new cud
            android.text.PrecomputedText$Params r6 = defpackage.eo$$ExternalSyntheticApiModelOutline0.m(r6)
            r0.<init>(r6)
            return r0
        L10:
            android.text.TextPaint r0 = new android.text.TextPaint
            android.text.TextPaint r2 = r6.getPaint()
            r0.<init>(r2)
            int r2 = r6.getBreakStrategy()
            int r3 = r6.getHyphenationFrequency()
            android.text.method.TransformationMethod r4 = r6.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            if (r4 == 0) goto L2c
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.LTR
            goto L7b
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 1
            if (r4 < r1) goto L5d
            int r1 = r6.getInputType()
            r1 = r1 & 15
            r4 = 3
            if (r1 != r4) goto L5d
            java.util.Locale r6 = r6.getTextLocale()
            android.icu.text.DecimalFormatSymbols r6 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r6)
            java.lang.String[] r6 = defpackage.eo$$ExternalSyntheticApiModelOutline0.m(r6)
            r1 = 0
            r6 = r6[r1]
            int r6 = r6.codePointAt(r1)
            byte r6 = java.lang.Character.getDirectionality(r6)
            if (r6 == r5) goto L5a
            r1 = 2
            if (r6 != r1) goto L57
            goto L5a
        L57:
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.LTR
            goto L7b
        L5a:
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.RTL
            goto L7b
        L5d:
            int r1 = r6.getLayoutDirection()
            int r6 = r6.getTextDirection()
            switch(r6) {
                case 2: goto L79;
                case 3: goto L76;
                case 4: goto L73;
                case 5: goto L70;
                case 6: goto L6d;
                case 7: goto L6a;
                default: goto L68;
            }
        L68:
            if (r1 != r5) goto L6d
        L6a:
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L7b
        L6d:
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L7b
        L70:
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.LOCALE
            goto L7b
        L73:
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.RTL
            goto L7b
        L76:
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.LTR
            goto L7b
        L79:
            android.text.TextDirectionHeuristic r6 = android.text.TextDirectionHeuristics.ANYRTL_LTR
        L7b:
            cud r1 = new cud
            r1.<init>(r0, r6, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czu.f(android.widget.TextView):cud");
    }

    public static void g(TextView textView, int i) {
        crl.j(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void h(TextView textView, int i) {
        crl.j(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void i(TextView textView, int i) {
        crl.j(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void j(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            textView.setLineHeight(i, f);
        } else {
            i(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void k(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        f(textView);
        throw null;
    }

    public static dxd l(yft yftVar) {
        return (dxd) yftVar.a();
    }

    public static boolean m(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] n(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void o(dwt dwtVar, ghc ghcVar, dve dveVar) throws NoSuchMethodException, SecurityException {
        ghcVar.getClass();
        dveVar.getClass();
        dwk dwkVar = (dwk) dwtVar.s("androidx.lifecycle.savedstate.vm.tag");
        if (dwkVar == null || dwkVar.b) {
            return;
        }
        dwkVar.b(ghcVar, dveVar);
        p(ghcVar, dveVar);
    }

    public static void p(ghc ghcVar, dve dveVar) throws NoSuchMethodException, SecurityException {
        dvd dvdVarA = dveVar.a();
        if (dvdVarA == dvd.b || dvdVarA.a(dvd.d)) {
            ghcVar.c(dva.class);
        } else {
            dveVar.c(new cvg(dveVar, ghcVar, 2));
        }
    }

    public static float q(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) (200.0f * f), 199);
        float f2 = f - (iMin * 0.005f);
        float f3 = fArr[iMin];
        return f3 + ((f2 / 0.005f) * (fArr[iMin + 1] - f3));
    }

    public static void r(String str, djh djhVar, due dueVar, int i, bao baoVar, int i2, int i3) {
        int i4;
        int i5 = i3 & 1;
        bao baoVarD = baoVar.d(-192911377);
        int i6 = 4;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != baoVarD.F(str) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.F(djhVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != baoVarD.F(dueVar) ? 128 : 256;
        }
        if (((i4 | 3072) & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                if (i7 != 0) {
                    djhVar = djh.b;
                }
                i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            } else {
                baoVarD.t();
            }
            baoVarD.m();
            baoVarD.y(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = dud.a;
                basVar.ae(objT);
            }
            basVar.aa();
            yjk yjkVar = (yjk) ((ymj) objT);
            baoVarD.y(-1115894518);
            baoVarD.y(1886828752);
            if (!(basVar.a instanceof dio)) {
                zy.n();
            }
            baoVarD.w();
            if (basVar.w) {
                baoVarD.k(new dji(yjkVar, 0));
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, str, new dsc(3));
            beb.a(baoVarD, djhVar, new dsc(i6));
            beb.a(baoVarD, dueVar, new dsc(5));
            dsc dscVar = new dsc(6);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, dscVar);
            }
            baoVarD.o();
            basVar.aa();
            basVar.aa();
        }
        djh djhVar2 = djhVar;
        int i8 = i;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new duc(str, djhVar2, dueVar, i8, i2, i3, 0);
        }
    }
}
