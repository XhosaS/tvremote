package com.google.android.apps.googletv.app.presentation.views.topcropimageview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;
import defpackage.ykn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TopCropImageView extends ShapeableImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopCropImageView(Context context) {
        super(context);
        context.getClass();
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final void e(int i, int i2, int i3, int i4) {
        Matrix imageMatrix = getImageMatrix();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int i5 = i3 - i;
            float fJ = (i5 > intrinsicWidth || i4 - i2 > getDrawable().getIntrinsicHeight()) ? ykn.j(i5 / intrinsicWidth, r7 / r2) : 1.0f;
            imageMatrix.setScale(fJ, fJ, 0.0f, 0.0f);
            imageMatrix.postTranslate((i5 - (intrinsicWidth * fJ)) / 2.0f, 0.0f);
            setImageMatrix(imageMatrix);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e(i, i2, i3, i4);
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        e(i, i2, i3, i4);
        return super.setFrame(i, i2, i3, i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
