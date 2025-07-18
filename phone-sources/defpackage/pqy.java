package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqy extends Drawable {
    public final int a;
    public final int b;
    public final int c;
    public float d;
    public float e;
    public float f;
    public prb g;
    private final Paint h;
    private final Paint i;
    private float j;
    private float k;
    private float l;
    private int m;
    private int n;

    public pqy(Context context) {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.i = paint2;
        this.j = 1.0f;
        this.g = prb.PULSE_WITH_INNER_CIRCLE;
        Resources resources = context.getResources();
        this.a = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_inner_radius);
        this.b = resources.getDimensionPixelOffset(R.dimen.libraries_material_featurehighlight_inner_padding);
        this.c = resources.getDimensionPixelOffset(R.dimen.libraries_material_featurehighlight_inner_margin);
        this.n = resources.getInteger(R.integer.libraries_material_featurehighlight_pulse_base_alpha);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        c(-1);
        d(csq.g(-1, this.n));
    }

    public final Animator a() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", getScale(), 0.0f), PropertyValuesHolder.ofInt("alpha", getAlpha(), 0), PropertyValuesHolder.ofFloat("pulseScale", getPulseScale(), 0.0f), PropertyValuesHolder.ofFloat("pulseAlpha", getPulseAlpha(), 0.0f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(pod.b);
        return objectAnimatorOfPropertyValuesHolder.setDuration(200L);
    }

    public final Animator b(float f) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        int iOrdinal = this.g.ordinal();
        if (iOrdinal == 0) {
            objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", f, 1.0f), PropertyValuesHolder.ofInt("alpha", (int) (255.0f * f), 255));
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("Unsupported animation type ".concat(String.valueOf(String.valueOf(this.g))));
            }
            objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f), PropertyValuesHolder.ofInt("alpha", 0));
        }
        objectAnimatorOfPropertyValuesHolder.setInterpolator(pod.a);
        return objectAnimatorOfPropertyValuesHolder.setDuration(f == 0.0f ? 350L : 150L);
    }

    public final void c(int i) {
        Paint paint = this.h;
        paint.setColor(i);
        this.m = paint.getAlpha();
        invalidateSelf();
    }

    public final void d(int i) {
        Paint paint = this.i;
        paint.setColor(i);
        this.n = paint.getAlpha();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.d;
        float f2 = this.j * f;
        float f3 = this.l;
        if (f3 > 0.0f) {
            float f4 = (f * this.k) - f2;
            Paint paint = this.i;
            paint.setAlpha((int) (this.n * f3));
            paint.setStrokeWidth(f4);
            canvas.drawCircle(this.e, this.f, (f4 * 0.5f) + f2, paint);
        }
        canvas.drawCircle(this.e, this.f, f2, this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getPulseAlpha() {
        return this.l;
    }

    public float getPulseScale() {
        return this.k;
    }

    public float getScale() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.h.setAlpha((int) (this.m * (i / 255.0f)));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setPulseAlpha(float f) {
        this.l = f;
        invalidateSelf();
    }

    public void setPulseScale(float f) {
        this.k = f;
        invalidateSelf();
    }

    public void setScale(float f) {
        this.j = f;
        invalidateSelf();
    }
}
