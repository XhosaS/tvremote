package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqi {
    public static final xqi a = new xqi(new xqf(1), xqf.a);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public xqi(xqh... xqhVarArr) {
        for (int i = 0; i < 2; i++) {
            xqh xqhVar = xqhVarArr[i];
            this.b.put(xqhVar.b(), xqhVar);
        }
    }
}
