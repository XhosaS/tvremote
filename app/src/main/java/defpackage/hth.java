package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
class hth extends htu {
    private ContextWrapper a;
    private boolean b;
    private boolean c = false;

    private final void aE() {
        if (this.a == null) {
            this.a = new aeiu(super.s(), this);
            this.b = aehm.a(super.s());
        }
    }

    @Override // defpackage.hti, defpackage.bq
    public final void W(Activity activity) {
        super.W(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aE();
        l();
    }

    @Override // defpackage.hti, defpackage.bq
    public final LayoutInflater ev(Bundle bundle) {
        LayoutInflater layoutInflaterEv = super.ev(bundle);
        return layoutInflaterEv.cloneInContext(new aeiu(layoutInflaterEv, this));
    }

    @Override // defpackage.hti, defpackage.bq
    public final void ex(Context context) {
        super.ex(context);
        aE();
        l();
    }

    @Override // defpackage.hti
    protected final void l() {
        if (this.c) {
            return;
        }
        this.c = true;
        htq htqVar = (htq) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        htqVar.ar = eupVar.ck;
        htqVar.as = eupVar.cp;
        htqVar.at = (gfr) eupVar.cu.a();
        htqVar.au = eupVar.bc();
        htqVar.av = (gmd) eupVar.eV.a();
        htqVar.aw = eupVar.fM;
        htqVar.ax = (fex) eupVar.cr.a();
        htqVar.ay = (gmu) eupVar.gd.a();
        htqVar.az = (ghr) eupVar.fg.a();
        htqVar.am = fgu.a.a(ethVar.c.e);
        htqVar.an = (hkz) eupVar.bx.a();
    }

    @Override // defpackage.hti, defpackage.bq
    public final Context s() {
        if (super.s() == null && !this.b) {
            return null;
        }
        aE();
        return this.a;
    }
}
