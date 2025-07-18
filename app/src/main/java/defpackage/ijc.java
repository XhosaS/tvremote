package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
class ijc extends ikr implements aeja {
    private final Object ah = new Object();
    private boolean ai = false;
    private ContextWrapper d;
    private boolean e;
    private volatile aeik f;

    private final void aV() {
        if (this.d == null) {
            this.d = new aeiu(super.s(), this);
            this.e = aehm.a(super.s());
        }
    }

    @Override // defpackage.bq
    public final void W(Activity activity) {
        boolean z = true;
        this.P = true;
        ContextWrapper contextWrapper = this.d;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aV();
        aU();
    }

    @Override // defpackage.aeja
    /* renamed from: aS, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.f == null) {
            synchronized (this.ah) {
                if (this.f == null) {
                    this.f = new aeik(this);
                }
            }
        }
        return this.f;
    }

    protected final void aU() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        iin iinVar = (iin) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        ((ikr) iinVar).ak = eupVar.u();
        iinVar.al = eupVar.bj();
        iinVar.am = (ipg) eupVar.oF.a();
        iinVar.an = (irh) ethVar.c.g.a();
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
        aV();
        aU();
    }

    @Override // defpackage.bq
    public final Context s() {
        if (super.s() == null && !this.e) {
            return null;
        }
        aV();
        return this.d;
    }
}
