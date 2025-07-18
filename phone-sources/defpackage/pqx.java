package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqx extends AnimatorListenerAdapter {
    private final Context a;

    public pqx(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i < 26 ? Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f : ValueAnimator.areAnimatorsEnabled()) {
            if (!((PowerManager) context.getSystemService("power")).isPowerSaveMode()) {
                return;
            }
        }
        animator.removeListener(this);
        animator.cancel();
    }
}
