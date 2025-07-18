package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class iib extends ayc {
    final /* synthetic */ iic k;

    public iib(iic iicVar) {
        this.k = iicVar;
    }

    @Override // defpackage.ayc
    public final int a() {
        return R.layout.setup_guidedactions_item;
    }

    @Override // defpackage.ayc
    public final int b() {
        return R.layout.setup_value_prop_v2p1_right_panel;
    }

    @Override // defpackage.ayc
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        zdy zdyVar = iic.d;
        View viewC = super.c(layoutInflater, viewGroup);
        iic iicVar = this.k;
        if (iicVar.n != null) {
            viewC.findViewById(R.id.guidance_header).setVisibility(0);
            View viewFindViewById = viewC.findViewById(R.id.guidance_subtitle);
            viewFindViewById.setVisibility(0);
            if (iicVar.ak.isTouchExplorationEnabled()) {
                ahj.p(viewFindViewById, true);
            }
        }
        return viewC;
    }

    @Override // defpackage.ayc
    public final void e(ayb aybVar, axh axhVar) {
        super.e(aybVar, axhVar);
        TextView textView = aybVar.t;
        if (textView != null) {
            textView.setSingleLine(false);
            textView.setMaxLines(1);
        }
        iic iicVar = this.k;
        if (iicVar.ak.isTouchExplorationEnabled()) {
            iicVar.aS(aybVar, axhVar);
        }
    }
}
