package defpackage;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdg {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public zdg(long j, zhe zheVar, zgr zgrVar, yot yotVar) {
        zgrVar.getClass();
        this.a = j;
        this.d = zheVar;
        this.c = zgrVar;
        this.b = new gyb(zgrVar, zheVar, yotVar, j);
    }

    public static final String b(String str) {
        zgn zgnVar = zgn.a;
        return wcq.aD(str).u().g();
    }

    public final boolean a(zbi zbiVar, zdc zdcVar, List list, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.d).iterator();
        it.getClass();
        while (it.hasNext()) {
            zde zdeVar = (zde) it.next();
            zdeVar.getClass();
            synchronized (zdeVar) {
                if (z) {
                    if (!zdeVar.i()) {
                        continue;
                    }
                }
                if (zdeVar.h(zbiVar, list)) {
                    zdcVar.e(zdeVar);
                    return true;
                }
            }
        }
        return false;
    }

    public zdg(ttm ttmVar, ttm ttmVar2, yfo yfoVar) {
        this.a = SystemClock.uptimeMillis();
        this.c = ttmVar;
        this.b = ttmVar2;
        this.d = yfoVar;
    }

    public zdg(zcv zcvVar, TimeUnit timeUnit) {
        zcvVar.getClass();
        this.a = timeUnit.toNanos(5L);
        this.b = zcvVar.a();
        this.c = new zdf(this, String.valueOf(zcr.e).concat(" ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }
}
