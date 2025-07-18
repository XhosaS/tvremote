package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class rw extends rv {
    private nt d;

    public rw(sf sfVar, WindowInsets windowInsets) {
        super(sfVar, windowInsets);
        this.d = null;
    }

    @Override // defpackage.sc
    public final nt m() {
        if (this.d == null) {
            WindowInsets windowInsets = this.a;
            this.d = nt.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.sc
    public sf n() {
        return sf.n(this.a.consumeStableInsets());
    }

    @Override // defpackage.sc
    public sf o() {
        return sf.n(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.sc
    public void p(nt ntVar) {
        this.d = ntVar;
    }

    @Override // defpackage.sc
    public boolean q() {
        return this.a.isConsumed();
    }
}
