package com.google.android.libraries.mdi.download.workmanager.workers;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import defpackage.caz;
import defpackage.cbr;
import defpackage.cbv;
import defpackage.pjn;
import defpackage.wyo;
import defpackage.yqi;
import defpackage.zuz;
import defpackage.zvh;
import defpackage.zxn;
import defpackage.zyd;
import defpackage.zyg;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PeriodicWorker extends cbv {
    public final pjn e;
    private final Executor f;

    public PeriodicWorker(Context context, WorkerParameters workerParameters, pjn pjnVar, zyg zygVar) {
        super(context, workerParameters);
        this.e = pjnVar;
        this.f = zygVar;
    }

    @Override // defpackage.cbv
    public final zyd b() {
        Log.d("MddPeriodicWorker", "PeriodicWorker: startWork");
        final caz cazVar = this.b.b;
        final String strA = cazVar.a("MDD_TASK_TAG_KEY");
        if (strA == null) {
            Log.e("MddPeriodicWorker", "can't find MDD task tag");
            return zxn.h(new cbr(caz.b));
        }
        zvh zvhVar = new zvh() { // from class: qgk
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
            
                if (r1.equals("NETWORK_STATE_CONNECTED") != false) goto L22;
             */
            @Override // defpackage.zvh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.zyd a() {
                /*
                    r14 = this;
                    caz r0 = r3
                    java.util.Map r1 = r0.c
                    r2 = -1
                    java.lang.Long r4 = java.lang.Long.valueOf(r2)
                    java.lang.String r5 = "MDD_TASK_PERIOD_HOURS_KEY"
                    java.lang.Object r1 = r1.get(r5)
                    boolean r5 = r1 instanceof java.lang.Long
                    r6 = 1
                    if (r6 != r5) goto L16
                    r4 = r1
                L16:
                    java.lang.Number r4 = (java.lang.Number) r4
                    long r8 = r4.longValue()
                    int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                    java.lang.String r2 = "MddPeriodicWorker"
                    if (r1 != 0) goto L2a
                    java.lang.String r0 = "can't find MDD task info"
                    android.util.Log.w(r2, r0)
                    ypv r0 = defpackage.ypv.a
                    goto L86
                L2a:
                    java.lang.String r1 = "MDD_TASK_NETWORK_STATE_KEY"
                    java.lang.String r1 = r0.a(r1)
                    if (r1 != 0) goto L3a
                    java.lang.String r0 = "can't find MDD task network state"
                    android.util.Log.e(r2, r0)
                    ypv r0 = defpackage.ypv.a
                    goto L86
                L3a:
                    int r2 = r1.hashCode()
                    r3 = -553837936(0xffffffffdefd1a90, float:-9.119024E18)
                    if (r2 == r3) goto L61
                    r3 = 494669930(0x1d7c106a, float:3.3360408E-21)
                    if (r2 == r3) goto L57
                    r3 = 534741005(0x1fdf800d, float:9.4656016E-20)
                    if (r2 != r3) goto L91
                    java.lang.String r2 = "NETWORK_STATE_ANY"
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L91
                    r6 = 3
                    goto L5f
                L57:
                    java.lang.String r2 = "NETWORK_STATE_CONNECTED"
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L91
                L5f:
                    r10 = r6
                    goto L6b
                L61:
                    java.lang.String r2 = "NETWORK_STATE_UNMETERED"
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L91
                    r6 = 2
                    goto L5f
                L6b:
                    java.lang.String r1 = "MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY"
                    boolean r11 = r0.d(r1)
                    java.lang.String r1 = "MDD_TASK_REQUIRES_CHARGING_KEY"
                    boolean r12 = r0.d(r1)
                    java.lang.String r1 = "MDD_TASK_REQUIRES_DEVICE_IDLE_KEY"
                    boolean r13 = r0.d(r1)
                    pgf r7 = new pgf
                    r7.<init>(r8, r10, r11, r12, r13)
                    yqt r0 = defpackage.yqt.i(r7)
                L86:
                    com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker r1 = r14.a
                    java.lang.String r2 = r2
                    pjn r1 = r1.e
                    zyd r0 = r1.d(r2, r0)
                    return r0
                L91:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qgk.a():zyd");
            }
        };
        Executor executor = this.f;
        return zuz.g(zxn.l(wyo.b(zvhVar), executor), wyo.a(new yqi() { // from class: qgl
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new cbt(caz.b);
            }
        }), executor);
    }
}
