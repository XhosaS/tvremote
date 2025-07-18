package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.katniss.R;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public class htu extends hti implements hts, hna {
    public static final zdy ao = zdy.h("com/google/android/apps/tvsearch/results/textresponse/TextResponseFragment");
    public String ap = "";
    TextView aq;
    public agow ar;
    public agow as;
    public gfr at;
    public glq au;
    public gmd av;
    public agow aw;
    public fex ax;
    public gmu ay;
    public ghr az;

    @Override // defpackage.bq
    public View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hld hldVar = new hld(layoutInflater);
        hldVar.b(R.layout.text_response);
        hldVar.d(hkb.i(this));
        hldVar.b.e = new hlc() { // from class: htt
            @Override // defpackage.hlc
            public final void a() {
                htu htuVar = this.a;
                gmd gmdVar = htuVar.av;
                gmc gmcVar = gmc.D;
                gmc gmcVar2 = gmc.J;
                gmdVar.q(gmcVar, gmcVar2, htuVar.ax.a(), hkb.c(htuVar));
                htuVar.ay.C(gmcVar2, Instant.EPOCH);
                htuVar.au.y(gma.i);
                htuVar.az.x(abnb.SEARCH_RESULT_PAGE);
                if (((Boolean) htuVar.aw.a()).booleanValue()) {
                    ((gfn) htuVar.as.a()).a(rpm.co()).b().c();
                } else {
                    htuVar.at.a(rpm.co(), abqb.OK, null, null);
                }
                if (((Boolean) htuVar.ar.a()).booleanValue() && htuVar.ax.b() != null) {
                    String strB = htuVar.ax.b();
                    gfl gflVarA = ((gfn) htuVar.as.a()).a(rpm.cT()).a(strB);
                    gflVarA.h(strB);
                    gflVarA.c();
                    gfg gfgVarA = ((gfn) htuVar.as.a()).c(rpm.dX()).a(strB);
                    gfgVarA.g(strB);
                    gfgVarA.c(abqb.OK);
                }
                htuVar.az.af();
                ((zdv) ((zdv) htu.ao.b()).q("com/google/android/apps/tvsearch/results/textresponse/TextResponseFragment", "onCreateView", 141, "TextResponseFragment.java")).u("Result displayed text.");
            }
        };
        return hldVar.a();
    }

    public void aB(String str) {
        this.ap = this.ap + "\n\n" + str;
        hts.sw.a(this, this.ap);
        TextView textView = this.aq;
        if (textView != null) {
            textView.setText(this.ap);
            View view = this.R;
            if (view instanceof hle) {
                hle hleVar = (hle) view;
                hleVar.b(hleVar.getFragmentView());
            }
        }
    }

    @Override // defpackage.bq
    public void aa(View view, Bundle bundle) {
        TextView textView = (TextView) view.findViewById(R.id.text_response_content);
        this.aq = textView;
        textView.setText(this.ap);
        if (hkb.h(this)) {
            view.setPadding(view.getPaddingLeft(), hkb.a(this), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.hna
    public final abnb dJ() {
        return abnb.SEARCH_RESULT_PAGE;
    }

    @Override // defpackage.bq
    public void e() {
        View view = this.R;
        if (view instanceof hle) {
            ((hle) view).e();
        }
        this.aq = null;
        this.P = true;
    }

    @Override // defpackage.bq
    public final void ey(Bundle bundle) {
        super.ey(bundle);
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            this.ap = bundle2.getString("response_text", "");
        }
    }

    @Override // defpackage.bq
    public final void h() {
        this.P = true;
        this.az.w(abnb.SEARCH_RESULT_PAGE);
    }

    @Override // defpackage.bq
    public final void i() {
        abnb abnbVar = abnb.SEARCH_RESULT_PAGE;
        this.az.y(abnbVar);
        this.az.v(hkb.c(this), abnbVar);
        this.P = true;
    }

    public /* synthetic */ void aD(SuggestionChipList suggestionChipList) {
    }

    public /* synthetic */ void aF(jov jovVar) {
    }
}
