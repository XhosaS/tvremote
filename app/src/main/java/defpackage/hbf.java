package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.tvsearch.preferences.fragment.searchable.SearchableAppsPreferenceFragment;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hbf extends aui implements aeja {
    private ContextWrapper aj;
    private boolean ak;
    private volatile aeik al;
    private final Object am = new Object();
    private boolean an = false;

    private final void aL() {
        if (this.aj == null) {
            this.aj = new aeiu(super.s(), this);
            this.ak = aehm.a(super.s());
        }
    }

    @Override // defpackage.bq
    public final void W(Activity activity) {
        boolean z = true;
        this.P = true;
        ContextWrapper contextWrapper = this.aj;
        if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
            z = false;
        }
        aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aL();
        aK();
    }

    @Override // defpackage.aeja
    /* renamed from: aJ, reason: merged with bridge method [inline-methods] */
    public final aeik cO() {
        if (this.al == null) {
            synchronized (this.am) {
                if (this.al == null) {
                    this.al = new aeik(this);
                }
            }
        }
        return this.al;
    }

    protected final void aK() {
        if (this.an) {
            return;
        }
        this.an = true;
        SearchableAppsPreferenceFragment searchableAppsPreferenceFragment = (SearchableAppsPreferenceFragment) this;
        eup eupVar = ((eth) cO().dN()).b;
        searchableAppsPreferenceFragment.aj = eupVar.gJ();
        searchableAppsPreferenceFragment.ak = (ahbt) eupVar.q.a();
        searchableAppsPreferenceFragment.al = (fiu) eupVar.eY.a();
        searchableAppsPreferenceFragment.am = (fsg) eupVar.fd.a();
        searchableAppsPreferenceFragment.an = eupVar.gI();
        searchableAppsPreferenceFragment.ao = (gyy) eupVar.fX.a();
        searchableAppsPreferenceFragment.ap = (gtu) eupVar.bE.a();
        searchableAppsPreferenceFragment.aq = eupVar.ct();
        searchableAppsPreferenceFragment.ar = eupVar.k();
        searchableAppsPreferenceFragment.as = (jbd) eupVar.gp.a();
        searchableAppsPreferenceFragment.at = (jbd) eupVar.fj.a();
        searchableAppsPreferenceFragment.av = (igs) eupVar.gf.a();
        searchableAppsPreferenceFragment.au = eupVar.al();
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
    public final void ex(Context context) {
        super.ex(context);
        aL();
        aK();
    }

    @Override // defpackage.atz, defpackage.bq
    public final Context s() {
        if (super.s() == null && !this.ak) {
            return null;
        }
        aL();
        return this.aj;
    }
}
