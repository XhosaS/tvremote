package defpackage;

import android.widget.ImageView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jte extends sca {
    public ImageView a;
    public final kuw b;

    public jte() {
        throw null;
    }

    public final ImageView a() {
        ImageView imageView = this.a;
        if (imageView != null) {
            return imageView;
        }
        yks.c("searchImageView");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.searchsuggestions.SearchSuggestionItemViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ImageView) p(R.id.search_image);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "search_image", "com.google.android.apps.googletv.app.presentation.components.searchsuggestions.SearchSuggestionItemViewBindable"));
        }
    }

    public jte(kuw kuwVar) {
        this.b = kuwVar;
    }
}
