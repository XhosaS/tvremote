package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class hqy extends hrw {
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
        hqw hqwVar = (hqw) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        hqwVar.aN = eupVar.u();
        hqwVar.aO = eupVar.ck;
        hqwVar.aP = ethVar.g;
        hqwVar.aQ = eupVar.bj();
        etb etbVar = ethVar.c;
        hqwVar.aR = fgu.a.a(etbVar.e);
        Activity activity = etbVar.a;
        aeiv.a(activity);
        hqwVar.aS = fgv.b(activity);
        hqwVar.aT = (wke) ethVar.e.a();
        hqwVar.aU = eupVar.C();
        hqwVar.aV = ethVar.a();
        hqwVar.aW = (gtu) eupVar.bE.a();
        hqwVar.aX = eupVar.cp;
        hqwVar.aY = (gfr) eupVar.cu.a();
        hqwVar.aZ = eupVar.bc();
        hqwVar.ba = (gmd) eupVar.eV.a();
        hqwVar.bb = eupVar.fM;
        hqwVar.bc = (fex) eupVar.cr.a();
        hqwVar.bd = ethVar.b();
        hqwVar.be = (gmu) eupVar.gd.a();
        hqwVar.bf = (hkz) eupVar.bx.a();
        hqwVar.bg = ethVar.h;
        hqwVar.bh = ethVar.f;
        hqwVar.bi = (ztw) eupVar.ao.a();
        hqwVar.bj = (ghr) eupVar.fg.a();
        hqwVar.bk = (Executor) eupVar.aR.a();
        hqwVar.bl = (gnj) eupVar.fo.a();
        hqwVar.bm = (tkw) eupVar.of.a();
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
