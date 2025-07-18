package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class hqc extends hrc {
    private ContextWrapper ar;
    private boolean as;
    private boolean at = false;

    private final void aW() {
        if (this.ar == null) {
            this.ar = new aeiu(super.s(), this);
            this.as = aehm.a(super.s());
        }
    }

    @Override // defpackage.hqz, defpackage.hra, defpackage.bq
    public final void W(Activity activity) {
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

    @Override // defpackage.hqz, defpackage.hra
    public final void aK() {
        if (this.at) {
            return;
        }
        this.at = true;
        hqn hqnVar = (hqn) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        hqnVar.aN = eupVar.u();
        hqnVar.aO = eupVar.ck;
        hqnVar.aP = ethVar.g;
        hqnVar.aQ = eupVar.bj();
        etb etbVar = ethVar.c;
        hqnVar.aR = fgu.a.a(etbVar.e);
        Activity activity = etbVar.a;
        aeiv.a(activity);
        hqnVar.aS = fgv.b(activity);
        hqnVar.aT = (wke) ethVar.e.a();
        hqnVar.aU = eupVar.C();
        hqnVar.aV = ethVar.a();
        hqnVar.aW = (gtu) eupVar.bE.a();
        hqnVar.aX = eupVar.cp;
        hqnVar.aY = (gfr) eupVar.cu.a();
        hqnVar.aZ = eupVar.bc();
        hqnVar.ba = (gmd) eupVar.eV.a();
        hqnVar.bb = eupVar.fM;
        hqnVar.bc = (fex) eupVar.cr.a();
        hqnVar.bd = ethVar.b();
        hqnVar.be = (gmu) eupVar.gd.a();
        hqnVar.bf = (hkz) eupVar.bx.a();
        hqnVar.bg = ethVar.h;
        hqnVar.bh = ethVar.f;
        hqnVar.bi = (ztw) eupVar.ao.a();
        hqnVar.bj = (ghr) eupVar.fg.a();
        hqnVar.bk = (Executor) eupVar.aR.a();
        hqnVar.bl = (gnj) eupVar.fo.a();
        hqnVar.bm = (tkw) eupVar.of.a();
        hqnVar.as = eupVar.u();
        hqnVar.at = (Display) eupVar.co.a();
        hqnVar.au = eupVar.pn;
        hqnVar.av = ethVar.i;
        hqnVar.aw = ethVar.j;
    }

    @Override // defpackage.hqz, defpackage.hra, defpackage.bq
    public final LayoutInflater ev(Bundle bundle) {
        LayoutInflater layoutInflaterEv = super.ev(bundle);
        return layoutInflaterEv.cloneInContext(new aeiu(layoutInflaterEv, this));
    }

    @Override // defpackage.hrc, defpackage.hqz, defpackage.hra, defpackage.bq
    public void ex(Context context) {
        super.ex(context);
        aW();
        aK();
    }

    @Override // defpackage.hqz, defpackage.hra, defpackage.bq
    public final Context s() {
        if (super.s() == null && !this.as) {
            return null;
        }
        aW();
        return this.ar;
    }
}
