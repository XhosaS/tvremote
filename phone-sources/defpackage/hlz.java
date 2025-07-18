package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlz {
    private static final hlv a = new hlx();
    private final Map b = new HashMap();

    public final synchronized hlw a(Object obj) {
        hlv hlvVar;
        hju.p(obj);
        Map map = this.b;
        hlvVar = (hlv) map.get(obj.getClass());
        if (hlvVar == null) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hlv hlvVar2 = (hlv) it.next();
                if (hlvVar2.b().isAssignableFrom(obj.getClass())) {
                    hlvVar = hlvVar2;
                    break;
                }
            }
        }
        if (hlvVar == null) {
            hlvVar = a;
        }
        return hlvVar.a(obj);
    }

    public final synchronized void b(hlv hlvVar) {
        this.b.put(hlvVar.b(), hlvVar);
    }
}
