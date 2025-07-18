package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djs {
    private final Map a;

    public djs() {
        throw null;
    }

    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    public final void b(djq djqVar, Object obj) {
        Map map = this.a;
        map.get(djqVar);
        if (obj == null) {
            map.remove(djqVar);
        } else {
            map.put(djqVar, obj);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof djs) && yks.e(this.a, ((djs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public djs(Map map) {
        this.a = map;
    }
}
