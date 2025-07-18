package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyd extends cyc {
    static final cyh e = cyh.o(WindowInsets.CONSUMED);

    public cyd(cyh cyhVar, WindowInsets windowInsets) {
        super(cyhVar, windowInsets);
    }

    @Override // defpackage.cyb, defpackage.cxx, defpackage.cye
    public csr a(int i) {
        return csr.f(this.a.getInsets(cyg.a(i)));
    }

    @Override // defpackage.cyb, defpackage.cxx, defpackage.cye
    public csr c(int i) {
        return csr.f(this.a.getInsetsIgnoringVisibility(cyg.a(i)));
    }

    @Override // defpackage.cyb, defpackage.cxx, defpackage.cye
    public boolean n(int i) {
        return this.a.isVisible(cyg.a(i));
    }

    public cyd(cyh cyhVar, cyd cydVar) {
        super(cyhVar, cydVar);
    }
}
