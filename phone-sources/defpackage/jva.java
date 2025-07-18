package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jva extends sca {
    public View a;

    public final View a() {
        View view = this.a;
        if (view != null) {
            return view;
        }
        yks.c("sortOptionButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.sortselection.SortSelectionViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.sort_option);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "sort_option", "com.google.android.apps.googletv.app.presentation.components.sortselection.SortSelectionViewBindable"));
        }
    }
}
