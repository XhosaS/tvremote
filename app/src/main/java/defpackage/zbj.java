package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class zbj extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set b();

    public Set e() {
        return new zbh(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.a = setB;
        return setB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.b = setE;
        return setE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        zbi zbiVar = new zbi(this);
        this.c = zbiVar;
        return zbiVar;
    }
}
