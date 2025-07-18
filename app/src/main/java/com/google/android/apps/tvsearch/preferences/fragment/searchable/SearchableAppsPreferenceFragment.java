package com.google.android.apps.tvsearch.preferences.fragment.searchable;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.katniss.R;
import defpackage.agqq;
import defpackage.agrj;
import defpackage.agvy;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.bii;
import defpackage.bje;
import defpackage.fiu;
import defpackage.fqh;
import defpackage.fsg;
import defpackage.fwe;
import defpackage.gtu;
import defpackage.gyy;
import defpackage.hbf;
import defpackage.hbi;
import defpackage.hbj;
import defpackage.hbk;
import defpackage.igs;
import defpackage.irm;
import defpackage.jba;
import defpackage.jbc;
import defpackage.jbd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchableAppsPreferenceFragment extends hbf implements bii {
    public Supplier aj;
    public ahbt ak;
    public fiu al;
    public fsg am;
    public Supplier an;
    public gyy ao;
    public gtu ap;
    public jbc aq;
    public PackageManager ar;
    public jbd as;
    public jbd at;
    public fqh au;
    public igs av;

    public static final String aQ(jba jbaVar, SearchableAppsPreferenceFragment searchableAppsPreferenceFragment) {
        ApplicationInfo applicationInfoC = jbaVar.c();
        String string = applicationInfoC != null ? searchableAppsPreferenceFragment.aL().getApplicationLabel(applicationInfoC).toString() : null;
        return string == null ? "" : string;
    }

    private static final Map aU(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((jba) obj).n()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            ((jba) obj2).i();
            arrayList2.add(obj2);
        }
        int iB = agrj.b(agqq.i(arrayList2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj3 : arrayList2) {
            linkedHashMap.put(((jba) obj3).i(), obj3);
        }
        return linkedHashMap;
    }

    @Override // defpackage.bii
    public final boolean a(Preference preference, Object obj) {
        obj.getClass();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Account accountC = aM().c();
        igs igsVar = null;
        if (((Boolean) aR().get()).booleanValue() && ((Boolean) aS().get()).booleanValue()) {
            fsg fsgVar = this.am;
            if (fsgVar == null) {
                agvy.b("dscAccessorCache");
                fsgVar = null;
            }
            String str = accountC != null ? accountC.name : null;
            if (str == null) {
                str = "";
            }
            if (fsgVar.a(str) != fwe.DSC_GRANTED && zBooleanValue) {
                Intent intent = new Intent();
                String str2 = preference.s;
                str2.getClass();
                Bundle bundle = new Bundle();
                bundle.putCharSequence("dsc_entry_point", "SETTINGS");
                bundle.putCharSequence("searchable_toggle_package_name", str2);
                Intent intentPutExtras = intent.putExtras(bundle);
                intentPutExtras.getClass();
                igs igsVar2 = this.av;
                if (igsVar2 == null) {
                    agvy.b("setupLauncher");
                } else {
                    igsVar = igsVar2;
                }
                ComponentName componentName = irm.a;
                igsVar.a(intentPutExtras, irm.a);
                return false;
            }
        }
        ahal.e(aT(), null, 0, new hbj(this, accountC, preference, zBooleanValue, null), 3);
        return true;
    }

    @Override // defpackage.bit
    public final void aH() {
        bje bjeVar = this.b;
        PreferenceScreen preferenceScreen = new PreferenceScreen(bjeVar.a, null);
        preferenceScreen.z(bjeVar);
        preferenceScreen.H(R.string.title_searchable_apps);
        preferenceScreen.G(preferenceScreen.j.getString(R.string.desc_searchable_apps));
        aE(preferenceScreen);
        ahal.e(aT(), null, 0, new hbi(this, null), 3);
    }

    public final PackageManager aL() {
        PackageManager packageManager = this.ar;
        if (packageManager != null) {
            return packageManager;
        }
        agvy.b("packageManager");
        return null;
    }

    public final gtu aM() {
        gtu gtuVar = this.ap;
        if (gtuVar != null) {
            return gtuVar;
        }
        agvy.b("katnissAccountManager");
        return null;
    }

    public final jbd aN() {
        jbd jbdVar = this.as;
        if (jbdVar != null) {
            return jbdVar;
        }
        agvy.b("searchableSourcesCloud");
        return null;
    }

    public final jbd aO() {
        jbd jbdVar = this.at;
        if (jbdVar != null) {
            return jbdVar;
        }
        agvy.b("searchableSourcesSystem");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        if (r15 == r1) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d A[Catch: NameNotFoundException -> 0x0176, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x0176, blocks: (B:51:0x0157, B:53:0x015d), top: B:59:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013d -> B:50:0x013f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object aP(defpackage.agsw r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.preferences.fragment.searchable.SearchableAppsPreferenceFragment.aP(agsw):java.lang.Object");
    }

    public final Supplier aR() {
        Supplier supplier = this.aj;
        if (supplier != null) {
            return supplier;
        }
        agvy.b("assistantSupported");
        return null;
    }

    public final Supplier aS() {
        Supplier supplier = this.an;
        if (supplier != null) {
            return supplier;
        }
        agvy.b("dscEnabled");
        return null;
    }

    public final ahbt aT() {
        ahbt ahbtVar = this.ak;
        if (ahbtVar != null) {
            return ahbtVar;
        }
        agvy.b("coroutineScope");
        return null;
    }

    @Override // defpackage.aui, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        view.getClass();
        super.aa(view, bundle);
        aB().D(false);
        ahal.e(aT(), null, 0, new hbk(this, null), 3);
    }
}
