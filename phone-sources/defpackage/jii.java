package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton;
import com.google.android.apps.play.movies.mobileux.component.downloadanimation.DownloadAnimationView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jii extends sca {
    public ViewGroup a;
    public FrameLayout b;
    public DownloadAnimationView c;
    public TextView d;
    public TextView e;
    public MediaDeviceAwarePlayButton f;
    public View g;
    public final kuw h;

    public jii() {
        throw null;
    }

    public final MediaDeviceAwarePlayButton a() {
        MediaDeviceAwarePlayButton mediaDeviceAwarePlayButton = this.f;
        if (mediaDeviceAwarePlayButton != null) {
            return mediaDeviceAwarePlayButton;
        }
        yks.c("playOverlay");
        return null;
    }

    public final DownloadAnimationView b() {
        DownloadAnimationView downloadAnimationView = this.c;
        if (downloadAnimationView != null) {
            return downloadAnimationView;
        }
        yks.c("downloadButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ViewGroup) p(R.id.tvod_action);
            try {
                this.b = (FrameLayout) p(R.id.download_view);
                try {
                    this.c = (DownloadAnimationView) p(R.id.download_icon);
                    try {
                        this.d = (TextView) p(R.id.purchase_button);
                        try {
                            this.e = (TextView) p(R.id.last_watched);
                            try {
                                this.f = (MediaDeviceAwarePlayButton) p(R.id.play_overlay);
                                try {
                                    p(R.id.thumbnail_frame);
                                    try {
                                        this.g = p(R.id.icon_container);
                                    } catch (scr unused) {
                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "icon_container", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
                                    }
                                } catch (scr unused2) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail_frame", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
                                }
                            } catch (scr unused3) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_overlay", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
                            }
                        } catch (scr unused4) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "last_watched", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
                        }
                    } catch (scr unused5) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "purchase_button", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
                    }
                } catch (scr unused6) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_icon", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
                }
            } catch (scr unused7) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_view", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        } catch (scr unused8) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tvod_action", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
        }
    }

    public jii(kuw kuwVar) {
        this.h = kuwVar;
    }
}
