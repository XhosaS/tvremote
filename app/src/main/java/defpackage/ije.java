package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ije extends iic implements aeja {
    private ContextWrapper ai;
    private boolean ao;
    private volatile aeik ap;
    private final Object aq = new Object();
    private boolean ar = false;

    private final void aW() {
        if (this.ai == null) {
            this.ai = new aeiu(super.s(), this);
            this.ao = aehm.a(super.s());
        }
    }

    @Override // defpackage.bq
    public final void W(Activity activity) {
        boolean z = true;
        this.P = true;
        ContextWrapper contextWrapper = this.ai;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aW();
        aV();
    }

    @Override // defpackage.aeja
    /* renamed from: aU, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.ap == null) {
            synchronized (this.aq) {
                if (this.ap == null) {
                    this.ap = new aeik(this);
                }
            }
        }
        return this.ap;
    }

    protected final void aV() {
        if (this.ar) {
            return;
        }
        this.ar = true;
        iip iipVar = (iip) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        ((ikr) iipVar).ak = eupVar.u();
        iipVar.al = eupVar.bj();
        iipVar.am = (ipg) eupVar.oF.a();
        iipVar.an = (irh) ethVar.c.g.a();
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
    public final LayoutInflater ev(Bundle bundle) {
        LayoutInflater layoutInflaterAr = ar();
        return layoutInflaterAr.cloneInContext(new aeiu(layoutInflaterAr, this));
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void ex(Context context) {
        super.ex(context);
        aW();
        aV();
    }

    @Override // defpackage.bq
    public final Context s() {
        if (super.s() == null && !this.ao) {
            return null;
        }
        aW();
        return this.ai;
    }
}
