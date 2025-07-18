package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lny {
    public final Executor a;
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public String d;
    public String e;
    public String f;
    public final lrc g;

    public lny(Executor executor, lrc lrcVar) {
        this.a = executor;
        this.g = lrcVar;
    }

    public static void b(Map map, String str, idy idyVar) {
        Map map2 = (Map) map.get(str);
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            idyVar.c((Map.Entry) it.next());
        }
    }

    final String a() {
        Map map = this.b;
        if (!map.containsKey(this.f)) {
            return "";
        }
        Map map2 = (Map) map.get(this.f);
        return map2.containsKey("docid") ? (String) map2.get("docid") : "";
    }
}
