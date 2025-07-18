package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fec implements gyi {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/common/environment/EnvironmentTask");
    private final PackageManager b;
    private final gyx c = gyx.l;
    private final Set d = hag.a;
    private final Set e = agrf.a;

    public fec(PackageManager packageManager) {
        this.b = packageManager;
    }

    @Override // defpackage.gzc
    public final int a() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = this.b.getPackageInfo("com.google.android.katniss", 128);
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/common/environment/EnvironmentTask", "run", 48, "EnvironmentTask.kt")).E("Katniss version: %s : %s", packageInfo.versionName, packageInfo.getLongVersionCode());
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/common/environment/EnvironmentTask", "run", 51, "EnvironmentTask.kt")).u("This is a RELEASE build.");
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
