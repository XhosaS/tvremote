package defpackage;

import android.animation.TimeAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atw implements TimeAnimator.TimeListener {
    static final Interpolator a = new DecelerateInterpolator(2.0f);
    final azx b;
    final azk c;
    final TimeAnimator d;
    final int e;
    final Interpolator f;
    float g;
    float h;

    public atw(ayo ayoVar) {
        TimeAnimator timeAnimator = new TimeAnimator();
        this.d = timeAnimator;
        this.b = (azx) ayoVar.s;
        this.c = ayoVar.t;
        timeAnimator.setTimeListener(this);
        this.e = ayoVar.a.getResources().getInteger(R.integer.lb_browse_rows_anim_duration);
        this.f = a;
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        float interpolation;
        TimeAnimator timeAnimator2 = this.d;
        if (timeAnimator2.isRunning()) {
            int i = this.e;
            if (j >= i) {
                timeAnimator2.end();
                interpolation = 1.0f;
            } else {
                interpolation = (float) (j / i);
            }
            Interpolator interpolator = this.f;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            this.b.C(this.c, this.g + (interpolation * this.h));
        }
    }
}
