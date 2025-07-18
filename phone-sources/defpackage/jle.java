package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jle extends sca {
    public View a;
    public View b;
    public TextView c;

    public final View a() {
        View view = this.a;
        if (view != null) {
            return view;
        }
        yks.c("selectedSeasonText");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.seasonlist.SeasonListViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.selected_season_text);
            try {
                this.b = p(R.id.selected_season_compose_view);
                try {
                    this.c = (TextView) p(R.id.season_stats);
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "season_stats", "com.google.android.apps.googletv.app.presentation.components.entity.seasonlist.SeasonListViewBindable"));
                }
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "selected_season_compose_view", "com.google.android.apps.googletv.app.presentation.components.entity.seasonlist.SeasonListViewBindable"));
            }
        } catch (scr unused3) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "selected_season_text", "com.google.android.apps.googletv.app.presentation.components.entity.seasonlist.SeasonListViewBindable"));
        }
    }
}
