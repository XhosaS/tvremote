package com.google.android.apps.googletv.app.presentation.views.carouselcropimageview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CarouselCropImageView extends ShapeableImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselCropImageView(Context context) {
        super(context);
        context.getClass();
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final void e(int i, int i2) {
        Matrix imageMatrix = getImageMatrix();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = (i2 - i) / getDrawable().getIntrinsicHeight();
            imageMatrix.setScale(intrinsicHeight, intrinsicHeight, 0.0f, 0.0f);
            imageMatrix.postTranslate(intrinsicWidth * intrinsicHeight * (-0.457f), 0.0f);
            setImageMatrix(imageMatrix);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e(i2, i4);
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        e(i2, i4);
        return super.setFrame(i, i2, i3, i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
