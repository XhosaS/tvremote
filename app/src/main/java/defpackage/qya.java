package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qya implements Window$OnFrameMetricsAvailableListener {
    public static final /* synthetic */ int a = 0;
    private boolean b;
    private long c;
    private qyi d;
    private final ArrayMap e;
    private final yrp f;
    private final agow g;

    public qya(final Context context, ArrayMap arrayMap, agow agowVar) {
        this.f = yru.a(new yrp() { // from class: qxz
            @Override // defpackage.yrp
            public final Object eV() {
                int i = qya.a;
                long jCeil = qxw.a;
                Context context2 = context;
                if (jCeil == 0) {
                    synchronized (qxw.class) {
                        jCeil = qxw.a;
                        if (jCeil == 0) {
                            float f = 60.0f;
                            float fFloatValue = ((Float) qxw.a(context2).e(Float.valueOf(60.0f))).floatValue();
                            if (fFloatValue >= 1.0f) {
                                f = fFloatValue;
                            }
                            jCeil = (long) Math.ceil(1.0E9d / f);
                            qxw.a = jCeil;
                        }
                    }
                }
                return Long.valueOf(jCeil);
            }
        });
        this.e = arrayMap;
        this.g = agowVar;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long j;
        char c;
        int i2;
        boolean z = true;
        if (!this.b) {
            this.b = true;
            this.d = Build.VERSION.SDK_INT <= 30 ? new qyi() : null;
            agow agowVar = this.g;
            if (agowVar.a() == null || !((Boolean) agowVar.a()).booleanValue()) {
                this.c = ((Long) this.f.eV()).longValue();
            } else {
                this.c = (long) (1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate());
            }
        }
        if (frameMetrics.getMetric(9) == 1) {
            qyi qyiVar = this.d;
            if (qyiVar != null) {
                qyiVar.a(frameMetrics, this.c);
                return;
            }
            return;
        }
        char c2 = '\b';
        long metric = frameMetrics.getMetric(8);
        qyi qyiVar2 = this.d;
        long jA = qyiVar2 != null ? qyiVar2.a(frameMetrics, this.c) : this.c;
        long metric2 = frameMetrics.getMetric(13);
        ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i3 = 0;
            while (i3 < size) {
                qyc qycVar = (qyc) arrayMap.valueAt(i3);
                boolean z2 = z;
                long j2 = metric;
                int i4 = (int) (j2 / 1000000);
                if (i4 < 0) {
                    qycVar.i++;
                    c = c2;
                    j = jA;
                } else {
                    qycVar.h++;
                    boolean z3 = qycVar.o;
                    if (metric2 > 0) {
                        j = jA;
                        int i5 = (int) ((j2 - metric2) / 1000000);
                        if (qycVar.n < i5) {
                            qycVar.n = i5;
                        }
                        int[] iArr = qycVar.e;
                        int i6 = i5 < 20 ? i5 >= -20 ? ((i5 + 20) >> 1) + 12 : i5 >= -30 ? ((i5 + 30) / 5) + 10 : i5 >= -100 ? ((i5 + 100) / 10) + 3 : i5 >= -200 ? ((i5 + 200) / 50) + 1 : 0 : i5 < 30 ? ((i5 - 20) / 5) + 32 : i5 < 100 ? ((i5 - 30) / 10) + 34 : i5 < 200 ? ((i5 - 50) / 100) + 41 : i5 < 1000 ? ((i5 - 200) / 100) + 43 : 51;
                        iArr[i6] = iArr[i6] + 1;
                        if (j2 > metric2) {
                            qycVar.f++;
                            qycVar.k += i4;
                        }
                        if (j2 > j) {
                            qycVar.g++;
                            qycVar.l += i4;
                        }
                    } else {
                        j = jA;
                        if (j2 > j) {
                            qycVar.f++;
                            qycVar.k += i4;
                        }
                    }
                    int[] iArr2 = qycVar.d;
                    if (i4 <= 20) {
                        c = '\b';
                        i2 = i4 >= 8 ? (i4 >> 1) - 2 : i4 / 4;
                    } else {
                        c = '\b';
                        i2 = i4 <= 30 ? (i4 / 5) + 4 : i4 <= 100 ? (i4 / 10) + 7 : i4 <= 200 ? (i4 / 50) + 15 : i4 <= 1000 ? (i4 / 100) + 17 : i4 < 5000 ? 27 : 28;
                    }
                    iArr2[i2] = iArr2[i2] + 1;
                    qycVar.i += i;
                    if (qycVar.j < i4) {
                        qycVar.j = i4;
                    }
                    qycVar.m += i4;
                }
                i3++;
                c2 = c;
                z = z2;
                metric = j2;
                jA = j;
            }
        }
    }
}
