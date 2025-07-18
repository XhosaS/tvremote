package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdj implements eul {
    public static final long a;
    public final enr b;
    public final egg c;
    public final Executor d;
    public final egc e;
    public final egk f;
    public final List g;
    public AtomicBoolean h;
    public final nuh i;
    private final iom j = new iom();

    static {
        long j = ynm.a;
        a = ynm.j(ylh.o(20, yno.d));
    }

    public jdj(enr enrVar, egg eggVar, Executor executor) {
        this.b = enrVar;
        this.c = eggVar;
        this.d = executor;
        egc egcVar = eggVar.a;
        if (egcVar == null) {
            throw new IllegalArgumentException("The provided cacheDataSourceFactory must contain a cache already set");
        }
        this.e = egcVar;
        this.f = eggVar.c;
        this.i = eggVar.e;
        this.g = new ArrayList();
        this.h = new AtomicBoolean(false);
    }

    private static final jdw d(enz enzVar, String str, long j, enw enwVar) {
        return new jdw(j, clw.C(enzVar, str, enwVar, 0, yhc.a), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(defpackage.ees r22, defpackage.enr r23, boolean r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdj.a(ees, enr, boolean):java.util.List");
    }

    public final void b(edj edjVar) {
        List list = this.g;
        synchronized (list) {
            if (this.h.get()) {
                throw new InterruptedException();
            }
            list.add(edjVar);
        }
    }

    public final void c(edj edjVar) {
        List list = this.g;
        synchronized (list) {
            list.remove(edjVar);
        }
    }
}
