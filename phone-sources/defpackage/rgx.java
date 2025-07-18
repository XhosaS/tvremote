package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rgx implements rma {
    public final /* synthetic */ rme a;
    public final /* synthetic */ qwn b;
    public final /* synthetic */ rhu c;
    public final /* synthetic */ wds d;
    private final /* synthetic */ int e;

    public /* synthetic */ rgx(qwn qwnVar, rhu rhuVar, wds wdsVar, rme rmeVar, int i) {
        this.e = i;
        this.b = qwnVar;
        this.c = rhuVar;
        this.d = wdsVar;
        this.a = rmeVar;
    }

    @Override // defpackage.rma
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.e;
        if (i == 0) {
            rme rmeVar = this.a;
            if (rmeVar.getView() == null) {
                return rhd.c(layoutInflater);
            }
            wds wdsVar = this.d;
            rhu rhuVar = this.c;
            qwn qwnVar = this.b;
            dvk viewLifecycleOwner = rmeVar.getViewLifecycleOwner();
            rhr rhrVar = new rhr(layoutInflater.getContext(), null);
            qux quxVarB = rhd.b(qwnVar, viewLifecycleOwner);
            int iAu = rrx.au(rhrVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing);
            rhrVar.getContext();
            rrx.aA((RecyclerView) rhrVar.findViewById(R.id.accounts), new qvx(rrx.ay(qwnVar), new rhg(rhuVar, qwnVar, 0), rhuVar, wdsVar, qwnVar.m, iAu, quxVarB));
            rhf rhfVar = new rhf(qwnVar, rhrVar.getContext(), viewLifecycleOwner);
            rhfVar.f = rrx.az(rhrVar.getContext(), qwnVar, wdsVar);
            rhfVar.b();
            rhfVar.c();
            rhfVar.d = true;
            qws qwsVar = new qws(qwnVar);
            qwsVar.b();
            rhfVar.e = qwsVar.a();
            rhe rheVarA = rhfVar.a();
            dvs dvsVar = rheVarA.a;
            rrx rrxVar = qwnVar.e.q;
            rrx.aA((RecyclerView) rhrVar.findViewById(R.id.cards_and_actions), rhrVar.b(dvsVar, qwnVar, rhuVar, iAu));
            rrx.aA((RecyclerView) rhrVar.findViewById(R.id.common_actions), rhrVar.b(rheVarA.b, qwnVar, rhuVar, iAu + rrx.au(rhrVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing)));
            return rhrVar;
        }
        if (i == 1) {
            rme rmeVar2 = this.a;
            if (rmeVar2.getView() == null) {
                return rhd.c(layoutInflater);
            }
            wds wdsVar2 = this.d;
            rhu rhuVar2 = this.c;
            qwn qwnVar2 = this.b;
            rhr rhrVar2 = new rhr(layoutInflater.getContext());
            dvk viewLifecycleOwner2 = rmeVar2.getViewLifecycleOwner();
            View viewFindViewById = rhrVar2.findViewById(R.id.sign_in_button);
            rhz rhzVar = new rhz(new nay(qwnVar2, wdsVar2, 14));
            rhzVar.d = rhuVar2.b();
            rhzVar.e = rhuVar2.a();
            viewFindViewById.setOnClickListener(new rhy(rhzVar));
            rhf rhfVar2 = new rhf(qwnVar2, rhrVar2.getContext(), viewLifecycleOwner2);
            rhfVar2.b();
            rhfVar2.c();
            rhfVar2.d = true;
            qws qwsVar2 = new qws(qwnVar2);
            qwsVar2.b();
            rhfVar2.e = qwsVar2.a();
            rhe rheVarA2 = rhfVar2.a();
            int iAu2 = rrx.au(rhrVar2.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + rrx.au(rhrVar2.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
            dvs dvsVar2 = rheVarA2.a;
            rrx rrxVar2 = qwnVar2.e.q;
            rrx.aA((RecyclerView) rhrVar2.findViewById(R.id.cards_and_actions), rhrVar2.a(dvsVar2, qwnVar2, rhuVar2, iAu2));
            rrx.aA((RecyclerView) rhrVar2.findViewById(R.id.common_actions), rhrVar2.a(rheVarA2.b, qwnVar2, rhuVar2, iAu2));
            return rhrVar2;
        }
        rhq rhqVar = new rhq(layoutInflater.getContext());
        dvk viewLifecycleOwner3 = this.a.getViewLifecycleOwner();
        a.H(false);
        MaterialButton materialButton = (MaterialButton) rhqVar.findViewById(R.id.turn_off_incognito_button);
        qwn qwnVar3 = this.b;
        rfg rfgVar = qwnVar3.e;
        rfq rfqVar = (rfq) rfgVar.b.c();
        materialButton.setText(rfqVar.b());
        rhqVar.getContext();
        materialButton.m(rfqVar.c());
        rhz rhzVar2 = new rhz(new nay(qwnVar3, this.d, 12));
        rhu rhuVar3 = this.c;
        rhzVar2.d = rhuVar3.b();
        rhzVar2.e = rhuVar3.a();
        materialButton.setOnClickListener(new rhy(rhzVar2));
        rhf rhfVar3 = new rhf(qwnVar3, rhqVar.getContext(), viewLifecycleOwner3);
        qws qwsVar3 = new qws(qwnVar3);
        qwsVar3.b();
        rhfVar3.e = qwsVar3.a();
        dvs dvvVar = rhfVar3.a().b;
        Context context = rhqVar.getContext();
        if (dvvVar == null) {
            dvvVar = new dvv();
        }
        dvs dvsVar3 = dvvVar;
        qwo qwoVar = qwnVar3.b;
        rjg rjgVar = qwnVar3.m;
        int iAu3 = rrx.au(rhqVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + rrx.au(rhqVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
        rfo rfoVar = rfgVar.j;
        rrx rrxVar3 = rfgVar.q;
        rdz rdzVar = new rdz(context, qwoVar, dvsVar3, rhuVar3, rjgVar, iAu3);
        RecyclerView recyclerView = rhqVar.a;
        rrx.ae(recyclerView, rdzVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(rhqVar.getContext()));
        return rhqVar;
    }

    public /* synthetic */ rgx(rme rmeVar, qwn qwnVar, rhu rhuVar, wds wdsVar, int i) {
        this.e = i;
        this.a = rmeVar;
        this.b = qwnVar;
        this.c = rhuVar;
        this.d = wdsVar;
    }
}
