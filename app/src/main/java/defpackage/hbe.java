package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
class hbe extends hao implements aeja {
    public ContextWrapper b;
    private boolean c;
    private volatile aeik d;
    private final Object e = new Object();
    private boolean f = false;

    protected aeik aC() {
        throw null;
    }

    @Override // defpackage.aeja
    /* renamed from: aD, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = aC();
                }
            }
        }
        return this.d;
    }

    public final void aE() {
        if (this.b == null) {
            this.b = new aeiu(super.s(), this);
            this.c = aehm.a(super.s());
        }
    }

    protected final void aF() {
        if (this.f) {
            return;
        }
        this.f = true;
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
        aE();
        aF();
    }

    @Override // defpackage.bq
    public Context s() {
        if (super.s() == null && !this.c) {
            return null;
        }
        aE();
        return this.b;
    }
}
