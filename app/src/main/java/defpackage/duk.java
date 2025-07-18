package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.litho.ComponentHost;

/* compiled from: PG */
/* loaded from: classes.dex */
class duk extends drq {
    public SparseArray a;
    public boolean b = false;

    protected duk() {
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        return new ComponentHost(context);
    }

    @Override // defpackage.drq
    protected final void H(dru druVar, Object obj, duv duvVar) {
        ((ComponentHost) obj).d();
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        ComponentHost componentHost = (ComponentHost) obj;
        componentHost.setAlpha(1.0f);
        componentHost.i = this.b;
    }

    @Override // defpackage.drq
    public final boolean S() {
        SparseArray sparseArray = this.a;
        return sparseArray != null && sparseArray.size() > 0;
    }

    @Override // defpackage.drq, defpackage.elz
    public final boolean ae() {
        boolean z = ebc.a;
        return true;
    }

    @Override // defpackage.drq
    protected final boolean ag(drq drqVar, dxx dxxVar, drq drqVar2, dxx dxxVar2) {
        return true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.isPressed()) {
            componentHost.setPressed(false);
        }
        componentHost.i = false;
    }

    @Override // defpackage.drq
    public final String d() {
        return "HostComponent";
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        return this == drqVar;
    }

    @Override // defpackage.drq
    protected final int h() {
        return 45;
    }

    @Override // defpackage.drq
    public final SparseArray i() {
        return this.a;
    }

    @Override // defpackage.drq
    protected final dwg s() {
        return new dul(ebc.k);
    }
}
