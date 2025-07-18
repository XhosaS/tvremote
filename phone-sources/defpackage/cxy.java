package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class cxy extends cxx {
    private csr d;

    public cxy(cyh cyhVar, WindowInsets windowInsets) {
        super(cyhVar, windowInsets);
        this.d = null;
    }

    @Override // defpackage.cye
    public final csr p() {
        if (this.d == null) {
            WindowInsets windowInsets = this.a;
            this.d = csr.e(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.cye
    public cyh q() {
        return cyh.o(this.a.consumeStableInsets());
    }

    @Override // defpackage.cye
    public cyh r() {
        return cyh.o(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.cye
    public void s(csr csrVar) {
        this.d = csrVar;
    }

    @Override // defpackage.cye
    public boolean t() {
        return this.a.isConsumed();
    }

    public cxy(cyh cyhVar, cxy cxyVar) {
        super(cyhVar, cxyVar);
        this.d = null;
        this.d = cxyVar.d;
    }
}
