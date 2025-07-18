package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilo extends ayc {
    final /* synthetic */ ilq k;

    public ilo(ilq ilqVar) {
        this.k = ilqVar;
    }

    @Override // defpackage.ayc
    public final int a() {
        return this.k.c.g() ? R.layout.setup_guidedactions_item : R.layout.lb_guidedactions_item;
    }

    @Override // defpackage.ayc
    public final int b() {
        return this.k.c.g() ? R.layout.homegraph_guidedactions_m3 : R.layout.homegraph_guidedactions;
    }

    @Override // defpackage.ayc
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        viewGroup.getClass();
        View viewC = super.c(layoutInflater, viewGroup);
        viewC.getClass();
        ilq ilqVar = this.k;
        if (ilqVar.d.size() >= 5 && !ilqVar.a.isTouchExplorationEnabled()) {
            viewC.requireViewById(R.id.info_group).setVisibility(0);
        }
        return viewC;
    }
}
