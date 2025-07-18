package com.google.android.apps.play.movies.mobile.usecase.downloads;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a;
import defpackage.kqb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RatioBar extends View {
    public float[] a;
    private final RectF b;
    private final Paint c;
    private int[] d;

    public RatioBar(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.a = null;
        this.d = null;
        this.b = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kqb.b);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(resourceId);
            int[] iArr = new int[typedArrayObtainTypedArray.length()];
            for (int i = 0; i < typedArrayObtainTypedArray.length(); i++) {
                iArr[i] = typedArrayObtainTypedArray.getColor(i, 0);
            }
            typedArrayObtainTypedArray.recycle();
            this.d = iArr;
            invalidate();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int[] iArr;
        if (this.a == null || (iArr = this.d) == null) {
            return;
        }
        int i = 0;
        a.ab(iArr.length == 4);
        RectF rectF = this.b;
        rectF.right = 0.0f;
        rectF.bottom = getHeight();
        float width = getWidth();
        while (true) {
            int length = this.a.length;
            if (i >= 4) {
                return;
            }
            rectF.left = rectF.right;
            rectF.right += this.a[i] * width;
            Paint paint = this.c;
            paint.setColor(this.d[i]);
            canvas.drawRect(rectF, paint);
            i++;
        }
    }
}
