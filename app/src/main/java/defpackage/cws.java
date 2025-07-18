package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cws extends cwo implements Choreographer.FrameCallback {
    public cph j;
    public float c = 1.0f;
    private boolean m = false;
    public long d = 0;
    public float e = 0.0f;
    public float f = 0.0f;
    public int g = 0;
    public float h = -2.1474836E9f;
    public float i = 2.1474836E9f;
    public boolean k = false;
    public boolean l = false;

    public final float c() {
        cph cphVar = this.j;
        if (cphVar == null) {
            return 0.0f;
        }
        float f = this.f;
        float f2 = cphVar.i;
        return (f - f2) / (cphVar.j - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        g();
        i(true);
    }

    public final float d() {
        cph cphVar = this.j;
        if (cphVar == null) {
            return 0.0f;
        }
        float f = this.i;
        return f == 2.1474836E9f ? cphVar.j : f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        h();
        cph cphVar = this.j;
        if (cphVar == null || !this.k) {
            return;
        }
        long j2 = this.d;
        long j3 = j2 != 0 ? j - j2 : 0L;
        float fAbs = (1.0E9f / cphVar.k) / Math.abs(this.c);
        float f = this.e;
        float f2 = j3 / fAbs;
        if (m()) {
            f2 = -f2;
        }
        float f3 = f + f2;
        float fE = e();
        float fD = d();
        PointF pointF = cwt.a;
        boolean z = f3 >= fE && f3 <= fD;
        float f4 = this.e;
        float fMax = Math.max(e(), Math.min(d(), f3));
        this.e = fMax;
        if (this.l) {
            fMax = (float) Math.floor(fMax);
        }
        this.f = fMax;
        this.d = j;
        if (!this.l || this.e != f4) {
            b();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.g < getRepeatCount()) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.g++;
                if (getRepeatMode() == 2) {
                    this.m = !this.m;
                    j();
                } else {
                    float fD2 = m() ? d() : e();
                    this.e = fD2;
                    this.f = fD2;
                }
                this.d = j;
            } else {
                float fE2 = this.c < 0.0f ? e() : d();
                this.e = fE2;
                this.f = fE2;
                i(true);
                a(m());
            }
        }
        if (this.j != null) {
            float f5 = this.f;
            float f6 = this.h;
            if (f5 < f6 || f5 > this.i) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f6), Float.valueOf(this.i), Float.valueOf(this.f)));
            }
        }
        coy.a();
    }

    public final float e() {
        cph cphVar = this.j;
        if (cphVar == null) {
            return 0.0f;
        }
        float f = this.h;
        return f == -2.1474836E9f ? cphVar.i : f;
    }

    public final void f() {
        i(true);
        a(m());
    }

    public final void g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(m());
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fD;
        float fE;
        if (this.j == null) {
            return 0.0f;
        }
        if (m()) {
            fD = d();
            fE = this.f;
        } else {
            fD = this.f;
            fE = e();
        }
        return (fD - fE) / (d() - e());
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        cph cphVar = this.j;
        if (cphVar == null) {
            return 0L;
        }
        return (long) cphVar.a();
    }

    public final void h() {
        if (this.k) {
            i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.k = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.k;
    }

    public final void j() {
        this.c = -this.c;
    }

    public final void k(float f) {
        if (this.e == f) {
            return;
        }
        float fE = e();
        float fD = d();
        PointF pointF = cwt.a;
        float fMax = Math.max(fE, Math.min(fD, f));
        this.e = fMax;
        if (this.l) {
            fMax = (float) Math.floor(fMax);
        }
        this.f = fMax;
        this.d = 0L;
        b();
    }

    public final void l(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        cph cphVar = this.j;
        float f3 = cphVar == null ? -3.4028235E38f : cphVar.i;
        float f4 = cphVar == null ? Float.MAX_VALUE : cphVar.j;
        PointF pointF = cwt.a;
        float fMax = Math.max(f3, Math.min(f4, f));
        float fMax2 = Math.max(f3, Math.min(f4, f2));
        if (fMax == this.h && fMax2 == this.i) {
            return;
        }
        this.h = fMax;
        this.i = fMax2;
        k((int) Math.max(fMax, Math.min(fMax2, this.f)));
    }

    public final boolean m() {
        return this.c < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.m) {
            return;
        }
        this.m = false;
        j();
    }
}
