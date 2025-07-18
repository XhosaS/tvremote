package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class aiu extends ait {
    private acs d;
    private acs e;
    private acs h;

    public aiu(ajc ajcVar, WindowInsets windowInsets) {
        super(ajcVar, windowInsets);
        this.d = null;
        this.e = null;
        this.h = null;
    }

    @Override // defpackage.air, defpackage.aiy
    public ajc e(int i, int i2, int i3, int i4) {
        return ajc.g(this.a.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.aiy
    public acs t() {
        if (this.e == null) {
            this.e = acs.e(this.a.getMandatorySystemGestureInsets());
        }
        return this.e;
    }

    @Override // defpackage.aiy
    public acs u() {
        if (this.d == null) {
            this.d = acs.e(this.a.getSystemGestureInsets());
        }
        return this.d;
    }

    @Override // defpackage.aiy
    public acs v() {
        if (this.h == null) {
            this.h = acs.e(this.a.getTappableElementInsets());
        }
        return this.h;
    }

    @Override // defpackage.ais, defpackage.aiy
    public void p(acs acsVar) {
    }
}
