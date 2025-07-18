package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uag extends wio implements aeja {
    private ContextWrapper c;
    private boolean d;
    private volatile aeik e;
    private final Object f = new Object();
    private boolean ah = false;

    private final void aC() {
        if (this.c == null) {
            this.c = new aeiu(super.s(), this);
            this.d = aehm.a(super.s());
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public void W(Activity activity) {
        super.W(activity);
        ContextWrapper contextWrapper = this.c;
        boolean z = true;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aC();
        aB();
    }

    protected final void aB() {
        if (this.ah) {
            return;
        }
        this.ah = true;
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

    @Override // defpackage.wio, defpackage.bq
    public void ex(Context context) {
        super.ex(context);
        aC();
        aB();
    }

    @Override // defpackage.aeja
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.e == null) {
            synchronized (this.f) {
                if (this.e == null) {
                    this.e = m();
                }
            }
        }
        return this.e;
    }

    protected aeik m() {
        throw null;
    }

    @Override // defpackage.bq
    public Context s() {
        if (super.s() == null && !this.d) {
            return null;
        }
        aC();
        return this.c;
    }
}
