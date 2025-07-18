package defpackage;

import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrg extends sca {
    public int a;
    public ModelAwareRecyclerView b;

    public final ModelAwareRecyclerView a() {
        ModelAwareRecyclerView modelAwareRecyclerView = this.b;
        if (modelAwareRecyclerView != null) {
            return modelAwareRecyclerView;
        }
        yks.c("rv");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.librarypage.LibraryPageViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.b = (ModelAwareRecyclerView) p(R.id.recycler_view);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "recycler_view", "com.google.android.apps.googletv.app.presentation.components.librarypage.LibraryPageViewBindable"));
        }
    }
}
