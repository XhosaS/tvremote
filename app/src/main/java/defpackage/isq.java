package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isq implements ism {
    private final PackageManager a;
    private final String b = "action.devices.traits.AppSelector";

    public isq(PackageManager packageManager) {
        this.a = packageManager;
    }

    private final abau d(String str) throws PackageManager.NameNotFoundException {
        abau abauVar = new abau();
        abauVar.l("key", str);
        abaq abaqVar = new abaq();
        try {
            PackageManager packageManager = this.a;
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 128);
            abauVar.l("version_code", String.valueOf(packageInfo.getLongVersionCode()));
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                return null;
            }
            Resources resourcesForApplication = packageManager.getResourcesForApplication(str);
            resourcesForApplication.getClass();
            try {
                abaqVar.d(resourcesForApplication.getString(applicationInfo.labelRes));
            } catch (Resources.NotFoundException unused) {
                int i = applicationInfo.labelRes;
            }
            abaqVar.d(this.a.getApplicationLabel(applicationInfo).toString());
            abau abauVar2 = new abau();
            abauVar2.k("name_synonym", abaqVar);
            abauVar2.l("lang", Locale.getDefault().getLanguage());
            abaq abaqVar2 = new abaq();
            abaqVar2.a.add(abauVar2);
            abauVar.k("names", abaqVar2);
            return abauVar;
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    @Override // defpackage.ism
    public final Object a(agsw agswVar) throws PackageManager.NameNotFoundException {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LEANBACK_LAUNCHER");
        PackageManager packageManager = this.a;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        abaq abaqVar = new abaq();
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            String installerPackageName = packageManager.getInstallerPackageName(str);
            if (installerPackageName != null && installerPackageName.length() != 0) {
                str.getClass();
                abau abauVarD = d(str);
                if (abauVarD != null) {
                    abaqVar.a.add(abauVarD);
                }
            }
        }
        abau abauVarD2 = d("com.google.android.katniss");
        if (abauVarD2 != null) {
            abaqVar.a.add(abauVarD2);
        }
        return agrj.c(new agpi("availableApplications", abaqVar));
    }

    @Override // defpackage.ism
    public final String b() {
        return this.b;
    }

    @Override // defpackage.ism
    public final boolean c() {
        return true;
    }
}
