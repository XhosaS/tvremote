package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
class hhy extends hhw {
    private boolean aA = false;
    private ContextWrapper ay;
    private boolean az;

    private final void aI() {
        if (this.ay == null) {
            this.ay = new aeiu(super.s(), this);
            this.az = aehm.a(super.s());
        }
    }

    @Override // defpackage.hhx, defpackage.bq
    public final void W(Activity activity) {
        super.W(activity);
        ContextWrapper contextWrapper = this.ay;
        boolean z = true;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aI();
        aH();
    }

    @Override // defpackage.hhx
    protected final void aH() {
        if (this.aA) {
            return;
        }
        this.aA = true;
        hia hiaVar = (hia) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        hiaVar.ai = eupVar.ck;
        hiaVar.aj = eupVar.bj();
        hiaVar.ak = ethVar.c();
        hiaVar.al = eupVar.cB();
        hiaVar.am = (gtu) eupVar.bE.a();
        hiaVar.an = eupVar.cp;
        hiaVar.ao = (gfr) eupVar.cu.a();
        hiaVar.ap = eupVar.bc();
        hiaVar.aq = (gmd) eupVar.eV.a();
        hiaVar.ar = eupVar.fM;
        hiaVar.as = (fex) eupVar.cr.a();
        hiaVar.at = (gmu) eupVar.gd.a();
        hiaVar.au = (hkz) eupVar.bx.a();
        hiaVar.av = (pfq) eupVar.ph.a();
        hiaVar.aw = (ghr) eupVar.fg.a();
        hiaVar.ax = (tkw) eupVar.of.a();
        hiaVar.aF = eupVar.bS();
    }

    @Override // defpackage.hhx, defpackage.bq
    public final LayoutInflater ev(Bundle bundle) {
        LayoutInflater layoutInflaterEv = super.ev(bundle);
        return layoutInflaterEv.cloneInContext(new aeiu(layoutInflaterEv, this));
    }

    @Override // defpackage.hhx, defpackage.bq
    public final void ex(Context context) {
        super.ex(context);
        aI();
        aH();
    }

    @Override // defpackage.hhx, defpackage.bq
    public final Context s() {
        if (super.s() == null && !this.az) {
            return null;
        }
        aI();
        return this.ay;
    }
}
