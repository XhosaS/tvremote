package defpackage;

import android.view.View;
import com.google.android.libraries.play.widget.fireball.FireballView;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvs extends sca implements sdw, kke {
    public View a;
    public ser b;
    public kkv c;
    public List d = yhb.a;
    public sdw e;
    public kke f;

    @Override // defpackage.sdw
    public final void a(List list) {
        sdw sdwVar;
        list.getClass();
        if (yks.e(list, this.d) || (sdwVar = this.e) == null) {
            return;
        }
        sdwVar.a(list);
    }

    public final View b() {
        View view = this.a;
        if (view != null) {
            return view;
        }
        yks.c("fireballView");
        return null;
    }

    @Override // defpackage.kke
    public final void d(List list) {
        kke kkeVar;
        if (yks.e(list, this.d) || list == null || (kkeVar = this.f) == null) {
            return;
        }
        kkeVar.d(list);
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.tagfilter.TagFilterViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.tag_filter_component);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tag_filter_component", "com.google.android.apps.googletv.app.presentation.components.tagfilter.TagFilterViewBindable"));
        }
    }

    @Override // defpackage.sca
    public final void l() {
        super.l();
        this.e = null;
    }

    @Override // defpackage.sca
    public final void z() {
        View viewB = b();
        FireballView fireballView = viewB instanceof FireballView ? (FireballView) viewB : null;
        if (fireballView != null) {
            fireballView.a.b.add(this);
        }
        View viewB2 = b();
        com.google.android.apps.googletv.app.presentation.views.tagfilter.FireballView fireballView2 = viewB2 instanceof com.google.android.apps.googletv.app.presentation.views.tagfilter.FireballView ? (com.google.android.apps.googletv.app.presentation.views.tagfilter.FireballView) viewB2 : null;
        if (fireballView2 != null) {
            fireballView2.a(this);
        }
    }
}
