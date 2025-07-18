package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zec extends zer {
    public zec(Class cls) {
        super("tags", cls, false, true);
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ void b(Object obj, zeq zeqVar) {
        zih zihVar = (zih) obj;
        if (zihVar == null) {
            return;
        }
        zid zidVar = new zid((zie) zihVar.c.d);
        while (zidVar.hasNext()) {
            Map.Entry entry = (Map.Entry) zidVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                zeqVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    zeqVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
