package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twk {
    private static final twg a = new twi();
    private static final twf b = new twj();

    public static twh a(Set set) {
        twd twdVar = new twd(a);
        twdVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            tuy tuyVar = (tuy) it.next();
            tuyVar.getClass();
            if (tuyVar.b) {
                twf twfVar = twd.b;
                a.aD(true, "key must be repeating");
                twdVar.c.remove(tuyVar);
                twdVar.d.put(tuyVar, twfVar);
            } else {
                Map map = twdVar.d;
                twg twgVar = twd.a;
                map.remove(tuyVar);
                twdVar.c.put(tuyVar, twgVar);
            }
        }
        return new twe(twdVar);
    }
}
