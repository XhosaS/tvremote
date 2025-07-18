package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import defpackage.aqn;
import defpackage.aya;
import defpackage.cbs;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    public final Semaphore a = new Semaphore(1);
    public volatile PackageStats b;

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            int i = aya.b;
            ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 50, "PackageStatsCapture.java")).t("Success getting PackageStats: %s", packageStats);
            this.b = packageStats;
        } else {
            int i2 = aya.b;
            ((cbs) aqn.a.g().j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 53, "PackageStatsCapture.java")).p("Failure getting PackageStats");
        }
        this.a.release();
    }
}
