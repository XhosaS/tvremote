package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hzz extends AnimatorListenerAdapter {
    final /* synthetic */ SuggestionsScrollView a;

    public hzz(SuggestionsScrollView suggestionsScrollView) {
        this.a = suggestionsScrollView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SuggestionsScrollView suggestionsScrollView = this.a;
        suggestionsScrollView.setVisibility(0);
        lu luVar = suggestionsScrollView.f;
        if (luVar != null) {
            luVar.setVisibility(0);
        }
        if (!suggestionsScrollView.j() || suggestionsScrollView.e.hasFocus()) {
            return;
        }
        suggestionsScrollView.getParent().focusableViewAvailable(suggestionsScrollView.e);
    }
}
