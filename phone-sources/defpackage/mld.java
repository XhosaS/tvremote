package defpackage;

import android.view.View;
import com.google.android.apps.googletv.app.presentation.views.tagfilter.FireballView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mld extends sca implements kke {
    public kkv a;
    public List b = yhb.a;
    public kke c;

    @Override // defpackage.kke
    public final void d(List list) {
        kke kkeVar;
        if (yks.e(list, this.b) || list == null || (kkeVar = this.c) == null) {
            return;
        }
        kkeVar.d(list);
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.components.fireball.FireballBindable";
    }

    @Override // defpackage.sca
    public final void l() {
        super.l();
        this.c = null;
    }

    @Override // defpackage.sca
    public final void z() {
        View viewQ = q();
        FireballView fireballView = viewQ instanceof FireballView ? (FireballView) viewQ : null;
        if (fireballView != null) {
            fireballView.a(this);
        }
    }
}
