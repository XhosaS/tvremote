package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mol extends sca {
    public int a;
    public View b;
    public RecyclerView c;
    public View d;

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MoviesPageBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.b = p(R.id.spinner);
            try {
                this.c = (RecyclerView) p(R.id.list);
                try {
                    this.d = p(R.id.tab_separator_line);
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tab_separator_line", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MoviesPageBindable"));
                }
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "list", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MoviesPageBindable"));
            }
        } catch (scr unused3) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "spinner", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MoviesPageBindable"));
        }
    }
}
