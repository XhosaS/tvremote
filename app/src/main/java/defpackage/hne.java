package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hne extends huz {
    public final boolean a;
    ayj b;
    private final hmc c;
    private final hmb d;

    public hne(hmb hmbVar, boolean z, hmc hmcVar) {
        super(hmcVar.B(), hmcVar.C(), null);
        this.d = hmbVar;
        this.a = z;
        this.c = hmcVar;
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        ayj ayjVar;
        hmb hmbVar = this.d;
        boolean z = hmbVar.r() == gph.a || hmbVar.r() == gph.c;
        if (z && this.b == null) {
            if (this.c.C()) {
                ayi ayiVar = new ayi();
                ayiVar.a(0.0f);
                ayiVar.f = true;
                ayiVar.b = R.id.entity_card;
                ayjVar = new ayj();
                ayjVar.a(new ayi[]{ayiVar});
            } else {
                Resources resources = viewGroup.getResources();
                ayi ayiVar2 = new ayi();
                ayiVar2.a(0.0f);
                ayiVar2.d = resources.getDimensionPixelSize(R.dimen.amati_entity_row_offset);
                ayiVar2.f = true;
                ayiVar2.b = R.id.entity_card;
                ayjVar = new ayj();
                ayjVar.a(new ayi[]{ayiVar2});
            }
            this.b = ayjVar;
            x(ayj.class, ayjVar);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.entity_metadata_row, viewGroup, false);
        azw hntVar = z ? new hnt(viewInflate, hmbVar, this.a, this.c) : new hns(viewInflate, hmbVar, this.a, this.c);
        if (!this.c.B()) {
            viewInflate.setFocusable(false);
        }
        return hntVar;
    }

    @Override // defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        super.g(azwVar, obj);
        if (obj instanceof hoh) {
            hns hnsVar = (hns) azwVar;
            hoh hohVar = (hoh) obj;
            hnsVar.b = hohVar;
            hnsVar.b.h = hnsVar;
            hnsVar.M.c = hohVar;
            hnsVar.n();
            if (hnsVar.b.i) {
                hnsVar.G.setVisibility(0);
            } else {
                hnsVar.G.setVisibility(8);
            }
        }
    }

    @Override // defpackage.azx
    protected final void k(azw azwVar) {
        if (azwVar instanceof hns) {
            hns hnsVar = (hns) azwVar;
            hnsVar.b.h = null;
            hnsVar.j();
            hnsVar.i();
        }
    }

    @Override // defpackage.huz, defpackage.huw, defpackage.azx
    protected final void z(azw azwVar) throws Resources.NotFoundException {
        hmb hmbVar = this.d;
        if (hmbVar.r() == gph.b || hmbVar.r() == gph.c) {
            super.z(azwVar);
        }
    }
}
