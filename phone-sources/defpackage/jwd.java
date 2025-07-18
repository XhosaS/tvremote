package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton;
import com.google.android.apps.googletv.app.presentation.views.rottentomatoesrating.RottenTomatoesRatingView;
import com.google.android.apps.play.movies.mobileux.component.downloadanimation.DownloadAnimationView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwd extends sca {
    public ImageView a;
    public MediaDeviceAwarePlayButton b;
    public FrameLayout c;
    public DownloadAnimationView d;
    public TextView e;
    public RottenTomatoesRatingView f;
    public View g;
    public TextView h;
    public final hfw i;
    public final kuw j;

    public jwd() {
        throw null;
    }

    public final TextView a() {
        TextView textView = this.e;
        if (textView != null) {
            return textView;
        }
        yks.c("subtitleTextView");
        return null;
    }

    public final MediaDeviceAwarePlayButton b() {
        MediaDeviceAwarePlayButton mediaDeviceAwarePlayButton = this.b;
        if (mediaDeviceAwarePlayButton != null) {
            return mediaDeviceAwarePlayButton;
        }
        yks.c("playIconButton");
        return null;
    }

    public final DownloadAnimationView d() {
        DownloadAnimationView downloadAnimationView = this.d;
        if (downloadAnimationView != null) {
            return downloadAnimationView;
        }
        yks.c("downloadIconButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            try {
                this.a = (ImageView) p(R.id.lock_icon);
                try {
                    this.b = (MediaDeviceAwarePlayButton) p(R.id.play_icon);
                    try {
                        this.c = (FrameLayout) p(R.id.download_view);
                        try {
                            try {
                                this.d = (DownloadAnimationView) p(R.id.download_icon);
                                try {
                                    this.e = (TextView) p(R.id.subtitle);
                                    try {
                                        this.f = (RottenTomatoesRatingView) p(R.id.rotten_tomatoes_rating);
                                        try {
                                            this.g = p(R.id.tvm_entity_card_component);
                                            try {
                                                this.h = (TextView) p(R.id.titled_text);
                                            } catch (scr unused) {
                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "titled_text", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
                                            }
                                        } catch (scr unused2) {
                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tvm_entity_card_component", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
                                        }
                                    } catch (scr unused3) {
                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "rotten_tomatoes_rating", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
                                    }
                                } catch (scr unused4) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
                                }
                            } catch (scr unused5) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_icon", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
                            }
                        } catch (scr unused6) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_icon", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
                        }
                    } catch (scr unused7) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_view", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
                    }
                } catch (scr unused8) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_icon", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
                }
            } catch (scr unused9) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "lock_icon", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
            }
        } catch (scr unused10) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
        }
    }

    public jwd(kuw kuwVar, hfw hfwVar) {
        this.j = kuwVar;
        this.i = hfwVar;
    }
}
