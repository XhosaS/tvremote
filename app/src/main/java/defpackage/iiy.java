package defpackage;

import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class iiy extends ayc {
    final /* synthetic */ iiz k;

    public iiy(iiz iizVar) {
        this.k = iizVar;
    }

    @Override // defpackage.ayc
    public final void e(ayb aybVar, axh axhVar) {
        super.e(aybVar, axhVar);
        iiz iizVar = this.k;
        if (iizVar.al == gph.a && axhVar.a == 3) {
            ViewGroup.LayoutParams layoutParams = aybVar.t.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int dimension = (int) iizVar.aY().getDimension(R.dimen.setup_amati_action_title_neutral_margin);
                marginLayoutParams.topMargin = dimension;
                marginLayoutParams.bottomMargin = dimension;
            }
        }
        if (iizVar.ak.isTouchExplorationEnabled()) {
            long j = axhVar.a;
            if (j == 2) {
                aybVar.t.setContentDescription(iizVar.dZ().getResources().getString(R.string.data_sharing_consent_decline_description, axhVar.b));
                return;
            }
            if (j == 1) {
                if (((Boolean) iizVar.f.a()).booleanValue()) {
                    if (iizVar.ah) {
                        aybVar.t.setContentDescription(iizVar.dZ().getResources().getString(R.string.data_sharing_consent_view_more_description));
                        return;
                    } else {
                        aybVar.t.setContentDescription(iizVar.dZ().getResources().getString(R.string.data_sharing_consent_accept_description, axhVar.b));
                        return;
                    }
                }
                if (iizVar.bb()) {
                    aybVar.t.setContentDescription(iizVar.dZ().getResources().getString(R.string.data_sharing_consent_view_more_description));
                } else {
                    aybVar.t.setContentDescription(iizVar.dZ().getResources().getString(R.string.data_sharing_consent_accept_description, axhVar.b));
                }
            }
        }
    }
}
