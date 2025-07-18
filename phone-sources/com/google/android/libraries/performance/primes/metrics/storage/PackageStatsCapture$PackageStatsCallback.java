package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import defpackage.rnb;
import defpackage.rua;
import defpackage.tug;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    public final Semaphore a = new Semaphore(1);
    public volatile PackageStats b;

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            int i = rua.b;
            ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 50, "PackageStatsCapture.java")).v("Success getting PackageStats: %s", packageStats);
            this.b = packageStats;
        } else {
            int i2 = rua.b;
            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 53, "PackageStatsCapture.java")).s("Failure getting PackageStats");
        }
        this.a.release();
    }
}
