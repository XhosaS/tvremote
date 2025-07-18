package defpackage;

import android.content.AttributionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sah {
    private final AtomicInteger a = new AtomicInteger();
    private sag b;
    private AttributionSource c;

    public final synchronized sag a(AttributionSource attributionSource) {
        sag sagVar;
        sag sagVar2 = sag.a;
        saf safVar = new saf();
        int iIncrementAndGet = this.a.incrementAndGet();
        if ((safVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            safVar.y();
        }
        sag sagVar3 = (sag) safVar.b;
        sagVar3.b |= 1;
        sagVar3.c = iIncrementAndGet;
        sagVar = (sag) safVar.v();
        this.b = sagVar;
        this.c = attributionSource;
        return sagVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (defpackage.abza.a.a(r4.getClass()).k(r4, r0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.yqt b(defpackage.sag r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            sag r0 = r3.b     // Catch: java.lang.Throwable -> L34
            if (r4 != r0) goto L6
            goto L23
        L6:
            if (r0 != 0) goto L9
            goto L30
        L9:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Throwable -> L34
            if (r1 != r2) goto L30
            abza r1 = defpackage.abza.a     // Catch: java.lang.Throwable -> L34
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> L34
            abzj r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L34
            boolean r4 = r1.k(r4, r0)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L30
        L23:
            r4 = 0
            r3.b = r4     // Catch: java.lang.Throwable -> L34
            android.content.AttributionSource r0 = r3.c     // Catch: java.lang.Throwable -> L34
            r3.c = r4     // Catch: java.lang.Throwable -> L34
            yqt r4 = defpackage.yqt.h(r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return r4
        L30:
            ypv r4 = defpackage.ypv.a     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return r4
        L34:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sah.b(sag):yqt");
    }
}
