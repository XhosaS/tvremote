package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class cya extends cxz {
    private csr d;
    private csr e;
    private csr h;

    public cya(cyh cyhVar, WindowInsets windowInsets) {
        super(cyhVar, windowInsets);
        this.d = null;
        this.e = null;
        this.h = null;
    }

    @Override // defpackage.cxx, defpackage.cye
    public cyh e(int i, int i2, int i3, int i4) {
        return cyh.o(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.cye
    public csr w() {
        if (this.e == null) {
            this.e = csr.f(this.a.getMandatorySystemGestureInsets());
        }
        return this.e;
    }

    @Override // defpackage.cye
    public csr x() {
        if (this.d == null) {
            this.d = csr.f(this.a.getSystemGestureInsets());
        }
        return this.d;
    }

    @Override // defpackage.cye
    public csr y() {
        if (this.h == null) {
            this.h = csr.f(this.a.getTappableElementInsets());
        }
        return this.h;
    }

    public cya(cyh cyhVar, cya cyaVar) {
        super(cyhVar, cyaVar);
        this.d = null;
        this.e = null;
        this.h = null;
    }

    @Override // defpackage.cxy, defpackage.cye
    public void s(csr csrVar) {
    }
}
