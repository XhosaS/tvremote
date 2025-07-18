package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class aiv extends aiu {
    static final ajc d = ajc.g(WindowInsets.CONSUMED, null);

    public aiv(ajc ajcVar, WindowInsets windowInsets) {
        super(ajcVar, windowInsets);
    }

    @Override // defpackage.air, defpackage.aiy
    public acs a(int i) {
        return acs.e(this.a.getInsets(aja.a(i)));
    }

    @Override // defpackage.air, defpackage.aiy
    public acs c(int i) {
        return acs.e(this.a.getInsetsIgnoringVisibility(aja.a(i)));
    }

    @Override // defpackage.air, defpackage.aiy
    public final void f(View view) {
    }
}
