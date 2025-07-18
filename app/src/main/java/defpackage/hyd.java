package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyd extends AnimatorListenerAdapter {
    final /* synthetic */ hye a;

    public hyd(hye hyeVar) {
        this.a = hyeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.f.setHint(R.string.keyboard_search_hint);
    }
}
