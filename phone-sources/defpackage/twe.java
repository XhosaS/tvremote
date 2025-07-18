package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class twe extends twh {
    private final Map a;
    private final Map b;
    private final twg c;
    private final twf d;

    public twe(twd twdVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(twdVar.c);
        map2.putAll(twdVar.d);
        this.c = twdVar.e;
        this.d = twdVar.f;
    }

    @Override // defpackage.twh
    protected final void a(tuy tuyVar, Object obj, Object obj2) {
        twg twgVar = (twg) this.a.get(tuyVar);
        if (twgVar != null) {
            twgVar.a(tuyVar, obj, obj2);
        } else {
            this.c.a(tuyVar, obj, obj2);
        }
    }

    @Override // defpackage.twh
    protected final void b(tuy tuyVar, Iterator it, Object obj) {
        twf twfVar = (twf) this.b.get(tuyVar);
        if (twfVar != null) {
            twfVar.a(tuyVar, it, obj);
            return;
        }
        twf twfVar2 = this.d;
        if (twfVar2 != null && !this.a.containsKey(tuyVar)) {
            twfVar2.a(tuyVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(tuyVar, it.next(), obj);
            }
        }
    }
}
