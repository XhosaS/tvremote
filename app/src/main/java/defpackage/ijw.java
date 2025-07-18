package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class ijw extends axe {
    @Override // defpackage.axe
    public final int a() {
        return R.layout.setup_guidance_m3_amati;
    }

    @Override // defpackage.axe
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, axd axdVar) {
        View viewB = super.b(layoutInflater, viewGroup, axdVar);
        viewB.requireViewById(R.id.guidance_subtitle).setVisibility(8);
        return viewB;
    }
}
