package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class ais extends air {
    private acs d;

    public ais(ajc ajcVar, WindowInsets windowInsets) {
        super(ajcVar, windowInsets);
        this.d = null;
    }

    @Override // defpackage.aiy
    public final acs m() {
        if (this.d == null) {
            WindowInsets windowInsets = this.a;
            this.d = acs.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.aiy
    public ajc n() {
        return ajc.g(this.a.consumeStableInsets(), null);
    }

    @Override // defpackage.aiy
    public ajc o() {
        return ajc.g(this.a.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.aiy
    public void p(acs acsVar) {
        this.d = acsVar;
    }

    @Override // defpackage.aiy
    public boolean q() {
        return this.a.isConsumed();
    }
}
