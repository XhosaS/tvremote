package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iac extends AnimatorListenerAdapter {
    final /* synthetic */ SuggestionsScrollView a;

    public iac(SuggestionsScrollView suggestionsScrollView) {
        this.a = suggestionsScrollView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SuggestionsScrollView suggestionsScrollView = this.a;
        suggestionsScrollView.setVisibility(8);
        lu luVar = suggestionsScrollView.f;
        if (luVar != null) {
            luVar.setVisibility(8);
        }
    }
}
