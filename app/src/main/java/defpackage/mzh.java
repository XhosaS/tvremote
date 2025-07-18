package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mzh {
    public static final /* synthetic */ int b = 0;
    private static final String[] c = {" "};
    private static final CharSequence[] d = {" "};
    static final oap a = ogj.a;

    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, ndo ndoVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        e(builderObtain, ndoVar, alignment);
        return builderObtain.build();
    }

    public static TextPaint b(CharSequence charSequence, Resources resources, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        int i = myf.a;
        textPaint.setTextSize(myf.f(charSequence2, myf.f(charSequence, myf.b(TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics())))));
        Typeface typefaceC = Typeface.DEFAULT;
        int iA = myf.a(resources);
        if (iA > 0) {
            typefaceC = iA == 300 ? Typeface.DEFAULT_BOLD : myf.c(resources, Typeface.DEFAULT);
        }
        textPaint.setTypeface(typefaceC);
        return textPaint;
    }

    public static ndt c(ndo ndoVar) {
        for (int i = 0; i < ndoVar.l(); i++) {
            nep nepVarR = ndoVar.r(i);
            if (nepVarR.t()) {
                ndt ndtVarO = nepVarR.o();
                if (ndtVarO.l()) {
                    ndw ndwVarI = ndtVarO.i();
                    int iH = ndwVarI.h();
                    if (iH <= ndwVarI.g() || iH > 0) {
                        return ndtVarO;
                    }
                } else if (ndtVarO.k()) {
                    if (ndtVarO.h().h() > 0) {
                        return ndtVarO;
                    }
                } else if (ndtVarO.j()) {
                    ndu nduVarG = ndtVarO.g();
                    if (nduVarG.j() == nduVarG.h() && nduVarG.j() > 0) {
                        return ndtVarO;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public static CharSequence d(int i, StaticLayout staticLayout, CharSequence charSequence, CharSequence charSequence2, TextPaint textPaint, ndo ndoVar, Layout.Alignment alignment) {
        int lineCount = staticLayout.getLineCount();
        if (i <= 0 || lineCount <= i || charSequence.length() <= 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        if (spannableString.length() > 0) {
            spannableString.setSpan(new elc(), 0, spannableString.length(), 18);
        }
        CharSequence charSequenceReplace = spannableString;
        while (TextUtils.indexOf(charSequenceReplace, " ") >= 0) {
            charSequenceReplace = TextUtils.replace(charSequenceReplace, c, d);
        }
        if (i == 1 && ndoVar.x()) {
            int iC = ndoVar.C() - 1;
            if (iC == 3) {
                int length = charSequence.length();
                int lineStart = staticLayout.getLineStart(lineCount - 2);
                return new SpannableString(TextUtils.concat(charSequenceReplace, charSequence.subSequence(i((lineStart + length) / 2, lineStart, length, charSequence, charSequenceReplace, textPaint, staticLayout.getWidth(), ndoVar, alignment), length)));
            }
            if (iC == 5) {
                int iMin = Math.min(charSequence.subSequence(0, staticLayout.getLineEnd(1)).length(), charSequence.subSequence(staticLayout.getLineStart(lineCount - 2), charSequence.length()).length());
                int iJ = j(iMin / 2, 0, iMin, charSequence, charSequenceReplace, textPaint, staticLayout.getWidth(), ndoVar, alignment);
                return new SpannableString(TextUtils.concat(charSequence.subSequence(0, iJ), charSequenceReplace, charSequence.subSequence(charSequence.length() - iJ, charSequence.length())));
            }
        }
        int lineEnd = staticLayout.getLineEnd(lineCount > i ? i : i - 1);
        int lineStart2 = staticLayout.getLineStart(i - 1);
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, h((lineStart2 + lineEnd) / 2, lineStart2, lineEnd, charSequence, charSequenceReplace, textPaint, staticLayout.getWidth(), ndoVar, alignment, i));
        while (charSequenceSubSequence.length() > 0 && Character.isWhitespace(charSequenceSubSequence.charAt(charSequenceSubSequence.length() - 1)) && charSequenceSubSequence.length() - 1 > lineStart2) {
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
        }
        SpannableString spannableString2 = new SpannableString(TextUtils.concat(charSequenceSubSequence, charSequenceReplace));
        myf.e(spannableString2, charSequenceReplace, ClickableSpan.class);
        myf.e(spannableString2, charSequenceReplace, ForegroundColorSpan.class);
        myf.e(spannableString2, charSequenceReplace, AbsoluteSizeSpan.class);
        myf.e(spannableString2, charSequenceReplace, UnderlineSpan.class);
        return spannableString2;
    }

    static void e(StaticLayout.Builder builder, ndo ndoVar, Layout.Alignment alignment) {
        builder.setUseLineSpacingFromFallbacks(true);
        builder.setAlignment(alignment).setEllipsize(null);
        if (ndoVar.z()) {
            builder.setLineSpacing(ndoVar.g(), 1.0f);
        }
        if (ndoVar.v()) {
            builder.setIncludePad(ndoVar.t());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void f(android.content.res.Resources r1, defpackage.mxx r2, java.lang.CharSequence r3, defpackage.nmt r4, float r5, float r6, float r7, java.lang.Integer r8, boolean r9, java.lang.Boolean r10, defpackage.eny r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzh.f(android.content.res.Resources, mxx, java.lang.CharSequence, nmt, float, float, float, java.lang.Integer, boolean, java.lang.Boolean, eny):void");
    }

    public static CharSequence g(CharSequence charSequence, CharSequence charSequence2, ndo ndoVar, int i, int i2, Layout.Alignment alignment, StaticLayout staticLayout, TextPaint textPaint, final dru druVar, oaa oaaVar, ofy ofyVar, oco ocoVar, oal oalVar, Map map, obh obhVar, mrg mrgVar, boolean z, Set set, ndt ndtVar) {
        CharSequence charSequence3;
        TextPaint textPaint2;
        CharSequence charSequence4;
        ndo ndoVar2;
        Layout.Alignment alignment2;
        StaticLayout staticLayout2;
        int i3;
        final dru druVar2 = druVar;
        if (i <= 0 || staticLayout.getLineCount() <= i) {
            return charSequence2;
        }
        if (ndtVar.j()) {
            ndu nduVarG = ndtVar.g();
            StaticLayout staticLayoutA = staticLayout;
            TextPaint textPaintB = textPaint;
            int i4 = 0;
            CharSequence charSequence5 = charSequence2;
            while (i4 < nduVarG.j()) {
                int i5 = nduVarG.i(i4);
                int iG = nduVarG.g(i4);
                ndu nduVar = nduVarG;
                Context context = druVar2.a;
                int i6 = i4;
                CharSequence charSequenceL = myf.l(oalVar, context, ndoVar, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z, new obg() { // from class: mza
                    @Override // defpackage.obg
                    public final void a(int i7) {
                        int i8 = mzh.b;
                        mym.aA(druVar2, i7);
                    }
                }, set, iG);
                textPaintB = b(charSequenceL, context.getResources(), charSequence);
                staticLayoutA = a(charSequenceL, textPaintB, i2, alignment, ndoVar);
                if (staticLayoutA.getLineCount() <= i5) {
                    return charSequenceL;
                }
                i4 = i6 + 1;
                druVar2 = druVar;
                charSequence5 = charSequenceL;
                nduVarG = nduVar;
            }
            ndoVar2 = ndoVar;
            i3 = i;
            alignment2 = alignment;
            charSequence4 = charSequence;
            charSequence3 = charSequence5;
            staticLayout2 = staticLayoutA;
            textPaint2 = textPaintB;
        } else {
            ndo ndoVar3 = ndoVar;
            if (ndtVar.k()) {
                ndv ndvVarH = ndtVar.h();
                StaticLayout staticLayoutA2 = staticLayout;
                TextPaint textPaintB2 = textPaint;
                int i7 = 0;
                CharSequence charSequence6 = charSequence2;
                while (i7 < ndvVarH.h()) {
                    int iG2 = ndvVarH.g(i7);
                    ndv ndvVar = ndvVarH;
                    Context context2 = druVar.a;
                    ndo ndoVar4 = ndoVar3;
                    int i8 = i7;
                    CharSequence charSequenceL2 = myf.l(oalVar, context2, ndoVar4, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z, new obg() { // from class: mzb
                        @Override // defpackage.obg
                        public final void a(int i9) {
                            int i10 = mzh.b;
                            mym.aA(druVar, i9);
                        }
                    }, set, iG2);
                    ndoVar3 = ndoVar4;
                    textPaintB2 = b(charSequenceL2, context2.getResources(), charSequence);
                    staticLayoutA2 = a(charSequenceL2, textPaintB2, i2, alignment, ndoVar3);
                    if (staticLayoutA2.getLineCount() <= i) {
                        return charSequenceL2;
                    }
                    i7 = i8 + 1;
                    charSequence6 = charSequenceL2;
                    ndvVarH = ndvVar;
                }
                i3 = i;
                charSequence4 = charSequence;
                ndoVar2 = ndoVar3;
                charSequence3 = charSequence6;
                staticLayout2 = staticLayoutA2;
                textPaint2 = textPaintB2;
            } else {
                int i9 = i;
                if (ndtVar.l()) {
                    ndw ndwVarI = ndtVar.i();
                    StaticLayout staticLayoutA3 = staticLayout;
                    TextPaint textPaintB3 = textPaint;
                    int iG3 = ndwVarI.g();
                    CharSequence charSequence7 = charSequence2;
                    while (iG3 >= ndwVarI.h()) {
                        Context context3 = druVar.a;
                        ndo ndoVar5 = ndoVar3;
                        CharSequence charSequenceL3 = myf.l(oalVar, context3, ndoVar5, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z, new obg() { // from class: mzc
                            @Override // defpackage.obg
                            public final void a(int i10) {
                                int i11 = mzh.b;
                                mym.aA(druVar, i10);
                            }
                        }, set, iG3);
                        ndoVar3 = ndoVar5;
                        textPaintB3 = b(charSequenceL3, context3.getResources(), charSequence);
                        staticLayoutA3 = a(charSequenceL3, textPaintB3, i2, alignment, ndoVar3);
                        i9 = i;
                        if (staticLayoutA3.getLineCount() <= i9) {
                            return charSequenceL3;
                        }
                        iG3--;
                        charSequence7 = charSequenceL3;
                    }
                    charSequence4 = charSequence;
                    ndoVar2 = ndoVar3;
                    charSequence3 = charSequence7;
                    staticLayout2 = staticLayoutA3;
                    textPaint2 = textPaintB3;
                    i3 = i9;
                } else {
                    charSequence3 = charSequence2;
                    textPaint2 = textPaint;
                    charSequence4 = charSequence;
                    ndoVar2 = ndoVar3;
                    alignment2 = alignment;
                    staticLayout2 = staticLayout;
                    i3 = i9;
                }
            }
            alignment2 = alignment;
        }
        return d(i3, staticLayout2, charSequence3, charSequence4, textPaint2, ndoVar2, alignment2);
    }

    private static int h(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, TextPaint textPaint, int i4, ndo ndoVar, Layout.Alignment alignment, int i5) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
        if (charSequenceSubSequence.length() != 0) {
            StaticLayout staticLayoutA = a(TextUtils.concat(charSequenceSubSequence, charSequence2), textPaint, i4, alignment, ndoVar);
            if (i != i2 && i != i3) {
                return staticLayoutA.getLineCount() > i5 ? h((i2 + i) / 2, i2, i, charSequence, charSequence2, textPaint, i4, ndoVar, alignment, i5) : h((i3 + i) / 2, i, i3, charSequence, charSequence2, textPaint, i4, ndoVar, alignment, i5);
            }
            if (staticLayoutA.getLineCount() > i5) {
                return i2;
            }
        }
        return i;
    }

    private static int i(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, TextPaint textPaint, int i4, ndo ndoVar, Layout.Alignment alignment) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, charSequence.length());
        if (charSequenceSubSequence.length() != 0) {
            StaticLayout staticLayoutA = a(TextUtils.concat(charSequenceSubSequence, charSequence2), textPaint, i4, alignment, ndoVar);
            if (i != i2 && i != i3) {
                return staticLayoutA.getLineCount() > 1 ? i((i3 + i) / 2, i, i3, charSequence, charSequence2, textPaint, i4, ndoVar, alignment) : i((i2 + i) / 2, i2, i, charSequence, charSequence2, textPaint, i4, ndoVar, alignment);
            }
            if (staticLayoutA.getLineCount() > 1) {
                return i3;
            }
        }
        return i;
    }

    private static int j(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, TextPaint textPaint, int i4, ndo ndoVar, Layout.Alignment alignment) {
        if (i > 1) {
            StaticLayout staticLayoutA = a(TextUtils.concat(charSequence.subSequence(0, i), charSequence2, charSequence.subSequence(charSequence.length() - i, charSequence.length())), textPaint, i4, alignment, ndoVar);
            if (i != i2 && i != i3) {
                return staticLayoutA.getLineCount() > 1 ? j((i + i2) >> 1, i2, i, charSequence, charSequence2, textPaint, i4, ndoVar, alignment) : j((i + i3) / 2, i, i3, charSequence, charSequence2, textPaint, i4, ndoVar, alignment);
            }
            if (staticLayoutA.getLineCount() > 1) {
                return i2;
            }
        }
        return i;
    }
}
