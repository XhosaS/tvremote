package com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.gm.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import defpackage.pgx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RoundedCornersImageView extends AppCompatImageView {
    private RectF a;
    private Path b;
    private float[] c;

    public RoundedCornersImageView(Context context) {
        super(context);
        b(null);
    }

    private final void b(AttributeSet attributeSet) {
        this.b = new Path();
        this.a = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pgx.b);
            float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
            float dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            float dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
            float dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            a(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3, dimensionPixelOffset4);
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.c = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.c != null) {
            this.a.set(0.0f, 0.0f, getWidth(), getHeight());
            this.b.reset();
            this.b.addRoundRect(this.a, this.c, Path.Direction.CW);
            canvas.clipPath(this.b);
        }
        super.onDraw(canvas);
    }

    public RoundedCornersImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet);
    }

    public RoundedCornersImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet);
    }
}
