package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyp extends sca {
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
        return "com.google.android.apps.googletv.app.framework.streampage.StreamPageViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.b = (ModelAwareRecyclerView) p(R.id.recycler_view);
            try {
                this.c = (SwipeRefreshLayout) p(R.id.swipe_refresh);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "swipe_refresh", "com.google.android.apps.googletv.app.framework.streampage.StreamPageViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "recycler_view", "com.google.android.apps.googletv.app.framework.streampage.StreamPageViewBindable"));
        }
    }

    @Override // defpackage.sca
    public final void z() {
        b().setScrollingTouchSlop(1);
        LayoutInflater.Factory factoryN = ihz.N(b());
        jeh jehVar = factoryN instanceof jeh ? (jeh) factoryN : null;
        if (jehVar != null) {
            b().setRecycledViewPool(jehVar.g());
            RecyclerView.LayoutManager layoutManager = b().getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.setItemPrefetchEnabled(true);
                linearLayoutManager.setRecycleChildrenOnDetach(true);
                linearLayoutManager.setInitialPrefetchItemCount(5);
            }
        }
        b().getViewTreeObserver().addOnGlobalLayoutListener(new iyo(this, 0));
    }
}
