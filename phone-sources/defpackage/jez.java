package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jez extends sca {
    public ImageView a;
    public CardView b;
    public TextView c;
    public final kuw d;

    public jez() {
        throw null;
    }

    public final ImageView a() {
        ImageView imageView = this.a;
        if (imageView != null) {
            return imageView;
        }
        yks.c("iconView");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.browsecard.BrowseCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ImageView) p(R.id.browse_card_icon);
            try {
                this.b = (CardView) p(R.id.browse_card_card_view);
                try {
                    this.c = (TextView) p(R.id.browse_card_title);
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "browse_card_title", "com.google.android.apps.googletv.app.presentation.components.browsecard.BrowseCardViewBindable"));
                }
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "browse_card_card_view", "com.google.android.apps.googletv.app.presentation.components.browsecard.BrowseCardViewBindable"));
            }
        } catch (scr unused3) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "browse_card_icon", "com.google.android.apps.googletv.app.presentation.components.browsecard.BrowseCardViewBindable"));
        }
    }

    public jez(kuw kuwVar) {
        this.d = kuwVar;
    }
}
