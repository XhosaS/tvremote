package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class jn extends afo implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int b = 0;
    public final ActionProvider a;
    private jl c;

    public jn(ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // defpackage.afo
    public final View a(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.afo
    public final void b(SubMenu subMenu) {
        this.a.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.afo
    public final boolean c() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.afo
    public final boolean d() {
        return this.a.isVisible();
    }

    @Override // defpackage.afo
    public final boolean e() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.afo
    public final boolean f() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.afo
    public final void g(jl jlVar) {
        this.c = jlVar;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        jl jlVar = this.c;
        if (jlVar != null) {
            jlVar.a.j.z();
        }
    }
}
