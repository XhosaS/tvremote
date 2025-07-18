package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbw extends cck {
    public cbw(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.cck
    public final /* bridge */ /* synthetic */ void b(Object obj, ccj ccjVar) {
        cez cezVar = (cez) obj;
        if (cezVar == null) {
            return;
        }
        cev cevVar = new cev((cew) cezVar.c.d);
        while (cevVar.hasNext()) {
            Map.Entry entry = (Map.Entry) cevVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                ccjVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    ccjVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
