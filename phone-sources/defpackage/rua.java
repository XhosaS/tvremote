package defpackage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import com.google.android.libraries.performance.primes.metrics.storage.PackageStatsCapture$PackageStatsCallback;
import java.lang.reflect.Modifier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rua {
    static final rzy[] a = {new rzy("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}, (char[]) null), new rzy("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}, (char[]) null), new rzy("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}, (char[]) null)};
    public static final /* synthetic */ int b = 0;

    public static boolean a() {
        try {
            return !Modifier.isAbstract(PackageStatsCapture$PackageStatsCallback.class.getMethod("onGetStatsCompleted", PackageStats.class, Boolean.TYPE).getModifiers());
        } catch (Error | Exception e) {
            ((tug) ((tug) ((tug) rnb.a.b()).i(e)).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "isCallbackPresent", (char) 155, "PackageStatsCapture.java")).s("failure");
            return false;
        }
    }
}
