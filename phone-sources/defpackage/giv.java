package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.play.search.PlaySearchSuggestionsList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giv implements Animation.AnimationListener {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public giv(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        giy giyVar;
        int i = this.b;
        if (i == 0) {
            ((SwipeRefreshLayout) this.a).f(null);
            return;
        }
        if (i != 1) {
            PlaySearchSuggestionsList playSearchSuggestionsList = (PlaySearchSuggestionsList) this.a;
            if (!playSearchSuggestionsList.d) {
                playSearchSuggestionsList.setVisibility(8);
                playSearchSuggestionsList.a.setVisibility(8);
                playSearchSuggestionsList.a.layout(0, 0, 0, 0);
            }
            playSearchSuggestionsList.c = null;
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.a;
        if (!swipeRefreshLayout.b) {
            swipeRefreshLayout.b();
            return;
        }
        swipeRefreshLayout.h.setAlpha(255);
        swipeRefreshLayout.h.start();
        if (swipeRefreshLayout.i && (giyVar = swipeRefreshLayout.a) != null) {
            giyVar.a();
        }
        swipeRefreshLayout.c = swipeRefreshLayout.d.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
