package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.slider.Slider;
import com.google.android.tv.remote.virtual.ui.trackpad.RemoteButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivk extends sca {
    public View a;
    public Slider b;
    public TextView c;
    public TextView d;
    public View e;
    public View f;
    public RemoteButton g;
    public View h;
    public RemoteButton i;
    public RemoteButton j;
    public RemoteButton k;
    public final kuw l;

    public ivk() {
        throw null;
    }

    public final View a() {
        View view = this.f;
        if (view != null) {
            return view;
        }
        yks.c("loadingSpinner");
        return null;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView != null) {
            return textView;
        }
        yks.c("elapsed");
        return null;
    }

    public final TextView c() {
        TextView textView = this.d;
        if (textView != null) {
            return textView;
        }
        yks.c("totalDuration");
        return null;
    }

    public final Slider d() {
        Slider slider = this.b;
        if (slider != null) {
            return slider;
        }
        yks.c("slider");
        return null;
    }

    public final RemoteButton e() {
        RemoteButton remoteButton = this.i;
        if (remoteButton != null) {
            return remoteButton;
        }
        yks.c("muteButton");
        return null;
    }

    public final RemoteButton f() {
        RemoteButton remoteButton = this.g;
        if (remoteButton != null) {
            return remoteButton;
        }
        yks.c("playButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.media_progress_container);
            try {
                this.b = (Slider) p(R.id.media_timebar);
                try {
                    this.c = (TextView) p(R.id.media_elapsed);
                    try {
                        this.d = (TextView) p(R.id.media_total_duration);
                        try {
                            this.e = p(R.id.media_playback_buttons_container);
                            try {
                                this.f = p(R.id.media_loading_spinner);
                                try {
                                    this.g = (RemoteButton) p(R.id.media_play_button);
                                    try {
                                        this.h = p(R.id.media_volume_buttons_container);
                                        try {
                                            this.i = (RemoteButton) p(R.id.media_mute_button);
                                            try {
                                                this.j = (RemoteButton) p(R.id.media_decrease_volume_button);
                                                try {
                                                    this.k = (RemoteButton) p(R.id.media_increase_volume_button);
                                                } catch (scr unused) {
                                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_increase_volume_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
                                                }
                                            } catch (scr unused2) {
                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_decrease_volume_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
                                            }
                                        } catch (scr unused3) {
                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_mute_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
                                        }
                                    } catch (scr unused4) {
                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_volume_buttons_container", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
                                    }
                                } catch (scr unused5) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_play_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
                                }
                            } catch (scr unused6) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_loading_spinner", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
                            }
                        } catch (scr unused7) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_playback_buttons_container", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
                        }
                    } catch (scr unused8) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_total_duration", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
                    }
                } catch (scr unused9) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_elapsed", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
                }
            } catch (scr unused10) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_timebar", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
            }
        } catch (scr unused11) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_progress_container", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable"));
        }
    }

    public ivk(kuw kuwVar) {
        this.l = kuwVar;
    }
}
