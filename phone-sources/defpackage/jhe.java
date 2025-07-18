package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhe extends sca {
    public View a;
    public TextView b;
    public TextView c;
    public MediaDeviceAwarePlayButton d;

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionButtonViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.remote_button);
            try {
                this.b = (TextView) p(R.id.companion_watch_cta_text);
                try {
                    this.c = (TextView) p(R.id.companion_watch_cta_subtitle_text);
                    try {
                        this.d = (MediaDeviceAwarePlayButton) p(R.id.companion_watch_cta_play_icon);
                    } catch (scr unused) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_watch_cta_play_icon", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionButtonViewBindable"));
                    }
                } catch (scr unused2) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_watch_cta_subtitle_text", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionButtonViewBindable"));
                }
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_watch_cta_text", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionButtonViewBindable"));
            }
        } catch (scr unused4) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionButtonViewBindable"));
        }
    }
}
