package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yvl implements zbl {
    private transient Set a;
    private transient Map b;
    public transient Collection c;
    public transient Collection d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zbl) {
            return m().equals(((zbl) obj).m());
        }
        return false;
    }

    public abstract Collection f();

    public abstract Map h();

    public final int hashCode() {
        return m().hashCode();
    }

    public abstract Set i();

    @Override // defpackage.zbl
    public void l(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.zbl
    public Map m() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        Map mapH = h();
        this.b = mapH;
        return mapH;
    }

    @Override // defpackage.zbl
    public Set n() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setI = i();
        this.a = setI;
        return setI;
    }

    public final boolean o(Object obj, Object obj2) {
        Collection collection = (Collection) m().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public final String toString() {
        return m().toString();
    }
}
