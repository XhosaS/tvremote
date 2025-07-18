package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.play.search.PlaySearch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgt extends AnimatorListenerAdapter {
    final /* synthetic */ PlaySearch a;

    public tgt(PlaySearch playSearch) {
        this.a = playSearch;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.h(3);
    }
}
