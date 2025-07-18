package defpackage;

import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uuq extends azm {
    private final int a;
    private final hqi b;
    public final hqg c;

    public uuq(hqi hqiVar, hqg hqgVar, int i) {
        this.b = hqiVar;
        this.c = hqgVar;
        this.a = i;
    }

    @Override // defpackage.azm
    public final azk q(ViewGroup viewGroup) {
        return new uup(this.a == 2 ? LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recent_filter, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.filter, viewGroup, false), this.b);
    }

    @Override // defpackage.azm
    public void s(azk azkVar, final Object obj) {
        uup uupVar = (uup) azkVar;
        hqi hqiVar = uupVar.a;
        View view = uupVar.g;
        boolean zA = hqiVar.a(obj);
        AppCompatButton appCompatButton = (AppCompatButton) view;
        xlm xlmVar = (xlm) obj;
        appCompatButton.setText(xlmVar.c);
        view.setActivated(zA);
        int[] iArr = hqiVar.b(obj) ? new int[]{R.drawable.quantum_gm_ic_history_white_18, 0, 0, 0} : new int[]{0, 0, 0, 0};
        appCompatButton.setCompoundDrawablesWithIntrinsicBounds(iArr[0], iArr[1], iArr[2], iArr[3]);
        view.setContentDescription(hqiVar.b(obj) ? xlmVar.c : hqiVar.a(obj) ? hqiVar.a.dZ().getResources().getString(R.string.search_result_page_filter_content_description_active, xlmVar.c) : hqiVar.a.dZ().getResources().getString(R.string.search_result_page_filter_content_description_inactive, xlmVar.c));
        if (hqiVar.a.as.isTouchExplorationEnabled()) {
            ahj.n(view, new hqh(hqiVar, obj));
        }
        View view2 = azkVar.g;
        view2.setOnClickListener(new View.OnClickListener() { // from class: uun
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                hqn hqnVar = this.a.c.a;
                hqnVar.ay = true;
                xlm xlmVar2 = (xlm) obj;
                int iA = xll.a(xlmVar2.g);
                int i = 4;
                if (iA != 0 && iA == 3) {
                    i = 6;
                }
                int i2 = i - 1;
                if ((xlmVar2.b & 8) != 0) {
                    hqnVar.aR.d(xlmVar2.f, i2);
                } else {
                    ((zdv) ((zdv) hqn.ar.d()).q("com/google/android/apps/tvsearch/results/searchresultspage/SearchResultsPageFragment", "processRefinements", 651, "SearchResultsPageFragment.java")).x("Refinement intent is null, fall back to text search with query %s", xlmVar2.c);
                    hqnVar.aR.h(xlmVar2.c, i2);
                }
                if (hqnVar.aQ == gph.a) {
                    hqnVar.ba.b(gmc.B);
                }
                hqnVar.aR.a();
                hqnVar.bj.E(8);
                hqnVar.bj.l(view3, new hqm(hqnVar, xlmVar2), false, hqnVar.aK.g(), 97270, hqnVar.aA.indexOf(xlmVar2), hqnVar.aB, hqnVar.bj());
            }
        });
        view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: uuo
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                return false;
            }
        });
    }

    @Override // defpackage.azm
    public final void u(azk azkVar) {
        View view = ((uup) azkVar).g;
        AppCompatButton appCompatButton = (AppCompatButton) view;
        appCompatButton.setText("");
        view.setActivated(false);
        appCompatButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        view.setContentDescription(null);
        View view2 = azkVar.g;
        view2.setOnClickListener(null);
        view2.setOnLongClickListener(null);
        view2.setOnFocusChangeListener(null);
    }
}
