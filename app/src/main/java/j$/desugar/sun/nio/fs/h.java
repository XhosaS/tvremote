package j$.desugar.sun.nio.fs;

import j$.nio.file.AbstractC0002a;
import j$.nio.file.C0044s;
import j$.nio.file.Path;
import j$.nio.file.y;
import j$.util.Map;
import j$.util.Spliterator;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.A;
import j$.util.stream.AbstractC0083a;
import j$.util.stream.Collectors;
import j$.util.stream.H;
import j$.util.stream.L;
import j$.util.stream.c0;
import j$.util.stream.i0;
import j$.util.stream.j0;
import j$.util.stream.o0;
import j$.util.stream.p0;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements y, DirectoryStream.Filter, Spliterator, Predicate, Supplier, BinaryOperator, LongFunction, Consumer, BooleanSupplier, c0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.nio.file.y
    public boolean a(Path path) {
        return ((Pattern) this.b).matcher(path.toString()).matches();
    }

    @Override // j$.util.stream.c0
    public /* synthetic */ void accept(int i) {
        L.d();
        throw null;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return (j < 0 || j >= 2147483639) ? new H() : new A(j, (IntFunction) this.b);
    }

    public void b(j0 j0Var) {
        ((EnumMap) this.b).put((EnumMap) j0Var, (j0) 1);
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
        ((Spliterator) this.b).forEachRemaining(new C0044s(consumer, 2));
    }

    @Override // j$.util.stream.c0
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return ((AbstractC0083a) this.b).j(0);
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 9:
                o0 o0Var = (o0) this.b;
                return o0Var.d.tryAdvance(o0Var.e);
            default:
                p0 p0Var = (p0) this.b;
                return p0Var.d.tryAdvance(p0Var.e);
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

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        return ((Spliterator) this.b).tryAdvance(new C0044s(consumer, 2));
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = ((Spliterator) this.b).trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new h(2, spliteratorTrySplit);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 7:
                ((ArrayList) this.b).add(obj);
                break;
            default:
                ((i0) this.b).accept(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* renamed from: accept, reason: collision with other method in class */
    public boolean mo115accept(Object obj) {
        return ((DirectoryStream.Filter) this.b).mo115accept(AbstractC0002a.g(obj));
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        BinaryOperator binaryOperator = (BinaryOperator) this.b;
        Map map = (Map) obj;
        Set set = Collectors.a;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            Map.EL.b(map, entry.getKey(), entry.getValue(), binaryOperator);
        }
        return map;
    }

    @Override // j$.util.stream.c0
    public /* synthetic */ void d(long j) {
    }

    @Override // j$.util.stream.c0
    public /* synthetic */ void end() {
    }
}
