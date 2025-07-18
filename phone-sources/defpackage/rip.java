package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rip implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ rip(ejs ejsVar, Pair pair, evq evqVar, evv evvVar, IOException iOException, boolean z, int i) {
        this.g = i;
        this.c = ejsVar;
        this.b = pair;
        this.d = evqVar;
        this.e = evvVar;
        this.f = iOException;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ttm] */
    @Override // java.lang.Runnable
    public final void run() {
        xtk xtkVar;
        int i = this.g;
        if (i == 0) {
            ((snf) ((riv) ((rzy) this.b).a.get()).e.get()).b(this.c, this.d, this.e, this.f, Boolean.valueOf(this.a));
            return;
        }
        if (i == 1) {
            Pair pair = (Pair) this.b;
            int iIntValue = ((Integer) pair.first).intValue();
            evz evzVar = (evz) pair.second;
            ejv ejvVar = ((ejs) this.c).a;
            boolean z = this.a;
            Object obj = this.f;
            ejvVar.j.j(iIntValue, evzVar, (evq) this.d, (evv) this.e, (IOException) obj, z);
            return;
        }
        for (yaz yazVar : this.d) {
            if (yazVar != this.b) {
                yazVar.a.h(ybb.c);
            }
        }
        ?? r0 = this.f;
        if (r0 != 0) {
            r0.cancel(false);
            if (!this.a) {
                ybb ybbVar = (ybb) this.c;
                if (ybbVar.u.decrementAndGet() == Integer.MIN_VALUE) {
                    ybbVar.h.execute(new xyp(this, 8));
                }
            }
        }
        ?? r02 = this.e;
        if (r02 != 0) {
            r02.cancel(false);
        }
        Object obj2 = this.c;
        xyq xyqVar = ((ybb) obj2).E.b.z;
        synchronized (xyqVar.a) {
            xyqVar.b.remove(obj2);
            if (xyqVar.b.isEmpty()) {
                xtkVar = xyqVar.c;
                xyqVar.b = new HashSet();
            } else {
                xtkVar = null;
            }
        }
        if (xtkVar != null) {
            xyqVar.d.y.e(xtkVar);
        }
    }

    public /* synthetic */ rip(rzy rzyVar, String str, String str2, String str3, String str4, boolean z, int i) {
        this.g = i;
        this.b = rzyVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.a = z;
    }

    public rip(ybb ybbVar, Collection collection, yaz yazVar, Future future, boolean z, Future future2, int i) {
        this.g = i;
        this.d = collection;
        this.b = yazVar;
        this.f = future;
        this.a = z;
        this.e = future2;
        this.c = ybbVar;
    }
}
