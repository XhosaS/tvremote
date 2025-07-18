package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.preference.LeanbackSettingsRootView;
import com.google.android.apps.tvsearch.preferences.fragment.google.GooglePreferenceFragment;
import com.google.android.katniss.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbb extends hbe implements wgt, aeiz, wjd, wwo {
    private boolean ah;
    private hbc c;
    private Context d;
    private final bco e = new bco(this);
    private final wua f = new wua(this);

    @Deprecated
    public hbb() {
        uea.c();
    }

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f.g();
        try {
            View viewInflate = layoutInflater.inflate(R.layout.leanback_settings_fragment, viewGroup, false);
            wum.n();
            return viewInflate;
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void U(Bundle bundle) {
        this.f.g();
        try {
            this.P = true;
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void V(int i, int i2, Intent intent) {
        wwt wwtVarA = this.f.a("Fragment:onActivityResult");
        try {
            super.V(i, i2, intent);
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void W(Activity activity) {
        this.f.g();
        boolean z = true;
        try {
            this.P = true;
            ContextWrapper contextWrapper = this.b;
            if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
                z = false;
            }
            aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            super.aE();
            aF();
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void X() {
        wwt wwtVarC = this.f.c();
        try {
            this.P = true;
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void Y() {
        this.f.g();
        try {
            this.P = true;
            LeanbackSettingsRootView leanbackSettingsRootView = (LeanbackSettingsRootView) this.R;
            if (leanbackSettingsRootView != null) {
                leanbackSettingsRootView.a = null;
            }
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void Z() {
        wwt wwtVarC = this.f.c();
        try {
            this.P = true;
            LeanbackSettingsRootView leanbackSettingsRootView = (LeanbackSettingsRootView) this.R;
            if (leanbackSettingsRootView != null) {
                leanbackSettingsRootView.a = ((aul) this).a;
            }
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wgt
    /* renamed from: aB, reason: merged with bridge method [inline-methods] */
    public final hbc L() {
        hbc hbcVar = this.c;
        if (hbcVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return hbcVar;
    }

    @Override // defpackage.hbe
    protected final /* synthetic */ aeik aC() {
        return new wjj(this);
    }

    @Override // defpackage.wwo
    public final wyt aK() {
        return this.f.b;
    }

    @Override // defpackage.wjd
    public final Locale aM() {
        return wjc.a(this);
    }

    @Override // defpackage.wwo
    public final void aN(wyt wytVar, boolean z) {
        this.f.d(wytVar, z);
    }

    @Override // defpackage.wwo
    public final void aO(wyt wytVar) {
        this.f.c = wytVar;
    }

    @Override // defpackage.bq
    public final void aa(View view, Bundle bundle) {
        this.f.g();
        if (bundle == null) {
            try {
                L();
                GooglePreferenceFragment googlePreferenceFragment = new GooglePreferenceFragment();
                aeik.d(googlePreferenceFragment);
                l(googlePreferenceFragment);
            } catch (Throwable th) {
                try {
                    wum.n();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        wum.n();
    }

    @Override // defpackage.bq
    public final void af(Object obj) {
        wua wuaVar = this.f;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().i = obj;
    }

    @Override // defpackage.bq
    public final void ag(Object obj) {
        wua wuaVar = this.f;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().k = obj;
    }

    @Override // defpackage.bq
    public final void aj(Object obj) {
        wua wuaVar = this.f;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().l = obj;
    }

    @Override // defpackage.bq
    public final void ak(Object obj) {
        wua wuaVar = this.f;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().j = obj;
    }

    @Override // defpackage.bq
    public final void av(int i, int i2) {
        this.f.e(i, i2);
        wum.n();
    }

    @Override // defpackage.bq
    public final boolean ay() {
        this.f.a("Fragment:onOptionsItemSelected").close();
        return false;
    }

    @Override // defpackage.bq
    public final void e() {
        wwt wwtVarC = this.f.c();
        try {
            this.P = true;
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq, defpackage.bcl
    public final bcg ek() {
        return this.e;
    }

    @Override // defpackage.bq
    public final void er() {
        wwt wwtVarB = this.f.b();
        try {
            this.P = true;
            this.ah = true;
            wwtVarB.close();
        } catch (Throwable th) {
            try {
                wwtVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final LayoutInflater ev(Bundle bundle) {
        this.f.g();
        try {
            LayoutInflater layoutInflaterAr = ar();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAr.cloneInContext(new aeiu(layoutInflaterAr, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new wjg(this, layoutInflaterCloneInContext));
            wum.n();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.hbe, defpackage.bq
    public final void ex(Context context) {
        this.f.g();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.c == null) {
                try {
                    wvx wvxVarD = wzg.d(hbb.class, "CreateComponent");
                    try {
                        cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(hbb.class, "CreatePeer");
                        try {
                            this.c = new hbc();
                            wvxVarD2.close();
                            this.aa.b(new wir(this.f, this.e));
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            wvxVarD.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            bqs bqsVar = this.F;
            if (bqsVar instanceof wwo) {
                wua wuaVar = this.f;
                if (wuaVar.b == null) {
                    wuaVar.d(((wwo) bqsVar).aK(), true);
                }
            }
            wum.n();
        } catch (Throwable th3) {
            try {
                wum.n();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.bq
    public final void ey(Bundle bundle) {
        this.f.g();
        try {
            super.ey(bundle);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void g(Bundle bundle) {
        this.f.g();
        wum.n();
    }

    @Override // defpackage.bq
    public final void h() {
        this.f.g();
        try {
            this.P = true;
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void i() {
        this.f.g();
        try {
            this.P = true;
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.hbe, defpackage.bq
    public final Context s() {
        if (super.s() == null) {
            return null;
        }
        if (this.d == null) {
            this.d = new wjg(this, super.s());
        }
        return this.d;
    }
}
