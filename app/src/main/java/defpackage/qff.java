package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qff implements ugz {
    public final piq a;
    private final Context b;
    private final qcf c;
    private final AtomicLong d = new AtomicLong();
    private final AtomicLong e = new AtomicLong();

    public qff(Context context, qcf qcfVar, piq piqVar) {
        this.b = context;
        this.c = qcfVar;
        this.a = piqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // defpackage.ugz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r5) {
        /*
            r4 = this;
            java.lang.String r0 = "NetworkUsageMonitor"
            android.content.Context r1 = r4.b
            r2 = 0
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.SecurityException -> Le
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.SecurityException -> Le
            goto L14
        Le:
            java.lang.String r1 = "%s: Couldn't retrieve ConnectivityManager."
            defpackage.qce.c(r1, r0)
            r1 = r2
        L14:
            if (r1 != 0) goto L17
            goto L1b
        L17:
            android.net.NetworkInfo r2 = r1.getActiveNetworkInfo()
        L1b:
            if (r2 != 0) goto L23
            java.lang.String r1 = "%s: Fail to get network type "
            defpackage.qce.c(r1, r0)
            goto L40
        L23:
            int r0 = r2.getType()
            r1 = 1
            if (r0 == r1) goto L40
            int r0 = r2.getType()
            r1 = 9
            if (r0 == r1) goto L40
            int r0 = r2.getType()
            r1 = 17
            if (r0 == r1) goto L40
            java.util.concurrent.atomic.AtomicLong r0 = r4.e
            r0.getAndAdd(r5)
            goto L45
        L40:
            java.util.concurrent.atomic.AtomicLong r0 = r4.d
            r0.getAndAdd(r5)
        L45:
            piq r5 = r4.a
            piy r5 = r5.c
            if (r5 != 0) goto L4d
            piy r5 = defpackage.piy.a
        L4d:
            java.lang.String r5 = r5.d
            java.util.concurrent.atomic.AtomicLong r5 = r4.d
            r5.get()
            java.util.concurrent.atomic.AtomicLong r5 = r4.e
            r5.get()
            int r5 = defpackage.qce.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qff.a(long):void");
    }

    @Override // defpackage.ugz
    public final void b() {
        pip pipVar = new pip();
        pipVar.B(this.a);
        long andSet = this.e.getAndSet(0L);
        if ((pipVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pipVar.y();
        }
        piq piqVar = (piq) pipVar.b;
        piq piqVar2 = piq.a;
        piqVar.b |= 16;
        piqVar.g = andSet;
        long andSet2 = this.d.getAndSet(0L);
        if ((pipVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pipVar.y();
        }
        qcf qcfVar = this.c;
        piq piqVar3 = (piq) pipVar.b;
        piqVar3.b |= 32;
        piqVar3.h = andSet2;
        zxn.p(qcfVar.e((piq) pipVar.v()), wyo.f(new qfe(this)), zwk.a);
    }
}
