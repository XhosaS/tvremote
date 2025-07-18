package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
class iks extends bq implements aeja {
    private ContextWrapper a;
    private boolean b;
    private volatile aeik c;
    private final Object d = new Object();
    private boolean e = false;

    private final void aB() {
        if (this.a == null) {
            this.a = new aeiu(super.s(), this);
            this.b = aehm.a(super.s());
        }
    }

    @Override // defpackage.bq
    public final void W(Activity activity) {
        boolean z = true;
        this.P = true;
        ContextWrapper contextWrapper = this.a;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aB();
        m();
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

    @Override // defpackage.bq
    public void ex(Context context) {
        super.ex(context);
        aB();
        m();
    }

    @Override // defpackage.aeja
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
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

    protected final void m() {
        if (this.e) {
            return;
        }
        this.e = true;
        ikt iktVar = (ikt) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        iktVar.a = eupVar.bj();
        iktVar.b = (ipg) eupVar.oF.a();
        iktVar.c = (irh) ethVar.c.g.a();
    }

    @Override // defpackage.bq
    public final Context s() {
        if (super.s() == null && !this.b) {
            return null;
        }
        aB();
        return this.a;
    }
}
