package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awg implements Window$OnFrameMetricsAvailableListener {
    public static final /* synthetic */ int a = 0;
    private boolean b;
    private long c;
    private aws d;
    private final ArrayMap e;
    private final byo f;
    private final crv g;

    public awg(Context context, ArrayMap arrayMap, crv crvVar) {
        this.f = bit.k(new asf(context, 8));
        this.e = arrayMap;
        this.g = crvVar;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        int i2;
        long j;
        char c;
        int i3;
        int i4 = 1;
        if (!this.b) {
            this.b = true;
            this.d = aws.b() ? new aws() : null;
            crv crvVar = this.g;
            if (crvVar.a() == null || !((Boolean) crvVar.a()).booleanValue()) {
                this.c = ((Long) this.f.aL()).longValue();
            } else {
                this.c = (long) (1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate());
            }
        }
        if (frameMetrics.getMetric(9) == 1) {
            aws awsVar = this.d;
            if (awsVar != null) {
                awsVar.a(frameMetrics, this.c);
                return;
            }
            return;
        }
        long metric = frameMetrics.getMetric(8);
        aws awsVar2 = this.d;
        long jA = awsVar2 != null ? awsVar2.a(frameMetrics, this.c) : this.c;
        long metric2 = frameMetrics.getMetric(13);
        ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i5 = 0;
            while (i5 < size) {
                awj awjVar = (awj) arrayMap.valueAt(i5);
                int i6 = i5;
                int i7 = (int) (metric / 1000000);
                int i8 = i4;
                if (i7 < 0) {
                    ((cbs) aqn.a.d().j("com/google/android/libraries/performance/primes/metrics/jank/FrameTimeHistogram", "addFrame", 104, "FrameTimeHistogram.java")).s("Invalid frame time: %d", metric);
                    awjVar.i += i8;
                    j = metric;
                    i2 = i8;
                    c = '\b';
                } else {
                    awjVar.h += i8;
                    if (awjVar.o) {
                        awjVar.q.add(Long.valueOf(metric));
                        awjVar.p.add(Long.valueOf(metric2));
                    }
                    i2 = i8;
                    if (metric2 > 0) {
                        j = metric;
                        int i9 = (int) ((metric - metric2) / 1000000);
                        if (awjVar.n < i9) {
                            awjVar.n = i9;
                        }
                        int[] iArr = awjVar.e;
                        int i10 = i9 < 20 ? i9 >= -20 ? ((i9 + 20) >> 1) + 12 : i9 >= -30 ? ((i9 + 30) / 5) + 10 : i9 >= -100 ? ((i9 + 100) / 10) + 3 : i9 >= -200 ? ((i9 + 200) / 50) + 1 : 0 : i9 < 30 ? ((i9 - 20) / 5) + 32 : i9 < 100 ? ((i9 - 30) / 10) + 34 : i9 < 200 ? ((i9 - 50) / 100) + 41 : i9 < 1000 ? ((i9 - 200) / 100) + 43 : 51;
                        iArr[i10] = iArr[i10] + 1;
                        if (j > metric2) {
                            awjVar.f++;
                            awjVar.k += i7;
                        }
                        if (j > jA) {
                            awjVar.g++;
                            awjVar.l += i7;
                        }
                    } else {
                        j = metric;
                        if (j > jA) {
                            awjVar.f++;
                            awjVar.k += i7;
                        }
                    }
                    int[] iArr2 = awjVar.d;
                    if (i7 <= 20) {
                        c = '\b';
                        i3 = i7 >= 8 ? (i7 >> 1) - 2 : i7 / 4;
                    } else {
                        c = '\b';
                        i3 = i7 <= 30 ? (i7 / 5) + 4 : i7 <= 100 ? (i7 / 10) + 7 : i7 <= 200 ? (i7 / 50) + 15 : i7 <= 1000 ? (i7 / 100) + 17 : i7 < 5000 ? 27 : 28;
                    }
                    iArr2[i3] = iArr2[i3] + 1;
                    awjVar.i += i;
                    if (awjVar.j < i7) {
                        awjVar.j = i7;
                    }
                    awjVar.m += i7;
                }
                i5 = i6 + 1;
                i4 = i2;
                metric = j;
            }
        }
    }
}
