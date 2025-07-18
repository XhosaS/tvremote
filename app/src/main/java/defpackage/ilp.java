package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilp extends axe {
    final /* synthetic */ ilq f;

    public ilp(ilq ilqVar) {
        this.f = ilqVar;
    }

    @Override // defpackage.axe
    public final int a() {
        return this.f.c.g() ? R.layout.setup_guidance_homegraph_m3 : R.layout.setup_guidance_homegraph;
    }

    @Override // defpackage.axe
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, axd axdVar) {
        layoutInflater.getClass();
        View viewB = super.b(layoutInflater, viewGroup, axdVar);
        viewB.getClass();
        ilq ilqVar = this.f;
        if (ilqVar.d.size() >= 5 && ilqVar.a.isTouchExplorationEnabled()) {
            viewB.requireViewById(R.id.info_group_a11y).setVisibility(0);
        }
        return viewB;
    }
}
