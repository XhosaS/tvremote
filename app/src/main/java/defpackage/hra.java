package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hra extends atx implements aeja {
    private ContextWrapper sp;
    private boolean sq;
    private volatile aeik sr;
    private final Object ss = new Object();

    private void aL() {
        if (this.sp == null) {
            this.sp = new aeiu(super.s(), this);
            this.sq = aehm.a(super.s());
        }
    }

    @Override // defpackage.bq
    public void W(Activity activity) {
        boolean z = true;
        this.P = true;
        ContextWrapper contextWrapper = this.sp;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aL();
        aK();
    }

    protected void aK() {
        throw null;
    }

    @Override // defpackage.aeja
    /* renamed from: bc, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.sr == null) {
            synchronized (this.ss) {
                if (this.sr == null) {
                    this.sr = new aeik(this);
                }
            }
        }
        return this.sr;
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
        aL();
        aK();
    }

    @Override // defpackage.bq
    public Context s() {
        if (super.s() == null && !this.sq) {
            return null;
        }
        aL();
        return this.sp;
    }
}
