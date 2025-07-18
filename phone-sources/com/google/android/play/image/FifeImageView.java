package com.google.android.play.image;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.play.drawer.PlayDrawerProfileInfoView;
import defpackage.sio;
import defpackage.tdk;
import defpackage.tfz;
import defpackage.tgb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FifeImageView extends ImageView {
    public tgb a;
    public boolean b;
    public PlayDrawerProfileInfoView c;
    private Drawable d;
    private final Rect e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private float j;
    private final PointF k;
    private final Matrix l;
    private float m;
    private boolean n;
    private final float o;

    public FifeImageView(Context context) {
        this(context, null);
    }

    private final void b() {
        if (this.b) {
            this.n = true;
        }
    }

    private final void c() {
        Drawable drawable = getDrawable();
        float width = getWidth();
        float height = getHeight();
        if (drawable == null || width == 0.0f || height == 0.0f) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0.0f || intrinsicHeight <= 0.0f) {
            this.l.reset();
        } else {
            float fMax = Math.max(width / intrinsicWidth, height / intrinsicHeight);
            float fMax2 = Math.max(intrinsicWidth - (width / fMax), 0.0f);
            float fMax3 = Math.max(intrinsicHeight - (height / fMax), 0.0f);
            PointF pointF = this.k;
            float f = pointF.x * fMax2;
            float f2 = pointF.y * fMax3;
            float f3 = this.j - 1.0f;
            float f4 = intrinsicWidth * f3;
            float f5 = f4 / 2.0f;
            float f6 = (f3 * intrinsicHeight) / 2.0f;
            this.l.setRectToRect(new RectF(f + f5, f2 + f6, (intrinsicWidth - (fMax2 - f)) - f5, (intrinsicHeight - (fMax3 - f2)) - f6), new RectF(0.0f, 0.0f, width, height), Matrix.ScaleToFit.FILL);
        }
        super.setImageMatrix(this.l);
    }

    public final synchronized void a() {
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable != null && drawable.isStateful()) {
            this.d.setState(getDrawableState());
        }
        if (this.a != null) {
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.a == null) {
            if (this.d == null) {
                return;
            }
            if (this.f) {
                this.f = false;
                Rect rect = this.e;
                rect.set(0, 0, getWidth(), getHeight());
                this.d.setBounds(rect);
            }
            this.d.draw(canvas);
            return;
        }
        if (isPressed() && (isDuplicateParentStateEnabled() || isClickable())) {
            tfz tfzVar = (tfz) this.a;
            float fA = tfzVar.a(width, height);
            float f = width - fA;
            float f2 = height - fA;
            canvas.save();
            canvas.translate(fA / 2.0f, 0.0f);
            Paint paint = tfzVar.e;
            float fMin = Math.min(((int) f) / 2.0f, ((int) f2) / 2.0f);
            canvas.drawCircle(fMin, fMin, fMin, paint);
            Paint paint2 = tfzVar.f;
            float strokeWidth = paint2.getStrokeWidth();
            paint2.setColor(tfzVar.g);
            canvas.drawCircle(fMin, fMin, fMin - (strokeWidth / 2.0f), paint2);
            canvas.restore();
        }
        if (isFocused()) {
            float f3 = width;
            tfz tfzVar2 = (tfz) this.a;
            float fA2 = tfzVar2.a(width, height);
            float f4 = f3 - fA2;
            float f5 = height - fA2;
            canvas.save();
            canvas.translate(fA2 / 2.0f, 0.0f);
            Paint paint3 = tfzVar2.f;
            float fMin2 = Math.min(((int) f4) / 2.0f, ((int) f5) / 2.0f);
            float strokeWidth2 = paint3.getStrokeWidth();
            paint3.setColor(tfzVar2.h);
            canvas.drawCircle(fMin2, fMin2, fMin2 - (strokeWidth2 / 2.0f), paint3);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.image.FifeImageView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.i) {
            c();
        }
        this.f = true;
    }

    @Override // android.view.View
    public final void requestLayout() {
        if (this.n) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.d;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.d);
            }
            this.d = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        b();
        super.setImageDrawable(drawable);
        this.n = false;
        if (this.i) {
            c();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageMatrix(Matrix matrix) {
        if (this.i) {
            throw new UnsupportedOperationException("Can't mix scale type and custom zoom");
        }
        super.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        b();
        super.setImageResource(i);
        this.n = false;
        if (this.i) {
            c();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        b();
        super.setImageURI(uri);
        this.n = false;
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (this.i) {
            throw new UnsupportedOperationException("Can't mix scale type and custom zoom");
        }
        super.setScaleType(scaleType);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.d;
    }

    public FifeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FifeImageView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.e = new Rect();
        this.f = false;
        this.k = new PointF(0.5f, 0.5f);
        this.l = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.b);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.b = typedArrayObtainStyledAttributes.getBoolean(2, false);
        int i2 = getResources().getDisplayMetrics().densityDpi;
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            sio.c();
            this.o = Math.min(typedArrayObtainStyledAttributes.getInt(0, i2) / i2, 1.0f);
        } else {
            sio.c();
            this.o = 1.0f;
        }
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(6);
        this.i = zHasValue;
        if (zHasValue) {
            this.j = typedArrayObtainStyledAttributes.getFraction(6, 1, 1, 1.0f);
            super.setScaleType(ImageView.ScaleType.MATRIX);
        } else {
            this.j = 1.0f;
        }
        Resources resources = context.getResources();
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.a = tfz.d(resources);
        } else if (typedArrayObtainStyledAttributes.getBoolean(4, false)) {
            this.a = tfz.e(resources);
        }
        this.m = typedArrayObtainStyledAttributes.getFraction(5, 1, 1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.foreground});
        Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        typedArrayObtainStyledAttributes2.recycle();
        resources.getInteger(R.integer.config_shortAnimTime);
        new Handler(Looper.getMainLooper());
    }
}
