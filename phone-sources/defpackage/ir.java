package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ir<K, V> extends ko<K, V> implements Map<K, V>, j$.util.Map<K, V> {
    il a;
    in b;
    ip c;

    public ir() {
    }

    public final boolean a(Collection collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(d(i2))) {
                e(i2);
            }
        }
        return i != this.d;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        il ilVar = this.a;
        if (ilVar != null) {
            return ilVar;
        }
        il ilVar2 = new il(this);
        this.a = ilVar2;
        return ilVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        in inVar = this.b;
        if (inVar != null) {
            return inVar;
        }
        in inVar2 = new in(this);
        this.b = inVar2;
        return inVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        h(this.d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        ip ipVar = this.c;
        if (ipVar != null) {
            return ipVar;
        }
        ip ipVar2 = new ip(this);
        this.c = ipVar2;
        return ipVar2;
    }

    public ir(int i) {
        super(i);
    }

    public ir(ko koVar) {
        super(koVar);
    }
}
