package defpackage;

import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class ikg extends ayc {
    final /* synthetic */ ikh k;

    public ikg(ikh ikhVar) {
        this.k = ikhVar;
    }

    @Override // defpackage.ayc
    public final void e(ayb aybVar, axh axhVar) {
        super.e(aybVar, axhVar);
        if (axhVar.a == 3) {
            ViewGroup.LayoutParams layoutParams = aybVar.t.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int dimension = (int) this.k.aY().getDimension(R.dimen.setup_amati_action_title_neutral_margin);
                marginLayoutParams.topMargin = dimension;
                marginLayoutParams.bottomMargin = dimension;
            }
        }
        ikh ikhVar = this.k;
        if (ikhVar.ak.isTouchExplorationEnabled()) {
            long j = axhVar.a;
            if (j == 2) {
                aybVar.t.setContentDescription(ikhVar.dZ().getResources().getString(R.string.voice_match_setup_no_description));
                return;
            }
            if (j == 1) {
                if (((Boolean) ikhVar.e.a()).booleanValue()) {
                    if (ikhVar.f) {
                        aybVar.t.setContentDescription(ikhVar.dZ().getResources().getString(R.string.voice_match_setup_view_more_description));
                        return;
                    } else {
                        aybVar.t.setContentDescription(ikhVar.dZ().getResources().getString(R.string.voice_match_setup_yes_description));
                        return;
                    }
                }
                if (ikhVar.bb()) {
                    aybVar.t.setContentDescription(ikhVar.dZ().getResources().getString(R.string.voice_match_setup_view_more_description));
                } else {
                    aybVar.t.setContentDescription(ikhVar.dZ().getResources().getString(R.string.voice_match_setup_yes_description));
                }
            }
        }
    }
}
