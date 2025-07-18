package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpr extends sca {
    public ImageView a;
    public TextView b;
    public TextView c;
    public View d;
    public View e;
    public ImageView f;
    public View g;
    public final kuw h;

    public jpr() {
        throw null;
    }

    public final View a() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        yks.c("dismissButton");
        return null;
    }

    public final View b() {
        View view = this.e;
        if (view != null) {
            return view;
        }
        yks.c("infoBannerCard");
        return null;
    }

    public final ImageView d() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView;
        }
        yks.c("iconView");
        return null;
    }

    public final TextView e() {
        TextView textView = this.b;
        if (textView != null) {
            return textView;
        }
        yks.c("title");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ImageView) p(R.id.icon);
            try {
                this.b = (TextView) p(R.id.title);
                try {
                    this.c = (TextView) p(R.id.subtitle);
                    try {
                        this.d = p(R.id.dismiss);
                        try {
                            this.e = p(R.id.info_banner_card_component);
                            try {
                                this.f = (ImageView) p(R.id.icon);
                                try {
                                    this.g = p(R.id.info_banner_card_cta);
                                } catch (scr unused) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "info_banner_card_cta", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
                                }
                            } catch (scr unused2) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "icon", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
                            }
                        } catch (scr unused3) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "info_banner_card_component", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
                        }
                    } catch (scr unused4) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "dismiss", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
                    }
                } catch (scr unused5) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
                }
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
            }
        } catch (scr unused7) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "icon", "com.google.android.apps.googletv.app.presentation.components.infobanner.InfoBannerCardViewBindable"));
        }
    }

    public jpr(kuw kuwVar) {
        this.h = kuwVar;
    }
}
