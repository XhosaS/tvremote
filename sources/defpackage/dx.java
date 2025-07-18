package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dx extends qk implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int b = 0;
    public final ActionProvider a;
    private byj e;

    public dx(ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // defpackage.qk
    public final View a(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.qk
    public final void b(SubMenu subMenu) {
        this.a.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.qk
    public final boolean c() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.qk
    public final boolean d() {
        return this.a.isVisible();
    }

    @Override // defpackage.qk
    public final boolean e() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.qk
    public final boolean f() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.qk
    public final void g(byj byjVar) {
        this.e = byjVar;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        byj byjVar = this.e;
        if (byjVar != null) {
            ((dw) byjVar.a).j.C();
        }
    }
}
