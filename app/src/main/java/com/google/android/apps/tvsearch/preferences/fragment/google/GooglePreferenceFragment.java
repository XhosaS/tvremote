package com.google.android.apps.tvsearch.preferences.fragment.google;

import android.accounts.Account;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.google.android.katniss.R;
import defpackage.a;
import defpackage.aeik;
import defpackage.aeiu;
import defpackage.aeiz;
import defpackage.aejb;
import defpackage.agqq;
import defpackage.agvy;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.bcg;
import defpackage.bco;
import defpackage.bds;
import defpackage.bet;
import defpackage.beu;
import defpackage.bii;
import defpackage.bij;
import defpackage.bq;
import defpackage.bqs;
import defpackage.eth;
import defpackage.eup;
import defpackage.fcu;
import defpackage.fda;
import defpackage.ffp;
import defpackage.fjr;
import defpackage.gph;
import defpackage.gtu;
import defpackage.gwq;
import defpackage.haz;
import defpackage.hba;
import defpackage.hbd;
import defpackage.idj;
import defpackage.idl;
import defpackage.idu;
import defpackage.jcy;
import defpackage.uea;
import defpackage.wgt;
import defpackage.wir;
import defpackage.wjc;
import defpackage.wjd;
import defpackage.wjg;
import defpackage.wjj;
import defpackage.wua;
import defpackage.wum;
import defpackage.wvx;
import defpackage.wwo;
import defpackage.wwt;
import defpackage.wyt;
import defpackage.wzg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GooglePreferenceFragment extends hbd implements wgt, aeiz, wjd, wwo {
    private hba ak;
    private Context al;
    private final bco am = new bco(this);
    private final wua an = new wua(this);
    private boolean ao;

    @Deprecated
    public GooglePreferenceFragment() {
        uea.c();
    }

    @Override // defpackage.aui, defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.g();
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
        this.an.g();
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
        wwt wwtVarA = this.an.a("Fragment:onActivityResult");
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
        this.an.g();
        boolean z = true;
        try {
            this.P = true;
            ContextWrapper contextWrapper = ((hbd) this).aj;
            if (contextWrapper != null && aeik.c(contextWrapper) != activity) {
                z = false;
            }
            aejb.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
            super.aQ();
            aR();
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
        wwt wwtVarC = this.an.c();
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
        this.an.g();
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
    public final void Z() {
        wwt wwtVarC = this.an.c();
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

    @Override // defpackage.bit
    public final void aH() throws Resources.NotFoundException {
        hba hbaVarL = L();
        GooglePreferenceFragment googlePreferenceFragment = hbaVarL.g;
        googlePreferenceFragment.aG();
        hbaVarL.n = googlePreferenceFragment.aB();
        PreferenceScreen preferenceScreen = hbaVarL.n;
        if (preferenceScreen == null) {
            agvy.b("preferenceScreen");
            preferenceScreen = null;
        }
        preferenceScreen.H(R.string.header_google);
    }

    @Override // defpackage.wgt
    /* renamed from: aJ, reason: merged with bridge method [inline-methods] */
    public final hba L() {
        hba hbaVar = this.ak;
        if (hbaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return hbaVar;
    }

    @Override // defpackage.wwo
    public final wyt aK() {
        return this.an.b;
    }

    @Override // defpackage.hbd
    protected final /* synthetic */ aeik aL() {
        return new wjj(this);
    }

    @Override // defpackage.wjd
    public final Locale aM() {
        return wjc.a(this);
    }

    @Override // defpackage.wwo
    public final void aN(wyt wytVar, boolean z) {
        this.an.d(wytVar, z);
    }

    @Override // defpackage.wwo
    public final void aO(wyt wytVar) {
        this.an.c = wytVar;
    }

    @Override // defpackage.aui, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        this.an.g();
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
        wua wuaVar = this.an;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().i = obj;
    }

    @Override // defpackage.bq
    public final void ag(Object obj) {
        wua wuaVar = this.an;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().k = obj;
    }

    @Override // defpackage.bq
    public final void aj(Object obj) {
        wua wuaVar = this.an;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().l = obj;
    }

    @Override // defpackage.bq
    public final void ak(Object obj) {
        wua wuaVar = this.an;
        if (wuaVar != null) {
            wuaVar.h();
        }
        super.eb().j = obj;
    }

    @Override // defpackage.bq
    public final void av(int i, int i2) {
        this.an.e(i, i2);
        wum.n();
    }

    @Override // defpackage.bq
    public final boolean ay() {
        this.an.a("Fragment:onOptionsItemSelected").close();
        return false;
    }

    @Override // defpackage.bit, defpackage.bq
    public final void e() {
        wwt wwtVarC = this.an.c();
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
        return this.am;
    }

    @Override // defpackage.bq, defpackage.bbz
    public final bet em() {
        beu beuVar = new beu(super.em());
        beuVar.b(bds.c, new Bundle());
        return beuVar;
    }

    @Override // defpackage.bq
    public final void er() {
        wwt wwtVarB = this.an.b();
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
        this.an.g();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [wvx] */
    @Override // defpackage.hbd, defpackage.bq
    public final void ex(Context context) {
        eup eupVar;
        gwq gwqVarBB;
        Supplier supplierGJ;
        fda fdaVar;
        ahbt ahbtVar;
        Supplier supplierGI;
        gph gphVarBj;
        bq bqVar;
        this.an.g();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.ak == null) {
                try {
                    wvx wvxVarD = wzg.d(GooglePreferenceFragment.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(GooglePreferenceFragment.class, "CreatePeer");
                        try {
                            eupVar = ((eth) objDN).b;
                            gwqVarBB = eupVar.bB();
                            supplierGJ = eupVar.gJ();
                            fdaVar = (fda) eupVar.fS.a();
                            ahbtVar = (ahbt) eupVar.q.a();
                            supplierGI = eupVar.gI();
                            gphVarBj = eupVar.bj();
                            bqVar = ((eth) objDN).a;
                        } catch (Throwable th) {
                            th = th;
                            context = wvxVarD2;
                        }
                        try {
                            if (!(bqVar instanceof GooglePreferenceFragment)) {
                                throw new IllegalStateException(a.B(bqVar, hba.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            GooglePreferenceFragment googlePreferenceFragment = (GooglePreferenceFragment) bqVar;
                            googlePreferenceFragment.getClass();
                            this.ak = new hba(gwqVarBB, supplierGJ, fdaVar, ahbtVar, supplierGI, gphVarBj, googlePreferenceFragment, eupVar.hf(), (fjr) eupVar.fW.a(), eupVar.gK(), (jcy) eupVar.gx.a(), (ffp) eupVar.by.a(), (gtu) eupVar.bE.a(), eupVar.fU, (fcu) eupVar.fb.a(), (idl) eupVar.ga.a(), (idu) eupVar.fZ.a());
                            wvxVarD2.close();
                            this.aa.b(new wir(this.an, this.am));
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            try {
                                context.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            bqs bqsVar = this.F;
            if (bqsVar instanceof wwo) {
                wua wuaVar = this.an;
                if (wuaVar.b == null) {
                    wuaVar.d(((wwo) bqsVar).aK(), true);
                }
            }
            wum.n();
        } finally {
        }
    }

    @Override // defpackage.bit, defpackage.bq
    public final void ey(Bundle bundle) {
        this.an.g();
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

    @Override // defpackage.bit, defpackage.bq
    public final void g(Bundle bundle) {
        this.an.g();
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

    @Override // defpackage.bit, defpackage.bq
    public final void h() {
        int i;
        Preference preference;
        this.an.g();
        try {
            super.h();
            final hba hbaVarL = L();
            PreferenceScreen preferenceScreen = hbaVarL.n;
            if (preferenceScreen == null) {
                agvy.b("preferenceScreen");
                preferenceScreen = null;
            }
            synchronized (preferenceScreen) {
                List list = ((PreferenceGroup) preferenceScreen).b;
                i = -1;
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    preferenceScreen.X((Preference) list.get(0));
                    size--;
                }
            }
            preferenceScreen.x();
            GooglePreferenceFragment googlePreferenceFragment = hbaVarL.g;
            googlePreferenceFragment.aG();
            hbaVarL.n = googlePreferenceFragment.aB();
            PreferenceScreen preferenceScreen2 = hbaVarL.n;
            if (preferenceScreen2 == null) {
                agvy.b("preferenceScreen");
                preferenceScreen2 = null;
            }
            preferenceScreen2.H(R.string.header_google);
            gtu gtuVar = hbaVarL.j;
            List listN = gtuVar.n();
            ArrayList arrayList = new ArrayList(agqq.i(listN, 10));
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add(((Account) it.next()).name);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            Account accountC = gtuVar.c();
            String str = accountC != null ? accountC.name : null;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (agvy.c(strArr[i2], str)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            ListPreference listPreference = (ListPreference) googlePreferenceFragment.cR("account");
            if (listPreference != null) {
                listPreference.e(strArr);
                listPreference.h = strArr;
                if (i >= 0) {
                    listPreference.f(i);
                    listPreference.n = new bii() { // from class: haq
                        @Override // defpackage.bii
                        public final boolean a(Preference preference2, Object obj) {
                            obj.getClass();
                            hba hbaVar = hbaVarL;
                            ahal.e(hbaVar.d, null, 0, new haw(hbaVar, (String) obj, null), 3);
                            return true;
                        }
                    };
                } else {
                    listPreference.D(false);
                }
            }
            SwitchPreference switchPreference = (SwitchPreference) googlePreferenceFragment.cR("enable_assistant");
            if (switchPreference != null) {
                Supplier supplier = hbaVarL.b;
                switchPreference.k((((Boolean) supplier.get()).booleanValue() && ((Boolean) hbaVarL.e.get()).booleanValue() && !hbaVarL.l.R(gtuVar.c())) ? false : true);
                switchPreference.J(((Boolean) supplier.get()).booleanValue() && ((Boolean) hbaVarL.e.get()).booleanValue());
                switchPreference.n = new bii() { // from class: hap
                    @Override // defpackage.bii
                    public final boolean a(Preference preference2, Object obj) {
                        obj.getClass();
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        hba hbaVar = hbaVarL;
                        if (!zBooleanValue) {
                            ahal.e(hbaVar.d, null, 0, new hax(hbaVar, null), 3);
                            return true;
                        }
                        Intent intent = new Intent();
                        ComponentName componentName = irm.a;
                        Intent intentAddFlags = intent.setComponent(irm.e).putExtra("START_VIA_MIC_PRESS", false).addFlags(268435456);
                        intentAddFlags.getClass();
                        wyo.l(hbaVar.g.dZ(), intentAddFlags);
                        return false;
                    }
                };
            }
            hbaVarL.o = googlePreferenceFragment.cR("enable_udc_permission");
            Preference preferenceCR = googlePreferenceFragment.cR("permissions");
            Supplier supplier2 = hbaVarL.b;
            if (!((Boolean) supplier2.get()).booleanValue()) {
                Preference preference2 = hbaVarL.o;
                if (preference2 != null) {
                    hbaVarL.c(preference2);
                }
                if (preferenceCR != null) {
                    hbaVarL.c(preferenceCR);
                }
            } else if (gtuVar.c() == null || hbaVarL.l.e(gtuVar.c()) == idj.b) {
                Preference preference3 = hbaVarL.o;
                if (preference3 != null) {
                    hbaVarL.c(preference3);
                }
            } else {
                if (preferenceCR != null) {
                    hbaVarL.c(preferenceCR);
                }
                Preference preference4 = hbaVarL.o;
                if (preference4 != null) {
                    preference4.o = new bij() { // from class: hau
                        @Override // defpackage.bij
                        public final void a() {
                            Intent intent = new Intent();
                            ComponentName componentName = irm.a;
                            intent.setComponent(irm.e);
                            intent.putExtra("is_intent_from_setting", true);
                            wyo.l(hbaVarL.g.dZ(), intent);
                        }
                    };
                }
            }
            Preference preferenceCR2 = googlePreferenceFragment.cR("ok_google_detection");
            if (preferenceCR2 != null) {
                preferenceCR2.J((!agvy.c(Build.MODEL, "SHIELD Android TV") || !hbaVarL.h || hbaVarL.m.B() || (preference = hbaVarL.o) == null || preference.x) ? false : true);
                preferenceCR2.o = new bij() { // from class: has
                    @Override // defpackage.bij
                    public final void a() {
                        hbaVarL.d();
                    }
                };
            }
            ahal.e(hbaVarL.d, null, 0, new haz(hbaVarL, null), 3);
            SwitchPreference switchPreference2 = (SwitchPreference) googlePreferenceFragment.cR("safe_search");
            if (switchPreference2 != null) {
                switchPreference2.k(hbaVarL.l.ac());
                switchPreference2.n = new bii() { // from class: har
                    @Override // defpackage.bii
                    public final boolean a(Preference preference5, Object obj) {
                        obj.getClass();
                        hbaVarL.l.H(((Boolean) obj).booleanValue());
                        return true;
                    }
                };
            }
            ListPreference listPreference2 = (ListPreference) googlePreferenceFragment.cR("temperature_unit");
            if (listPreference2 != null) {
                if (((Boolean) supplier2.get()).booleanValue()) {
                    hbaVarL.c(listPreference2);
                } else {
                    listPreference2.h = new String[]{"1", "2"};
                    listPreference2.e(new String[]{googlePreferenceFragment.dZ().getResources().getString(R.string.temperature_unit_celsius), googlePreferenceFragment.dZ().getResources().getString(R.string.temperature_unit_fahrenheit)});
                    int iA = hbaVarL.l.a();
                    listPreference2.f(((iA == 0 || iA == 1 || iA != 2) ? 1 : 0) ^ 1);
                    listPreference2.n = new bii() { // from class: hat
                        @Override // defpackage.bii
                        public final boolean a(Preference preference5, Object obj) throws NumberFormatException {
                            obj.getClass();
                            hbaVarL.l.I(Integer.parseInt((String) obj));
                            return true;
                        }
                    };
                }
            }
            hbaVarL.b();
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

    @Override // defpackage.bit, defpackage.bq
    public final void i() {
        this.an.g();
        try {
            super.i();
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

    @Override // defpackage.hbd, defpackage.atz, defpackage.bq
    public final Context s() {
        if (super.s() == null) {
            return null;
        }
        if (this.al == null) {
            this.al = new wjg(this, super.s());
        }
        return this.al;
    }
}
