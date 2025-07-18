package defpackage;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class efd extends ForwardingMap {
    private final Map a;

    public efd(Map map) {
        this.a = map;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.standardContainsValue(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Set<Map.Entry<String, List<String>>> entrySet() {
        return Sets.filter(super.entrySet(), new efc(1));
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.standardEquals(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final int hashCode() {
        return super.standardHashCode();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Set<String> keySet() {
        return Sets.filter(super.keySet(), new efc(0));
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final Map<String, List<String>> delegate() {
        return this.a;
    }
}
