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
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ils extends ima implements wgt, aeiz, wjd, wwo {
    private final bco ah = new bco(this);
    private final wua ai = new wua(this);
    private boolean ao;
    private ilv e;
    private Context f;

    @Deprecated
    public ils() {
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
            ContextWrapper contextWrapper = ((ima) this).d;
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
        if (L().b.g()) {
            return -1;
        }
        return R.style.Theme_KatnissSetup_HomeGraphGuidedStepAmati;
    }

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return new ilu(L());
    }

    @Override // defpackage.ats
    public final ayc aF() {
        int i = ayc.j;
        return new ilt(L());
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
        ils ilsVar = L().a;
        return new axd(ilsVar.dZ().getResources().getString(R.string.homegraph_choose_room_screen_title), ilsVar.dZ().getResources().getString(R.string.homegraph_choose_home_room_description), null, null);
    }

    @Override // defpackage.ats
    public final void aR(List list) throws Resources.NotFoundException {
        String[] stringArray;
        ilv ilvVarL = L();
        List list2 = ilvVarL.c;
        if (!list2.isEmpty()) {
            ils ilsVar = ilvVarL.a;
            String string = ilsVar.dZ().getResources().getString(R.string.homegraph_choose_room_existing_room_list_title);
            string.getClass();
            list.add(ilvVarL.a(string, -100L));
            ArrayList arrayList = new ArrayList(agqq.i(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    agqq.h();
                }
                ilsVar.s();
                axf axfVar = new axf(null);
                axfVar.b = ((inq) obj).c;
                axfVar.a = i;
                arrayList.add(axfVar.a());
                i = i2;
            }
            agqq.k(list, arrayList);
            String string2 = ilsVar.dZ().getResources().getString(R.string.homegraph_choose_room_add_room_list_title);
            string2.getClass();
            list.add(ilvVarL.a(string2, -101L));
        }
        ils ilsVar2 = ilvVarL.a;
        Resources resourcesAY = ilsVar2.aY();
        if (resourcesAY != null && (stringArray = resourcesAY.getStringArray(R.array.homegraph_choose_room_add_room_provided_rooms)) != null) {
            for (String str : stringArray) {
                if (list2.isEmpty()) {
                    ilsVar2.s();
                    axf axfVar2 = new axf(null);
                    axfVar2.b = str;
                    axfVar2.a = -2L;
                    list.add(axfVar2.a());
                } else {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (agvy.c(((inq) it.next()).c, str)) {
                            break;
                        }
                    }
                    ilsVar2.s();
                    axf axfVar22 = new axf(null);
                    axfVar22.b = str;
                    axfVar22.a = -2L;
                    list.add(axfVar22.a());
                }
            }
        }
        ilsVar2.s();
        axf axfVar3 = new axf(null);
        axfVar3.b = ilsVar2.dZ().getResources().getString(R.string.homegraph_choose_room_add_custom_room_option_name);
        axfVar3.a = -1L;
        list.add(axfVar3.a());
    }

    @Override // defpackage.wgt
    /* renamed from: aS, reason: merged with bridge method [inline-methods] */
    public final ilv L() {
        ilv ilvVar = this.e;
        if (ilvVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ilvVar;
    }

    @Override // defpackage.ima
    protected final /* synthetic */ aeik aU() {
        return new wjj(this);
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        this.ai.g();
        try {
            ilv ilvVarL = L();
            view.getClass();
            irh irhVar = ilvVarL.b;
            if (irhVar.g()) {
                view.setBackground(irhVar.b(ilvVarL.a.dZ()));
            }
            super.aa(view, bundle);
            if (!ilvVarL.c.isEmpty()) {
                View viewRequireViewById = view.requireViewById(R.id.guidedactions_list);
                ils ilsVar = ilvVarL.a;
                viewRequireViewById.setPadding(0, ilsVar.dZ().getResources().getDimensionPixelSize(R.dimen.setup_homegraph_actions_vertical_offset_top), 0, ilsVar.dZ().getResources().getDimensionPixelSize(R.dimen.setup_actions_vertical_offset_bottom));
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
        View view = L().a.R;
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
            ilv ilvVarL = L();
            axhVar.getClass();
            Object objEp = ilvVarL.a.ep();
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
            long j = axhVar.a;
            if (j == -1) {
                iozVar.o(4, Bundle.EMPTY);
            } else if (j == -2) {
                Bundle bundle = new Bundle();
                bundle.putCharSequence("room_name", axhVar.b);
                iozVar.o(5, bundle);
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("room_id", ((inq) ilvVarL.c.get((int) j)).b);
                iozVar.o(8, bundle2);
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

    @Override // defpackage.ima, defpackage.ikr, defpackage.bq
    public final void ex(Context context) {
        this.ai.g();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.e == null) {
                try {
                    wvx wvxVarD = wzg.d(ils.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(ils.class, "CreatePeer");
                        try {
                            bq bqVar = ((eth) objDN).a;
                            Bundle bundleA = wjk.a(bqVar);
                            ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) ((eth) objDN).b.pq.a();
                            yqw.B(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            inm inmVar = (inm) acas.d(bundleA, inm.a, extensionRegistryLite);
                            inmVar.getClass();
                            if (!(bqVar instanceof ils)) {
                                throw new IllegalStateException(a.B(bqVar, ilv.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            ils ilsVar = (ils) bqVar;
                            ilsVar.getClass();
                            this.e = new ilv(inmVar, ilsVar, (irh) ((eth) objDN).c.g.a());
                            wvxVarD2.close();
                            this.e.d = this;
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
            ilv ilvVarL = L();
            if (!ilvVarL.b.g() && (bwVarEe = ilvVarL.a.ee()) != null) {
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

    @Override // defpackage.ima, defpackage.bq
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
