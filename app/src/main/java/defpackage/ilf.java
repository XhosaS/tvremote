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
public final class ilf extends ily implements wgt, aeiz, wjd, wwo {
    private final bco ah = new bco(this);
    private final wua ai = new wua(this);
    private boolean ao;
    private ill e;
    private Context f;

    @Deprecated
    public ilf() {
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
            ContextWrapper contextWrapper = ((ily) this).d;
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
        L();
        return R.style.Theme_KatnissSetup_HomeGraphGuidedInputStepAmati;
    }

    @Override // defpackage.ats
    public final long aC(axh axhVar) throws Resources.NotFoundException {
        int i;
        ill illVarL = L();
        axhVar.getClass();
        CharSequence charSequence = axhVar.b;
        if (charSequence == null || charSequence.length() == 0) {
            i = 2;
        } else {
            irh irhVar = illVarL.c;
            String string = charSequence.toString();
            abxs abxsVar = illVarL.a.b;
            abxsVar.getClass();
            ArrayList arrayList = new ArrayList(agqq.i(abxsVar, 10));
            Iterator<E> it = abxsVar.iterator();
            while (it.hasNext()) {
                String str = ((inq) it.next()).c;
                str.getClass();
                arrayList.add(str);
            }
            i = !irhVar.h(string, arrayList) ? 3 : 1;
        }
        int i2 = i - 1;
        ayb aybVar = null;
        ioz iozVar = null;
        ayb aybVar2 = null;
        if (i2 == 1) {
            ayb aybVar3 = illVarL.d;
            if (aybVar3 == null) {
                agvy.b("actionViewHolder");
            } else {
                aybVar = aybVar3;
            }
            ilf ilfVar = illVarL.b;
            String string2 = ilfVar.dZ().getResources().getString(R.string.homegraph_add_room_room_name_empty_error);
            string2.getClass();
            illVarL.b(aybVar, string2);
            axhVar.c = ilfVar.dZ().getResources().getString(R.string.homegraph_add_room_room_name_empty_error);
            return 0L;
        }
        if (i2 == 2) {
            ayb aybVar4 = illVarL.d;
            if (aybVar4 == null) {
                agvy.b("actionViewHolder");
            } else {
                aybVar2 = aybVar4;
            }
            ilf ilfVar2 = illVarL.b;
            String string3 = ilfVar2.dZ().getResources().getString(R.string.homegraph_add_room_room_name_error);
            string3.getClass();
            illVarL.b(aybVar2, string3);
            axhVar.c = ilfVar2.dZ().getResources().getString(R.string.homegraph_add_room_room_name_error);
            return 0L;
        }
        ilf ilfVar3 = illVarL.b;
        Object objEp = ilfVar3.ep();
        ioz iozVar2 = objEp instanceof ioz ? (ioz) objEp : null;
        if (iozVar2 == null) {
            Object objEp2 = ilfVar3.ep();
            wgt wgtVar = objEp2 instanceof wgt ? (wgt) objEp2 : null;
            Object objL = wgtVar != null ? wgtVar.L() : null;
            if (objL instanceof ioz) {
                iozVar = (ioz) objL;
            }
        } else {
            iozVar = iozVar2;
        }
        if (iozVar == null) {
            return -2L;
        }
        Bundle bundle = new Bundle();
        bundle.putString("room_name", String.valueOf(charSequence));
        iozVar.o(2, bundle);
        return -2L;
    }

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return new ilk(L());
    }

    @Override // defpackage.ats
    public final ayc aF() {
        int i = ayc.j;
        return new ilj(L());
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
        return new axd(L().b.dZ().getResources().getString(R.string.homegraph_add_room_screen_title), null, null, null);
    }

    @Override // defpackage.ats
    public final void aR(List list) {
        L().b.s();
        axf axfVar = new axf(null);
        axfVar.c();
        axfVar.a = 10L;
        list.add(axfVar.a());
    }

    @Override // defpackage.wgt
    /* renamed from: aS, reason: merged with bridge method [inline-methods] */
    public final ill L() {
        ill illVar = this.e;
        if (illVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return illVar;
    }

    @Override // defpackage.ily
    protected final /* synthetic */ aeik aU() {
        return new wjj(this);
    }

    @Override // defpackage.ikr, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        Object next;
        this.ai.g();
        try {
            ill illVarL = L();
            view.getClass();
            irh irhVar = illVarL.c;
            if (irhVar.g()) {
                view.setBackground(irhVar.b(illVarL.b.dZ()));
            }
            super.aa(view, bundle);
            View viewRequireViewById = view.requireViewById(R.id.error_border);
            viewRequireViewById.getClass();
            illVarL.f = viewRequireViewById;
            ilf ilfVar = illVarL.b;
            List list = ilfVar.c;
            list.getClass();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                axh axhVar = (axh) next;
                if (axhVar != null && axhVar.a == 10) {
                    break;
                }
            }
            axh axhVar2 = (axh) next;
            if (axhVar2 != null) {
                ilfVar.b.i(axhVar2);
            }
            illVarL.e = view.requireViewById(R.id.guidedactions_hidden_view);
            boolean z = true;
            if (view.getResources().getConfiguration().getLayoutDirection() != 1) {
                z = false;
            }
            illVarL.g = z;
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

    @Override // defpackage.ats
    public final void dt(axh axhVar) {
        this.ai.a("Fragment:onGuidedActionClickedBegin").close();
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

    @Override // defpackage.ily, defpackage.ikr, defpackage.bq
    public final void ex(Context context) {
        this.ai.g();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.e == null) {
                try {
                    wvx wvxVarD = wzg.d(ilf.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(ilf.class, "CreatePeer");
                        try {
                            bq bqVar = ((eth) objDN).a;
                            Bundle bundleA = wjk.a(bqVar);
                            ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) ((eth) objDN).b.pq.a();
                            yqw.B(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            ini iniVar = (ini) acas.d(bundleA, ini.a, extensionRegistryLite);
                            iniVar.getClass();
                            if (!(bqVar instanceof ilf)) {
                                throw new IllegalStateException(a.B(bqVar, ill.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            ilf ilfVar = (ilf) bqVar;
                            ilfVar.getClass();
                            this.e = new ill(iniVar, ilfVar, (irh) ((eth) objDN).c.g.a());
                            wvxVarD2.close();
                            this.e.h = this;
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
            ill illVarL = L();
            if (!illVarL.c.g() && (bwVarEe = illVarL.b.ee()) != null) {
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

    @Override // defpackage.ily, defpackage.bq
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
