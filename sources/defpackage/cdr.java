package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdr {
    private static final cdn a = new cdp();
    private static final cdm b = new cdq();

    public static cdo a(Set set) {
        cdk cdkVar = new cdk(a);
        cdkVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cck cckVar = (cck) it.next();
            cckVar.getClass();
            if (cckVar.b) {
                cdm cdmVar = cdk.b;
                ces.j(true, "key must be repeating");
                cdkVar.c.remove(cckVar);
                cdkVar.d.put(cckVar, cdmVar);
            } else {
                Map map = cdkVar.d;
                cdn cdnVar = cdk.a;
                map.remove(cckVar);
                cdkVar.c.put(cckVar, cdnVar);
            }
        }
        return new cdl(cdkVar);
    }
}
