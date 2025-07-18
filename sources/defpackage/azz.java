package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class azz implements byo {
    private final /* synthetic */ int a;

    public /* synthetic */ azz(int i) {
        this.a = i;
    }

    @Override // defpackage.byo
    public final Object aL() {
        int i = this.a;
        if (i == 0) {
            byo byoVar = ClearcutMetricSnapshotTransmitter.a;
            return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : Build.VERSION.SDK_INT < 29 ? ActivityManager.isRunningInTestHarness() : ActivityManager.isRunningInUserTestHarness());
        }
        if (i == 1) {
            return axq.a();
        }
        if (i == 2) {
            return new cxt();
        }
        int i2 = 0;
        if (i == 3) {
            Object obj = bav.a;
            return qm.D(Executors.newSingleThreadScheduledExecutor(new bas(i2)));
        }
        if (i != 4) {
            throw new IllegalStateException();
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
        } catch (RuntimeException e) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
        }
        boolean z = runningAppProcessInfo.importance >= 400;
        return Boolean.valueOf(z);
    }
}
