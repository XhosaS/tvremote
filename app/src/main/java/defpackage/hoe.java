package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoe implements View.OnFocusChangeListener {
    final /* synthetic */ hof a;
    private boolean b;

    public hoe(hof hofVar) {
        this.a = hofVar;
        this.b = !hofVar.d.isFocusable();
        hofVar.o.setVisibility(0);
        GradientDrawable gradientDrawable = (GradientDrawable) hofVar.n.getBackground();
        if (hofVar.e.hasFocus()) {
            gradientDrawable.setColor(hofVar.i);
        } else {
            gradientDrawable.setColor(hofVar.h);
        }
        hofVar.e.setForeground(new jrq(ColorStateList.valueOf(hofVar.b.getColor(R.color.pressed_foreground_ripple_color, null)), (int) hofVar.b.getDimension(R.dimen.pressed_foreground_ripple_radius)));
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        hof hofVar = this.a;
        final GradientDrawable gradientDrawable = (GradientDrawable) hofVar.n.getBackground();
        if (!z) {
            ImageDownloadView imageDownloadView = hofVar.e;
            Animator animator = (Animator) imageDownloadView.getTag(R.id.suggestion_flash_animator);
            if (animator != null) {
                if (animator.isRunning()) {
                    animator.cancel();
                }
                imageDownloadView.setTag(R.id.suggestion_flash_animator, null);
            }
            gradientDrawable.setColor(hofVar.h);
        } else if (this.b) {
            gradientDrawable.setColor(hofVar.i);
        } else {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: hod
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    gradientDrawable.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            };
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Integer numValueOf = Integer.valueOf(hofVar.h);
            Integer numValueOf2 = Integer.valueOf(hofVar.j);
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(argbEvaluator, numValueOf, numValueOf2);
            valueAnimatorOfObject.setDuration(hofVar.k);
            Interpolator interpolator = hofVar.m;
            valueAnimatorOfObject.setInterpolator(interpolator);
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), numValueOf2, Integer.valueOf(hofVar.i));
            valueAnimatorOfObject2.setDuration(hofVar.l);
            valueAnimatorOfObject2.setInterpolator(interpolator);
            valueAnimatorOfObject2.addUpdateListener(animatorUpdateListener);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(valueAnimatorOfObject, valueAnimatorOfObject2);
            hofVar.e.setTag(R.id.suggestion_flash_animator, animatorSet);
            animatorSet.start();
        }
        this.b = false;
    }
}
