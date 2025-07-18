package com.google.android.apps.tvsearch.results.motion;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import defpackage.agvs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BorderedTextView extends AppCompatTextView {
    private int a;
    private int b;
    private int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BorderedTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public final int getBorderColor() {
        return this.b;
    }

    public final int getBorderWidth() {
        return this.a;
    }

    public final int getShapeColor() {
        return this.c;
    }

    public final int getTextColor() {
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            return textColors.getDefaultColor();
        }
        return -1;
    }

    public final void setBorderColor(int i) {
        this.b = i;
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setStroke(this.a, this.b);
        }
    }

    public final void setBorderWidth(int i) {
        this.a = i;
    }

    public final void setShapeColor(int i) {
        this.c = i;
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(this.c);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(this.c);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BorderedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = 1;
    }

    public /* synthetic */ BorderedTextView(Context context, AttributeSet attributeSet, int i, int i2, agvs agvsVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
