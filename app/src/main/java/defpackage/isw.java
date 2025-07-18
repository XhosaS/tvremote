package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isw implements ism {
    private final PackageManager a;
    private final String b = "action.devices.traits.MediaInitiation";

    public isw(PackageManager packageManager) {
        this.a = packageManager;
    }

    @Override // defpackage.ism
    public final Object a(agsw agswVar) {
        abaq abaqVar = new abaq();
        abaqVar.d("TVEpisode");
        abaqVar.d("TVSeries");
        abaqVar.d("Movie");
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LEANBACK_LAUNCHER");
        PackageManager packageManager = this.a;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        abaq abaqVar2 = new abaq();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            String installerPackageName = packageManager.getInstallerPackageName(resolveInfo.activityInfo.packageName);
            if (installerPackageName != null && installerPackageName.length() != 0) {
                abaqVar2.d(resolveInfo.activityInfo.packageName);
            }
        }
        return agrj.d(new agpi("supportedMediaTypes", abaqVar), new agpi("mediaInitiationAvailableAndroidPackages", abaqVar2), new agpi("mediaInitiationByDescription", new abax((Object) false)), new agpi("mediaInitiationBySources", new abax((Object) true)));
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
