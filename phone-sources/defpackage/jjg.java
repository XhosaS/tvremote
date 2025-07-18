package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjg extends scf {
    public sco a = sco.a;
    public wlx b;
    public wls c;
    public woc d;
    public wfo e;
    private final yfo f;

    public jjg(yfo yfoVar) {
        this.f = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.moreinfo_item_view_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jjg jjgVar = (jjg) scfVar;
        long j = true != yks.e(this.a, jjgVar.a) ? 1L : 0L;
        if (!yks.e(this.b, jjgVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, jjgVar.c)) {
            j |= 4;
        }
        if (!yks.e(this.d, jjgVar.d)) {
            j |= 8;
        }
        return !yks.e(this.e, jjgVar.e) ? j | 16 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.f.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.moreinfo.MoreInfoItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        wfo wfoVar;
        jjf jjfVar = (jjf) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                jjfVar.w(R.id.moreinfo_item_title, this.a.a(jjfVar.o()), 8);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "moreinfo_item_title", "com.google.android.apps.googletv.app.presentation.components.entity.moreinfo.MoreInfoItemViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            jjfVar.c.t(jjfVar, this.b, R.id.moreinfo_item_content_rating_icon, -1, 8, false, false, false);
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(jjfVar, this.c, R.id.moreinfo_item_description, 8);
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.i(jjfVar, this.d, R.id.moreinfo_item_rotten_tomatoes_rating);
        }
        if ((j == 0 || (j & 16) != 0) && (wfoVar = this.e) != null) {
            TextView textView = jjfVar.a;
            TextView textView2 = null;
            if (textView == null) {
                yks.c("titleView");
                textView = null;
            }
            textView.setTextColor(wfoVar.h());
            TextView textView3 = jjfVar.b;
            if (textView3 == null) {
                yks.c("descriptionView");
            } else {
                textView2 = textView3;
            }
            textView2.setTextColor(wfoVar.h());
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("MoreInfoItemViewModel{title=%s, contentRatingImage=%s, description=%s, rottenTomatoesRating=%s, applyDynamicScheme=%s}", this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
