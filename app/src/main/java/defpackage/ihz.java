package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
class ihz extends AnimatorListenerAdapter {
    final /* synthetic */ TextView a;
    final /* synthetic */ yyk b;
    final /* synthetic */ ObjectAnimator c;
    final /* synthetic */ iic d;
    private boolean e = false;

    public ihz(iic iicVar, TextView textView, yyk yykVar, ObjectAnimator objectAnimator) {
        this.a = textView;
        this.b = yykVar;
        this.c = objectAnimator;
        this.d = iicVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.e = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.e) {
            return;
        }
        ObjectAnimator objectAnimator = this.c;
        objectAnimator.setStartDelay(((Long) iic.e.get(this.d.ah)).longValue());
        objectAnimator.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.e = false;
        this.a.setText((CharSequence) this.b.get(this.d.ah));
    }
}
