package defpackage;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class iil extends ayc {
    final /* synthetic */ iim k;

    public iil(iim iimVar) {
        this.k = iimVar;
    }

    @Override // defpackage.ayc
    public final int b() {
        return R.layout.setup_udc_opt_in_right_panel_v2p2;
    }

    @Override // defpackage.ayc
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewC = super.c(layoutInflater, viewGroup);
        iim iimVar = this.k;
        if (iimVar.aV()) {
            ylw ylwVarAS = iimVar.aS();
            TextView textView = (TextView) viewC.findViewById(R.id.udc_title);
            ylv ylvVar = ylwVarAS.c;
            if (ylvVar == null) {
                ylvVar = ylv.a;
            }
            textView.setText(ylvVar.b);
            textView.setVisibility(0);
            TextView textView2 = (TextView) viewC.findViewById(R.id.email_id);
            ylv ylvVar2 = ylwVarAS.c;
            if (ylvVar2 == null) {
                ylvVar2 = ylv.a;
            }
            textView2.setText(ylvVar2.d);
            textView2.setVisibility(0);
            TextView textView3 = (TextView) viewC.findViewById(R.id.udc_footer);
            ylv ylvVar3 = ylwVarAS.c;
            if (ylvVar3 == null) {
                ylvVar3 = ylv.a;
            }
            String strConcat = "";
            if (ylvVar3.f.size() > 0) {
                ylv ylvVar4 = ylwVarAS.c;
                if (ylvVar4 == null) {
                    ylvVar4 = ylv.a;
                }
                strConcat = "".concat(String.valueOf(String.valueOf(Html.fromHtml(iim.aU(ylvVar4.f), 0))));
            }
            textView3.setText(strConcat.trim());
            textView3.setVisibility(0);
            ylv ylvVar5 = ylwVarAS.c;
            if (ylvVar5 == null) {
                ylvVar5 = ylv.a;
            }
            if (ylvVar5.e.size() > 0) {
                ylv ylvVar6 = ylwVarAS.c;
                if (ylvVar6 == null) {
                    ylvVar6 = ylv.a;
                }
                ymn ymnVar = (ymn) ylvVar6.e.get(0);
                TextView textView4 = (TextView) viewC.findViewById(R.id.consent_title);
                textView4.setText(ymnVar.b);
                textView4.setVisibility(0);
                TextView textView5 = (TextView) viewC.findViewById(R.id.consent_description);
                textView5.setText(Html.fromHtml(iim.aU(ymnVar.c)));
                textView5.setVisibility(0);
            }
            this.c.setOverScrollMode(1);
        }
        return viewC;
    }
}
