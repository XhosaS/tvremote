package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pra extends Drawable {
    public int a;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    private final Paint j;
    private final Paint k;
    private float l;
    private float m;
    private float n;
    private int o;
    private int p;

    public pra(Context context) {
        Paint paint = new Paint();
        this.j = paint;
        Paint paint2 = new Paint();
        this.k = paint2;
        this.l = 1.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 244;
        TypedValue typedValue = new TypedValue();
        c(csq.g(context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true) ? typedValue.data : context.getResources().getColor(com.google.android.videos.R.color.quantum_googblue600), 244));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        d(0);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.a = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.libraries_material_featurehighlight_center_threshold);
        this.e = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.libraries_material_featurehighlight_center_horizontal_offset);
        this.f = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.libraries_material_featurehighlight_center_vertical_offset);
        this.d = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.libraries_material_featurehighlight_outer_padding);
    }

    public static final int f(int i, float f, int i2) {
        return (int) (((((f * f) * 9.0f) - ((i * 8) * i2)) - ((i2 * i2) * 4)) / (i2 * 8));
    }

    public static final float g(float f, float f2, Rect rect) {
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        float fBC = ocv.bC(f, f2, f3, f4);
        float fBC2 = ocv.bC(f, f2, f5, f4);
        float fBC3 = ocv.bC(f, f2, f5, f6);
        float fBC4 = ocv.bC(f, f2, f3, f6);
        if (fBC <= fBC2 || fBC <= fBC3 || fBC <= fBC4) {
            fBC = (fBC2 <= fBC3 || fBC2 <= fBC4) ? fBC3 <= fBC4 ? fBC4 : fBC3 : fBC2;
        }
        return (float) Math.ceil(fBC);
    }

    final float a(Rect rect) {
        return g(this.h + this.m, this.i + this.n, rect);
    }

    public final Animator b(float f, float f2, float f3) {
        float f4 = 1.0f - f3;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", f3, 1.0f), PropertyValuesHolder.ofFloat("translationX", f * f4, 0.0f), PropertyValuesHolder.ofFloat("translationY", f2 * f4, 0.0f), PropertyValuesHolder.ofInt("alpha", (int) (255.0f * f3), 255));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(pod.a);
        return objectAnimatorOfPropertyValuesHolder.setDuration(f3 == 0.0f ? 350L : 150L);
    }

    public final void c(int i) {
        Paint paint = this.j;
        paint.setColor(i);
        this.o = paint.getAlpha();
        invalidateSelf();
    }

    public final void d(int i) {
        Paint paint = this.k;
        paint.setColor(i);
        this.p = paint.getAlpha();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPaint(this.k);
        canvas.drawCircle(this.h + this.m, this.i + this.n, this.g * this.l, this.j);
    }

    public final boolean e(float f, float f2) {
        return ocv.bC(f, f2, this.h, this.i) < this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getScale() {
        return this.l;
    }

    public float getTranslationX() {
        return this.m;
    }

    public float getTranslationY() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        float f = i / 255.0f;
        this.j.setAlpha((int) (this.o * f));
        this.k.setAlpha((int) (this.p * f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setScale(float f) {
        this.l = f;
        invalidateSelf();
    }

    public void setTranslationX(float f) {
        this.m = f;
        invalidateSelf();
    }

    public void setTranslationY(float f) {
        this.n = f;
        invalidateSelf();
    }
}
