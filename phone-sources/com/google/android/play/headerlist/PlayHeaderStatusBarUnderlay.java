package com.google.android.play.headerlist;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.tfx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayHeaderStatusBarUnderlay extends View implements Animator.AnimatorListener {
    private final Paint a;

    public PlayHeaderStatusBarUnderlay(Context context) {
        this(context, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (animator == null) {
            setLayerType(0, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        setLayerType(2, null);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i = tfx.a;
        Paint paint = this.a;
        int width = getWidth();
        paint.setColor(0);
        canvas.drawRect(0.0f, 0.0f, width, 0.0f, paint);
    }

    public PlayHeaderStatusBarUnderlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = tfx.a;
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(false);
        setAlpha(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
