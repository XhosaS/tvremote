package com.google.android.libraries.play.widget.cardimageview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.videos.R;
import defpackage.sdl;
import defpackage.sdm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CardImageView extends AppCompatImageView {
    public int a;
    public int b;
    private final sdl c;
    private final float d;
    private final float e;

    public CardImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        this.c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c.setBounds(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.a <= 0 || this.b <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = this.a + getPaddingLeft() + getPaddingRight();
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(paddingLeft, size);
        } else if (mode != 1073741824 || size <= 0) {
            size = paddingLeft;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = this.b + getPaddingTop() + getPaddingBottom();
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingTop, size2);
        } else if (mode2 != 1073741824 || size2 <= 0) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    public CardImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardImageViewStyle);
    }

    public CardImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sdm.a, i, 0);
        TypedValue typedValue = new TypedValue();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.replay__cardimageview__default_inset));
        float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, resources.getDimensionPixelSize(R.dimen.replay__cardimageview__default_elevation));
        this.d = dimensionPixelOffset;
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(R.dimen.replay__cardimageview__default_radius));
        this.e = dimensionPixelSize2;
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        context.getTheme().resolveAttribute(android.R.attr.windowBackground, typedValue, true);
        this.c = new sdl(resources, typedArrayObtainStyledAttributes.getColor(0, typedValue.data), dimensionPixelSize2, dimensionPixelOffset, dimensionPixelSize);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        typedArrayObtainStyledAttributes.recycle();
    }
}
