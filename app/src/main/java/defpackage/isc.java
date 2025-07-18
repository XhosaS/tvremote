package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isc implements isp {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/smarthome/executors/AppSelectorExecutor");
    private final exl b;
    private final gtu c;
    private final PackageManager d;
    private final irr e;
    private final Set f;

    public isc(exl exlVar, gtu gtuVar, PackageManager packageManager, irr irrVar) {
        gtuVar.getClass();
        this.b = exlVar;
        this.c = gtuVar;
        this.d = packageManager;
        this.e = irrVar;
        Set setSingleton = Collections.singleton("action.devices.commands.appSelect");
        setSingleton.getClass();
        this.f = setSingleton;
    }

    @Override // defpackage.isp
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.isp
    public final boolean b(String str, abau abauVar) {
        if (!agvy.c("action.devices.commands.appSelect", str)) {
            throw new IllegalArgumentException("Unsupported command: ".concat(str));
        }
        if (abauVar.g("newApplication") == null) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/smarthome/executors/AppSelectorExecutor", "execute", 34, "AppSelectorExecutor.kt")).u("No PARAM_APP is found");
            return false;
        }
        String strC = abauVar.j("newApplication").c();
        PackageManager packageManager = this.d;
        Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(strC);
        if (leanbackLaunchIntentForPackage == null) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/smarthome/executors/AppSelectorExecutor", "execute", 42, "AppSelectorExecutor.kt")).x("No leanback launch intent found for '%s'", strC);
            leanbackLaunchIntentForPackage = packageManager.getLaunchIntentForPackage(strC);
        }
        Intent intent = leanbackLaunchIntentForPackage;
        if (intent == null) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/smarthome/executors/AppSelectorExecutor", "execute", 46, "AppSelectorExecutor.kt")).x("Unable to get launch intent for '%s'", strC);
            return false;
        }
        gtu gtuVar = this.c;
        if (gtuVar.d() != fwx.PROFILE_LOCK_LOCKED) {
            intent.addFlags(268435456);
            this.e.b();
            this.b.b(intent, exj.b, exk.a, 2, null);
            return true;
        }
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/smarthome/executors/AppSelectorExecutor", "execute", 52, "AppSelectorExecutor.kt")).u("Unable to open app since profile is locked.");
        this.e.b();
        exl exlVar = this.b;
        Intent intent2 = new Intent("android.apps.tv.launcherx.PROFILE_LOCK_REAUTH");
        intent2.setPackage("com.google.android.apps.tv.launcherx");
        Account accountC = gtuVar.c();
        if (accountC != null) {
            intent2.putExtra("account_name_extra", accountC.name);
        }
        if (!exlVar.c(intent2, exj.b, exk.a, 2)) {
            ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/smarthome/executors/AppSelectorExecutor", "execute", 69, "AppSelectorExecutor.kt")).u("Unable to start LauncherX profile lock reauth.");
        }
        return false;
    }
}
