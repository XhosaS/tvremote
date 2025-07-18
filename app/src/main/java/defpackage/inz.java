package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inz extends ins implements wgt, aeiz, wjd, wwo {
    private final bco ah = new bco(this);
    private final wua ai = new wua(this);
    private boolean ao;
    private ioc e;
    private Context f;

    @Deprecated
    public inz() {
        uea.c();
    }

    static inz aX() {
        inz inzVar = new inz();
        aeik.d(inzVar);
        return inzVar;
    }

    @Override // defpackage.ats, defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ai.g();
        try {
            View viewD = super.D(layoutInflater, viewGroup, bundle);
            wum.n();
            return viewD;
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
        this.ai.g();
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
        wwt wwtVarA = this.ai.a("Fragment:onActivityResult");
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
        this.ai.g();
        boolean z = true;
        try {
            this.P = true;
            ContextWrapper contextWrapper = ((ins) this).d;
            if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
                z = false;
            }
            aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            super.aV();
            aW();
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
        wwt wwtVarC = this.ai.c();
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
        this.ai.g();
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

    @Override // defpackage.ats, defpackage.bq
    public final void Z() {
        wwt wwtVarC = this.ai.c();
        try {
            super.Z();
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

    @Override // defpackage.ats
    public final int aB() {
        L();
        return R.style.Theme_KatnissSetup_FarfieldMicGuidedStepAmati;
    }

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return new iob(L());
    }

    @Override // defpackage.ats
    public final ayc aF() {
        int i = ayc.j;
        return new ioa(L());
    }

    @Override // defpackage.wwo
    public final wyt aK() {
        return this.ai.b;
    }

    @Override // defpackage.wjd
    public final Locale aM() {
        return wjc.a(this);
    }

    @Override // defpackage.wwo
    public final void aN(wyt wytVar, boolean z) {
        this.ai.d(wytVar, z);
    }

    @Override // defpackage.wwo
    public final void aO(wyt wytVar) {
        this.ai.c = wytVar;
    }

    @Override // defpackage.ats
    public final axd aP() {
        ioc iocVarL = L();
        inz inzVar = iocVarL.a;
        Bundle bundle = inzVar.n;
        iocVarL.c = bundle != null ? bundle.getBoolean("mic_available_key", true) : true;
        Resources resourcesAY = inzVar.aY();
        return new axd((iocVarL.b.d() && iocVarL.c) ? inzVar.dZ().getResources().getString(R.string.assistant_setup_hotword_education_amati) : inzVar.dZ().getResources().getString(R.string.assistant_setup_hotword_education_mic_off_amati), null, null, resourcesAY != null ? resourcesAY.getDrawable(R.drawable.product_logo_assistant_color_24) : null);
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        inz inzVar = L().a;
        inzVar.s();
        axf axfVar = new axf(null);
        axfVar.a = 1L;
        axfVar.b = inzVar.dZ().getResources().getString(R.string.assistant_setup_done_button);
        list.add(axfVar.a());
    }

    @Override // defpackage.ins
    protected final /* synthetic */ aeik aU() {
        return new wjj(this);
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        this.ai.g();
        try {
            super.aa(view, bundle);
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
    public final void af(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().i = obj;
    }

    @Override // defpackage.bq
    public final void ag(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().k = obj;
    }

    @Override // defpackage.bq
    public final void aj(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().l = obj;
    }

    @Override // defpackage.bq
    public final void ak(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().j = obj;
    }

    @Override // defpackage.bq
    public final void al(Object obj) {
        wua wuaVar = this.ai;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().m = obj;
    }

    @Override // defpackage.bq
    public final void av(int i, int i2) {
        this.ai.e(i, i2);
        wum.n();
    }

    @Override // defpackage.bq
    public final boolean ay() {
        this.ai.a("Fragment:onOptionsItemSelected").close();
        return false;
    }

    @Override // defpackage.wgt
    /* renamed from: bd, reason: merged with bridge method [inline-methods] */
    public final ioc L() {
        ioc iocVar = this.e;
        if (iocVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return iocVar;
    }

    @Override // defpackage.ats
    public final void dt(axh axhVar) {
        bw bwVarEe;
        wwt wwtVarA = this.ai.a("Fragment:onGuidedActionClickedBegin");
        try {
            ioc iocVarL = L();
            axhVar.getClass();
            if (axhVar.a == 1 && (bwVarEe = iocVarL.a.ee()) != null) {
                bwVarEe.finish();
            }
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

    @Override // defpackage.ats, defpackage.bq
    public final void e() {
        wwt wwtVarC = this.ai.c();
        try {
            super.e();
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
        return this.ah;
    }

    @Override // defpackage.bq
    public final void er() {
        wwt wwtVarB = this.ai.b();
        try {
            this.P = true;
            this.ao = true;
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
        this.ai.g();
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

    @Override // defpackage.ins, defpackage.ikr, defpackage.bq
    public final void ex(Context context) {
        this.ai.g();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.e == null) {
                try {
                    wvx wvxVarD = wzg.d(inz.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(inz.class, "CreatePeer");
                        try {
                            bq bqVar = ((eth) objDN).a;
                            if (!(bqVar instanceof inz)) {
                                throw new IllegalStateException(a.B(bqVar, ioc.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            inz inzVar = (inz) bqVar;
                            inzVar.getClass();
                            this.e = new ioc(inzVar, (jcy) ((eth) objDN).b.gx.a());
                            wvxVarD2.close();
                            this.aa.b(new wir(this.ai, this.ah));
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
                wua wuaVar = this.ai;
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

    @Override // defpackage.ats, defpackage.bq
    public final void ey(Bundle bundle) {
        this.ai.g();
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

    @Override // defpackage.ats, defpackage.bq
    public final void g(Bundle bundle) {
        this.ai.g();
        try {
            super.g(bundle);
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

    @Override // defpackage.ikr, defpackage.bq
    public final void h() {
        this.ai.g();
        try {
            super.h();
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
        this.ai.g();
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

    @Override // defpackage.ins, defpackage.bq
    public final Context s() {
        if (super.s() == null) {
            return null;
        }
        if (this.f == null) {
            this.f = new wjg(this, super.s());
        }
        return this.f;
    }
}
