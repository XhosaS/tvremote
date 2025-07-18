package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hpt extends azm {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/searchlist/SearchItemDetailPresenterAmati");
    public final hmb b;
    public final boolean c;
    public final zyg d;
    public final zyg e;

    public hpt(hmb hmbVar, boolean z, zyg zygVar, zyg zygVar2) {
        this.b = hmbVar;
        this.c = z;
        this.d = zygVar;
        this.e = zygVar2;
    }

    protected hps b(View view) {
        return new hps(view, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.azm
    public final azk q(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.global_search_browse_row_item_amati, viewGroup, false);
        viewInflate.getClass();
        hps hpsVarB = b(viewInflate);
        hpsVarB.j();
        return hpsVarB;
    }

    @Override // defpackage.azm
    public void s(azk azkVar, Object obj) {
        if (obj instanceof hly) {
            hps hpsVar = (hps) azkVar;
            hkk hkkVar = (hkk) obj;
            hpsVar.f(hkkVar);
            View view = hpsVar.g;
            obj.getClass();
            paq.c(view, hkkVar.o());
            return;
        }
        if (!(obj instanceof hkk)) {
            ((zdv) a.c().q("com/google/android/apps/tvsearch/results/searchlist/SearchItemDetailPresenterAmati", "onBindViewHolder", 113, "SearchItemDetailPresenterAmati.kt")).x("Wrong use of the item %s", obj);
            return;
        }
        hps hpsVar2 = (hps) azkVar;
        hkk hkkVar2 = (hkk) obj;
        hpsVar2.f(hkkVar2);
        paq.c(hpsVar2.g, hkkVar2.o());
    }

    @Override // defpackage.azm
    public void u(azk azkVar) {
        ((hps) azkVar).i();
    }
}
