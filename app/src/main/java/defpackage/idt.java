package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import j$.time.Instant;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idt implements idl {
    public static final ido a = new ido();
    private static final zdy l = zdy.h("com/google/android/apps/tvsearch/settings/preferences/SearchSettingsImpl");
    public final fqa b;
    public final fjr c;
    public final gyy d;
    public final idu e;
    public final SharedPreferences f;
    public final Object g;
    public final Map h;
    public final Map i;
    public final Map j;
    public final Map k;
    private final ContentResolver m;
    private final ahbt n;
    private final ahbt o;
    private final fry p;
    private final gph q;
    private final boolean r;
    private final gtu s;
    private final icr t;
    private final icx u;
    private final fvb v;
    private String w;
    private Account x;

    public idt(fqa fqaVar, ContentResolver contentResolver, ahbt ahbtVar, ahbt ahbtVar2, fry fryVar, gph gphVar, boolean z, fjr fjrVar, gyy gyyVar, gtu gtuVar, icr icrVar, hag hagVar, icx icxVar, idu iduVar, fvb fvbVar) {
        ahbtVar.getClass();
        ahbtVar2.getClass();
        fjrVar.getClass();
        gyyVar.getClass();
        gtuVar.getClass();
        icrVar.getClass();
        hagVar.getClass();
        iduVar.getClass();
        this.b = fqaVar;
        this.m = contentResolver;
        this.n = ahbtVar;
        this.o = ahbtVar2;
        this.p = fryVar;
        this.q = gphVar;
        this.r = z;
        this.c = fjrVar;
        this.d = gyyVar;
        this.s = gtuVar;
        this.t = icrVar;
        this.u = icxVar;
        this.e = iduVar;
        this.v = fvbVar;
        this.f = iduVar.a();
        this.g = new Object();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.w = "";
        if (hagVar != hag.g) {
            ((zdv) ((zdv) l.d()).r(zfc.LARGE).q("com/google/android/apps/tvsearch/settings/preferences/SearchSettingsImpl", "<init>", 257, "SearchSettingsImpl.kt")).x("SearchSettings incorrectly used in %s", new qsk(hagVar));
        }
        ahal.e(ahbtVar, null, 0, new idm(this, null), 3);
        gtuVar.q(new idn(this));
    }

    @Override // defpackage.idl
    public final void A(boolean z) {
        icq icqVar = new icq();
        icqVar.a(icg.f, z);
        this.t.x(icqVar);
        this.f.edit().putBoolean("is_operator_device", z).apply();
    }

    @Override // defpackage.idl
    public final void B(String str) {
        synchronized (this.g) {
            this.f.edit().putString("parental_auth_status", str).apply();
        }
    }

    @Override // defpackage.idl
    public final void C(Account account, boolean z) {
        String str = account != null ? account.name : null;
        SharedPreferences sharedPreferences = this.f;
        Set setA = a.a(sharedPreferences, "personal_results_enabled");
        if (str == null) {
            str = "";
        }
        if (z) {
            setA.add(str);
        } else if (setA.contains(str)) {
            setA.remove(str);
        }
        sharedPreferences.edit().putStringSet("personal_results_enabled", setA).apply();
    }

    @Override // defpackage.idl
    public final void D(Account account, boolean z) {
        String str = account != null ? account.name : null;
        SharedPreferences sharedPreferences = this.f;
        Set setA = a.a(sharedPreferences, "personal_results_locked");
        if (str == null) {
            str = "";
        }
        if (z) {
            setA.add(str);
        } else {
            setA.remove(str);
        }
        sharedPreferences.edit().putStringSet("personal_results_locked", setA).apply();
    }

    @Override // defpackage.idl
    public final void E(Account account, boolean z) {
        String str = account != null ? account.name : null;
        SharedPreferences sharedPreferences = this.f;
        Set setA = a.a(sharedPreferences, "proactive_results_enabled");
        if (str == null) {
            str = "";
        }
        if (z) {
            setA.add(str);
        } else if (setA.contains(str)) {
            setA.remove(str);
        }
        sharedPreferences.edit().putStringSet("proactive_results_enabled", setA).apply();
    }

    @Override // defpackage.idl
    public final void F(Account account, boolean z) {
        String str = account != null ? account.name : null;
        SharedPreferences sharedPreferences = this.f;
        Set setA = a.a(sharedPreferences, "proactive_results_locked");
        if (str == null) {
            str = "";
        }
        if (z) {
            setA.add(str);
        } else {
            setA.remove(str);
        }
        sharedPreferences.edit().putStringSet("proactive_results_locked", setA).apply();
    }

    @Override // defpackage.idl
    public final void G(Boolean bool) {
        if (bool != null) {
            this.f.edit().putBoolean("promo_emails_opted_in", bool.booleanValue()).apply();
        }
    }

    @Override // defpackage.idl
    public final void H(boolean z) {
        this.f.edit().putBoolean("safe_search_enabled", z).apply();
        icq icqVar = new icq();
        icqVar.a(icg.g, z);
        this.t.x(icqVar);
    }

    @Override // defpackage.idl
    public final void I(int i) {
        this.f.edit().putInt("temperature_unit", i).apply();
        icq icqVar = new icq();
        icg icgVar = icg.h;
        icgVar.getClass();
        icg.a.b(icgVar, 2);
        icqVar.a.putInt(icgVar.w, i);
        this.t.x(icqVar);
    }

    @Override // defpackage.idl
    public final void J(Account account, idj idjVar, boolean z) {
        idjVar.getClass();
        String str = account != null ? account.name : null;
        synchronized (this.g) {
            Map map = this.i;
            if (str == null) {
                str = "";
            }
            if (map.containsKey(str) && map.get(str) == idjVar) {
                return;
            }
            ((zdv) l.b().q("com/google/android/apps/tvsearch/settings/preferences/SearchSettingsImpl", "setUdcPermissionState", 384, "SearchSettingsImpl.kt")).F("Updating UDC permission state from %s to %s on device.", map.get(str), idjVar);
            SharedPreferences sharedPreferences = this.f;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            String str2 = "";
            if (map.containsKey(str)) {
                idj idjVar2 = (idj) map.get(str);
                if (idjVar2 != null) {
                    int iOrdinal = idjVar2.ordinal();
                    if (iOrdinal == 1) {
                        str2 = "udc_permission_granted_accounts";
                    } else if (iOrdinal == 2) {
                        str2 = "udc_permission_denied_accounts";
                    }
                }
                str2 = "udc_permission_unknown_accounts";
            }
            int iOrdinal2 = idjVar.ordinal();
            String str3 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? "udc_permission_unknown_accounts" : "udc_permission_denied_accounts" : "udc_permission_granted_accounts";
            map.put(str, idjVar);
            if (str2.length() > 0) {
                Set setA = a.a(sharedPreferences, str2);
                setA.remove(str);
                editorEdit.putStringSet(str2, setA);
            }
            Set<String> setA2 = a.a(sharedPreferences, str3);
            setA2.add(str);
            editorEdit.putStringSet(str3, setA2).apply();
            L(account, z);
            ai();
        }
    }

    @Override // defpackage.idl
    public final void K(Account account, boolean z) {
        String str = account != null ? account.name : null;
        synchronized (this.g) {
            Map map = this.k;
            idk idkVar = z ? idk.b : idk.a;
            if (str == null) {
                str = "";
            }
            map.put(str, idkVar);
            this.e.A(str, z);
        }
    }

    @Override // defpackage.idl
    public final void L(Account account, boolean z) {
        boolean z2 = false;
        if (ad(account) && (!z || Q(account))) {
            z2 = true;
        }
        String str = account != null ? account.name : null;
        synchronized (this.g) {
            Map map = this.j;
            idi idiVar = z2 ? idi.b : idi.a;
            if (str == null) {
                str = "";
            }
            map.put(str, idiVar);
            this.e.t(str, z2);
        }
    }

    @Override // defpackage.idl
    public final void M() {
        String str;
        Account accountC = this.s.c();
        if (accountC != null && this.r && this.q == gph.a) {
            icx icxVar = this.u;
            String str2 = accountC.name;
            str2.getClass();
            idg idgVar = (idg) icxVar;
            ahal.e(idgVar.d, null, 0, new idf(idgVar, str2, ag(), null), 3);
        }
        B("");
        long jC = lwy.c(this.m);
        if (jC == 0) {
            str = "";
        } else {
            str = String.format("%016x", Arrays.copyOf(new Object[]{Long.valueOf(jC)}, 1));
            str.getClass();
        }
        synchronized (this.g) {
            this.w = str;
        }
        icr icrVar = this.t;
        icq icqVar = new icq();
        icqVar.b(icg.i, h());
        icrVar.x(icqVar);
    }

    @Override // defpackage.idl
    public final boolean N(Account account) {
        String str = account != null ? account.name : null;
        SharedPreferences sharedPreferences = this.f;
        if (!sharedPreferences.contains("assistant_settings_initialized")) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return a.b(sharedPreferences, "assistant_settings_initialized").contains(str);
    }

    @Override // defpackage.idl
    public final boolean O(Account account, boolean z) {
        if (!z) {
            return this.f.getBoolean("assistant_setup_for_setup_wizard_ended", false);
        }
        String str = account != null ? account.name : null;
        idu iduVar = this.e;
        if (str == null) {
            str = "";
        }
        return iduVar.f().contains(str);
    }

    @Override // defpackage.idl
    public final boolean P(Account account, boolean z) {
        if (!z) {
            return this.f.getBoolean("assistant_setup_for_setup_wizard_started_once", false);
        }
        String str = account != null ? account.name : null;
        idu iduVar = this.e;
        if (str == null) {
            str = "";
        }
        return iduVar.g().contains(str);
    }

    @Override // defpackage.idl
    public final boolean Q(Account account) {
        boolean z;
        synchronized (this.g) {
            z = d(account) == idh.b;
        }
        return z;
    }

    @Override // defpackage.idl
    public final boolean R(Account account) {
        boolean z;
        synchronized (this.g) {
            Map map = this.j;
            String str = account != null ? account.name : null;
            if (str == null) {
                str = "";
            }
            z = Map.EL.getOrDefault(map, str, idi.a) == idi.b;
        }
        return z;
    }

    @Override // defpackage.idl
    public final boolean S(Account account) {
        boolean zContainsKey;
        String str = account != null ? account.name : null;
        synchronized (this.g) {
            java.util.Map map = this.h;
            if (str == null) {
                str = "";
            }
            zContainsKey = map.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // defpackage.idl
    public final boolean T(Account account) {
        boolean zContainsKey;
        synchronized (this.g) {
            java.util.Map map = this.j;
            String str = account != null ? account.name : null;
            if (str == null) {
                str = "";
            }
            zContainsKey = map.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // defpackage.idl
    public final boolean U() {
        return this.e.D();
    }

    @Override // defpackage.idl
    public final boolean V(Account account, boolean z) {
        account.getClass();
        return !a.b(this.f, true != z ? "assistant_settings_verified_accounts" : "assistant_settings_verified_accounts_v2").contains(account.name);
    }

    @Override // defpackage.idl
    public final boolean W(Account account) {
        String str = account != null ? account.name : null;
        SharedPreferences sharedPreferences = this.f;
        if (!sharedPreferences.contains("personal_results_enabled")) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return a.b(sharedPreferences, "personal_results_enabled").contains(str);
    }

    @Override // defpackage.idl
    public final boolean X() {
        return this.f.contains("personal_results_enabled");
    }

    @Override // defpackage.idl
    public final boolean Y(Account account) {
        String str = account.name;
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferences = this.f;
        return sharedPreferences.contains("personal_results_locked") && a.b(sharedPreferences, "personal_results_locked").contains(str);
    }

    @Override // defpackage.idl
    public final boolean Z(Account account) {
        String str = account != null ? account.name : null;
        SharedPreferences sharedPreferences = this.f;
        if (!sharedPreferences.contains("proactive_results_enabled")) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return a.b(sharedPreferences, "proactive_results_enabled").contains(str);
    }

    @Override // defpackage.idl
    public final int a() {
        return this.f.getInt("temperature_unit", 0);
    }

    @Override // defpackage.idl
    public final boolean aa() {
        return this.f.contains("proactive_results_enabled");
    }

    @Override // defpackage.idl
    public final boolean ab(Account account) {
        String str = account.name;
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferences = this.f;
        return sharedPreferences.contains("proactive_results_locked") && a.b(sharedPreferences, "proactive_results_locked").contains(str);
    }

    @Override // defpackage.idl
    public final boolean ac() {
        return this.f.getBoolean("safe_search_enabled", false);
    }

    @Override // defpackage.idl
    public final boolean ad(Account account) {
        boolean zContainsKey;
        String str = account != null ? account.name : null;
        synchronized (this.g) {
            java.util.Map map = this.i;
            if (str == null) {
                str = "";
            }
            zContainsKey = map.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // defpackage.idl
    public final boolean ae(Account account) {
        boolean z;
        synchronized (this.g) {
            java.util.Map map = this.k;
            String str = account != null ? account.name : null;
            if (str == null) {
                str = "";
            }
            idk idkVar = idk.b;
            z = Map.EL.getOrDefault(map, str, idkVar) == idkVar;
        }
        return z;
    }

    @Override // defpackage.idl
    public final boolean af() {
        return this.f.getBoolean("is_operator_device", false);
    }

    @Override // defpackage.idl
    public final int ag() {
        idu iduVar = this.e;
        if (iduVar.F()) {
            return iduVar.B() ? 2 : 3;
        }
        return 1;
    }

    public final void ah() {
        icq icqVar = new icq();
        idu iduVar = this.e;
        icqVar.c(icg.p, iduVar.j());
        icqVar.c(icg.n, iduVar.h());
        icqVar.c(icg.o, iduVar.i());
        this.t.x(icqVar);
    }

    public final void ai() {
        List listM = m(idj.a);
        List listM2 = m(idj.b);
        List listM3 = m(idj.c);
        ((zdv) l.b().q("com/google/android/apps/tvsearch/settings/preferences/SearchSettingsImpl", "mirrorUdcPermissionStates", 797, "SearchSettingsImpl.kt")).v("Mirroring UDC settings of %d account(s) to :interactor", listM.size() + listM2.size() + listM3.size());
        icq icqVar = new icq();
        icqVar.c(icg.s, listM);
        icqVar.c(icg.r, listM2);
        icqVar.c(icg.q, listM3);
        this.t.x(icqVar);
    }

    @Override // defpackage.idl
    public final Account b() {
        return this.x;
    }

    @Override // defpackage.idl
    public final Account c() {
        synchronized (this.g) {
            gtu gtuVar = this.s;
            List listN = gtuVar.n();
            if (listN.isEmpty()) {
                ((zdv) l.b().q("com/google/android/apps/tvsearch/settings/preferences/SearchSettingsImpl", "processAccountRelatedSettings", 319, "SearchSettingsImpl.kt")).u("No adult account available, setting search account to null.");
                ahal.e(this.o, null, 0, new idq(this, null), 3);
                return null;
            }
            agwh agwhVar = new agwh();
            agwhVar.a = gtuVar.c();
            Object obj = agwhVar.a;
            boolean z = true;
            boolean z2 = obj != null && listN.contains(obj);
            Object obj2 = agwhVar.a;
            if (obj2 == null || !gtuVar.r((Account) obj2)) {
                z = false;
            }
            zdy zdyVar = l;
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/settings/preferences/SearchSettingsImpl", "processAccountRelatedSettings", 331, "SearchSettingsImpl.kt")).H("is Kid account=%b Account in settings exists? %b", z, z2);
            if (!z2 && !z) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/settings/preferences/SearchSettingsImpl", "processAccountRelatedSettings", 333, "SearchSettingsImpl.kt")).u("Setting new SearchAccount");
                agwhVar.a = listN.get(0);
                ahal.e(this.o, null, 0, new idr(this, agwhVar, null), 3);
            }
            return (Account) agwhVar.a;
        }
    }

    @Override // defpackage.idl
    public final idh d(Account account) {
        idh idhVar;
        String str = account != null ? account.name : null;
        synchronized (this.g) {
            java.util.Map map = this.h;
            idh idhVar2 = idh.a;
            if (str == null) {
                str = "";
            }
            idhVar = (idh) Map.EL.getOrDefault(map, str, idhVar2);
        }
        return idhVar;
    }

    @Override // defpackage.idl
    public final idj e(Account account) {
        idj idjVar;
        String str = account != null ? account.name : null;
        synchronized (this.g) {
            java.util.Map map = this.i;
            if (str == null) {
                str = "";
            }
            idjVar = (idj) map.get(str);
            if (idjVar == null) {
                idjVar = idj.a;
            }
        }
        return idjVar;
    }

    @Override // defpackage.idl
    public final Boolean f() {
        SharedPreferences sharedPreferences = this.f;
        if (sharedPreferences.contains("promo_emails_opted_in")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("promo_emails_opted_in", false));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0168, code lost:
    
        if (r0.g("", r4) == r5) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016b  */
    @Override // defpackage.idl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(android.accounts.Account r19, boolean r20, defpackage.agsw r21) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idt.g(android.accounts.Account, boolean, agsw):java.lang.Object");
    }

    @Override // defpackage.idl
    public final String h() {
        String str;
        synchronized (this.g) {
            str = this.w;
        }
        return str;
    }

    @Override // defpackage.idl
    public final String i() {
        String string = this.f.getString("assistant_settings_device_name", "");
        return string == null ? "" : string;
    }

    @Override // defpackage.idl
    public final String j() {
        return this.e.b();
    }

    @Override // defpackage.idl
    public final String k() {
        String string;
        synchronized (this.g) {
            string = this.f.getString("parental_auth_status", null);
        }
        return string;
    }

    @Override // defpackage.idl
    public final List l(idh idhVar) {
        List listX;
        idhVar.getClass();
        synchronized (this.g) {
            Set setEntrySet = this.h.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((Map.Entry) obj).getValue() == idhVar) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it.next()).getKey());
            }
            listX = agqq.x(arrayList2);
        }
        return listX;
    }

    @Override // defpackage.idl
    public final List m(idj idjVar) {
        List listX;
        idjVar.getClass();
        synchronized (this.g) {
            Set setEntrySet = this.i.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((Map.Entry) obj).getValue() == idjVar) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it.next()).getKey());
            }
            listX = agqq.x(arrayList2);
        }
        return listX;
    }

    @Override // defpackage.idl
    public final void n(Account account) {
        String str = account != null ? account.name : null;
        synchronized (this.g) {
            java.util.Map map = this.h;
            if (str == null) {
                str = "";
            }
            map.remove(str);
            this.e.o(str);
            ah();
        }
    }

    @Override // defpackage.idl
    public final void o() {
        this.f.edit().remove("assistant_settings_verified_accounts_v2").apply();
    }

    @Override // defpackage.idl
    public final void p(Account account) {
        String str = account != null ? account.name : null;
        idu iduVar = this.e;
        if (str == null) {
            str = "";
        }
        iduVar.p(str);
    }

    @Override // defpackage.idl
    public final void q(Account account) {
        if (account != null) {
            idu iduVar = this.e;
            String str = account.name;
            str.getClass();
            iduVar.s(str);
        }
    }

    @Override // defpackage.idl
    public final void r(Account account) {
        this.x = account;
    }

    @Override // defpackage.idl
    public final void s(String str) {
        str.getClass();
        this.f.edit().putString("assistant_settings_device_name", str).apply();
    }

    @Override // defpackage.idl
    public final void t(Account account, boolean z) {
        String str = account != null ? account.name : null;
        ((zdv) l.b().q("com/google/android/apps/tvsearch/settings/preferences/SearchSettingsImpl", "setAssistantSettingsInitialized", 554, "SearchSettingsImpl.kt")).x("setAssistantSettingsInitialized %s for account", Boolean.valueOf(z));
        SharedPreferences sharedPreferences = this.f;
        Set setA = a.a(sharedPreferences, "assistant_settings_initialized");
        if (str == null) {
            str = "";
        }
        if (z) {
            setA.add(str);
        } else {
            setA.remove(str);
        }
        sharedPreferences.edit().putStringSet("assistant_settings_initialized", setA).apply();
    }

    @Override // defpackage.idl
    public final void u(Account account, boolean z) {
        account.getClass();
        String str = account.name;
        str.getClass();
        ido idoVar = a;
        String str2 = true != z ? "assistant_settings_verified_accounts" : "assistant_settings_verified_accounts_v2";
        SharedPreferences sharedPreferences = this.f;
        Set setA = idoVar.a(sharedPreferences, str2);
        if (setA.contains(str)) {
            return;
        }
        setA.add(str);
        sharedPreferences.edit().putStringSet(true == z ? "assistant_settings_verified_accounts_v2" : "assistant_settings_verified_accounts", setA).apply();
    }

    @Override // defpackage.idl
    public final void v(Account account, boolean z) {
        if (!z) {
            this.f.edit().putBoolean("assistant_setup_for_setup_wizard_ended", true).apply();
            return;
        }
        String str = account != null ? account.name : null;
        idu iduVar = this.e;
        if (str == null) {
            str = "";
        }
        iduVar.u(str);
    }

    @Override // defpackage.idl
    public final void w(Account account, boolean z) {
        if (!z) {
            this.f.edit().putBoolean("assistant_setup_for_setup_wizard_started_once", true).apply();
            return;
        }
        String str = account != null ? account.name : null;
        idu iduVar = this.e;
        if (str == null) {
            str = "";
        }
        iduVar.v(str);
    }

    @Override // defpackage.idl
    public final void x(Account account, idh idhVar) {
        idhVar.getClass();
        String str = account != null ? account.name : null;
        synchronized (this.g) {
            java.util.Map map = this.h;
            if (str == null) {
                str = "";
            }
            map.put(str, idhVar);
            idu iduVar = this.e;
            iduVar.o(str);
            ah();
            iduVar.w(str, idhVar);
            ah();
        }
    }

    @Override // defpackage.idl
    public final void y(boolean z) {
        this.u.b(z);
        ahal.e(this.o, null, 0, new ids(this, z, null), 3);
    }

    @Override // defpackage.idl
    public final void z(Instant instant) {
        this.e.y(instant);
    }
}
