package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
class iij extends AnimatorListenerAdapter {
    final /* synthetic */ TextView a;
    final /* synthetic */ yyk b;
    final /* synthetic */ ObjectAnimator c;
    final /* synthetic */ iim d;
    private boolean e = false;

    public iij(iim iimVar, TextView textView, yyk yykVar, ObjectAnimator objectAnimator) {
        this.a = textView;
        this.b = yykVar;
        this.c = objectAnimator;
        this.d = iimVar;
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
        objectAnimator.setStartDelay(((Long) iim.e.get(this.d.ah)).longValue());
        objectAnimator.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.e = false;
        this.a.setText((CharSequence) this.b.get(this.d.ah));
    }
}
