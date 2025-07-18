package defpackage;

import com.google.common.collect.ForwardingCollection;
import com.google.common.collect.ForwardingMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class udy extends ForwardingMap {
    Set a;
    Collection b;
    final /* synthetic */ Map c;
    final /* synthetic */ udz d;

    public udy(udz udzVar, Map map) {
        this.c = map;
        this.d = udzVar;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return ((ForwardingCollection) values()).standardContains(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.c;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Set<Map.Entry> entrySet() {
        Set<Map.Entry> set = this.a;
        if (set != null) {
            return set;
        }
        udr udrVar = new udr(this.c.entrySet());
        this.a = udrVar;
        return udrVar;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = this.d.get((udz) obj);
        if (collection.isEmpty()) {
            return null;
        }
        return collection;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Collection<Collection> values() {
        Collection<Collection> collection = this.b;
        if (collection != null) {
            return collection;
        }
        udt udtVar = new udt(this.c.values(), entrySet());
        this.b = udtVar;
        return udtVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final Map delegate() {
        return this.c;
    }
}
