package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class aix extends aiw {
    static final ajc e = ajc.g(WindowInsets.CONSUMED, null);

    public aix(ajc ajcVar, WindowInsets windowInsets) {
        super(ajcVar, windowInsets);
    }

    @Override // defpackage.aiv, defpackage.air, defpackage.aiy
    public acs a(int i) {
        return acs.e(this.a.getInsets(ajb.a(i)));
    }

    @Override // defpackage.aiv, defpackage.air, defpackage.aiy
    public acs c(int i) {
        return acs.e(this.a.getInsetsIgnoringVisibility(ajb.a(i)));
    }
}
