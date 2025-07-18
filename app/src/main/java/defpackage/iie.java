package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class iie extends ayc {
    final /* synthetic */ iif k;

    public iie(iif iifVar) {
        this.k = iifVar;
    }

    @Override // defpackage.ayc
    public final void e(ayb aybVar, axh axhVar) {
        TextView textView;
        TextView textView2;
        super.e(aybVar, axhVar);
        TextView textView3 = aybVar.u;
        if (textView3 != null && !TextUtils.isEmpty(textView3.getText()) && (textView2 = aybVar.t) != null) {
            textView2.setTextAppearance(R.style.AmatiSetupGuidedActionItemTitleWithDescriptionTextAppearance);
            if (textView2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                iif iifVar = this.k;
                marginLayoutParams.topMargin = (int) iifVar.aY().getDimension(R.dimen.setup_amati_action_title_with_description_top_margin);
                marginLayoutParams.bottomMargin = (int) iifVar.aY().getDimension(R.dimen.setup_amati_action_title_with_description_bottom_margin);
            }
        }
        if (axhVar.a == 5000 && (textView = aybVar.t) != null && (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int dimension = (int) this.k.aY().getDimension(R.dimen.setup_amati_action_title_neutral_margin);
            marginLayoutParams2.topMargin = dimension;
            marginLayoutParams2.bottomMargin = dimension;
        }
    }
}
