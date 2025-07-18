package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jq implements ds {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public jq(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.ds
    public final void E(du duVar) {
        if (this.b != 0) {
            ds dsVar = ((ActionMenuView) this.a).d;
            if (dsVar != null) {
                dsVar.E(duVar);
                return;
            }
            return;
        }
        Toolbar toolbar = (Toolbar) this.a;
        if (toolbar.a.l()) {
            return;
        }
        toolbar.v.l(duVar);
    }

    @Override // defpackage.ds
    public final boolean I(du duVar, MenuItem menuItem) {
        byj byjVar;
        return (this.b == 0 || (byjVar = ((ActionMenuView) this.a).e) == null || !((Toolbar) byjVar.a).v.m(menuItem)) ? false : true;
    }
}
