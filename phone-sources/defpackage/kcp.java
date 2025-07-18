package defpackage;

import android.view.View;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcp extends sca {
    public View a;
    public View b;
    public ModelAwareRecyclerView c;

    public final ModelAwareRecyclerView a() {
        ModelAwareRecyclerView modelAwareRecyclerView = this.c;
        if (modelAwareRecyclerView != null) {
            return modelAwareRecyclerView;
        }
        yks.c("rv");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.managedservices.ManagedServicesPageViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.nav);
            try {
                this.b = p(R.id.done);
                try {
                    this.c = (ModelAwareRecyclerView) p(R.id.recycler_view);
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "recycler_view", "com.google.android.apps.googletv.app.presentation.pages.managedservices.ManagedServicesPageViewBindable"));
                }
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "done", "com.google.android.apps.googletv.app.presentation.pages.managedservices.ManagedServicesPageViewBindable"));
            }
        } catch (scr unused3) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "nav", "com.google.android.apps.googletv.app.presentation.pages.managedservices.ManagedServicesPageViewBindable"));
        }
    }
}
