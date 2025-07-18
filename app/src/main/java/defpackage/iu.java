package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iu extends oc {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.oc
    public final ka a() {
        kp kpVar;
        iv ivVar = this.a.c;
        if (ivVar == null || (kpVar = ((kq) ivVar).a.k) == null) {
            return null;
        }
        return kpVar.a();
    }

    @Override // defpackage.oc
    protected final boolean b() {
        ka kaVarA;
        ActionMenuItemView actionMenuItemView = this.a;
        ji jiVar = actionMenuItemView.b;
        return jiVar != null && jiVar.b(actionMenuItemView.a) && (kaVarA = a()) != null && kaVarA.u();
    }
}
