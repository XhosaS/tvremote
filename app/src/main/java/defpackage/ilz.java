package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
class ilz extends ikr implements aeja {
    private final Object ah = new Object();
    private boolean ai = false;
    public ContextWrapper d;
    private boolean e;
    private volatile aeik f;

    protected aeik aU() {
        throw null;
    }

    @Override // defpackage.aeja
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.f == null) {
            synchronized (this.ah) {
                if (this.f == null) {
                    this.f = aU();
                }
            }
        }
        return this.f;
    }

    public final void aW() {
        if (this.d == null) {
            this.d = new aeiu(super.s(), this);
            this.e = aehm.a(super.s());
        }
    }

    protected final void aX() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        iln ilnVar = (iln) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        ((ikr) ilnVar).ak = eupVar.u();
        ilnVar.al = eupVar.bj();
        ilnVar.am = (ipg) eupVar.oF.a();
        ilnVar.an = (irh) ethVar.c.g.a();
    }

    @Override // defpackage.bq, defpackage.bbz
    public final beg dM() {
        return aehs.b(this, super.dM());
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // defpackage.ikr, defpackage.bq
    public void ex(Context context) {
        super.ex(context);
        aW();
        aX();
    }

    @Override // defpackage.bq
    public Context s() {
        if (super.s() == null && !this.e) {
            return null;
        }
        aW();
        return this.d;
    }
}
