package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zel {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected zel() {
    }

    protected abstract Object a();

    public final Object b(zej zejVar, zfx zfxVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(zejVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(zejVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((zee) zfxVar).b;
        zek zekVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (zed.f.equals(zfxVar.b(i2))) {
                Object objD = zfxVar.d(i2);
                if (objD instanceof zep) {
                    if (zekVar == null) {
                        zekVar = new zek(this, zejVar);
                    }
                    ((zep) objD).a();
                }
            }
        }
        return objA;
    }
}
