package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjt extends sca {
    public MaterialButton a;

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.myseasonlist.MySeasonListViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (MaterialButton) p(R.id.selected_season_text);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "selected_season_text", "com.google.android.apps.googletv.app.presentation.components.entity.myseasonlist.MySeasonListViewBindable"));
        }
    }
}
