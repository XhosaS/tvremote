package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class ry extends rx {
    private nt d;
    private nt e;
    private nt h;

    public ry(sf sfVar, WindowInsets windowInsets) {
        super(sfVar, windowInsets);
        this.d = null;
        this.e = null;
        this.h = null;
    }

    @Override // defpackage.rv, defpackage.sc
    public sf e(int i, int i2, int i3, int i4) {
        return sf.n(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.sc
    public nt t() {
        if (this.e == null) {
            this.e = nt.e(this.a.getMandatorySystemGestureInsets());
        }
        return this.e;
    }

    @Override // defpackage.sc
    public nt u() {
        if (this.d == null) {
            this.d = nt.e(this.a.getSystemGestureInsets());
        }
        return this.d;
    }

    @Override // defpackage.sc
    public nt v() {
        if (this.h == null) {
            this.h = nt.e(this.a.getTappableElementInsets());
        }
        return this.h;
    }

    @Override // defpackage.rw, defpackage.sc
    public void p(nt ntVar) {
    }
}
