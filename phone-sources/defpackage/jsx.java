package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsx extends sca {
    public View a;
    public View b;
    public View c;
    public View d;
    public View e;
    public final kuw f;

    public jsx() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.ratingcard.RatingCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.rating_card_view);
            try {
                this.b = p(R.id.title);
                try {
                    this.c = p(R.id.subtitle);
                    try {
                        this.d = p(R.id.open);
                        try {
                            this.e = p(R.id.external_link_icon_bg);
                        } catch (scr unused) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "external_link_icon_bg", "com.google.android.apps.googletv.app.presentation.components.ratingcard.RatingCardViewBindable"));
                        }
                    } catch (scr unused2) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "open", "com.google.android.apps.googletv.app.presentation.components.ratingcard.RatingCardViewBindable"));
                    }
                } catch (scr unused3) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.googletv.app.presentation.components.ratingcard.RatingCardViewBindable"));
                }
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.ratingcard.RatingCardViewBindable"));
            }
        } catch (scr unused5) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "rating_card_view", "com.google.android.apps.googletv.app.presentation.components.ratingcard.RatingCardViewBindable"));
        }
    }

    public jsx(kuw kuwVar) {
        this.f = kuwVar;
    }
}
