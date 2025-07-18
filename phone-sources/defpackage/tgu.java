package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.play.search.PlaySearch;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tgu extends AnimatorListenerAdapter {
    final /* synthetic */ PlaySearch a;

    public tgu(PlaySearch playSearch) {
        this.a = playSearch;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        PlaySearch playSearch = this.a;
        playSearch.setVisibility(4);
        playSearch.d.setVisibility(8);
    }
}
