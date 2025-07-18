package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.TextAppearanceSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwm extends MetricAffectingSpan {
    private final TextAppearanceSpan a;
    private final int b;
    private final int c;
    private final ColorStateList d;
    private final ColorStateList e;
    private final Typeface f;

    public mwm(Context context, int i) throws Resources.NotFoundException {
        this.a = ksk.b >= 28 ? new TextAppearanceSpan(context, i) : null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.textSize, R.attr.textStyle, R.attr.textColor, R.attr.textColorLink, R.attr.typeface, R.attr.fontFamily});
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.c = typedArrayObtainStyledAttributes.getInt(1, -1);
        this.d = typedArrayObtainStyledAttributes.getColorStateList(2);
        this.e = typedArrayObtainStyledAttributes.getColorStateList(3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, -1);
        if (resourceId != -1) {
            this.f = cso.a(context, resourceId);
            return;
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(5, -1);
        if (resourceId2 != -1) {
            this.f = cso.a(context, resourceId2);
        } else {
            this.f = null;
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        TextAppearanceSpan textAppearanceSpan = this.a;
        if (textAppearanceSpan != null) {
            textAppearanceSpan.updateDrawState(textPaint);
            return;
        }
        updateMeasureState(textPaint);
        ColorStateList colorStateList = this.d;
        if (colorStateList != null) {
            textPaint.setColor(colorStateList.getColorForState(textPaint.drawableState, 0));
        }
        ColorStateList colorStateList2 = this.e;
        if (colorStateList2 != null) {
            textPaint.linkColor = colorStateList2.getColorForState(textPaint.drawableState, 0);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int style;
        Typeface typefaceDefaultFromStyle;
        TextAppearanceSpan textAppearanceSpan = this.a;
        if (textAppearanceSpan != null) {
            textAppearanceSpan.updateMeasureState(textPaint);
            return;
        }
        Typeface typeface = this.f;
        if (typeface != null) {
            style = this.c;
            typefaceDefaultFromStyle = Typeface.create(typeface, style);
        } else {
            int i = this.c;
            if (i != 0) {
                Typeface typeface2 = textPaint.getTypeface();
                style = (typeface2 != null ? typeface2.getStyle() : 0) | i;
                typefaceDefaultFromStyle = typeface2 == null ? Typeface.defaultFromStyle(style) : Typeface.create(typeface2, style);
            } else {
                typefaceDefaultFromStyle = null;
            }
        }
        if (typefaceDefaultFromStyle != null) {
            int i2 = style & (~typefaceDefaultFromStyle.getStyle());
            if ((i2 & 1) != 0) {
                textPaint.setFakeBoldText(true);
            }
            if ((i2 & 2) != 0) {
                textPaint.setTextSkewX(-0.25f);
            }
            textPaint.setTypeface(typefaceDefaultFromStyle);
        }
        int i3 = this.b;
        if (i3 > 0) {
            textPaint.setTextSize(i3);
        }
    }
}
