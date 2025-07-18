package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfw extends DrawerArrowDrawable {
    private ValueAnimator a;

    public tfw(Context context) {
        super(context);
    }

    public final void a(float f) {
        if (f == 1.0f) {
            setVerticalMirror(true);
        } else if (f == 0.0f) {
            setVerticalMirror(false);
        }
        setProgress(f);
    }

    public final void b(int i, int i2) {
        float f = 1 != i ? 0.0f : 1.0f;
        if (i2 == 0) {
            a(f);
            return;
        }
        if (i2 == 1) {
            a(f);
            ObjectAnimator duration = ObjectAnimator.ofInt(this, "alpha", 0, 255).setDuration(400L);
            duration.setInterpolator(thk.a);
            duration.start();
            return;
        }
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float progress = getProgress();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(progress, f);
        this.a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(i == 0 ? (long) (progress * 350.0f) : (long) ((1.0f - progress) * 350.0f));
        this.a.setInterpolator(thk.a);
        this.a.addUpdateListener(new tfv(this));
        this.a.start();
    }

    @Override // android.support.v7.graphics.drawable.DrawerArrowDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        invalidateSelf();
    }
}
