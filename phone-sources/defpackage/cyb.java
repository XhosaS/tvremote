package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class cyb extends cya {
    static final cyh d = cyh.o(WindowInsets.CONSUMED);

    public cyb(cyh cyhVar, WindowInsets windowInsets) {
        super(cyhVar, windowInsets);
    }

    @Override // defpackage.cxx, defpackage.cye
    public csr a(int i) {
        return csr.f(this.a.getInsets(cyf.a(i)));
    }

    @Override // defpackage.cxx, defpackage.cye
    public csr c(int i) {
        return csr.f(this.a.getInsetsIgnoringVisibility(cyf.a(i)));
    }

    @Override // defpackage.cxx, defpackage.cye
    public boolean n(int i) {
        return this.a.isVisible(cyf.a(i));
    }

    public cyb(cyh cyhVar, cyb cybVar) {
        super(cyhVar, cybVar);
    }

    @Override // defpackage.cxx, defpackage.cye
    public final void f(View view) {
    }
}
