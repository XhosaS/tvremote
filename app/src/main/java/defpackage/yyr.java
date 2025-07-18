package defpackage;

import com.google.common.collect.Sets;
import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yyr implements Map, Serializable, j$.util.Map {
    private static final long serialVersionUID = 912559;
    private transient yzq a;
    private transient yzq b;
    private transient yxy c;

    public static yyn h(int i) {
        ywl.b(i, "expectedSize");
        return new yyn(i);
    }

    public static yyr i(Iterable iterable) {
        yyn yynVar = new yyn(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        yynVar.e(iterable);
        return yynVar.a(true);
    }

    public static yyr j(Map map) {
        if (!(map instanceof yyr) || (map instanceof SortedMap)) {
            return i(map.entrySet());
        }
        yyr yyrVar = (yyr) map;
        yyrVar.c();
        return yyrVar;
    }

    public static yyr k(Object obj, Object obj2) {
        ywl.a(obj, obj2);
        return zcl.a(1, new Object[]{obj, obj2}, null);
    }

    public static yyr l(Object obj, Object obj2, Object obj3, Object obj4) {
        ywl.a(obj, obj2);
        ywl.a(obj3, obj4);
        return zcl.a(2, new Object[]{obj, obj2, obj3, obj4}, null);
    }

    public static yyr m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ywl.a(obj, obj2);
        ywl.a(obj3, obj4);
        ywl.a(obj5, obj6);
        return zcl.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, null);
    }

    public static yyr n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        ywl.a(obj, obj2);
        ywl.a(obj3, obj4);
        ywl.a(obj5, obj6);
        ywl.a(obj7, obj8);
        return zcl.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, null);
    }

    public static yyr o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        ywl.a(obj, obj2);
        ywl.a(obj3, obj4);
        ywl.a(obj5, obj6);
        ywl.a(obj7, obj8);
        ywl.a(obj9, obj10);
        return zcl.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public zdl b() {
        throw null;
    }

    public abstract void c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
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
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract yxy d();

    public abstract yzq e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return zbk.e(this, obj);
    }

    public abstract yzq f();

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final yxy values() {
        yxy yxyVar = this.c;
        if (yxyVar != null) {
            return yxyVar;
        }
        yxy yxyVarD = d();
        this.c = yxyVarD;
        return yxyVarD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return Sets.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final yzq entrySet() {
        yzq yzqVar = this.a;
        if (yzqVar != null) {
            return yzqVar;
        }
        yzq yzqVarE = e();
        this.a = yzqVarE;
        return yzqVarE;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final yzq keySet() {
        yzq yzqVar = this.b;
        if (yzqVar != null) {
            return yzqVar;
        }
        yzq yzqVarF = f();
        this.b = yzqVarF;
        return yzqVarF;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        return zbk.c(this);
    }

    public Object writeReplace() {
        return new yyq(this);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
