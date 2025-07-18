package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.slider.Slider;
import com.google.android.tv.remote.virtual.ui.assistant.VirtualRemoteAssistantButton;
import com.google.android.tv.remote.virtual.ui.trackpad.DpadView;
import com.google.android.tv.remote.virtual.ui.trackpad.RemoteButton;
import com.google.android.tv.remote.virtual.ui.trackpad.TrackpadView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivp extends sca {
    public iwf a;
    public View b;
    public TrackpadView c;
    public DpadView d;
    public ViewGroup e;
    public RemoteButton f;
    public RemoteButton g;
    public VirtualRemoteAssistantButton h;
    public View i;
    public RemoteButton j;
    public RemoteButton k;
    public RemoteButton l;
    public View m;
    public RemoteButton n;
    public ImageView o;
    public View p;
    public Slider q;
    public ProgressBar r;
    public TextView s;
    public TextView t;
    public pku u;

    public final View a() {
        View view = this.p;
        if (view != null) {
            return view;
        }
        yks.c("progressBarContainer");
        return null;
    }

    public final ViewGroup b() {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            return viewGroup;
        }
        yks.c("remoteViewContainer");
        return null;
    }

    public final ImageView c() {
        ImageView imageView = this.o;
        if (imageView != null) {
            return imageView;
        }
        yks.c("remoteContentThumbnail");
        return null;
    }

    public final ProgressBar d() {
        ProgressBar progressBar = this.r;
        if (progressBar != null) {
            return progressBar;
        }
        yks.c("remotePlaybackProgressbar");
        return null;
    }

    public final Slider e() {
        Slider slider = this.q;
        if (slider != null) {
            return slider;
        }
        yks.c("slider");
        return null;
    }

    public final VirtualRemoteAssistantButton f() {
        VirtualRemoteAssistantButton virtualRemoteAssistantButton = this.h;
        if (virtualRemoteAssistantButton != null) {
            return virtualRemoteAssistantButton;
        }
        yks.c("assistantButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            p(R.id.remote_layout);
            try {
                this.b = p(R.id.trackpad_container);
                try {
                    this.c = (TrackpadView) p(R.id.trackpad_view);
                    try {
                        this.d = (DpadView) p(R.id.dpad_view);
                        try {
                            this.e = (ViewGroup) p(R.id.remote_view_container);
                            try {
                                this.f = (RemoteButton) p(R.id.back_event);
                                try {
                                    this.g = (RemoteButton) p(R.id.home_event);
                                    try {
                                        this.h = (VirtualRemoteAssistantButton) p(R.id.assistant_button);
                                        try {
                                            this.i = p(R.id.volume_buttons_container);
                                            try {
                                                this.j = (RemoteButton) p(R.id.mute_event);
                                                try {
                                                    this.k = (RemoteButton) p(R.id.lower_volume_event);
                                                    try {
                                                        this.l = (RemoteButton) p(R.id.increase_volume_event);
                                                        try {
                                                            this.m = p(R.id.remote_playback_controls);
                                                            try {
                                                                this.n = (RemoteButton) p(R.id.remote_play_button);
                                                                try {
                                                                    this.o = (ImageView) p(R.id.remote_content_thumbnail);
                                                                    try {
                                                                        this.p = p(R.id.media_controls_progress);
                                                                        try {
                                                                            this.q = (Slider) p(R.id.timebar);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        p(R.id.replay);
                                                                                        try {
                                                                                            p(R.id.forward);
                                                                                            try {
                                                                                                this.r = (ProgressBar) p(R.id.remote_playback_progressbar);
                                                                                                try {
                                                                                                    this.s = (TextView) p(R.id.elapsed);
                                                                                                    try {
                                                                                                        this.t = (TextView) p(R.id.total_duration);
                                                                                                    } catch (scr unused) {
                                                                                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "total_duration", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                                                    }
                                                                                                } catch (scr unused2) {
                                                                                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "elapsed", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                                                }
                                                                                            } catch (scr unused3) {
                                                                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_playback_progressbar", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                                            }
                                                                                        } catch (scr unused4) {
                                                                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "forward", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                                        }
                                                                                    } catch (scr unused5) {
                                                                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "replay", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                                    }
                                                                                } catch (scr unused6) {
                                                                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_content_subtitle", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                                }
                                                                            } catch (scr unused7) {
                                                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_content_title", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                            }
                                                                        } catch (scr unused8) {
                                                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "timebar", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                        }
                                                                    } catch (scr unused9) {
                                                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "media_controls_progress", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                    }
                                                                } catch (scr unused10) {
                                                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_content_thumbnail", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                                }
                                                            } catch (scr unused11) {
                                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_play_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                            }
                                                        } catch (scr unused12) {
                                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_playback_controls", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                        }
                                                    } catch (scr unused13) {
                                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "increase_volume_event", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                    }
                                                } catch (scr unused14) {
                                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "lower_volume_event", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                                }
                                            } catch (scr unused15) {
                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "mute_event", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                            }
                                        } catch (scr unused16) {
                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "volume_buttons_container", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                        }
                                    } catch (scr unused17) {
                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "assistant_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                    }
                                } catch (scr unused18) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "home_event", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                                }
                            } catch (scr unused19) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "back_event", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                            }
                        } catch (scr unused20) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_view_container", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                        }
                    } catch (scr unused21) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "dpad_view", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                    }
                } catch (scr unused22) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "trackpad_view", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
                }
            } catch (scr unused23) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "trackpad_container", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
            }
        } catch (scr unused24) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_layout", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
        }
    }

    public final DpadView i() {
        DpadView dpadView = this.d;
        if (dpadView != null) {
            return dpadView;
        }
        yks.c("dpadView");
        return null;
    }

    public final RemoteButton j() {
        RemoteButton remoteButton = this.j;
        if (remoteButton != null) {
            return remoteButton;
        }
        yks.c("muteButton");
        return null;
    }

    public final RemoteButton k() {
        RemoteButton remoteButton = this.n;
        if (remoteButton != null) {
            return remoteButton;
        }
        yks.c("remotePlaybackButton");
        return null;
    }

    @Override // defpackage.sca
    public final void l() {
        super.l();
        iwf iwfVar = this.a;
        if (iwfVar != null) {
            pku pkuVarM = m();
            pkuVarM.getClass();
            ((tug) iwu.a.b().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl", "removeSpeechSessionListener", 468, "VirtualRemoteImpl.kt")).s("Removing a speech listener.");
            ((iwu) iwfVar).g.remove(pkuVarM);
        }
    }

    public final pku m() {
        pku pkuVar = this.u;
        if (pkuVar != null) {
            return pkuVar;
        }
        yks.c("speechSessionListener");
        return null;
    }
}
