package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gir extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new dup();
    private static final int[] g = {-16777216};
    public final giq a;
    public final Resources b;
    float c;
    boolean d;
    private float h;
    private final Animator i;

    public gir(Context context) {
        context.getClass();
        this.b = context.getResources();
        giq giqVar = new giq();
        this.a = giqVar;
        giqVar.i = g;
        giqVar.g();
        giqVar.d(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new gio(this, giqVar, 0));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(e);
        valueAnimatorOfFloat.addListener(new gip(this, giqVar));
        this.i = valueAnimatorOfFloat;
    }

    static final void e(float f2, giq giqVar) {
        if (f2 <= 0.75f) {
            giqVar.t = giqVar.a();
            return;
        }
        int iA = giqVar.a();
        int[] iArr = giqVar.i;
        giqVar.f();
        int i = iArr[0];
        int i2 = iA >> 24;
        int i3 = iA >> 16;
        int i4 = iA >> 8;
        int i5 = i >> 16;
        int i6 = i >> 8;
        float f3 = (f2 - 0.75f) / 0.25f;
        int i7 = (i4 & 255) + ((int) (((i6 & 255) - r4) * f3));
        int i8 = (i3 & 255) + ((int) (((i5 & 255) - r3) * f3));
        int i9 = i2 & 255;
        giqVar.t = ((i9 + ((int) (f3 * (((i >> 24) & 255) - i9)))) << 24) | (i8 << 16) | (i7 << 8) | ((iA & 255) + ((int) (((i & 255) - r0) * f3)));
    }

    final void a(float f2, giq giqVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.d) {
            e(f2, giqVar);
            double dFloor = Math.floor(giqVar.l / 0.8f) + 1.0d;
            float f3 = giqVar.j;
            float f4 = giqVar.k;
            giqVar.e = f3 + ((((-0.01f) + f4) - f3) * f2);
            giqVar.f = f4;
            float f5 = giqVar.l;
            giqVar.g = f5 + ((((float) dFloor) - f5) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f6 = giqVar.l;
            if (f2 < 0.5f) {
                interpolation = giqVar.j;
                interpolation2 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = giqVar.j + 0.79f;
                interpolation = f7 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f7;
            }
            float f8 = f6 + (0.20999998f * f2);
            float f9 = f2 + this.c;
            giqVar.e = interpolation;
            giqVar.f = interpolation2;
            giqVar.g = f8;
            this.h = f9 * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.c(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        giq giqVar = this.a;
        if (f2 != giqVar.o) {
            giqVar.o = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        giq giqVar = this.a;
        giqVar.e = 0.0f;
        giqVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        giq giqVar = this.a;
        float f2 = giqVar.p;
        float fMin = (giqVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((giqVar.q * giqVar.o) / 2.0f, giqVar.h / 2.0f);
        }
        RectF rectF = giqVar.a;
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f3 = giqVar.e;
        float f4 = giqVar.g;
        float f5 = f3 + f4;
        float f6 = giqVar.f + f4;
        Paint paint = giqVar.b;
        paint.setColor(giqVar.t);
        paint.setAlpha(giqVar.s);
        float f7 = giqVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, giqVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        float f9 = f5 * 360.0f;
        float f10 = (f6 * 360.0f) - f9;
        canvas.drawArc(rectF, f9, f10, false, paint);
        if (giqVar.m) {
            Path path = giqVar.n;
            if (path == null) {
                giqVar.n = new Path();
                giqVar.n.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f11 = (giqVar.q * giqVar.o) / 2.0f;
            giqVar.n.moveTo(0.0f, 0.0f);
            giqVar.n.lineTo(giqVar.q * giqVar.o, 0.0f);
            Path path2 = giqVar.n;
            float f12 = giqVar.q;
            float f13 = giqVar.o;
            path2.lineTo((f12 * f13) / 2.0f, giqVar.r * f13);
            giqVar.n.offset((fMin2 + rectF.centerX()) - f11, rectF.centerY() + (giqVar.h / 2.0f));
            giqVar.n.close();
            Paint paint2 = giqVar.c;
            paint2.setColor(giqVar.t);
            paint2.setAlpha(giqVar.s);
            canvas.save();
            canvas.rotate(f9 + f10, rectF.centerX(), rectF.centerY());
            canvas.drawPath(giqVar.n, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animator animator = this.i;
        animator.cancel();
        giq giqVar = this.a;
        giqVar.e();
        if (giqVar.f != giqVar.e) {
            this.d = true;
            animator.setDuration(666L);
            animator.start();
        } else {
            giqVar.g();
            giqVar.b();
            animator.setDuration(1332L);
            animator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        giq giqVar = this.a;
        giqVar.c(false);
        giqVar.g();
        giqVar.b();
        invalidateSelf();
    }
}
