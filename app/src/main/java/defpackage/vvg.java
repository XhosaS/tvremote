package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vvg {
    public static cai a(Context context, final vum vumVar, zyh zyhVar, agte agteVar, vrm vrmVar, ccz cczVar) {
        cai caiVar = new cai();
        zyhVar.getClass();
        caiVar.a = zyhVar;
        caiVar.e = new vun(vrmVar);
        zyhVar.getClass();
        caiVar.d = zyhVar;
        agteVar.getClass();
        caiVar.b = agteVar;
        cczVar.getClass();
        caiVar.c = cczVar;
        final String packageName = context.getPackageName();
        ((zdv) ((zdv) vum.a.b()).q("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateAsynchronouslyAndMaybeCrash", 68, "DefaultProcessValidator.java")).u("Validating WorkManager process");
        vumVar.d.f(zxn.j(wyo.h(new Runnable() { // from class: vul
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                vum vumVar2 = vumVar;
                String str = packageName;
                try {
                    ServiceInfo serviceInfo = vumVar2.e.getServiceInfo(new ComponentName(vumVar2.b, "androidx.work.impl.background.systemjob.SystemJobService"), 0);
                    boolean zEquals = Objects.equals(serviceInfo.processName, str);
                    ((zdv) ((zdv) vum.a.b()).q("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 97, "DefaultProcessValidator.java")).J("Processes: %s, %s, %s, %s", vumVar2.f, Boolean.valueOf(zEquals), serviceInfo.processName, str);
                    if (zEquals) {
                        return;
                    }
                    int iOrdinal = vumVar2.f.ordinal();
                    if (iOrdinal == 1) {
                        ((zdv) ((zdv) vum.a.c()).q("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 123, "DefaultProcessValidator.java")).F("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", str, serviceInfo.processName);
                    } else {
                        if (iOrdinal != 2) {
                            return;
                        }
                        ((zdv) ((zdv) vum.a.d()).q("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 119, "DefaultProcessValidator.java")).u("Invalid process");
                        throw new IllegalStateException(String.format("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", str, serviceInfo.processName));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((zdv) ((zdv) ((zdv) vum.a.d()).p(e)).q("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'j', "DefaultProcessValidator.java")).u("The WorkManager SystemJobService could not be found. If you are trying to disable WorkManager, make sure not to initialize it.");
                } catch (RuntimeException e2) {
                    ((zdv) ((zdv) ((zdv) vum.a.d()).p(e2)).q("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'p', "DefaultProcessValidator.java")).u("Failed to look up WorkManager manifest process");
                }
            }
        }), vumVar.c), 1L, TimeUnit.MINUTES);
        return caiVar;
    }
}
