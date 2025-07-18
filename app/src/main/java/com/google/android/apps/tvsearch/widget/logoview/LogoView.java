package com.google.android.apps.tvsearch.widget.logoview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.tvsearch.widget.logoview.LogoView;
import defpackage.jps;
import defpackage.jpv;
import defpackage.jpw;
import defpackage.jpx;
import defpackage.jpy;
import defpackage.jrc;
import defpackage.jrd;
import defpackage.jre;
import defpackage.jrf;
import defpackage.jrg;
import defpackage.jrh;
import defpackage.jri;
import defpackage.jrj;
import defpackage.jrk;
import defpackage.jrl;
import defpackage.jrm;
import defpackage.jrn;
import defpackage.jro;
import defpackage.jrp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LogoView extends View implements TimeAnimator.TimeListener, jre {
    public final jrj a;
    public int b;
    public int c;
    private final TimeAnimator d;
    private final jrm e;
    private final jro f;
    private final AnimatorSet g;
    private final Paint h;
    private final Paint i;
    private float j;
    private jrc k;
    private boolean l;
    private int m;

    static {
        new jpv();
        new jpw();
    }

    public LogoView(Context context) {
        this(context, null);
    }

    private final float e() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private final float f() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final void g(Canvas canvas, jrp jrpVar) {
        Paint paint = this.h;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(jrpVar.a);
        paint.setStrokeWidth(jrpVar.c);
        canvas.drawPath(jrpVar.b, paint);
        paint.setStrokeWidth(jrpVar.g);
        canvas.drawPath(jrpVar.f, paint);
    }

    private final void h() {
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jpt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimatorOfInt.getAnimatedValue()).intValue();
                LogoView logoView = this.a;
                logoView.b = iIntValue;
                logoView.invalidate();
            }
        });
        final ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt2.setDuration(100L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jpu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimatorOfInt2.getAnimatedValue()).intValue();
                LogoView logoView = this.a;
                logoView.c = iIntValue;
                logoView.invalidate();
            }
        });
        Animator[] animatorArr = {valueAnimatorOfInt, valueAnimatorOfInt2};
        AnimatorSet animatorSet = this.g;
        animatorSet.playSequentially(animatorArr);
        animatorSet.addListener(new jpx());
        this.h.setAntiAlias(true);
        this.i.setFilterBitmap(true);
        this.d.setTimeListener(this);
    }

    private final void i(boolean z) {
        TimeAnimator timeAnimator = this.d;
        if (timeAnimator == null || this.l == z) {
            return;
        }
        this.l = z;
        if (z) {
            if (this.b != 255 || this.c != 0) {
                this.k.c();
            }
            timeAnimator.setTimeListener(this);
            return;
        }
        this.g.cancel();
        timeAnimator.setTimeListener(null);
        timeAnimator.end();
        this.k.b();
    }

    private final void j() {
        jrj jrjVar = this.a;
        this.j = Math.min(f() / jrjVar.d(), e() / jrjVar.b());
    }

    private static jri k() {
        return new jri(new jrh(80.0f, 1000.0f), new jrg(360.0f), new jrh(80.0f, 160.0f), new jrh(320.0f, 40.0f), new jrh(160.0f, 1000.0f), new jrh(1000.0f, 1000.0f), new jrh(160.0f, 160.0f), new jrh(160.0f, 160.0f), new jrh(320.0f, 320.0f));
    }

    @Override // defpackage.jre
    public final void a() {
        TimeAnimator timeAnimator = this.d;
        if (timeAnimator.isStarted() || !this.l) {
            return;
        }
        timeAnimator.start();
    }

    public final void b(jps jpsVar, int i) {
        this.k.d(jpsVar, i);
    }

    public final void c(float f, float f2) {
        this.a.k(f, f2);
        j();
        invalidate();
    }

    public final void d(int i, boolean z) {
        this.m = i;
        boolean z2 = true;
        if (this.l && !z) {
            z2 = false;
        }
        this.k.f(i, z2);
        if (!this.l) {
            this.k.b();
        } else if (z) {
            this.k.c();
        }
    }

    public int getState() {
        return this.k.a();
    }

    public int getTargetState() {
        return this.m;
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i(isShown());
        this.k.e(this);
        this.k.g();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i(false);
        this.k.e(null);
        this.k.g();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f4 = 2.0f;
        canvas2.translate(getPaddingLeft() + (f() / 2.0f), getPaddingTop() + (e() / 2.0f));
        jrj<jri> jrjVar = this.a;
        for (jri jriVar : jrjVar) {
            Paint paint = this.h;
            paint.setColor(jriVar.a);
            paint.setAlpha(255);
            float f5 = jriVar.c.f;
            float fC = jrjVar.c() + jriVar.d.f;
            float f6 = jriVar.f.f;
            float f7 = jriVar.g.f;
            double d = fC;
            float fCos = (((float) Math.cos(d)) * f5) + f6;
            float fSin = (f5 * ((float) Math.sin(d))) + f7;
            if (jriVar.g()) {
                float f8 = jriVar.k.f;
                jro jroVar = this.f;
                jroVar.f();
                if (jriVar == jrjVar.q()) {
                    jroVar.a(jroVar.b, jrn.a, 7.0f, -1.0f, f8);
                    jroVar.c = f8 + f8 + 4.0f;
                    jroVar.a = Paint.Cap.ROUND;
                } else if (jriVar == jrjVar.s()) {
                    jroVar.a(jroVar.b, jrn.b, 14.0f, -1.0f, f8);
                    jroVar.c = (f8 * (-2.0f)) + 4.0f;
                    jroVar.a = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                } else if (jriVar == jrjVar.v()) {
                    jroVar.a(jroVar.b, jrn.c, 5.0f, -1.0f, f8);
                    jroVar.c = (f8 * (-2.0f)) + 4.0f;
                    jroVar.a = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                } else if (jriVar == jrjVar.r()) {
                    jroVar.a(jroVar.b, jrn.d, 4.0f, 10.0f, f8);
                    jroVar.c = (f8 * (-2.0f)) + 4.0f;
                    jroVar.a = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                }
                jroVar.g(fCos, fSin, this.j);
                g(canvas2, jroVar);
            } else {
                float f9 = jriVar.j.f;
                if (f9 > 0.001f) {
                    float f10 = jriVar.i.f;
                    jrm jrmVar = this.e;
                    jrmVar.f();
                    f = f4;
                    if (jriVar == jrjVar.q()) {
                        float fB = jrmVar.b(f9);
                        float fA = jrmVar.a(f10, f9);
                        float f11 = ((0.66999996f * f9) + 1.0f) * fA;
                        float fC2 = jrmVar.c(f11, f9);
                        float f12 = fC2 + (((fC2 * 1.08f) - fC2) * f9);
                        jrmVar.c = f12;
                        jrmVar.a = Paint.Cap.BUTT;
                        float f13 = (fA - f11) + (((fC2 - f12) / f) * f9);
                        if (fB > 0.0f) {
                            RectF rectF = jrmVar.e;
                            jrmVar.d(rectF, f11, 0.97f);
                            rectF.offset(0.0f, f13);
                            Path path = jrmVar.b;
                            path.addArc(rectF, 88.0f, 184.0f);
                            jrmVar.d(rectF, f11, 1.0f);
                            rectF.offset(0.0f, f13);
                            path.addArc(rectF, 88.0f, 184.0f);
                            float f14 = f11 + f13;
                            path.moveTo(0.0f, f14);
                            path.cubicTo(f11 * 0.83f, f14, f11 * 0.99f, (0.3f * f11) + f13, f11 * 0.93f, ((-0.05f) * f11) + f13);
                            jrmVar.d(rectF, f11, 1.0f);
                            rectF.offset(0.0f, f13);
                            path.addArc(rectF, 270.0f, 90.0f - (46.0f * fB));
                            float f15 = 1.06f * f11 * fB;
                            float f16 = f11 * 1.08f;
                            float f17 = f13 + 0.42f;
                            path.moveTo(f16 - f15, f17);
                            path.lineTo(f16, f17);
                        } else {
                            jrmVar.b.addCircle(0.0f, f13, f11, Path.Direction.CW);
                        }
                    } else if (jriVar == jrjVar.s() || jriVar == jrjVar.v()) {
                        jrmVar.e(f9, f10);
                    } else if (jriVar == jrjVar.t()) {
                        float fB2 = jrmVar.b(f9);
                        float fA2 = jrmVar.a(f10, f9);
                        float fC3 = jrmVar.c(fA2, f9);
                        jrmVar.a = Paint.Cap.BUTT;
                        jrmVar.c = fC3;
                        if (fB2 > 0.0f) {
                            jrmVar.c = fC3 / f;
                            RectF rectF2 = jrmVar.e;
                            jrmVar.d(rectF2, fA2, 0.92f);
                            float f18 = fC3 / 4.0f;
                            rectF2.inset(f18, f18);
                            Path path2 = jrmVar.b;
                            path2.addOval(rectF2, Path.Direction.CW);
                            float f19 = (fC3 * (-2.0f)) / 4.0f;
                            rectF2.inset(f19 * 0.9f, f19);
                            rectF2.offset(-0.4f, 0.0f);
                            path2.addOval(rectF2, Path.Direction.CW);
                            rectF2.offset(0.5f, 0.0f);
                            path2.addArc(rectF2, 88.0f, 184.0f);
                            float f20 = fB2 / 0.1f;
                            float f21 = fB2 - 0.1f;
                            float fMin = Math.min(f20, 1.0f);
                            jrmVar.g = fC3 * 1.05f;
                            if (fMin > 0.0f) {
                                float f22 = (-1.17f) * fA2 * fMin;
                                float f23 = 1.21f * fA2 * fMin;
                                float f24 = fA2 * 0.9f;
                                Path path3 = jrmVar.f;
                                path3.moveTo(f24, f22);
                                path3.lineTo(f24, f23);
                            }
                            float f25 = f21 / 0.9f;
                            if (f25 > 0.0f) {
                                jrmVar.d(rectF2, fA2, 0.925f);
                                rectF2.offset(-0.14f, fA2 * 1.15f);
                                jrmVar.f.addArc(rectF2, -2.0f, f25 * 158.0f);
                            }
                        } else {
                            jrmVar.b.addCircle(0.0f, 0.0f, fA2, Path.Direction.CW);
                        }
                    } else if (jriVar == jrjVar.r()) {
                        jrmVar.c = f10 * 4.0f * (((-0.35000002f) * f9) + 1.0f);
                        if (f9 > 0.66f) {
                            jrmVar.a = Paint.Cap.SQUARE;
                        } else {
                            jrmVar.a = Paint.Cap.ROUND;
                        }
                        Path path4 = jrmVar.b;
                        path4.moveTo(0.0f, (-10.46f) * f9);
                        path4.lineTo(0.0f, 4.19f * f9);
                    } else {
                        if (jriVar == jrjVar.u()) {
                            float fB3 = jrmVar.b(f9);
                            float fA3 = jrmVar.a(f10, f9);
                            jrmVar.c = jrmVar.c(fA3, f9);
                            jrmVar.a = Paint.Cap.BUTT;
                            if (fB3 > 0.0f) {
                                RectF rectF3 = jrmVar.e;
                                jrmVar.d(rectF3, fA3, 0.9f);
                                Path path5 = jrmVar.b;
                                path5.addArc(rectF3, 88.0f, 184.0f);
                                jrmVar.d(rectF3, fA3, 0.94f);
                                path5.addArc(rectF3, 88.0f, 184.0f);
                                jrmVar.d(rectF3, fA3, 1.05f);
                                path5.addArc(rectF3, 33.0f, 57.0f);
                                jrmVar.d(rectF3, fA3, 0.89f);
                                path5.addArc(rectF3, 270.0f, (-270.0f) + (393.0f - (fB3 * 48.0f)));
                                float radians = (float) Math.toRadians(((-173.0f) + r11) - 11.0f);
                                float radians2 = (float) Math.toRadians(r11 - 11.0f);
                                double d2 = radians;
                                double d3 = fA3 * 1.15f;
                                f2 = fSin;
                                double dCos = d3 * Math.cos(d2);
                                double dSin = Math.sin(d2) * d3;
                                double d4 = radians2;
                                f3 = f9;
                                double dCos2 = d3 * Math.cos(d4);
                                double dSin2 = d3 * Math.sin(d4);
                                Path path6 = jrmVar.f;
                                path6.moveTo((float) dCos, (float) dSin);
                                path6.lineTo((float) dCos2, (float) dSin2);
                                jrmVar.g = jrmVar.c * 0.85f;
                            } else {
                                f2 = fSin;
                                f3 = f9;
                                jrmVar.b.addCircle(0.0f, 0.0f, fA3, Path.Direction.CW);
                            }
                        }
                        jrjVar.x();
                        jrmVar.g(fCos, f2 + (f3 * 0.6f), this.j);
                        g(canvas2, jrmVar);
                    }
                    f2 = fSin;
                    f3 = f9;
                    jrjVar.x();
                    jrmVar.g(fCos, f2 + (f3 * 0.6f), this.j);
                    g(canvas2, jrmVar);
                } else {
                    f = f4;
                    jrh jrhVar = jriVar.h;
                    float f26 = jrhVar.f;
                    if (f26 < -0.001f || f26 > 0.001f) {
                        paint.setStrokeWidth(jriVar.e.f * this.j);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        float f27 = jrhVar.f;
                        float f28 = this.j;
                        float f29 = fCos * f28;
                        canvas2.drawLine(f29, (fSin - f27) * f28, f29, (f27 + fSin) * f28, paint);
                        canvas2 = canvas;
                    } else {
                        float f30 = jriVar.e.f * jriVar.i.f;
                        paint.setStyle(Paint.Style.FILL);
                        float f31 = this.j;
                        canvas2.drawCircle(fCos * f31, fSin * f31, (f30 / f) * f31, paint);
                    }
                }
                f4 = f;
            }
        }
        setAlpha(jrjVar.a());
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        j();
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        for (long jMin = Math.min(100L, j2); jMin > 0; jMin -= 10) {
            this.a.m(Math.min(jMin, 10L));
        }
        if (this.a.n()) {
            this.d.end();
            if (this.k.a() == 6 && this.b != 255) {
                this.g.start();
            }
        } else {
            this.g.cancel();
            this.c = 255;
            this.b = 0;
        }
        invalidate();
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        i(isShown());
    }

    public LogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 255;
        this.l = true;
        this.m = 0;
        this.g = new AnimatorSet();
        this.e = new jrm();
        this.f = new jro();
        this.h = new Paint();
        this.i = new Paint();
        jri jriVarK = k();
        jri jriVarK2 = k();
        jri jriVarK3 = k();
        jri jriVarK4 = k();
        jri jriVarK5 = k();
        jri jriVarK6 = k();
        jrl jrlVar = new jrl(new jrg(80.0f), new jrh(80.0f, 80.0f));
        jrh jrhVar = new jrh(1000.0f, 1000.0f);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, jpy.a, 0, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            jrk jrkVar = new jrk(jriVarK, jriVarK2, jriVarK3, jriVarK4, jriVarK5, jriVarK6, jrlVar, jrhVar, z);
            this.a = jrkVar;
            this.d = new TimeAnimator();
            this.k = new jrd(jrkVar, new TimeAnimator(), this, new jrf());
            h();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    LogoView(Context context, AttributeSet attributeSet, AnimatorSet animatorSet, jrm jrmVar, jro jroVar, Paint paint, Paint paint2, jrj jrjVar, TimeAnimator timeAnimator, jrc jrcVar) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 255;
        this.l = true;
        this.m = 0;
        this.g = animatorSet;
        this.e = jrmVar;
        this.f = jroVar;
        this.h = paint;
        this.i = paint2;
        this.a = jrjVar;
        this.d = timeAnimator;
        this.k = jrcVar;
        h();
    }
}
