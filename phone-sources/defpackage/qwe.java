package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qwe extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ AnimatorListenerAdapter b;
    final /* synthetic */ qwg c;

    public qwe(qwg qwgVar, Runnable runnable, AnimatorListenerAdapter animatorListenerAdapter) {
        this.a = runnable;
        this.b = animatorListenerAdapter;
        this.c = qwgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
        qwg qwgVar = this.c;
        AccountParticleDisc accountParticleDisc = qwgVar.b.b;
        ImmutableList immutableListOf = ImmutableList.of(ObjectAnimator.ofFloat(accountParticleDisc, "scaleX", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "scaleY", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 0.125f, 1.0f).setDuration(117L));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(immutableListOf);
        animatorSet.addListener(this.b);
        animatorSet.addListener(new qwf(qwgVar, accountParticleDisc));
        animatorSet.start();
    }
}
