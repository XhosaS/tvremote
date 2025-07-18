package defpackage;

import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class iid extends axe {
    final /* synthetic */ iif f;

    public iid(iif iifVar) {
        this.f = iifVar;
    }

    @Override // defpackage.axe
    public final int a() {
        return this.f.an.g() ? R.layout.setup_guidance_m3_amati : R.layout.setup_guidance_amati;
    }

    @Override // defpackage.axe
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, axd axdVar) {
        View viewB = super.b(layoutInflater, viewGroup, axdVar);
        iif iifVar = this.f;
        ylw ylwVarAS = iifVar.aS();
        StringBuilder sb = new StringBuilder();
        if (ylwVarAS != null) {
            ylv ylvVar = ylwVarAS.c;
            if (ylvVar == null) {
                ylvVar = ylv.a;
            }
            sb.append(TextUtils.join("\n", ylvVar.c));
            sb.append("<br/><br/>");
            ylv ylvVar2 = ylwVarAS.c;
            if (ylvVar2 == null) {
                ylvVar2 = ylv.a;
            }
            sb.append(TextUtils.join("\n", ylvVar2.f));
            sb.append("<br/><br/>");
        }
        if (ylwVarAS != null) {
            ylv ylvVar3 = ylwVarAS.c;
            if (ylvVar3 == null) {
                ylvVar3 = ylv.a;
            }
            if (ylvVar3.e.size() > 0) {
                ylv ylvVar4 = ylwVarAS.c;
                if (ylvVar4 == null) {
                    ylvVar4 = ylv.a;
                }
                ymn ymnVar = (ymn) ylvVar4.e.get(0);
                sb.append("<b>");
                sb.append(ymnVar.b);
                sb.append("</b><br/><br/>");
                sb.append(TextUtils.join("", ymnVar.c));
            }
        }
        if (iifVar.al == gph.a) {
            TextView textView = (TextView) viewB.findViewById(R.id.guidance_description_2);
            textView.setVisibility(0);
            textView.setText(Html.fromHtml(sb.toString(), 0));
        }
        if (iifVar.an.g()) {
            viewB.findViewById(R.id.guidance_subtitle).setVisibility(8);
        }
        return viewB;
    }
}
