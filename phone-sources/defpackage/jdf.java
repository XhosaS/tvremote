package defpackage;

import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdf extends sca {
    public TextView a;
    public TextView b;
    public TextView c;
    public final kuw d;

    public jdf() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.player.bingewatch.BingeWatchCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            try {
                this.a = (TextView) p(R.id.count_down);
                try {
                    this.b = (TextView) p(R.id.episode_number);
                    try {
                        this.c = (TextView) p(R.id.episode_title);
                    } catch (scr unused) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "episode_title", "com.google.android.apps.googletv.app.player.bingewatch.BingeWatchCardViewBindable"));
                    }
                } catch (scr unused2) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "episode_number", "com.google.android.apps.googletv.app.player.bingewatch.BingeWatchCardViewBindable"));
                }
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "count_down", "com.google.android.apps.googletv.app.player.bingewatch.BingeWatchCardViewBindable"));
            }
        } catch (scr unused4) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail_frame", "com.google.android.apps.googletv.app.player.bingewatch.BingeWatchCardViewBindable"));
        }
    }

    public jdf(kuw kuwVar) {
        this.d = kuwVar;
    }
}
