package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kju extends sca {
    public final ihg a;
    public ProgressBar b;
    public View c;

    public kju(ihg ihgVar) {
        this.a = ihgVar;
    }

    public final View a() {
        View view = this.c;
        if (view != null) {
            return view;
        }
        yks.c("loading");
        return null;
    }

    public final ProgressBar b() {
        ProgressBar progressBar = this.b;
        if (progressBar != null) {
            return progressBar;
        }
        yks.c("loadingOld");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.views.loadingindicator.LoadingIndicatorViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.b = (ProgressBar) p(R.id.progress_old);
            try {
                this.c = p(R.id.progress);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "progress", "com.google.android.apps.googletv.app.presentation.views.loadingindicator.LoadingIndicatorViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "progress_old", "com.google.android.apps.googletv.app.presentation.views.loadingindicator.LoadingIndicatorViewBindable"));
        }
    }
}
