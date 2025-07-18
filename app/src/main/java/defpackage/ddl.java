package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddl {
    public final Map a = new HashMap();

    public ddl() {
        new HashMap();
    }

    final void a(daj dajVar, ddd dddVar) {
        Map map = this.a;
        if (dddVar.equals(map.get(dajVar))) {
            map.remove(dajVar);
        }
    }
}
