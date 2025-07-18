package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public class la implements jh {
    final /* synthetic */ ActionMenuView a;

    public la(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // defpackage.jh
    public final void C(jj jjVar) {
        jh jhVar = this.a.d;
        if (jhVar != null) {
            jhVar.C(jjVar);
        }
    }

    @Override // defpackage.jh
    public final boolean G(jj jjVar, MenuItem menuItem) {
        rx rxVar = this.a.e;
        return rxVar != null && rxVar.a.n.c(menuItem);
    }
}
