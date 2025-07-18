package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtk extends sca {
    public RecyclerView a;

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.searchsuggestions.SearchSuggestionsViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (RecyclerView) p(R.id.recycler_view);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "recycler_view", "com.google.android.apps.googletv.app.presentation.components.searchsuggestions.SearchSuggestionsViewBindable"));
        }
    }

    @Override // defpackage.sca
    public final void z() {
        RecyclerView recyclerView = this.a;
        if (recyclerView == null) {
            yks.c("recyclerView");
            recyclerView = null;
        }
        recyclerView.setItemAnimator(null);
    }
}
