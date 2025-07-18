package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftc extends AnimatorListenerAdapter {
    final /* synthetic */ ftk a;

    public ftc(ftk ftkVar) {
        this.a = ftkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ftk ftkVar = this.a;
        View view = ftkVar.b;
        if (view != null) {
            view.setVisibility(0);
        }
        ViewGroup viewGroup = ftkVar.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = ftkVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(true != ftkVar.t ? 4 : 0);
        }
        View view2 = ftkVar.j;
        if (!(view2 instanceof DefaultTimeBar) || ftkVar.t) {
            return;
        }
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
        if (defaultTimeBar.d.isStarted()) {
            defaultTimeBar.d.cancel();
        }
        defaultTimeBar.f = false;
        defaultTimeBar.d.setFloatValues(defaultTimeBar.e, 1.0f);
        defaultTimeBar.d.setDuration(250L);
        defaultTimeBar.d.start();
    }
}
