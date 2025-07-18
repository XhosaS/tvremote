package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tus {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected tus() {
    }

    protected abstract Object a();

    public final Object b(tur turVar, twa twaVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(turVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(turVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((tum) twaVar).b;
        ukm ukmVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (tul.f.equals(twaVar.c(i2))) {
                Object objE = twaVar.e(i2);
                if (objE instanceof tuw) {
                    if (ukmVar == null) {
                        ukmVar = new ukm(this, turVar, 1);
                    }
                    ((tuw) objE).a();
                }
            }
        }
        return objA;
    }
}
