package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sb extends sa {
    static final sf e = sf.n(WindowInsets.CONSUMED);

    public sb(sf sfVar, WindowInsets windowInsets) {
        super(sfVar, windowInsets);
    }

    @Override // defpackage.rz, defpackage.rv, defpackage.sc
    public nt a(int i) {
        return nt.e(this.a.getInsets(se.a(i)));
    }

    @Override // defpackage.rz, defpackage.rv, defpackage.sc
    public nt c(int i) {
        return nt.e(this.a.getInsetsIgnoringVisibility(se.a(i)));
    }
}
