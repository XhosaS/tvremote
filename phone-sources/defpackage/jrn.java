package defpackage;

import android.widget.ProgressBar;
import com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrn extends sca {
    public ProgressBar a;
    public MediaDeviceAwarePlayButton b;
    public final kuw c;

    public jrn() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.livetvcard.LiveTvCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ProgressBar) p(R.id.progress_bar);
            try {
                this.b = (MediaDeviceAwarePlayButton) p(R.id.play_overlay);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_overlay", "com.google.android.apps.googletv.app.presentation.components.livetvcard.LiveTvCardViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "progress_bar", "com.google.android.apps.googletv.app.presentation.components.livetvcard.LiveTvCardViewBindable"));
        }
    }

    public jrn(kuw kuwVar) {
        this.c = kuwVar;
    }
}
