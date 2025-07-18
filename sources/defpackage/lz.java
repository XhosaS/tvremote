package defpackage;

import j$.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lz extends mi implements Map, j$.util.Map {
    lt a;
    lv b;
    lx c;

    public lz() {
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
    public final Set entrySet() {
        lt ltVar = this.a;
        if (ltVar != null) {
            return ltVar;
        }
        lt ltVar2 = new lt(this);
        this.a = ltVar2;
        return ltVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        lv lvVar = this.b;
        if (lvVar != null) {
            return lvVar;
        }
        lv lvVar2 = new lv(this);
        this.b = lvVar2;
        return lvVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = this.f + map.size();
        int i = this.f;
        int[] iArr = this.d;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            iArrCopyOf.getClass();
            this.d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.e, size + size);
            objArrCopyOf.getClass();
            this.e = objArrCopyOf;
        }
        if (this.f != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        lx lxVar = this.c;
        if (lxVar != null) {
            return lxVar;
        }
        lx lxVar2 = new lx(this);
        this.c = lxVar2;
        return lxVar2;
    }

    public lz(int i) {
        super(i);
    }
}
