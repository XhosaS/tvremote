package j$.time.format;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.C0020f;
import j$.util.stream.F;
import j$.util.stream.G;
import j$.util.stream.I;
import j$.util.stream.J;
import j$.util.stream.K;
import j$.util.stream.M;
import j$.util.stream.N;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class s implements Predicate, Supplier, N, G, LongFunction, Consumer, BooleanSupplier {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ s(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.util.stream.N
    public Object a(F f, Spliterator spliterator) {
        f.a(f.h(this), spliterator);
        return null;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((j$.util.concurrent.w) this.b).accept(obj);
                break;
            case 5:
            default:
                ((I) this.b).accept(obj);
                break;
            case 6:
                ((ArrayList) this.b).add(obj);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return j$.nio.file.attribute.a.w(j, (IntFunction) this.b);
    }

    @Override // j$.util.stream.G
    public /* synthetic */ void b(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.G
    public /* synthetic */ boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.N
    public Object d(F f, Spliterator spliterator) {
        new C0020f(f, spliterator, f.h(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.G
    public /* synthetic */ void end() {
        int i = this.a;
    }

    @Override // j$.util.stream.N
    public int f() {
        return K.o;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 3:
                return ((F) this.b).f(0);
            default:
                return null;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        M m = (M) this.b;
        return m.d.tryAdvance(m.e);
    }

    public String k(long j, w wVar) {
        Map map = (Map) ((Map) this.b).get(wVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    public void l(J j) {
        ((EnumMap) this.b).put((EnumMap) j, (J) 1);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return !((Predicate) this.b).test(obj);
            default:
                return this.b.equals(obj);
        }
    }

    public s(Map map) {
        this.a = 0;
        this.b = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                r rVar = c.b;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, c.b);
            map2.put((w) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, c.b);
    }

    private final /* synthetic */ void g(long j) {
    }

    private final /* synthetic */ void h(long j) {
    }

    private final /* synthetic */ void i() {
    }

    private final /* synthetic */ void j() {
    }
}
