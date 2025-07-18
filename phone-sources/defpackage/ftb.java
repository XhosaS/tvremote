package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftb extends AnimatorListenerAdapter {
    final /* synthetic */ ftk a;

    public ftb(ftk ftkVar) {
        this.a = ftkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ftk ftkVar = this.a;
        View view = ftkVar.b;
        if (view != null) {
            view.setVisibility(4);
        }
        ViewGroup viewGroup = ftkVar.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        ViewGroup viewGroup2 = ftkVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ftk ftkVar = this.a;
        View view = ftkVar.j;
        if (!(view instanceof DefaultTimeBar) || ftkVar.t) {
            return;
        }
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
        if (defaultTimeBar.d.isStarted()) {
            defaultTimeBar.d.cancel();
        }
        defaultTimeBar.d.setFloatValues(defaultTimeBar.e, 0.0f);
        defaultTimeBar.d.setDuration(250L);
        defaultTimeBar.d.start();
    }
}
