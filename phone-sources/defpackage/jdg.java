package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdg extends scf {
    public CharSequence a;
    public ihe b;
    private final yfo c;
    private wlx d;
    private View.OnClickListener e;
    private Integer f;
    private String g;
    private String h;
    private boolean i;

    public jdg(yfo yfoVar) {
        this.c = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.binge_watch_card_v2;
    }

    public final void b(boolean z) {
        if (yks.e(Boolean.valueOf(this.i), Boolean.valueOf(z))) {
            return;
        }
        this.i = z;
        G(7);
    }

    public final void c(sch schVar) {
        if (schVar == null) {
            this.e = null;
        } else {
            this.e = new scc("R.id.binge_watch_card_view", this, schVar);
        }
        G(2);
    }

    public final void d(Integer num) {
        if (yks.e(this.f, num)) {
            return;
        }
        this.f = num;
        G(4);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jdg jdgVar = (jdg) scfVar;
        long j = true != yks.e(this.d, jdgVar.d) ? 1L : 0L;
        if (!yks.e(this.a, jdgVar.a)) {
            j |= 2;
        }
        if (!yks.e(this.e, jdgVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.b, jdgVar.b)) {
            j |= 8;
        }
        if (!yks.e(this.f, jdgVar.f)) {
            j |= 16;
        }
        if (!yks.e(this.g, jdgVar.g)) {
            j |= 32;
        }
        if (!yks.e(this.h, jdgVar.h)) {
            j |= 64;
        }
        return !yks.e(Boolean.valueOf(this.i), Boolean.valueOf(jdgVar.i)) ? j | 128 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.c.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.player.bingewatch.BingeWatchCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        Integer num;
        String str;
        String str2;
        jdf jdfVar = (jdf) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jdfVar.d.t(jdfVar, this.d, R.id.thumbnail_frame, R.drawable.binge_watch_thumbnail_image, -1, false, false, false);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                jdfVar.s(R.id.thumbnail_frame, this.a);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail_frame", "com.google.android.apps.googletv.app.player.bingewatch.BingeWatchCardViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                jdfVar.r(R.id.binge_watch_card_view, this.e);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "binge_watch_card_view", "com.google.android.apps.googletv.app.player.bingewatch.BingeWatchCardViewBindable"));
            }
        }
        if (j == 0 || (8 & j) != 0) {
            ipc.i(jdfVar, this.b, R.id.binge_watch_card_view);
        }
        TextView textView = null;
        if ((j == 0 || (16 & j) != 0) && (num = this.f) != null && num.intValue() >= 0) {
            TextView textView2 = jdfVar.a;
            if (textView2 == null) {
                yks.c("bingeWatchCardCountdown");
                textView2 = null;
            }
            textView2.setText(num.toString());
        }
        if ((j == 0 || (32 & j) != 0) && (str = this.g) != null) {
            TextView textView3 = jdfVar.b;
            if (textView3 == null) {
                yks.c("bingeWatchCardEpisodeNumber");
                textView3 = null;
            }
            textView3.setText(jdfVar.o().getResources().getString(R.string.binge_watch_next_episode_number, str));
        }
        if ((j == 0 || (64 & j) != 0) && (str2 = this.h) != null) {
            TextView textView4 = jdfVar.c;
            if (textView4 == null) {
                yks.c("bingeWatchCardEpisodeTitle");
            } else {
                textView = textView4;
            }
            textView.setText(str2);
        }
        if (j == 0 || (j & 128) != 0) {
            jdfVar.q().setVisibility(true != this.i ? 8 : 0);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a, this.e, this.b, this.f, this.g, this.h, Boolean.valueOf(this.i));
    }

    public final void k(wlx wlxVar) {
        if (yks.e(this.d, wlxVar)) {
            return;
        }
        this.d = wlxVar;
        G(0);
    }

    public final void l(String str) {
        if (yks.e(this.g, str)) {
            return;
        }
        this.g = str;
        G(5);
    }

    public final void m(String str) {
        if (yks.e(this.h, str)) {
            return;
        }
        this.h = str;
        G(6);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("BingeWatchCardViewModel{bingeWatchCardThumbnailImage=%s, imageContentDescription=%s, bingeWatchCardClickListener=%s, bingeWatchCardSwipeListener=%s, bingeWatchCardCountdown=%s, bingeWatchEpisodeNumber=%s, bingeWatchEpisodeTitle=%s, isVisible=%s}", this.d, this.a, this.e, this.b, this.f, this.g, this.h, Boolean.valueOf(this.i));
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
