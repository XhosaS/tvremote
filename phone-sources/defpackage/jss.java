package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jss extends sca {
    public LinearLayout a;
    public ViewGroup b;
    public final jwj c;
    public final kuw d;

    public jss() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.posterbanner.PosterBannerCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (LinearLayout) p(R.id.banner_layout);
            try {
                try {
                    this.b = (ViewGroup) p(R.id.image_section_layout);
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "image_section_layout", "com.google.android.apps.googletv.app.presentation.components.posterbanner.PosterBannerCardViewBindable"));
                }
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "banner_title_button", "com.google.android.apps.googletv.app.presentation.components.posterbanner.PosterBannerCardViewBindable"));
            }
        } catch (scr unused3) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "banner_layout", "com.google.android.apps.googletv.app.presentation.components.posterbanner.PosterBannerCardViewBindable"));
        }
    }

    public jss(jwj jwjVar, kuw kuwVar) {
        this.c = jwjVar;
        this.d = kuwVar;
    }
}
