package com.google.android.apps.tvsearch.results.motion;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import com.google.android.apps.tvsearch.results.motion.ScalingAnimator;
import defpackage.agpc;
import defpackage.agpn;
import defpackage.agum;
import defpackage.hlu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScalingAnimator {
    public final Interpolator a;
    public float b;
    private final hlu c;
    private final long d;
    private final long e;
    private float f;
    private final agpc g = new agpn(new agum() { // from class: hlt
        @Override // defpackage.agum
        public final Object a() {
            ScalingAnimator scalingAnimator = this.a;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(scalingAnimator, "scaleLevel", 0.0f);
            objectAnimatorOfFloat.setInterpolator(scalingAnimator.a);
            return objectAnimatorOfFloat;
        }
    });

    public ScalingAnimator(hlu hluVar, long j, long j2, Interpolator interpolator) {
        this.c = hluVar;
        this.d = j;
        this.e = j2;
        this.a = interpolator;
    }

    public final ValueAnimator a() {
        Object objA = this.g.a();
        objA.getClass();
        return (ValueAnimator) objA;
    }

    public final void b() {
        d();
        if (this.f == 0.0f) {
            return;
        }
        this.b = 0.0f;
        ValueAnimator valueAnimatorA = a();
        valueAnimatorA.setDuration(this.d);
        valueAnimatorA.setFloatValues(0.0f);
        valueAnimatorA.start();
    }

    public final void c() {
        d();
        if (this.f == 1.0f) {
            return;
        }
        this.b = 1.0f;
        ValueAnimator valueAnimatorA = a();
        valueAnimatorA.setDuration(this.e);
        valueAnimatorA.setFloatValues(1.0f);
        valueAnimatorA.start();
    }

    public final void d() {
        ValueAnimator valueAnimatorA = a();
        if (valueAnimatorA.isRunning()) {
            valueAnimatorA.cancel();
        }
    }

    public final void e() {
        d();
        this.b = 0.0f;
        setScaleLevel(0.0f);
    }

    public final float getScaleLevel() {
        return this.f;
    }

    public final void setScaleLevel(float f) {
        this.f = f;
        this.c.a(f);
    }
}
