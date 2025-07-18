package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.time.Instant;
import j$.util.Map;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idv implements idu {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/settings/preferences/SearchSharedPreferencesImpl");
    private final icr b;
    private final ztw c;
    private final SharedPreferences d;

    public idv(Context context, icr icrVar, ztw ztwVar) {
        context.getClass();
        icrVar.getClass();
        ztwVar.getClass();
        this.b = icrVar;
        this.c = ztwVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.katniss.setting", 0);
        sharedPreferences.getClass();
        this.d = sharedPreferences;
    }

    @Override // defpackage.idu
    public final void A(String str, boolean z) {
        Set<String> setZ = agqq.z(l());
        Set<String> setZ2 = agqq.z(k());
        if (z) {
            setZ.add(str);
            setZ2.remove(str);
        } else {
            setZ.remove(str);
            setZ2.add(str);
        }
        this.d.edit().putStringSet("voice_input_enabled_accounts", setZ).putStringSet("voice_input_disabled_accounts", setZ2).apply();
        icr icrVar = this.b;
        icq icqVar = new icq();
        icqVar.c(icg.t, k());
        icqVar.c(icg.u, l());
        icrVar.x(icqVar);
    }

    @Override // defpackage.idu
    public final boolean B() {
        return this.d.getBoolean("hotowrd_accepted_by_user", false);
    }

    @Override // defpackage.idu
    public final boolean C() {
        return this.d.getBoolean("hotword_content_provider_migrated", false);
    }

    @Override // defpackage.idu
    public final boolean D() {
        Instant instantA = this.c.a();
        Instant instant = Instant.EPOCH;
        instant.getClass();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(this.d.getLong("intent_logger_expiry", instant.toEpochMilli()));
        instantOfEpochMilli.getClass();
        return instantA.compareTo(instantOfEpochMilli) < 0;
    }

    @Override // defpackage.idu
    public final boolean E() {
        return this.d.getBoolean("neutral_setup", false);
    }

    @Override // defpackage.idu
    public final boolean F() {
        return this.d.contains("hotowrd_accepted_by_user");
    }

    @Override // defpackage.idu
    public final void G() {
        this.d.edit().putBoolean("hotword_content_provider_migrated", true).apply();
    }

    @Override // defpackage.idu
    public final SharedPreferences a() {
        return this.d;
    }

    @Override // defpackage.idu
    public final String b() {
        String string = this.d.getString("netflix_dsc_denied_count", new JSONObject().toString());
        return string == null ? "" : string;
    }

    @Override // defpackage.idu
    public final Set c() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("3p_disclosure_acked", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final Set d() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("assistant_disabled_accounts", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final Set e() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("assistant_enabled_accounts", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final Set f() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("setup_for_setup_wizard_ended_accounts", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final Set g() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("setup_for_setup_wizard_started_once_accounts", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final Set h() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("dsc_denied_accounts", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final Set i() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("dsc_denied_in_OOBE_accounts", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final Set j() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("dsc_granted_accounts", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final Set k() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("voice_input_disabled_accounts", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final Set l() {
        SharedPreferences sharedPreferences = this.d;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet("voice_input_enabled_accounts", agrfVar);
        Set setA = stringSet != null ? agqq.A(stringSet) : null;
        return setA == null ? agrfVar : setA;
    }

    @Override // defpackage.idu
    public final void m(String str) {
        this.d.edit().putStringSet("setup_for_setup_wizard_ended_accounts", agrp.b(f(), str)).apply();
    }

    @Override // defpackage.idu
    public final void n(String str) {
        this.d.edit().putStringSet("setup_for_setup_wizard_started_once_accounts", agrp.b(g(), str)).apply();
    }

    @Override // defpackage.idu
    public final void o(String str) {
        Set<String> setB = agrp.b(j(), str);
        Set<String> setB2 = agrp.b(h(), str);
        this.d.edit().putStringSet("dsc_granted_accounts", setB).putStringSet("dsc_denied_accounts", setB2).putStringSet("dsc_denied_in_OOBE_accounts", agrp.b(i(), str)).apply();
    }

    @Override // defpackage.idu
    public final void p(String str) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = new JSONObject().toString();
        SharedPreferences sharedPreferences = this.d;
        String string2 = sharedPreferences.getString("netflix_dsc_denied_count", string);
        if (string2 == null) {
            string2 = "";
        }
        try {
            JSONObject jSONObject = new JSONObject(string2);
            Iterator<String> itKeys = jSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                obj.getClass();
                Integer num = (Integer) obj;
                num.intValue();
                linkedHashMap.put(next, num);
            }
            linkedHashMap.put(str, Integer.valueOf(((Number) Map.EL.getOrDefault(linkedHashMap, str, 0)).intValue() + 1));
            String string3 = new JSONObject(linkedHashMap).toString();
            string3.getClass();
            sharedPreferences.edit().putString("netflix_dsc_denied_count", string3).apply();
            icr icrVar = this.b;
            icq icqVar = new icq();
            icqVar.b(icg.j, b());
            icrVar.x(icqVar);
        } catch (Exception e) {
            ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/settings/preferences/SearchSharedPreferencesImpl", "increaseNetflixDscDeniedCount", 183, "SearchSharedPreferencesImpl.kt")).u("Failed to increase Netflix DSC denied count.");
        }
    }

    @Override // defpackage.idu
    public final void q() {
        icq icqVar = new icq();
        icqVar.c(icg.k, c());
        this.b.x(icqVar);
    }

    @Override // defpackage.idu
    public final void r() {
        this.d.edit().remove("hotowrd_accepted_by_user").apply();
        icq icqVar = new icq();
        icqVar.a(icg.d, false);
        this.b.x(icqVar);
    }

    @Override // defpackage.idu
    public final void s(String str) {
        SharedPreferences sharedPreferences = this.d;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Set<String> setSingleton = Collections.singleton(str);
        setSingleton.getClass();
        editorEdit.putStringSet("3p_disclosure_acked", sharedPreferences.getStringSet("3p_disclosure_acked", setSingleton)).apply();
        q();
    }

    @Override // defpackage.idu
    public final void t(String str, boolean z) {
        Set<String> setZ = agqq.z(e());
        Set<String> setZ2 = agqq.z(d());
        if (z) {
            setZ.add(str);
            setZ2.remove(str);
        } else {
            setZ.remove(str);
            setZ2.add(str);
        }
        this.d.edit().putStringSet("assistant_enabled_accounts", setZ).putStringSet("assistant_disabled_accounts", setZ2).apply();
        icr icrVar = this.b;
        icq icqVar = new icq();
        icqVar.c(icg.l, d());
        icqVar.c(icg.m, e());
        icrVar.x(icqVar);
    }

    @Override // defpackage.idu
    public final void u(String str) {
        this.d.edit().putStringSet("setup_for_setup_wizard_ended_accounts", agrp.c(f(), str)).apply();
    }

    @Override // defpackage.idu
    public final void v(String str) {
        this.d.edit().putStringSet("setup_for_setup_wizard_started_once_accounts", agrp.c(g(), str)).apply();
    }

    @Override // defpackage.idu
    public final void w(String str, idh idhVar) {
        Set<String> setZ = agqq.z(j());
        Set<String> setZ2 = agqq.z(h());
        Set<String> setZ3 = agqq.z(i());
        int iOrdinal = idhVar.ordinal();
        if (iOrdinal == 1) {
            setZ.add(str);
        } else if (iOrdinal == 2) {
            setZ2.add(str);
        } else if (iOrdinal == 3) {
            setZ3.add(str);
        }
        this.d.edit().putStringSet("dsc_granted_accounts", setZ).putStringSet("dsc_denied_accounts", setZ2).putStringSet("dsc_denied_in_OOBE_accounts", setZ3).apply();
    }

    @Override // defpackage.idu
    public final void x(boolean z) {
        this.d.edit().putBoolean("hotowrd_accepted_by_user", z).apply();
        icq icqVar = new icq();
        icqVar.a(icg.d, true);
        icqVar.a(icg.c, z);
        this.b.x(icqVar);
    }

    @Override // defpackage.idu
    public final void y(Instant instant) {
        this.d.edit().putLong("intent_logger_expiry", instant.toEpochMilli()).apply();
        icq icqVar = new icq();
        icqVar.a(icg.e, D());
        this.b.x(icqVar);
    }

    @Override // defpackage.idu
    public final void z(boolean z) {
        this.d.edit().putBoolean("neutral_setup", z).apply();
    }
}
