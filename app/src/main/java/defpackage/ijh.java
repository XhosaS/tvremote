package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
class ijh extends ikr implements aeja {
    private final Object ah = new Object();
    private boolean ai = false;
    public ContextWrapper d;
    private boolean e;
    private volatile aeik f;

    @Override // defpackage.aeja
    /* renamed from: aS, reason: merged with bridge method [inline-methods] */
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

    protected aeik aU() {
        throw null;
    }

    public final void aV() {
        if (this.d == null) {
            this.d = new aeiu(super.s(), this);
            this.e = aehm.a(super.s());
        }
    }

    protected final void aW() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        ijn ijnVar = (ijn) this;
        eth ethVar = (eth) cO().dN();
        eup eupVar = ethVar.b;
        ((ikr) ijnVar).ak = eupVar.u();
        ijnVar.al = eupVar.bj();
        ijnVar.am = (ipg) eupVar.oF.a();
        ijnVar.an = (irh) ethVar.c.g.a();
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
        aV();
        aW();
    }

    @Override // defpackage.bq
    public Context s() {
        if (super.s() == null && !this.e) {
            return null;
        }
        aV();
        return this.d;
    }
}
