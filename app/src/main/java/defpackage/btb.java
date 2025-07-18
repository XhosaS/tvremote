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
public class btb extends Drawable implements Animatable {
    private static final Interpolator d = new LinearInterpolator();
    private static final Interpolator e = new ath();
    private static final int[] f = {-16777216};
    public final bta a;
    float b;
    boolean c;
    private float g;
    private Resources h;
    private Animator i;

    public btb(Context context) {
        context.getClass();
        this.h = context.getResources();
        bta btaVar = new bta();
        this.a = btaVar;
        btaVar.i = f;
        btaVar.e();
        btaVar.c(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new bsy(this, btaVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(d);
        valueAnimatorOfFloat.addListener(new bsz(this, btaVar));
        this.i = valueAnimatorOfFloat;
    }

    private final void g(float f2, float f3, float f4, float f5) {
        float f6 = this.h.getDisplayMetrics().density;
        bta btaVar = this.a;
        btaVar.c(f3 * f6);
        btaVar.q = f2 * f6;
        btaVar.e();
        btaVar.r = (int) (f4 * f6);
        btaVar.s = (int) (f5 * f6);
    }

    final void a(float f2, bta btaVar, boolean z) {
        float fA;
        float fA2;
        if (this.c) {
            e(f2, btaVar);
            double dFloor = Math.floor(btaVar.m / 0.8f) + 1.0d;
            float f3 = btaVar.k;
            float f4 = btaVar.l;
            btaVar.e = f3 + ((((-0.01f) + f4) - f3) * f2);
            btaVar.f = f4;
            float f5 = btaVar.m;
            btaVar.g = f5 + ((((float) dFloor) - f5) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f6 = btaVar.m;
            if (f2 < 0.5f) {
                fA = btaVar.k;
                fA2 = (atj.a(ath.a, f2 / 0.5f) * 0.79f) + 0.01f + fA;
            } else {
                float f7 = btaVar.k + 0.79f;
                fA = f7 - (((1.0f - atj.a(ath.a, ((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                fA2 = f7;
            }
            float f8 = f6 + (0.20999998f * f2);
            float f9 = f2 + this.b;
            btaVar.e = fA;
            btaVar.f = fA2;
            btaVar.g = f8;
            this.g = f9 * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.b(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        bta btaVar = this.a;
        if (f2 != btaVar.p) {
            btaVar.p = f2;
        }
        invalidateSelf();
    }

    public final void d(int i) {
        if (i == 0) {
            g(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            g(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.g, bounds.exactCenterX(), bounds.exactCenterY());
        bta btaVar = this.a;
        float f2 = btaVar.q;
        float fMin = (btaVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((btaVar.r * btaVar.p) / 2.0f, btaVar.h / 2.0f);
        }
        RectF rectF = btaVar.a;
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f3 = btaVar.e;
        float f4 = btaVar.g;
        float f5 = f3 + f4;
        float f6 = btaVar.f + f4;
        Paint paint = btaVar.b;
        paint.setColor(btaVar.u);
        paint.setAlpha(btaVar.t);
        float f7 = btaVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, btaVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        float f9 = f5 * 360.0f;
        float f10 = (f6 * 360.0f) - f9;
        canvas.drawArc(rectF, f9, f10, false, paint);
        if (btaVar.n) {
            Path path = btaVar.o;
            if (path == null) {
                btaVar.o = new Path();
                btaVar.o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f11 = (btaVar.r * btaVar.p) / 2.0f;
            btaVar.o.moveTo(0.0f, 0.0f);
            btaVar.o.lineTo(btaVar.r * btaVar.p, 0.0f);
            Path path2 = btaVar.o;
            float f12 = btaVar.r;
            float f13 = btaVar.p;
            path2.lineTo((f12 * f13) / 2.0f, btaVar.s * f13);
            btaVar.o.offset((fMin2 + rectF.centerX()) - f11, rectF.centerY() + (btaVar.h / 2.0f));
            btaVar.o.close();
            Paint paint2 = btaVar.c;
            paint2.setColor(btaVar.u);
            paint2.setAlpha(btaVar.t);
            canvas.save();
            canvas.rotate(f9 + f10, rectF.centerX(), rectF.centerY());
            canvas.drawPath(btaVar.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    final void e(float f2, bta btaVar) {
        if (f2 <= 0.75f) {
            int[] iArr = btaVar.i;
            int i = btaVar.j;
            btaVar.u = iArr[0];
            return;
        }
        int[] iArr2 = btaVar.i;
        int i2 = btaVar.j;
        int i3 = iArr2[0];
        int length = iArr2.length;
        int i4 = (int) (((f2 - 0.75f) / 0.25f) * 0);
        btaVar.u = ((((i3 >> 24) & 255) + i4) << 24) | ((((i3 >> 16) & 255) + i4) << 16) | ((((i3 >> 8) & 255) + i4) << 8) | ((i3 & 255) + i4);
    }

    public final void f(float f2) {
        bta btaVar = this.a;
        btaVar.e = 0.0f;
        btaVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
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
        this.a.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.i.cancel();
        bta btaVar = this.a;
        btaVar.d();
        if (btaVar.f != btaVar.e) {
            this.c = true;
            this.i.setDuration(666L);
            this.i.start();
        } else {
            btaVar.e();
            btaVar.a();
            this.i.setDuration(1332L);
            this.i.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.g = 0.0f;
        bta btaVar = this.a;
        btaVar.b(false);
        btaVar.e();
        btaVar.a();
        invalidateSelf();
    }
}
