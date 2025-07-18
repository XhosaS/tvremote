package defpackage;

import android.widget.ProgressBar;
import com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfx extends sca {
    public ProgressBar a;
    public LinearProgressIndicator b;
    public MediaDeviceAwarePlayButton c;
    public MediaDeviceAwarePlayButton d;
    public final kuw e;

    public jfx() {
        throw null;
    }

    public final ProgressBar a() {
        ProgressBar progressBar = this.a;
        if (progressBar != null) {
            return progressBar;
        }
        yks.c("progressBar");
        return null;
    }

    public final MediaDeviceAwarePlayButton b() {
        MediaDeviceAwarePlayButton mediaDeviceAwarePlayButton = this.c;
        if (mediaDeviceAwarePlayButton != null) {
            return mediaDeviceAwarePlayButton;
        }
        yks.c("playOverlay");
        return null;
    }

    public final MediaDeviceAwarePlayButton d() {
        MediaDeviceAwarePlayButton mediaDeviceAwarePlayButton = this.d;
        if (mediaDeviceAwarePlayButton != null) {
            return mediaDeviceAwarePlayButton;
        }
        yks.c("playOverlayBc25");
        return null;
    }

    public final LinearProgressIndicator e() {
        LinearProgressIndicator linearProgressIndicator = this.b;
        if (linearProgressIndicator != null) {
            return linearProgressIndicator;
        }
        yks.c("progressBarBc25");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ProgressBar) p(R.id.progress_bar);
            try {
                this.b = (LinearProgressIndicator) p(R.id.progress_bar_bc25);
                try {
                    this.c = (MediaDeviceAwarePlayButton) p(R.id.play_overlay);
                    try {
                        this.d = (MediaDeviceAwarePlayButton) p(R.id.play_overlay_bc25);
                    } catch (scr unused) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_overlay_bc25", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
                    }
                } catch (scr unused2) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_overlay", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
                }
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "progress_bar_bc25", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
            }
        } catch (scr unused4) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "progress_bar", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
        }
    }

    public jfx(kuw kuwVar) {
        this.e = kuwVar;
    }
}
