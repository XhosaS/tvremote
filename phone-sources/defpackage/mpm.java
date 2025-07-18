package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mpm extends sca {
    public View a;
    public View b;

    public final View a() {
        View view = this.a;
        if (view != null) {
            return view;
        }
        yks.c("sortOptionButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.SortSectionBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.sort_option);
            try {
                this.b = p(R.id.view_mode);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "view_mode", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.SortSectionBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "sort_option", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.SortSectionBindable"));
        }
    }
}
