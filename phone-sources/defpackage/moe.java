package defpackage;

import android.view.View;
import com.google.android.apps.play.movies.mobileux.component.downloadanimation.DownloadAnimationView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class moe extends sca {
    public View a;
    public View b;
    public DownloadAnimationView c;

    public final DownloadAnimationView a() {
        DownloadAnimationView downloadAnimationView = this.c;
        if (downloadAnimationView != null) {
            return downloadAnimationView;
        }
        yks.c("downloadView");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.play_button);
            try {
                this.b = p(R.id.download_button);
                try {
                    this.c = (DownloadAnimationView) p(R.id.download_icon);
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_icon", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
                }
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_button", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
            }
        } catch (scr unused3) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_button", "com.google.android.apps.play.movies.mobile.usecase.home.gtvlibrary.MovieBindable"));
        }
    }
}
