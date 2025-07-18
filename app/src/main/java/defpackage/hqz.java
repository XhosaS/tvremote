package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class hqz extends hrw {
    private ContextWrapper ar;
    private boolean as;
    private boolean at = false;

    private void aW() {
        if (this.ar == null) {
            this.ar = new aeiu(super.s(), this);
            this.as = aehm.a(super.s());
        }
    }

    @Override // defpackage.hra, defpackage.bq
    public void W(Activity activity) {
        super.W(activity);
        ContextWrapper contextWrapper = this.ar;
        boolean z = true;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aW();
        aK();
    }

    @Override // defpackage.hra
    public void aK() {
        if (this.at) {
            return;
        }
        this.at = true;
        hrc hrcVar = (hrc) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        hrcVar.aN = eupVar.u();
        hrcVar.aO = eupVar.ck;
        hrcVar.aP = ethVar.g;
        hrcVar.aQ = eupVar.bj();
        etb etbVar = ethVar.c;
        hrcVar.aR = fgu.a.a(etbVar.e);
        Activity activity = etbVar.a;
        aeiv.a(activity);
        hrcVar.aS = fgv.b(activity);
        hrcVar.aT = (wke) ethVar.e.a();
        hrcVar.aU = eupVar.C();
        hrcVar.aV = ethVar.a();
        hrcVar.aW = (gtu) eupVar.bE.a();
        hrcVar.aX = eupVar.cp;
        hrcVar.aY = (gfr) eupVar.cu.a();
        hrcVar.aZ = eupVar.bc();
        hrcVar.ba = (gmd) eupVar.eV.a();
        hrcVar.bb = eupVar.fM;
        hrcVar.bc = (fex) eupVar.cr.a();
        hrcVar.bd = ethVar.b();
        hrcVar.be = (gmu) eupVar.gd.a();
        hrcVar.bf = (hkz) eupVar.bx.a();
        hrcVar.bg = ethVar.h;
        hrcVar.bh = ethVar.f;
        hrcVar.bi = (ztw) eupVar.ao.a();
        hrcVar.bj = (ghr) eupVar.fg.a();
        hrcVar.bk = (Executor) eupVar.aR.a();
        hrcVar.bl = (gnj) eupVar.fo.a();
        hrcVar.bm = (tkw) eupVar.of.a();
    }

    @Override // defpackage.hra, defpackage.bq
    public LayoutInflater ev(Bundle bundle) {
        LayoutInflater layoutInflaterEv = super.ev(bundle);
        return layoutInflaterEv.cloneInContext(new aeiu(layoutInflaterEv, this));
    }

    @Override // defpackage.hra, defpackage.bq
    public void ex(Context context) {
        super.ex(context);
        aW();
        aK();
    }

    @Override // defpackage.hra, defpackage.bq
    public Context s() {
        if (super.s() == null && !this.as) {
            return null;
        }
        aW();
        return this.ar;
    }
}
