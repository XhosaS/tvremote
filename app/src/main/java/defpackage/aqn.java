package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.os.Build;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqn extends aqk {
    public aqo r;
    public boolean s;
    private float t;

    public aqn(aqm aqmVar) {
        super(aqmVar);
        this.r = null;
        this.t = Float.MAX_VALUE;
        this.s = false;
    }

    @Override // defpackage.aqk
    public final boolean c(long j) {
        float f;
        if (this.s) {
            float f2 = this.t;
            if (f2 != Float.MAX_VALUE) {
                this.r.e = f2;
                this.t = Float.MAX_VALUE;
            }
            this.h = (float) this.r.e;
            this.g = 0.0f;
            this.s = false;
            return true;
        }
        if (this.t != Float.MAX_VALUE) {
            long j2 = j / 2;
            aqi aqiVarA = this.r.a(this.h, this.g, j2);
            aqo aqoVar = this.r;
            aqoVar.e = this.t;
            this.t = Float.MAX_VALUE;
            aqi aqiVarA2 = aqoVar.a(aqiVarA.a, aqiVarA.b, j2);
            f = aqiVarA2.a;
            this.h = f;
            this.g = aqiVarA2.b;
        } else {
            aqi aqiVarA3 = this.r.a(this.h, this.g, j);
            f = aqiVarA3.a;
            this.h = f;
            this.g = aqiVarA3.b;
        }
        float fMax = Math.max(f, this.n);
        this.h = fMax;
        this.h = Math.min(fMax, this.m);
        float f3 = this.g;
        aqo aqoVar2 = this.r;
        if (Math.abs(f3) >= aqoVar2.d || Math.abs(r1 - ((float) aqoVar2.e)) >= aqoVar2.c) {
            return false;
        }
        this.h = (float) this.r.e;
        this.g = 0.0f;
        return true;
    }

    public final void d(float f) {
        if (this.l) {
            this.t = f;
            return;
        }
        if (this.r == null) {
            this.r = new aqo(f);
        }
        aqo aqoVar = this.r;
        double d = f;
        aqoVar.e = d;
        if (aqoVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d2 = (float) d;
        if (d2 > this.m) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.n) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.o * 0.75f);
        aqoVar.c = dAbs;
        aqoVar.d = dAbs * 62.5d;
        if (!aqa.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.l) {
            return;
        }
        this.l = true;
        if (!this.i) {
            this.h = this.k.a(this.j);
        }
        float f2 = this.h;
        if (f2 > this.m || f2 < this.n) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        aqa aqaVarA = aqa.a();
        ArrayList arrayList = aqaVarA.b;
        if (arrayList.size() == 0) {
            aqaVarA.g.a(aqaVarA.d);
            if (Build.VERSION.SDK_INT >= 33) {
                aqaVarA.f = ValueAnimator.getDurationScale();
                if (aqaVarA.h == null) {
                    aqaVarA.h = new apx(aqaVarA);
                }
                final apx apxVar = aqaVarA.h;
                if (apxVar.a == null) {
                    apxVar.a = new ValueAnimator$DurationScaleChangeListener() { // from class: apw
                        public final void onChanged(float f3) {
                            apxVar.b.f = f3;
                        }
                    };
                    ValueAnimator.registerDurationScaleChangeListener(apxVar.a);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public aqn(Object obj, aql aqlVar) {
        super(obj, aqlVar);
        this.r = null;
        this.t = Float.MAX_VALUE;
        this.s = false;
    }
}
