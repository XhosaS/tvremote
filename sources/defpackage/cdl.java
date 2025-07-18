package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdl extends cdo {
    private final Map a;
    private final Map b;
    private final cdn c;
    private final cdm d;

    public cdl(cdk cdkVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(cdkVar.c);
        map2.putAll(cdkVar.d);
        this.c = cdkVar.e;
        this.d = cdkVar.f;
    }

    @Override // defpackage.cdo
    protected final void a(cck cckVar, Object obj, Object obj2) {
        cdn cdnVar = (cdn) this.a.get(cckVar);
        if (cdnVar != null) {
            cdnVar.a(cckVar, obj, obj2);
        } else {
            this.c.a(cckVar, obj, obj2);
        }
    }

    @Override // defpackage.cdo
    protected final void b(cck cckVar, Iterator it, Object obj) {
        cdm cdmVar = (cdm) this.b.get(cckVar);
        if (cdmVar != null) {
            cdmVar.a(cckVar, it, obj);
            return;
        }
        cdm cdmVar2 = this.d;
        if (cdmVar2 != null && !this.a.containsKey(cckVar)) {
            cdmVar2.a(cckVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(cckVar, it.next(), obj);
            }
        }
    }
}
