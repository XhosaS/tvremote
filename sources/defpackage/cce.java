package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cce {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected cce() {
    }

    protected abstract Object a();

    public final Object b(ccd ccdVar, cdh cdhVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(ccdVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(ccdVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((cby) cdhVar).b;
        bsp bspVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (cbx.f.equals(cdhVar.c(i2))) {
                Object objE = cdhVar.e(i2);
                if (objE instanceof cci) {
                    if (bspVar == null) {
                        bspVar = new bsp(this, ccdVar, 6);
                    }
                    ((cci) objE).a();
                }
            }
        }
        return objA;
    }
}
