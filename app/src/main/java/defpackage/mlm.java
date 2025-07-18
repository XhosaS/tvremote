package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mlm implements nzw {
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    private final yyk b;

    public mlm(yyk yykVar) {
        this.b = yykVar;
        DesugarCollections.synchronizedMap(new HashMap());
    }

    @Override // defpackage.nzw
    public final nzv a(nzv nzvVar) {
        int i = 0;
        nzv nzvVarA = nzvVar;
        while (true) {
            yyk yykVar = this.b;
            if (i >= ((zcg) yykVar).d) {
                break;
            }
            nzvVarA = ((nzw) yykVar.get(i)).a(nzvVar);
            i++;
        }
        Map map = this.a;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                nzvVarA = ((nzw) it.next()).a(nzvVar);
            }
        }
        return nzvVarA;
    }

    public final void b(Object obj, nzw nzwVar) {
        this.a.put(obj, nzwVar);
    }
}
