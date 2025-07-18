package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class joq extends sca {
    public int a;
    public ModelAwareRecyclerView b;
    public SwipeRefreshLayout c;

    public final SwipeRefreshLayout a() {
        SwipeRefreshLayout swipeRefreshLayout = this.c;
        if (swipeRefreshLayout != null) {
            return swipeRefreshLayout;
        }
        yks.c("swipeRefreshLayout");
        return null;
    }

    public final ModelAwareRecyclerView b() {
        ModelAwareRecyclerView modelAwareRecyclerView = this.b;
        if (modelAwareRecyclerView != null) {
            return modelAwareRecyclerView;
        }
        yks.c("rv");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.genericstreampage.GenericStreamPageViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.b = (ModelAwareRecyclerView) p(R.id.recycler_view);
            try {
                this.c = (SwipeRefreshLayout) p(R.id.swipe_refresh);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "swipe_refresh", "com.google.android.apps.googletv.app.presentation.components.genericstreampage.GenericStreamPageViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "recycler_view", "com.google.android.apps.googletv.app.presentation.components.genericstreampage.GenericStreamPageViewBindable"));
        }
    }

    @Override // defpackage.sca
    public final void z() {
        RecyclerView.OnScrollListener onScrollListenerH;
        b().setScrollingTouchSlop(1);
        b().getViewTreeObserver().addOnGlobalLayoutListener(new iyo(this, 5));
        LayoutInflater.Factory factoryN = ihz.N(b());
        jxo jxoVar = factoryN instanceof jxo ? (jxo) factoryN : null;
        if (jxoVar == null || (onScrollListenerH = jxoVar.h()) == null) {
            return;
        }
        b().addOnScrollListener(onScrollListenerH);
    }
}
