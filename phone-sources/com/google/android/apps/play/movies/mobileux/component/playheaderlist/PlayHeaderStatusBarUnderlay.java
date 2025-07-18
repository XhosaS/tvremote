package com.google.android.apps.play.movies.mobileux.component.playheaderlist;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayHeaderStatusBarUnderlay extends View implements Animator.AnimatorListener {
    private static Interpolator f;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    private final Paint g;
    private int h;
    private ObjectAnimator i;

    public PlayHeaderStatusBarUnderlay(Context context) {
        this(context, null);
    }

    public final void a(int i, boolean z) {
        float alpha = getAlpha();
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            alpha = ((Float) this.i.getAnimatedValue()).floatValue();
            this.i.cancel();
        }
        float f2 = i == 1 ? 1.0f : 0.0f;
        if (!z || alpha == f2) {
            setAlpha(f2);
            return;
        }
        if (f == null) {
            f = new LinearInterpolator();
        }
        this.d = i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<PlayHeaderStatusBarUnderlay, Float>) ALPHA, alpha, f2);
        this.i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration((long) (Math.abs(f2 - alpha) * 300.0f));
        this.i.setInterpolator(f);
        this.i.addListener(this);
        this.i.start();
    }

    public final void b(int i) {
        if (this.h == i) {
            return;
        }
        this.h = i;
        invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (animator == this.i) {
            this.d = 0;
            this.i = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (animator == this.i) {
            int i = this.d;
            this.d = 0;
            this.i = null;
            if (i == 2) {
                setMinimumHeight(0);
            }
            setLayerType(0, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        setLayerType(2, null);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i = PlayHeaderListLayout.f;
        int width = getWidth();
        Paint paint = this.g;
        paint.setColor(this.b);
        float f2 = width;
        canvas.drawRect(0.0f, 0.0f, f2, this.h, paint);
        if (this.h > this.c) {
            paint.setColor(this.a);
            canvas.drawRect(0.0f, this.c, f2, this.h, paint);
        }
    }

    public PlayHeaderStatusBarUnderlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = PlayHeaderListLayout.f;
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(false);
        setAlpha(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
