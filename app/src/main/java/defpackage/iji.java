package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class iji extends hmw implements aeja {
    private ContextWrapper b;
    private boolean c;
    private volatile aeik d;
    private final Object e = new Object();
    private boolean f = false;

    private final void aC() {
        if (this.b == null) {
            this.b = new aeiu(super.s(), this);
            this.c = aehm.a(super.s());
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public void W(Activity activity) {
        super.W(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aC();
        aB();
    }

    protected final void aB() {
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
        aC();
        aB();
    }

    @Override // defpackage.aeja
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = m();
                }
            }
        }
        return this.d;
    }

    protected aeik m() {
        throw null;
    }

    @Override // defpackage.bq
    public Context s() {
        if (super.s() == null && !this.c) {
            return null;
        }
        aC();
        return this.b;
    }
}
