package defpackage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import com.google.android.libraries.performance.primes.metrics.storage.PackageStatsCapture$PackageStatsCallback;
import java.lang.reflect.Modifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aya {
    static final awy[] a = {new awy("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new awy("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new awy("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};
    public static final /* synthetic */ int b = 0;

    public static boolean a() {
        try {
            return !Modifier.isAbstract(PackageStatsCapture$PackageStatsCallback.class.getMethod("onGetStatsCompleted", PackageStats.class, Boolean.TYPE).getModifiers());
        } catch (Error | Exception e) {
            ((cbs) ((cbs) aqn.a.b().i(e)).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "isCallbackPresent", 155, "PackageStatsCapture.java")).p("failure");
            return false;
        }
    }
}
