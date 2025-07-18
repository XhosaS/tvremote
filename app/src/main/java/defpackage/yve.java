package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yve extends yvl implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    protected yve(Map map) {
        yqw.A(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    @Override // defpackage.zbl
    public Collection b(Object obj) {
        Collection collectionA = (Collection) this.a.get(obj);
        if (collectionA == null) {
            collectionA = a();
        }
        return d(obj, collectionA);
    }

    public Collection c(Collection collection) {
        throw null;
    }

    public Collection d(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.yvl
    public final Collection f() {
        throw null;
    }

    final List g(Object obj, List list, yva yvaVar) {
        return list instanceof RandomAccess ? new yuw(this, obj, list, yvaVar) : new yvc(this, obj, list, yvaVar);
    }

    @Override // defpackage.yvl
    public Map h() {
        return new yuq(this, this.a);
    }

    @Override // defpackage.yvl
    public Set i() {
        return new yut(this, this.a);
    }

    @Override // defpackage.zbl
    public final void j() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void k(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            yqw.A(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.yvl, defpackage.zbl
    public void l(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.b++;
            }
        } else {
            Collection collectionA = a();
            if (!collectionA.add(obj2)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            this.b++;
            this.a.put(obj, collectionA);
        }
    }
}
