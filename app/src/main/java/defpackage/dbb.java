package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dbb {
    private static final dax a = new daz();
    private final Map b = new HashMap();

    public final synchronized day a(Object obj) {
        dax daxVar;
        dqk.d(obj, "Argument must not be null");
        Map map = this.b;
        daxVar = (dax) map.get(obj.getClass());
        if (daxVar == null) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dax daxVar2 = (dax) it.next();
                if (daxVar2.b().isAssignableFrom(obj.getClass())) {
                    daxVar = daxVar2;
                    break;
                }
            }
        }
        if (daxVar == null) {
            daxVar = a;
        }
        return daxVar.a(obj);
    }

    public final synchronized void b(dax daxVar) {
        this.b.put(daxVar.b(), daxVar);
    }
}
