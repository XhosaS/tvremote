package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ium extends sca {
    public ImageView a;
    public MaterialButton b;
    public View c;
    public View d;
    public MaterialButton e;
    public MaterialDivider f;
    public ProgressBar g;
    public TextView h;

    public final View a() {
        View view = this.c;
        if (view != null) {
            return view;
        }
        yks.c("companionBarScrubberElapsed");
        return null;
    }

    public final View b() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        yks.c("companionBarScrubberRemaining");
        return null;
    }

    public final ImageView c() {
        ImageView imageView = this.a;
        if (imageView != null) {
            return imageView;
        }
        yks.c("companionBarPlaybackImage");
        return null;
    }

    public final ProgressBar d() {
        ProgressBar progressBar = this.g;
        if (progressBar != null) {
            return progressBar;
        }
        yks.c("companionBarPlaybackProgressBar");
        return null;
    }

    public final TextView e() {
        TextView textView = this.h;
        if (textView != null) {
            return textView;
        }
        yks.c("companionBarSubtitle");
        return null;
    }

    public final MaterialButton f() {
        MaterialButton materialButton = this.b;
        if (materialButton != null) {
            return materialButton;
        }
        yks.c("companionBarPlayButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ImageView) p(R.id.companion_bar_playback_image);
            try {
                this.b = (MaterialButton) p(R.id.companion_bar_play_button);
                try {
                    this.c = p(R.id.companion_bar_scrubber_elapsed);
                    try {
                        this.d = p(R.id.companion_bar_scrubber_remaining);
                        try {
                            try {
                                this.e = (MaterialButton) p(R.id.companion_bar_remote);
                                try {
                                    this.f = (MaterialDivider) p(R.id.companion_bar_divider);
                                    try {
                                        this.g = (ProgressBar) p(R.id.companion_bar_playback_progressbar);
                                        try {
                                            try {
                                                this.h = (TextView) p(R.id.companion_bar_subtitle);
                                            } catch (scr unused) {
                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_subtitle", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
                                            }
                                        } catch (scr unused2) {
                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_title", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
                                        }
                                    } catch (scr unused3) {
                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_playback_progressbar", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
                                    }
                                } catch (scr unused4) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_divider", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
                                }
                            } catch (scr unused5) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_remote", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
                            }
                        } catch (scr unused6) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_collapsed_view", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
                        }
                    } catch (scr unused7) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_scrubber_remaining", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
                    }
                } catch (scr unused8) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_scrubber_elapsed", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
                }
            } catch (scr unused9) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_play_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
            }
        } catch (scr unused10) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_playback_image", "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable"));
        }
    }
}
