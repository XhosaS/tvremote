package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class dyw {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    public final Map d = new HashMap();

    final Object a(dyv dyvVar) {
        return this.d.get(dyvVar);
    }

    final Collection b() {
        return this.d.values();
    }

    final Set c() {
        return this.d.keySet();
    }

    final void d(dyv dyvVar) {
        if (this.d.remove(dyvVar) == null) {
            return;
        }
        int i = dyvVar.a;
        if (i == 1) {
            this.a.remove(dyvVar.b);
            return;
        }
        if (i != 2) {
            this.c.remove(dyvVar.b);
            return;
        }
        String str = dyvVar.c;
        Map map = this.b;
        Map map2 = (Map) map.get(str);
        map2.remove(dyvVar.b);
        if (map2.isEmpty()) {
            map.remove(str);
        }
    }
}
