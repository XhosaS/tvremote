package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class ekz {
    protected static final ColorStateList a;
    protected static final int b;
    protected static final Typeface c;
    public static final Path d;
    public static final Rect e;
    public static final RectF f;
    protected static final int g;
    private static final Typeface h;
    private static final int[][] i;
    private static final int[] j;

    static {
        Typeface typeface = Typeface.DEFAULT;
        h = typeface;
        int[][] iArr = {new int[]{0}};
        i = iArr;
        int[] iArr2 = {-16777216};
        j = iArr2;
        a = new ColorStateList(iArr, iArr2);
        b = typeface.getStyle();
        c = typeface;
        g = 1;
        d = new Path();
        e = new Rect();
        f = new RectF();
    }

    public static int a(Layout layout) {
        for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
            if (layout.getEllipsisCount(i2) > 0) {
                return i2;
            }
        }
        return -1;
    }

    public static int b(Layout layout, int i2, Layout layout2) {
        if (layout2 == null) {
            return 0;
        }
        Rect rect = new Rect();
        layout.getLineBounds(i2, rect);
        Rect rect2 = new Rect();
        layout2.getLineBounds(layout2.getLineCount() - 1, rect2);
        return Math.max(0, rect2.height() - rect.height());
    }

    public static void c(SpannableString spannableString, CharSequence charSequence, Class cls) {
        Object[] spans = spannableString.getSpans(0, spannableString.length(), cls);
        int length = spannableString.length() - charSequence.length();
        for (Object obj : spans) {
            int spanStart = spannableString.getSpanStart(obj);
            int spanEnd = spannableString.getSpanEnd(obj);
            if (spanStart > 0 && spanStart < length && spanEnd >= length) {
                spannableString.removeSpan(obj);
                spannableString.setSpan(obj, spanStart, length, 0);
            } else if (spanStart == 0 && spanEnd == length) {
                spannableString.setSpan(obj, 0, spannableString.length(), 0);
            } else if (spanStart == length) {
                spannableString.setSpan(obj, spanStart, spannableString.length(), 0);
            }
        }
    }

    public static int d(int i2) {
        if (i2 != 0) {
            return i2;
        }
        return 1;
    }

    public static aew e(eny enyVar) {
        return enyVar == eny.RTL ? afd.d : afd.c;
    }

    public static Layout f(dru druVar, int i2, TextUtils.TruncateAt truncateAt, boolean z, int i3, float f2, float f3, float f4, int i4, CharSequence charSequence, ColorStateList colorStateList, int i5, int i6, float f5, int i7, Typeface typeface, int i8, eny enyVar, float f6, int i9) {
        int i10;
        Layout.Alignment alignment;
        dqy dqyVar = new dqy();
        dqyVar.g = false;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i10 = 2;
        } else if (mode == 0) {
            i10 = 0;
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unexpected size mode: " + View.MeasureSpec.getMode(i2));
            }
            i10 = 1;
        }
        dqx dqxVar = dqyVar.e;
        if (dqxVar.a.density != f6) {
            dqxVar.a();
            dqxVar.a.density = f6;
            dqyVar.f = null;
        }
        if (dqxVar.m != truncateAt) {
            dqxVar.m = truncateAt;
            dqyVar.f = null;
        }
        if (dqxVar.n != i3) {
            dqxVar.n = i3;
            dqyVar.f = null;
        }
        dqxVar.a();
        dqxVar.d = f2;
        dqxVar.b = f3;
        dqxVar.c = f4;
        dqxVar.e = i4;
        dqxVar.a.setShadowLayer(f2, f3, f4, i4);
        dqyVar.f = null;
        if (charSequence != dqxVar.h) {
            if (charSequence instanceof SpannableStringBuilder) {
                try {
                    charSequence.hashCode();
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line.", e2);
                }
            }
            if (charSequence == null || !charSequence.equals(dqyVar.e.h)) {
                dqyVar.e.h = charSequence;
                dqyVar.f = null;
            }
        }
        int size = View.MeasureSpec.getSize(i2);
        dqx dqxVar2 = dqyVar.e;
        if (dqxVar2.f != size || dqxVar2.g != i10) {
            dqxVar2.f = size;
            dqxVar2.g = i10;
            dqyVar.f = null;
        }
        if (dqxVar2.l != z) {
            dqxVar2.l = z;
            dqyVar.f = null;
        }
        if (dqxVar2.k != f5) {
            dqxVar2.k = f5;
            dqyVar.f = null;
        }
        if (dqxVar2.j != 1.0f) {
            dqxVar2.j = 1.0f;
            dqyVar.f = null;
        }
        if (dqxVar2.a.linkColor != i5) {
            dqxVar2.a();
            dqxVar2.a.linkColor = i5;
            dqyVar.f = null;
        }
        if (dqxVar2.q != i9) {
            dqxVar2.q = i9;
            dqyVar.f = null;
        }
        if (i6 != -1) {
            dqyVar.b(i6);
        } else {
            dqyVar.b(druVar.e.b(14.0f));
        }
        if (dqxVar2.a.getLetterSpacing() != 0.0f) {
            dqxVar2.a();
            dqxVar2.a.setLetterSpacing(0.0f);
            dqyVar.f = null;
        }
        dqyVar.b = 2;
        dqyVar.c = Integer.MAX_VALUE;
        dqyVar.d = 2;
        dqxVar2.a();
        dqxVar2.i = colorStateList;
        TextPaint textPaint = dqxVar2.a;
        ColorStateList colorStateList2 = dqxVar2.i;
        textPaint.setColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : -16777216);
        dqyVar.f = null;
        if (h.equals(typeface)) {
            dqyVar.c(Typeface.defaultFromStyle(i7));
        } else {
            dqyVar.c(typeface);
        }
        aew aewVarE = e(enyVar);
        if (dqxVar2.p != aewVarE) {
            dqxVar2.p = aewVarE;
            dqyVar.f = null;
        }
        switch (eky.c[i8 - 1]) {
            case 3:
                if ((enyVar == eny.RTL) == aewVarE.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 2:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                if ((enyVar == eny.RTL) != aewVarE.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 5:
                if (!aewVarE.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 6:
                if (!aewVarE.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 7:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        if (dqxVar2.o != alignment) {
            dqxVar2.o = alignment;
            dqyVar.f = null;
        }
        try {
            return dqyVar.a();
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new RuntimeException("text: ".concat(String.valueOf(charSequence.toString())), e3);
        }
    }
}
