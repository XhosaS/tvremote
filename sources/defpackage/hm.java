package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hm implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new mu(1);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final ja b(RecyclerView recyclerView, int i, long j) {
        int iC = recyclerView.h.c();
        for (int i2 = 0; i2 < iC; i2++) {
            ja jaVarF = RecyclerView.f(recyclerView.h.f(i2));
            if (jaVarF.d == i && !jaVarF.q()) {
                return null;
            }
        }
        ir irVar = recyclerView.f;
        if (j == Long.MAX_VALUE) {
            try {
                if (ol.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.K(false);
                Trace.endSection();
            }
        }
        recyclerView.I();
        ja jaVarN = irVar.n(i, j);
        if (jaVarN != null) {
            if (!jaVarN.p() || jaVarN.q()) {
                irVar.c(jaVarN, false);
            } else {
                irVar.i(jaVarN.b);
            }
        }
        return jaVarN;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.r && this.d == 0) {
            this.d = RecyclerView.ag();
            recyclerView.post(this);
        }
        hk hkVar = recyclerView.J;
        hkVar.a = i;
        hkVar.b = i2;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm.run():void");
    }
}
