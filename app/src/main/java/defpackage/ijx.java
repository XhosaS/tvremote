package defpackage;

import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class ijx extends ayc {
    final /* synthetic */ ijy k;

    public ijx(ijy ijyVar) {
        this.k = ijyVar;
    }

    @Override // defpackage.ayc
    public final void e(ayb aybVar, axh axhVar) {
        super.e(aybVar, axhVar);
        ijy ijyVar = this.k;
        if (ijyVar.al == gph.a && axhVar.a == 32003) {
            ViewGroup.LayoutParams layoutParams = aybVar.t.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int dimension = (int) ijyVar.aY().getDimension(R.dimen.setup_amati_action_title_neutral_margin);
                marginLayoutParams.topMargin = dimension;
                marginLayoutParams.bottomMargin = dimension;
            }
        }
        if (ijyVar.ak.isTouchExplorationEnabled()) {
            long j = axhVar.a;
            if (j == 32002) {
                aybVar.t.setContentDescription(ijyVar.dZ().getResources().getString(R.string.assistant_personal_result_skip_description));
                return;
            }
            if (j == 32001) {
                if (((Boolean) ijyVar.e.a()).booleanValue()) {
                    if (ijyVar.f) {
                        aybVar.t.setContentDescription(ijyVar.dZ().getResources().getString(R.string.assistant_personal_result_view_more_description));
                        return;
                    } else {
                        aybVar.t.setContentDescription(ijyVar.dZ().getResources().getString(R.string.assistant_personal_result_allow_description));
                        return;
                    }
                }
                if (ijyVar.bb()) {
                    aybVar.t.setContentDescription(ijyVar.dZ().getResources().getString(R.string.assistant_personal_result_view_more_description));
                } else {
                    aybVar.t.setContentDescription(ijyVar.dZ().getResources().getString(R.string.assistant_personal_result_allow_description));
                }
            }
        }
    }
}
