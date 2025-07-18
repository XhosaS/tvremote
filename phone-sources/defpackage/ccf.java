package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccf {
    public static final ciy A(cix... cixVarArr) {
        return new cjb(yfm.aC(cixVarArr));
    }

    public static /* synthetic */ cix B(String str, cji cjiVar) {
        return new ciw(str, cjiVar, new cjh(new cjg[0]));
    }

    public static final int C(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return 3;
            }
        } else if (z) {
            return 1;
        }
        return !z2 ? 0 : 2;
    }

    public static final int D(cji cjiVar, int i) {
        return C(cjiVar.compareTo(cji.c) >= 0, a.r(i, 1));
    }

    public static final int E(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }

    public static final float F(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        if (!chp.c(layout, i) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && cib.a[paragraphAlignment.ordinal()] == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static final float G(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        if (!chp.c(layout, i) || layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && cib.a[paragraphAlignment.ordinal()] == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020e A[EDGE_INSN: B:167:0x020e->B:105:0x020e BREAK  A[LOOP:3: B:88:0x01c4->B:102:0x01fb], EDGE_INSN: B:168:0x020e->B:105:0x020e BREAK  A[LOOP:3: B:88:0x01c4->B:102:0x01fb], EDGE_INSN: B:173:0x020e->B:105:0x020e BREAK  A[LOOP:5: B:135:0x027e->B:149:0x02b6], EDGE_INSN: B:174:0x020e->B:105:0x020e BREAK  A[LOOP:5: B:135:0x027e->B:149:0x02b6], PHI: r16 r21
  0x020e: PHI (r16v4 int) = (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v7 int), (r16v7 int), (r16v9 int) binds: [B:104:0x020c, B:129:0x025c, B:132:0x0265, B:173:0x020e, B:174:0x020e, B:167:0x020e, B:168:0x020e, B:57:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x020e: PHI (r21v3 chj[]) = (r21v1 chj[]), (r21v1 chj[]), (r21v1 chj[]), (r21v1 chj[]), (r21v1 chj[]), (r21v5 chj[]), (r21v5 chj[]), (r21v6 chj[]) binds: [B:104:0x020c, B:129:0x025c, B:132:0x0265, B:173:0x020e, B:174:0x020e, B:167:0x020e, B:168:0x020e, B:57:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int H(defpackage.cho r19, android.text.Layout r20, defpackage.chk r21, int r22, android.graphics.RectF r23, defpackage.chv r24, defpackage.yjz r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccf.H(cho, android.text.Layout, chk, int, android.graphics.RectF, chv, yjz, boolean):int");
    }

    public static final StaticLayout I(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            cko.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            cko.a("invalid end value");
        }
        if (i3 < 0) {
            cko.a("invalid maxLines value");
        }
        if (i < 0) {
            cko.a("invalid width value");
        }
        if (i4 < 0) {
            cko.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(false);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        if (Build.VERSION.SDK_INT >= 26) {
            builderObtain.setJustificationMode(i5);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            builderObtain.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (Build.VERSION.SDK_INT >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final boolean J(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final Rect K(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    Iterator itE = ykn.e(metricAffectingSpanArr);
                    while (itE.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) itE.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    aa(textPaint2, charSequence, i, iNextSpanTransition, rect2);
                    rect.right += rect2.width();
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        aa(textPaint, charSequence, i, i2, rect3);
        return rect3;
    }

    public static final int L(Layout layout, int i) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        return ((lineStart == i || layout.getLineEnd(lineForOffset) == i) && lineStart == i) ? lineForOffset - 1 : lineForOffset;
    }

    public static final chc M(chc chcVar, cmi cmiVar) {
        long j;
        int i;
        clq clqVar;
        int i2;
        cgs cgsVar = chcVar.b;
        clo cloVar = cgsVar.a;
        long j2 = cgt.a;
        clo cloVarD = cloVar.d(new awl(9));
        long j3 = cgsVar.b;
        if (cmk.b(j3) == 0) {
            j3 = cgt.a;
        }
        long j4 = j3;
        cji cjiVar = cgsVar.c;
        if (cjiVar == null) {
            cjiVar = cji.e;
        }
        cji cjiVar2 = cjiVar;
        cje cjeVar = cgsVar.d;
        cje cjeVar2 = new cje(cjeVar != null ? cjeVar.a : 0);
        cjf cjfVar = new cjf();
        ciy ciyVar = cgsVar.f;
        if (ciyVar == null) {
            ciyVar = ciy.e;
        }
        ciy ciyVar2 = ciyVar;
        String str = cgsVar.g;
        long j5 = cgsVar.h;
        if (cmk.b(j5) == 0) {
            j5 = cgt.b;
        }
        long j6 = j5;
        cld cldVar = new cld();
        clp clpVar = cgsVar.j;
        if (clpVar == null) {
            clpVar = clp.a;
        }
        clp clpVar2 = clpVar;
        ckq ckqVarC = cgsVar.k;
        if (ckqVarC == null) {
            ckq ckqVar = ckq.a;
            ckqVarC = cko.c();
        }
        ckq ckqVar2 = ckqVarC;
        long j7 = cgsVar.l;
        if (j7 == 16) {
            j7 = cgt.c;
        }
        long j8 = j7;
        cll cllVar = cgsVar.m;
        if (cllVar == null) {
            cllVar = cll.a;
        }
        cll cllVar2 = cllVar;
        bok bokVar = cgsVar.n;
        if (bokVar == null) {
            bokVar = bok.a;
        }
        bok bokVar2 = bokVar;
        brx brxVar = cgsVar.p;
        if (brxVar == null) {
            brxVar = bps.a;
        }
        brx brxVar2 = brxVar;
        if (str == null) {
            str = "";
        }
        cgs cgsVar2 = new cgs(cloVarD, j4, cjiVar2, cjeVar2, cjfVar, ciyVar2, str, j6, cldVar, clpVar2, ckqVar2, j8, cllVar2, bokVar2, brxVar2);
        cgm cgmVar = chcVar.c;
        int i3 = cgmVar.a;
        long j9 = cgn.a;
        int i4 = cgmVar.b;
        if (a.r(i4, 3)) {
            int iOrdinal = cmiVar.ordinal();
            if (iOrdinal == 0) {
                i4 = 4;
            } else {
                if (iOrdinal != 1) {
                    throw new yfu();
                }
                i4 = 5;
            }
        } else if (a.r(i4, Integer.MIN_VALUE)) {
            int iOrdinal2 = cmiVar.ordinal();
            if (iOrdinal2 == 0) {
                i4 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new yfu();
                }
                i4 = 2;
            }
        }
        long j10 = cgmVar.c;
        if (cmk.b(j10) == 0) {
            j10 = cgn.a;
        }
        clq clqVar2 = cgmVar.d;
        if (clqVar2 == null) {
            clqVar2 = clq.a;
        }
        long j11 = j10;
        cgp cgpVar = cgmVar.e;
        clj cljVar = cgmVar.f;
        int i5 = cgmVar.g;
        if (true == a.r(i5, 0)) {
            i5 = 66305;
        }
        int i6 = cgmVar.h;
        boolean zR = a.r(i6, Integer.MIN_VALUE);
        clr clrVar = cgmVar.i;
        if (clrVar == null) {
            clrVar = clr.a;
        }
        if (true == zR) {
            i6 = 1;
        }
        if (true == a.r(i3, Integer.MIN_VALUE)) {
            j = j11;
            i = i5;
            clqVar = clqVar2;
            i2 = 5;
        } else {
            j = j11;
            i = i5;
            clqVar = clqVar2;
            i2 = i3;
        }
        return new chc(cgsVar2, new cgm(i2, i4, j, clqVar, cgpVar, cljVar, i, i6, clrVar), chcVar.d);
    }

    public static final long N(int i, int i2) {
        if (i < 0 || i2 < 0) {
            cko.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final String O(CharSequence charSequence, long j) {
        return charSequence.subSequence(chb.d(j), chb.c(j)).toString();
    }

    public static final long P(long j, int i) {
        int iA = chb.a(j);
        if (iA < 0) {
            iA = 0;
        }
        if (iA > i) {
            iA = i;
        }
        int iE = chb.e(j);
        int i2 = iE >= 0 ? iE : 0;
        if (i2 <= i) {
            i = i2;
        }
        return (i == chb.e(j) && iA == chb.a(j)) ? j : N(i, iA);
    }

    public static final int Q(float f) {
        return (int) Math.ceil(f);
    }

    public static final int R(List list, int i) {
        int i2;
        int i3;
        int i4 = ((cgj) yfm.W(list)).b;
        if (i > ((cgj) yfm.W(list)).b) {
            cko.a(a.ce(i4, i, "Index ", " should be less or equal than last line's end "));
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            i2 = 1;
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            cgj cgjVar = (cgj) list.get(i3);
            char c = cgjVar.a > i ? (char) 1 : cgjVar.b <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        cko.a("Found paragraph index " + i3 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + cmq.d(list, null, null, null, new cjp(i2), 31) + ']');
        return i3;
    }

    public static final int S(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                return -(i2 + 1);
            }
            int i3 = (i2 + size) >>> 1;
            cgj cgjVar = (cgj) list.get(i3);
            char c = cgjVar.c <= i ? cgjVar.d <= i ? (char) 65535 : (char) 0 : (char) 1;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
    }

    public static final int T(List list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((cgj) yfm.W(list)).f) {
            return yfm.q(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                return -(i + 1);
            }
            int i2 = (i + size) >>> 1;
            cgj cgjVar = (cgj) list.get(i2);
            char c = cgjVar.e <= f ? cgjVar.f <= f ? (char) 65535 : (char) 0 : (char) 1;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
    }

    public static final void U(List list, long j, yjv yjvVar) {
        int size = list.size();
        for (int iR = R(list, chb.d(j)); iR < size; iR++) {
            cgj cgjVar = (cgj) list.get(iR);
            int i = cgjVar.a;
            if (i >= chb.c(j)) {
                return;
            }
            if (i != cgjVar.b) {
                yjvVar.a(cgjVar);
            }
        }
    }

    public static final cfv V(cfx cfxVar) {
        return new cfv(cfxVar.a, cfxVar.b, cfxVar.c, cfxVar.d);
    }

    private static final float W(int i) {
        return -i;
    }

    private static final List X(cff cffVar) {
        return cffVar.l(false, false);
    }

    private static final float Y(int i, int i2, float[] fArr) {
        int i3 = i - i2;
        return fArr[i3 + i3 + 1];
    }

    private static final boolean Z(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }

    public static final void a(View view, float f) {
        view.setRequestedFrameRate(f);
    }

    private static final void aa(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            paint.getTextBounds(charSequence, i, i2, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
        }
    }

    public static final int b(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final long c(cbc cbcVar) {
        Activity activity;
        long jRound;
        int iRound;
        Context context = cbcVar.getContext();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof Activity)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            } else {
                activity = (Activity) baseContext;
                break;
            }
        }
        if (activity != null) {
            Rect rectA = (Build.VERSION.SDK_INT >= 30 ? cci.a : Build.VERSION.SDK_INT >= 29 ? cch.a : Build.VERSION.SDK_INT >= 28 ? cch.b : cci.b).a(activity);
            int iWidth = rectA.width();
            iRound = rectA.height();
            jRound = iWidth << 32;
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            jRound = Math.round(configuration.screenWidthDp * r7) << 32;
            iRound = Math.round(configuration.screenHeightDp * context.getResources().getDisplayMetrics().density);
        }
        return (4294967295L & iRound) | jRound;
    }

    public static final bkp d(bkp bkpVar, String str) {
        return bkpVar.a(new TestTagElement(str));
    }

    public static final boolean e(float f, float f2, long j, float f3, float f4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f5 = f2 - f4;
        float f6 = f - f3;
        return ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f5 * f5) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }

    public static final boolean f(bni bniVar, float f, float f2) {
        bmy bmyVar = new bmy(f - 0.005f, (-0.005f) + f2, f + 0.005f, f2 + 0.005f);
        byte[] bArr = null;
        bni bniVar2 = new bni(bArr);
        bnj.s(bniVar2, bmyVar);
        bni bniVar3 = new bni(bArr);
        bniVar3.o(bniVar, bniVar2, 1);
        boolean zIsEmpty = bniVar3.a.isEmpty();
        bniVar3.k();
        bniVar2.k();
        return !zIsEmpty;
    }

    public static final View g(ccd ccdVar, int i) {
        Object next;
        Iterator it = ccdVar.b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((bys) ((Map.Entry) next).getKey()).c == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (cmv) entry.getValue();
        }
        return null;
    }

    public static final cdn h(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((cdn) list.get(i2)).a == i) {
                return (cdn) list.get(i2);
            }
        }
        return null;
    }

    public static final cgz i(cfc cfcVar) {
        ArrayList arrayList = new ArrayList();
        ces cesVar = (ces) t(cfcVar, cfb.a);
        if (cesVar == null || !((Boolean) ((yjv) cesVar.b).a(arrayList)).booleanValue()) {
            return null;
        }
        return (cgz) arrayList.get(0);
    }

    public static final String j(int i) {
        if (a.r(i, 0)) {
            return "android.widget.Button";
        }
        if (a.r(i, 1)) {
            return "android.widget.CheckBox";
        }
        if (a.r(i, 3)) {
            return "android.widget.RadioButton";
        }
        if (a.r(i, 5)) {
            return "android.widget.ImageView";
        }
        if (a.r(i, 6)) {
            return "android.widget.Spinner";
        }
        if (a.r(i, 7)) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final float k(float f) {
        return -f;
    }

    public static final int l(float f) {
        double d = f;
        return -((int) (f >= 0.0f ? Math.ceil(d) : Math.floor(d)));
    }

    public static final int m(long j) {
        float fAbs = Math.abs(Float.intBitsToFloat((int) (j >> 32)));
        float fAbs2 = Math.abs(Float.intBitsToFloat((int) (j & 4294967295L)));
        int i = fAbs >= 0.5f ? 1 : 0;
        return fAbs2 >= 0.5f ? i | 2 : i;
    }

    public static final int n(long j, float f) {
        float fAbs = Math.abs(cmm.a(j));
        float fAbs2 = Math.abs(cmm.b(j));
        int i = fAbs >= f ? 1 : 0;
        return fAbs2 >= f ? i | 2 : i;
    }

    public static final int o(int i) {
        return a.r(i, 1) ? 0 : 1;
    }

    public static final long p(int[] iArr, long j) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) >= 0.0f ? ykn.h(W(iArr[0]), Float.intBitsToFloat(r1)) : ykn.g(W(iArr[0]), Float.intBitsToFloat(r1))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) >= 0.0f ? ykn.h(W(iArr[1]), Float.intBitsToFloat(r7)) : ykn.g(W(iArr[1]), Float.intBitsToFloat(r7))) & 4294967295L);
    }

    public static final int q(float[] fArr) {
        int length = fArr.length;
        int i = 0;
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 + i2) | i;
    }

    public static final boolean r(long j) {
        return !a.s(j, 9223372034707292159L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[LOOP:0: B:5:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:5:0x000d->B:35:0x0063], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [bko] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.cff s(defpackage.bys r9, boolean r10) {
        /*
            bzm r0 = r9.t
            int r1 = r0.a()
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L66
            bko r0 = r0.f
        Ld:
            if (r0 == 0) goto L66
            int r1 = r0.r
            r1 = r1 & 8
            if (r1 == 0) goto L5d
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5d
            boolean r4 = r1 instanceof defpackage.cae
            if (r4 == 0) goto L1f
            r2 = r1
            goto L66
        L1f:
            int r4 = r1.r
            r4 = r4 & 8
            if (r4 == 0) goto L58
            boolean r4 = r1 instanceof defpackage.bxw
            if (r4 == 0) goto L58
            r4 = r1
            bxw r4 = (defpackage.bxw) r4
            bko r4 = r4.C
            r5 = 0
            r6 = r5
        L30:
            r7 = 1
            if (r4 == 0) goto L56
            int r8 = r4.r
            r8 = r8 & 8
            if (r8 == 0) goto L53
            int r6 = r6 + 1
            if (r6 != r7) goto L3f
            r1 = r4
            goto L53
        L3f:
            if (r3 != 0) goto L4a
            bfz r3 = new bfz
            r7 = 16
            bko[] r7 = new defpackage.bko[r7]
            r3.<init>(r7, r5)
        L4a:
            if (r1 == 0) goto L4f
            r3.o(r1)
        L4f:
            r3.o(r4)
            r1 = r2
        L53:
            bko r4 = r4.u
            goto L30
        L56:
            if (r6 == r7) goto L17
        L58:
            bko r1 = defpackage.fh.F(r3)
            goto L17
        L5d:
            int r1 = r0.s
            r1 = r1 & 8
            if (r1 == 0) goto L66
            bko r0 = r0.u
            goto Ld
        L66:
            r2.getClass()
            cae r2 = (defpackage.cae) r2
            bko r0 = r2.E()
            cfc r1 = r9.p()
            if (r1 != 0) goto L7a
            cfc r1 = new cfc
            r1.<init>()
        L7a:
            cff r2 = new cff
            r2.<init>(r0, r10, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccf.s(bys, boolean):cff");
    }

    public static final Object t(cfc cfcVar, cfm cfmVar) {
        Object objA = cfcVar.c.a(cfmVar);
        if (objA == null) {
            return null;
        }
        return objA;
    }

    public static final yjz u(cff cffVar) {
        return (yjz) t(cffVar.c, cfb.e);
    }

    public static final void v(cff cffVar, int i, yjv yjvVar) {
        cff cffVar2;
        bfz bfzVar = new bfz(new cff[16], 0);
        List listX = X(cffVar);
        int i2 = bfzVar.b;
        while (true) {
            bfzVar.q(i2, listX);
            while (true) {
                int i3 = bfzVar.b;
                if (i3 == 0) {
                    return;
                }
                cffVar2 = (cff) bfzVar.d(i3 - 1);
                if (!cfg.a(cffVar2)) {
                    cfc cfcVar = cffVar2.c;
                    if (cfcVar.f(cfi.i)) {
                        continue;
                    } else {
                        bzq bzqVarE = cffVar2.e();
                        if (bzqVarE == null) {
                            bty.a("Expected semantics node to have a coordinator.");
                            throw new yfs();
                        }
                        cmg cmgVarA = clw.A(bty.v(bzqVarE));
                        if (cmgVarA.b < cmgVarA.d && cmgVarA.c < cmgVarA.e) {
                            yjz yjzVarU = u(cffVar2);
                            cfa cfaVar = (cfa) t(cfcVar, cfi.u);
                            if (yjzVarU == null || cfaVar == null || ((Number) cfaVar.b.a()).floatValue() <= 0.0f) {
                                break;
                            }
                            int i4 = i + 1;
                            yjvVar.a(new cer(cffVar2, i4, cmgVarA, bzqVarE));
                            v(cffVar2, i4, yjvVar);
                        }
                    }
                }
            }
            listX = X(cffVar2);
            i2 = bfzVar.b;
        }
    }

    public static final String w(int i, bao baoVar) {
        return ((Resources) baoVar.f(AndroidCompositionLocals_androidKt.c)).getString(i);
    }

    public static final float x(int i, bao baoVar) {
        return ((Resources) baoVar.f(AndroidCompositionLocals_androidKt.c)).getDimension(i) / ((clx) baoVar.f(ccq.d)).a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:55:0x018b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.bqh y(int r59, defpackage.bao r60, int r61) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccf.y(int, bao, int):bqh");
    }

    public static final Object z(bxv bxvVar, yjk yjkVar, yih yihVar) {
        Object obj;
        bvc bvcVarG;
        Object objE;
        bzm bzmVar;
        if (bxvVar.E().A) {
            if (!bxvVar.E().A) {
                bty.c("visitAncestors called on an unattached node");
            }
            bko bkoVar = bxvVar.E().t;
            bys bysVarI = fh.I(bxvVar);
            loop0: while (true) {
                obj = null;
                if (bysVarI == null) {
                    break;
                }
                if ((bysVarI.t.f.s & 524288) != 0) {
                    while (bkoVar != null) {
                        if ((bkoVar.r & 524288) != 0) {
                            bko bkoVarF = bkoVar;
                            bfz bfzVar = null;
                            while (bkoVarF != null) {
                                if (bkoVarF instanceof cef) {
                                    obj = bkoVarF;
                                    break loop0;
                                }
                                if ((bkoVarF.r & 524288) != 0 && (bkoVarF instanceof bxw)) {
                                    int i = 0;
                                    for (bko bkoVar2 = ((bxw) bkoVarF).C; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
                                        if ((bkoVar2.r & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                bkoVarF = bkoVar2;
                                            } else {
                                                if (bfzVar == null) {
                                                    bfzVar = new bfz(new bko[16], 0);
                                                }
                                                if (bkoVarF != null) {
                                                    bfzVar.o(bkoVarF);
                                                }
                                                bfzVar.o(bkoVar2);
                                                bkoVarF = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                bkoVarF = fh.F(bfzVar);
                            }
                        }
                        bkoVar = bkoVar.t;
                    }
                }
                bysVarI = bysVarI.j();
                bkoVar = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
            }
            cef cefVar = (cef) obj;
            if (cefVar != null && (objE = cefVar.e((bvcVarG = fh.G(bxvVar)), new bmq(yjkVar, bvcVarG, 11), yihVar)) == yio.a) {
                return objE;
            }
        }
        return ygi.a;
    }
}
