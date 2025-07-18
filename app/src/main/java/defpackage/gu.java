package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
class gu implements ii {
    final /* synthetic */ hf a;
    private final ii b;

    public gu(hf hfVar, ii iiVar) {
        this.a = hfVar;
        this.b = iiVar;
    }

    @Override // defpackage.ii
    public final void a(ij ijVar) {
        il ilVar = (il) this.b;
        ilVar.a.onDestroyActionMode(ilVar.e(ijVar));
        hf hfVar = this.a;
        if (hfVar.s != null) {
            hfVar.l.getDecorView().removeCallbacks(hfVar.t);
        }
        if (hfVar.r != null) {
            hfVar.z();
            ahw ahwVarD = ahj.d(hfVar.r);
            ahwVarD.b(0.0f);
            hfVar.u = ahwVarD;
            hfVar.u.d(new gt(this));
        }
        gg ggVar = hfVar.m;
        if (ggVar != null) {
            ggVar.cU(hfVar.q);
        }
        hfVar.q = null;
        ViewGroup viewGroup = hfVar.x;
        int[] iArr = ahj.a;
        aha.c(viewGroup);
        hfVar.D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ii
    public final boolean b(ij ijVar, MenuItem menuItem) {
        il ilVar = (il) this.b;
        return ilVar.a.onActionItemClicked(ilVar.e(ijVar), new jr(ilVar.b, menuItem));
    }

    @Override // defpackage.ii
    public final boolean c(ij ijVar, Menu menu) {
        il ilVar = (il) this.b;
        return ilVar.a.onCreateActionMode(ilVar.e(ijVar), ilVar.f(menu));
    }

    @Override // defpackage.ii
    public final void d(ij ijVar, Menu menu) {
        ViewGroup viewGroup = this.a.x;
        int[] iArr = ahj.a;
        aha.c(viewGroup);
        il ilVar = (il) this.b;
        ilVar.a.onPrepareActionMode(ilVar.e(ijVar), ilVar.f(menu));
    }
}
