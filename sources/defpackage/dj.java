package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dj extends hj {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.hj
    public final ek a() {
        ew ewVar;
        byj byjVar = this.a.c;
        if (byjVar == null || (ewVar = ((fa) byjVar.a).j) == null) {
            return null;
        }
        return ewVar.a();
    }

    @Override // defpackage.hj
    public final boolean b() {
        ek ekVarA;
        ActionMenuItemView actionMenuItemView = this.a;
        dt dtVar = actionMenuItemView.b;
        return dtVar != null && dtVar.b(actionMenuItemView.a) && (ekVarA = a()) != null && ekVarA.u();
    }
}
