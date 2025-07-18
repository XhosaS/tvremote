package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class og implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new od();
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private final qv b(RecyclerView recyclerView, int i, long j) {
        int iB = recyclerView.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            qv qvVarM = RecyclerView.m(recyclerView.h.e(i2));
            if (qvVarM.c == i && !qvVarM.q()) {
                return null;
            }
        }
        ql qlVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                if (adv.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.V(false);
                Trace.endSection();
            }
        }
        recyclerView.U();
        qv qvVarQ = qlVar.q(i, j);
        if (qvVarQ != null) {
            if (!qvVarQ.p() || qvVarQ.q()) {
                qlVar.c(qvVarQ, false);
            } else {
                qlVar.j(qvVarQ.a);
            }
        }
        return qvVarQ;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.s && this.d == 0) {
            this.d = recyclerView.g();
            recyclerView.post(this);
        }
        oe oeVar = recyclerView.M;
        oeVar.a = i;
        oeVar.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.run():void");
    }
}
