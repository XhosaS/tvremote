package j$.desugar.sun.nio.fs;

import j$.nio.file.AbstractC0040a;
import j$.nio.file.Path;
import j$.nio.file.r;
import j$.nio.file.x;
import j$.time.format.t;
import j$.util.Map;
import j$.util.Spliterator;
import j$.util.function.BiFunction$CC;
import j$.util.function.BiPredicate$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.AbstractC0111a;
import j$.util.stream.AbstractC0153v0;
import j$.util.stream.C0140o0;
import j$.util.stream.Collectors;
import j$.util.stream.K0;
import j$.util.stream.W;
import j$.util.stream.Y0;
import j$.util.stream.Z0;
import j$.util.stream.e1;
import j$.util.stream.g1;
import j$.util.stream.i1;
import j$.util.stream.j1;
import java.nio.file.DirectoryStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements x, DirectoryStream.Filter, Spliterator, BiPredicate, IntPredicate, Predicate, Supplier, BinaryOperator, LongFunction, Consumer, BooleanSupplier, K0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.nio.file.x
    public boolean a(Path path) {
        return ((Pattern) this.b).matcher(path.toString()).matches();
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return (j < 0 || j >= 2147483639) ? new C0140o0() : new W(j, (IntFunction) this.b);
    }

    public String b(long j, t tVar) {
        Map map = (Map) ((Map) this.b).get(tVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    public void c(Z0 z0) {
        ((EnumMap) this.b).put((EnumMap) z0, (Z0) 1);
    }

    @Override // j$.util.Spliterator
    public int characteristics() {
        return ((Spliterator) this.b).characteristics();
    }

    @Override // j$.util.Spliterator
    public long estimateSize() {
        return ((Spliterator) this.b).estimateSize();
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        ((Spliterator) this.b).forEachRemaining(new r(consumer, 2));
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return ((AbstractC0111a) this.b).k(0);
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 14:
                e1 e1Var = (e1) this.b;
                return e1Var.d.tryAdvance(e1Var.e);
            case 15:
                g1 g1Var = (g1) this.b;
                return g1Var.d.tryAdvance(g1Var.e);
            case 16:
                i1 i1Var = (i1) this.b;
                return i1Var.d.tryAdvance(i1Var.e);
            default:
                j1 j1Var = (j1) this.b;
                return j1Var.d.tryAdvance(j1Var.e);
        }
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        return ((Spliterator) this.b).getComparator();
    }

    @Override // j$.util.Spliterator
    public long getExactSizeIfKnown() {
        return ((Spliterator) this.b).getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public boolean hasCharacteristics(int i) {
        return ((Spliterator) this.b).hasCharacteristics(i);
    }

    public /* synthetic */ BiPredicate negate() {
        return BiPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i) {
        return !((IntPredicate) this.b).test(i);
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        return ((Spliterator) this.b).tryAdvance(new r(consumer, 2));
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = ((Spliterator) this.b).trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new h(3, spliteratorTrySplit);
    }

    public h(Map map) {
        this.a = 2;
        this.b = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                j$.time.format.p pVar = j$.time.format.a.b;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, j$.time.format.a.b);
            map2.put((t) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, j$.time.format.a.b);
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ IntPredicate m437negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return !((BiPredicate) this.b).test(obj, obj2);
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ Predicate mo438negate() {
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
            case 6:
                return !((Predicate) this.b).test(obj);
            default:
                return this.b.equals(obj);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 11:
                ((K0) this.b).accept((K0) obj);
                break;
            case 12:
                ((ArrayList) this.b).add(obj);
                break;
            default:
                ((Y0) this.b).accept(obj);
                break;
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        BinaryOperator binaryOperator = (BinaryOperator) this.b;
        Map map = (Map) obj;
        Set set = Collectors.a;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            Map.EL.merge(map, entry.getKey(), entry.getValue(), binaryOperator);
        }
        return map;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* renamed from: accept, reason: collision with other method in class */
    public boolean mo436accept(Object obj) {
        return ((DirectoryStream.Filter) this.b).mo436accept(AbstractC0040a.g(obj));
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void d(long j) {
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void end() {
    }
}
