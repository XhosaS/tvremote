package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.katniss.R;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iln extends ilz implements wgt, aeiz, wjd, wwo {
    private final bco ah = new bco(this);
    private final wua ai = new wua(this);
    private boolean ao;
    private ilq e;
    private Context f;

    @Deprecated
    public iln() {
        uea.c();
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
            ContextWrapper contextWrapper = ((ilz) this).d;
            if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
                z = false;
            }
            aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            super.aW();
            aX();
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
        if (L().c.g()) {
            return -1;
        }
        return R.style.Theme_KatnissSetup_HomeGraphGuidedStepAmati;
    }

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return new ilp(L());
    }

    @Override // defpackage.ats
    public final ayc aF() {
        int i = ayc.j;
        return new ilo(L());
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
        iln ilnVar = L().b;
        return new axd(ilnVar.dZ().getResources().getString(R.string.homegraph_choose_home_screen_title), ilnVar.dZ().getResources().getString(R.string.homegraph_choose_home_room_description), null, null);
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        ilq ilqVarL = L();
        List list2 = ilqVarL.d;
        ArrayList arrayList = new ArrayList(agqq.i(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                agqq.h();
            }
            ilqVarL.b.s();
            axf axfVar = new axf(null);
            axfVar.b = ((ino) obj).c;
            axfVar.a = i;
            arrayList.add(axfVar.a());
            i = i2;
        }
        agqq.k(list, arrayList);
        if (list2.size() < 5) {
            iln ilnVar = ilqVarL.b;
            ilnVar.s();
            axf axfVar2 = new axf(null);
            axfVar2.b = ilnVar.dZ().getResources().getString(R.string.homegraph_choose_home_add_home_option_name);
            axfVar2.a = -1L;
            list.add(axfVar2.a());
        }
    }

    @Override // defpackage.wgt
    /* renamed from: aS, reason: merged with bridge method [inline-methods] */
    public final ilq L() {
        ilq ilqVar = this.e;
        if (ilqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ilqVar;
    }

    @Override // defpackage.ilz
    protected final /* synthetic */ aeik aU() {
        return new wjj(this);
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        this.ai.g();
        try {
            ilq ilqVarL = L();
            view.getClass();
            irh irhVar = ilqVarL.c;
            if (irhVar.g()) {
                view.setBackground(irhVar.b(ilqVarL.b.dZ()));
            }
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
    public final void ae(Bundle bundle) {
        Bundle bundle2 = this.n;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        yqw.M(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ae(bundle);
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

    @Override // defpackage.ikr, defpackage.bq
    public final void dH(Bundle bundle) {
        View viewFindViewById;
        super.dH(bundle);
        View view = L().b.R;
        if (view == null || (viewFindViewById = view.findViewById(R.id.guidance_title)) == null) {
            return;
        }
        viewFindViewById.sendAccessibilityEvent(8);
    }

    @Override // defpackage.ats
    public final void dt(axh axhVar) {
        ioz iozVar;
        wwt wwtVarA = this.ai.a("Fragment:onGuidedActionClickedBegin");
        try {
            ilq ilqVarL = L();
            axhVar.getClass();
            Object objEp = ilqVarL.b.ep();
            if (!(objEp instanceof ioz)) {
                if (objEp instanceof wgt) {
                    Object objL = ((wgt) objEp).L();
                    iozVar = objL instanceof ioz ? (ioz) objL : null;
                    if (iozVar == null) {
                    }
                }
                wwtVarA.close();
            }
            iozVar = (ioz) objEp;
            int i = (int) axhVar.a;
            if (i == -1) {
                iozVar.o(3, Bundle.EMPTY);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("home_id", ((ino) ilqVarL.d.get(i)).b);
                iozVar.o(7, bundle);
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

    @Override // defpackage.bq, defpackage.bbz
    public final bet em() {
        beu beuVar = new beu(super.em());
        beuVar.b(bds.c, new Bundle());
        return beuVar;
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

    @Override // defpackage.ilz, defpackage.ikr, defpackage.bq
    public final void ex(Context context) {
        this.ai.g();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.e == null) {
                try {
                    wvx wvxVarD = wzg.d(iln.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(iln.class, "CreatePeer");
                        try {
                            eup eupVar = ((eth) objDN).b;
                            AccessibilityManager accessibilityManagerU = eupVar.u();
                            bq bqVar = ((eth) objDN).a;
                            Bundle bundleA = wjk.a(bqVar);
                            ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) eupVar.pq.a();
                            yqw.B(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            ink inkVar = (ink) acas.d(bundleA, ink.a, extensionRegistryLite);
                            inkVar.getClass();
                            if (!(bqVar instanceof iln)) {
                                throw new IllegalStateException(a.B(bqVar, ilq.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            iln ilnVar = (iln) bqVar;
                            ilnVar.getClass();
                            this.e = new ilq(accessibilityManagerU, inkVar, ilnVar, (irh) ((eth) objDN).c.g.a());
                            wvxVarD2.close();
                            this.e.e = this;
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
        bw bwVarEe;
        this.ai.g();
        try {
            ilq ilqVarL = L();
            if (!ilqVarL.c.g() && (bwVarEe = ilqVarL.b.ee()) != null) {
                bwVarEe.setTheme(R.style.Theme_KatnissSetup_AmatiBlack);
            }
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

    @Override // defpackage.ilz, defpackage.bq
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
