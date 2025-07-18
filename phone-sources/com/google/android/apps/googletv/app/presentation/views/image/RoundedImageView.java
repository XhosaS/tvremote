package com.google.android.apps.googletv.app.presentation.views.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ctd;
import defpackage.kjq;
import defpackage.kjr;
import defpackage.kjs;
import defpackage.kjt;
import defpackage.yks;
import defpackage.ykv;
import defpackage.ylg;
import defpackage.yln;
import defpackage.ylr;
import defpackage.ymp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RoundedImageView extends AppCompatImageView {
    static final /* synthetic */ ymp[] a;
    public float b;
    private final ylr c;
    private RectF d;

    static {
        ykv ykvVar = new ykv(RoundedImageView.class, "aspectRatio", "getAspectRatio()F", 0);
        int i = ylg.a;
        a = new ymp[]{ykvVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context) {
        super(context);
        context.getClass();
        this.c = new kjr(Float.valueOf(0.0f), this);
    }

    private final void c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, kjq.a, 0, 0);
        b(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static final int d(int i, float f) {
        return yln.v(i / f);
    }

    private static final int e(int i, float f) {
        return yln.v(i * f);
    }

    public final float a() {
        return ((Number) this.c.d(a[0])).floatValue();
    }

    public final void b(float f) {
        this.c.c(a[0], Float.valueOf(f));
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (a() > 0.0f) {
            if (size > 0 && size2 > 0) {
                int iD = d(size, a());
                if (iD <= size2) {
                    size2 = iD;
                } else {
                    size = e(size2, a());
                }
            } else if (size > 0) {
                size2 = d(size, a());
            } else if (size2 > 0) {
                size = e(size2, a());
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        RectF rectF = this.d;
        if (rectF == null) {
            this.d = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        rectF.right = getMeasuredWidth();
        RectF rectF2 = this.d;
        if (rectF2 == null) {
            yks.c("dimensionsRect");
            rectF2 = null;
        }
        rectF2.bottom = getMeasuredHeight();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.d;
        float f = i;
        float f2 = i2;
        if (rectF == null) {
            this.d = new RectF(0.0f, 0.0f, f, f2);
            return;
        }
        rectF.right = f;
        RectF rectF2 = this.d;
        if (rectF2 == null) {
            yks.c("dimensionsRect");
            rectF2 = null;
        }
        rectF2.bottom = f2;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        ctd ctdVar = new ctd(getResources(), bitmap);
        ctdVar.b(this.b);
        setImageDrawable(ctdVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.c = new kjs(Float.valueOf(0.0f), this);
        if (attributeSet != null) {
            c(attributeSet);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.c = new kjt(Float.valueOf(0.0f), this);
        if (attributeSet != null) {
            c(attributeSet);
        }
    }
}
