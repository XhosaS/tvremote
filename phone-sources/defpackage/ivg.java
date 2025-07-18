package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivg extends sca {
    public idr a;
    public View b;
    public View c;
    public View d;
    public View e;
    public MaterialButton f;
    public View g;
    public ImageButton h;
    public View i;
    public MaterialButton j;
    public View k;
    public TextView l;

    public final View a() {
        View view = this.b;
        if (view != null) {
            return view;
        }
        yks.c("companionBarContainer");
        return null;
    }

    public final View b() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        yks.c("companionBarScrim");
        return null;
    }

    public final View c() {
        View view = this.c;
        if (view != null) {
            return view;
        }
        yks.c("companionBarView");
        return null;
    }

    public final View d() {
        View view = this.g;
        if (view != null) {
            return view;
        }
        yks.c("keyboardFragment");
        return null;
    }

    public final View e() {
        View view = this.e;
        if (view != null) {
            return view;
        }
        yks.c("toolbarView");
        return null;
    }

    public final TextView f() {
        TextView textView = this.l;
        if (textView != null) {
            return textView;
        }
        yks.c("deviceSubtitle");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.b = p(R.id.companion_bar_container);
            try {
                this.c = p(R.id.companion_bar_view);
                try {
                    this.d = p(R.id.companion_bar_scrim);
                    try {
                        this.e = p(R.id.toolbar);
                        try {
                            this.f = (MaterialButton) p(R.id.keyboard_button);
                            try {
                                this.g = p(R.id.keyboard_fragment);
                                try {
                                    this.h = (ImageButton) p(R.id.close_button);
                                    try {
                                        this.i = p(R.id.power_button);
                                        try {
                                            this.j = (MaterialButton) p(R.id.track_menu);
                                            try {
                                                this.k = p(R.id.overflow_menu);
                                                try {
                                                    this.l = (TextView) p(R.id.device_subtitle);
                                                } catch (scr unused) {
                                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "device_subtitle", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
                                                }
                                            } catch (scr unused2) {
                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "overflow_menu", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
                                            }
                                        } catch (scr unused3) {
                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "track_menu", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
                                        }
                                    } catch (scr unused4) {
                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "power_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
                                    }
                                } catch (scr unused5) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "close_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
                                }
                            } catch (scr unused6) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "keyboard_fragment", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
                            }
                        } catch (scr unused7) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "keyboard_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
                        }
                    } catch (scr unused8) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "toolbar", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
                    }
                } catch (scr unused9) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_scrim", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
                }
            } catch (scr unused10) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_view", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        } catch (scr unused11) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_container", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
        }
    }

    public final MaterialButton i() {
        MaterialButton materialButton = this.f;
        if (materialButton != null) {
            return materialButton;
        }
        yks.c("keyboardButton");
        return null;
    }

    public final MaterialButton j() {
        MaterialButton materialButton = this.j;
        if (materialButton != null) {
            return materialButton;
        }
        yks.c("trackMenuButton");
        return null;
    }
}
