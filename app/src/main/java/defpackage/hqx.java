package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class hqx extends hrw {
    private ContextWrapper ar;
    private boolean as;
    private boolean at = false;

    private final void aW() {
        if (this.ar == null) {
            this.ar = new aeiu(super.s(), this);
            this.as = aehm.a(super.s());
        }
    }

    @Override // defpackage.hra, defpackage.bq
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

    @Override // defpackage.hra
    protected final void aK() {
        if (this.at) {
            return;
        }
        this.at = true;
        hqq hqqVar = (hqq) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        hqqVar.aN = eupVar.u();
        hqqVar.aO = eupVar.ck;
        hqqVar.aP = ethVar.g;
        hqqVar.aQ = eupVar.bj();
        etb etbVar = ethVar.c;
        hqqVar.aR = fgu.a.a(etbVar.e);
        Activity activity = etbVar.a;
        aeiv.a(activity);
        hqqVar.aS = fgv.b(activity);
        hqqVar.aT = (wke) ethVar.e.a();
        hqqVar.aU = eupVar.C();
        hqqVar.aV = ethVar.a();
        hqqVar.aW = (gtu) eupVar.bE.a();
        hqqVar.aX = eupVar.cp;
        hqqVar.aY = (gfr) eupVar.cu.a();
        hqqVar.aZ = eupVar.bc();
        hqqVar.ba = (gmd) eupVar.eV.a();
        hqqVar.bb = eupVar.fM;
        hqqVar.bc = (fex) eupVar.cr.a();
        hqqVar.bd = ethVar.b();
        hqqVar.be = (gmu) eupVar.gd.a();
        hqqVar.bf = (hkz) eupVar.bx.a();
        hqqVar.bg = ethVar.h;
        hqqVar.bh = ethVar.f;
        hqqVar.bi = (ztw) eupVar.ao.a();
        hqqVar.bj = (ghr) eupVar.fg.a();
        hqqVar.bk = (Executor) eupVar.aR.a();
        hqqVar.bl = (gnj) eupVar.fo.a();
        hqqVar.bm = (tkw) eupVar.of.a();
    }

    @Override // defpackage.hra, defpackage.bq
    public final LayoutInflater ev(Bundle bundle) {
        LayoutInflater layoutInflaterEv = super.ev(bundle);
        return layoutInflaterEv.cloneInContext(new aeiu(layoutInflaterEv, this));
    }

    @Override // defpackage.hra, defpackage.bq
    public final void ex(Context context) {
        super.ex(context);
        aW();
        aK();
    }

    @Override // defpackage.hra, defpackage.bq
    public final Context s() {
        if (super.s() == null && !this.as) {
            return null;
        }
        aW();
        return this.ar;
    }
}
