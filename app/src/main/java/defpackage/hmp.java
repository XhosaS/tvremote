package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmp extends uut {
    private final hmb a;
    private final hmc b;

    public hmp(hmb hmbVar, hmc hmcVar) {
        this.a = hmbVar;
        this.b = hmcVar;
    }

    @Override // defpackage.uut, defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amati_refinement_container, viewGroup, false);
        azw azwVarB = super.b(viewGroup2);
        View view = azwVarB.g;
        viewGroup2.addView(view);
        viewGroup2.setDescendantFocusability(262144);
        if (view instanceof HorizontalGridView) {
            HorizontalGridView horizontalGridView = (HorizontalGridView) view;
            if (!horizontalGridView.ag) {
                horizontalGridView.ag = true;
                horizontalGridView.invalidate();
                horizontalGridView.aF();
            }
            horizontalGridView.setFadingLeftEdgeLength(horizontalGridView.getPaddingLeft());
        }
        return new hmo(viewGroup2, azwVarB);
    }

    @Override // defpackage.azx
    protected final void f(azw azwVar) {
        super.f(azwVar);
        hmo hmoVar = (hmo) y(azwVar);
        ((HorizontalGridView) hmoVar.a.g).ag(new hmn(hmoVar, this.a, this.b));
    }

    @Override // defpackage.uut, defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        if (azwVar instanceof hmo) {
            super.g(((hmo) azwVar).a, ((hmm) obj).a);
        } else {
            super.g(azwVar, obj);
        }
    }

    @Override // defpackage.uut, defpackage.azx
    protected final void k(azw azwVar) {
        ((uus) ((hmo) azwVar).a).d();
    }

    @Override // defpackage.uut, defpackage.azm
    public final void t(azk azkVar, Object obj, List list) {
        if (azkVar instanceof hmo) {
            hmm hmmVar = (hmm) obj;
            Object obj2 = hmmVar.a;
            if (((uum) obj2).c.isEmpty()) {
                ((hmo) azkVar).a.g.setFocusable(false);
            }
            azw azwVar = ((hmo) azkVar).a;
            super.t(azwVar, obj2, list);
            if (hmmVar.b == null) {
                hmmVar.b = new pan(97270);
            }
            paq.c(azwVar.g, hmmVar.b);
        }
    }

    @Override // defpackage.azx
    protected final void z(azw azwVar) {
        super.z(azwVar);
        azw azwVar2 = azwVar instanceof hmo ? ((hmo) azwVar).a : azwVar;
        hmc hmcVar = this.b;
        View view = azwVar2.g;
        pan panVarA = paq.a(view);
        if (hmcVar.E() && panVarA != null && (panVarA.a().b & 1) == 0) {
            this.a.q().u(hmcVar.y(), view, (View) azwVar.g.getParent());
        }
    }
}
