package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.enl;
import defpackage.enm;
import defpackage.enn;
import defpackage.eno;
import defpackage.enp;
import defpackage.enr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    private final Paint a;
    private final enr b;
    private final boolean c;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new enr();
        this.c = true;
        b(context, null);
    }

    private final void b(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.b.setCallback(this);
        if (attributeSet == null) {
            a(new enm().a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, enl.a, 0, 0);
        try {
            enn enoVar = (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) ? new eno() : new enm();
            enoVar.b(typedArrayObtainStyledAttributes);
            a(enoVar.a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(enp enpVar) {
        boolean zIsStarted;
        enr enrVar = this.b;
        enrVar.d = enpVar;
        enp enpVar2 = enrVar.d;
        if (enpVar2 != null) {
            enrVar.b.setXfermode(new PorterDuffXfermode(enpVar2.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        enrVar.b();
        if (enrVar.d != null) {
            ValueAnimator valueAnimator = enrVar.c;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                enrVar.c.cancel();
                enrVar.c.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            enp enpVar3 = enrVar.d;
            enrVar.c = ValueAnimator.ofFloat(0.0f, (enpVar3.t / enpVar3.s) + 1.0f);
            enrVar.c.setRepeatMode(enrVar.d.r);
            enrVar.c.setRepeatCount(enrVar.d.q);
            enrVar.c.setStartDelay(enrVar.d.u);
            ValueAnimator valueAnimator2 = enrVar.c;
            enp enpVar4 = enrVar.d;
            valueAnimator2.setDuration(enpVar4.s + enpVar4.t);
            enrVar.c.addUpdateListener(enrVar.a);
            if (zIsStarted) {
                enrVar.c.start();
            }
        }
        enrVar.invalidateSelf();
        if (enpVar.n) {
            setLayerType(2, this.a);
        } else {
            setLayerType(0, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        enr enrVar = this.b;
        ValueAnimator valueAnimator = enrVar.c;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        enrVar.c.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.b = new enr();
        this.c = true;
        b(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint();
        this.b = new enr();
        this.c = true;
        b(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new Paint();
        this.b = new enr();
        this.c = true;
        b(context, attributeSet);
    }
}
