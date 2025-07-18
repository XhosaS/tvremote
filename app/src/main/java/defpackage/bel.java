package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bel {
    public final Map a = new LinkedHashMap();

    public final beb a(String str) {
        str.getClass();
        return (beb) this.a.get(str);
    }

    public final Set b() {
        return new HashSet(this.a.keySet());
    }

    public final void c() {
        Map map = this.a;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((beb) it.next()).eP();
        }
        map.clear();
    }
}
