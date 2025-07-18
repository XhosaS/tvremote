package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class rz extends ry {
    static final sf d = sf.n(WindowInsets.CONSUMED);

    public rz(sf sfVar, WindowInsets windowInsets) {
        super(sfVar, windowInsets);
    }

    @Override // defpackage.rv, defpackage.sc
    public nt a(int i) {
        return nt.e(this.a.getInsets(sd.a(i)));
    }

    @Override // defpackage.rv, defpackage.sc
    public nt c(int i) {
        return nt.e(this.a.getInsetsIgnoringVisibility(sd.a(i)));
    }

    @Override // defpackage.rv, defpackage.sc
    public final void f(View view) {
    }
}
