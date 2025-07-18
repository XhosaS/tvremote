package defpackage;

import android.os.Build;
import android.view.FrameMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aws {
    long a;

    static boolean b() {
        return Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 30;
    }

    public long a(FrameMetrics frameMetrics, long j) {
        long metric = frameMetrics.getMetric(10);
        long metric2 = frameMetrics.getMetric(8);
        long j2 = metric + metric2;
        long jMax = Math.max(this.a + j, metric + j);
        this.a = jMax;
        long j3 = jMax - metric;
        if (j2 >= jMax && metric2 >= j) {
            this.a = (j2 - ((j2 - frameMetrics.getMetric(11)) % j)) + j;
        }
        return j3;
    }
}
