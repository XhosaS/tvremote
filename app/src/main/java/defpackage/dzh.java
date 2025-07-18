package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzh {
    private final Map a = DesugarCollections.synchronizedMap(new HashMap());

    public static dzh a(dzh dzhVar) {
        dzh dzhVar2 = new dzh();
        if (dzhVar == null) {
            return dzhVar2;
        }
        Map map = dzhVar.a;
        synchronized (map) {
            dzhVar2.a.putAll(map);
        }
        return dzhVar2;
    }

    public static dzh b(dzh dzhVar) {
        if (dzhVar == null) {
            return null;
        }
        return a(dzhVar);
    }

    public final Object c(Class cls) {
        return this.a.get(cls);
    }

    public final void d(Class cls, Object obj) {
        this.a.put(cls, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dzh) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
