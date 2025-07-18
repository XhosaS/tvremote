package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
class hhx extends bq implements aeja {
    private ContextWrapper a;
    private boolean b;
    private volatile aeik c;
    private final Object d = new Object();
    private boolean e = false;

    private void l() {
        if (this.a == null) {
            this.a = new aeiu(super.s(), this);
            this.b = aehm.a(super.s());
        }
    }

    @Override // defpackage.bq
    public void W(Activity activity) {
        boolean z = true;
        this.P = true;
        ContextWrapper contextWrapper = this.a;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l();
        aH();
    }

    @Override // defpackage.aeja
    /* renamed from: aG, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aeik(this);
                }
            }
        }
        return this.c;
    }

    protected void aH() {
        if (this.e) {
            return;
        }
        this.e = true;
        hhw hhwVar = (hhw) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        hhwVar.ai = eupVar.ck;
        hhwVar.aj = eupVar.bj();
        hhwVar.ak = ethVar.c();
        hhwVar.al = eupVar.cB();
        hhwVar.am = (gtu) eupVar.bE.a();
        hhwVar.an = eupVar.cp;
        hhwVar.ao = (gfr) eupVar.cu.a();
        hhwVar.ap = eupVar.bc();
        hhwVar.aq = (gmd) eupVar.eV.a();
        hhwVar.ar = eupVar.fM;
        hhwVar.as = (fex) eupVar.cr.a();
        hhwVar.at = (gmu) eupVar.gd.a();
        hhwVar.au = (hkz) eupVar.bx.a();
        hhwVar.av = (pfq) eupVar.ph.a();
        hhwVar.aw = (ghr) eupVar.fg.a();
        hhwVar.ax = (tkw) eupVar.of.a();
    }

    @Override // defpackage.bq, defpackage.bbz
    public final beg dM() {
        return aehs.b(this, super.dM());
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // defpackage.bq
    public LayoutInflater ev(Bundle bundle) {
        LayoutInflater layoutInflaterAr = ar();
        return layoutInflaterAr.cloneInContext(new aeiu(layoutInflaterAr, this));
    }

    @Override // defpackage.bq
    public void ex(Context context) {
        super.ex(context);
        l();
        aH();
    }

    @Override // defpackage.bq
    public Context s() {
        if (super.s() == null && !this.b) {
            return null;
        }
        l();
        return this.a;
    }
}
