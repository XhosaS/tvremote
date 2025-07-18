package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hbd extends aui implements aeja {
    public ContextWrapper aj;
    private boolean ak;
    private volatile aeik al;
    private final Object am = new Object();
    private boolean an = false;

    protected aeik aL() {
        throw null;
    }

    @Override // defpackage.aeja
    /* renamed from: aP, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.al == null) {
            synchronized (this.am) {
                if (this.al == null) {
                    this.al = aL();
                }
            }
        }
        return this.al;
    }

    public final void aQ() {
        if (this.aj == null) {
            this.aj = new aeiu(super.s(), this);
            this.ak = aehm.a(super.s());
        }
    }

    public final void aR() {
        if (this.an) {
            return;
        }
        this.an = true;
        cO().dN();
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
    public void ex(Context context) {
        super.ex(context);
        aQ();
        aR();
    }

    @Override // defpackage.atz, defpackage.bq
    public Context s() {
        if (super.s() == null && !this.ak) {
            return null;
        }
        aQ();
        return this.aj;
    }
}
