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
public class bgw<K, V> extends ygt<K, V> implements Map<K, V>, j$.util.Map<K, V>, yll {
    public bhc a;
    public Object b;
    public int c;
    public int d;
    public a e = new a();
    private bgu f;

    public bgw(bgu bguVar) {
        this.f = bguVar;
        bgu bguVar2 = this.f;
        this.a = bguVar2.b;
        this.d = bguVar2.a();
    }

    @Override // defpackage.ygt
    public final int a() {
        return this.d;
    }

    public bgu b() {
        bhc bhcVar = this.a;
        bgu bguVar = this.f;
        if (bhcVar != bguVar.b) {
            this.e = new a();
            bguVar = new bgu(bhcVar, a());
        }
        this.f = bguVar;
        return bguVar;
    }

    @Override // defpackage.ygt
    public final Collection c() {
        return new bgz(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a = bhc.a;
        f(0);
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.ygt
    public final Set d() {
        return new bgr(this);
    }

    @Override // defpackage.ygt
    public final Set e() {
        return new bgy(this);
    }

    public final void f(int i) {
        this.d = i;
        this.c++;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return (V) this.a.j(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.b = null;
        this.a = this.a.d(k != null ? k.hashCode() : 0, k, v, 0, this);
        return (V) this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        bgu bguVarB = map instanceof bgu ? (bgu) map : null;
        if (bguVarB == null) {
            bgw bgwVar = map instanceof bgw ? (bgw) map : null;
            bguVarB = bgwVar != null ? bgwVar.b() : null;
        }
        if (bguVarB == null) {
            super.putAll(map);
            return;
        }
        bhl bhlVar = new bhl(null);
        int iA = a();
        bhc bhcVar = this.a;
        bhc bhcVar2 = bguVarB.b;
        bhcVar2.getClass();
        this.a = bhcVar.e(bhcVar2, 0, bhlVar, this);
        int iA2 = (bguVarB.a() + iA) - bhlVar.a;
        if (iA != iA2) {
            f(iA2);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.b = null;
        bhc bhcVarF = this.a.f(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (bhcVarF == null) {
            bhcVarF = bhc.a;
        }
        this.a = bhcVarF;
        return (V) this.b;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iA = a();
        bhc bhcVarG = this.a.g(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (bhcVarG == null) {
            bhcVarG = bhc.a;
        }
        this.a = bhcVarG;
        return iA != a();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
