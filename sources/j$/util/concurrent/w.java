package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.C0021g;
import j$.util.stream.C0023i;
import j$.util.stream.EnumC0022h;
import j$.util.stream.F;
import j$.util.stream.K;
import j$.util.stream.L;
import j$.util.stream.N;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements BiConsumer, BiFunction, Consumer, Supplier, N {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ w(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // j$.util.stream.N
    public Object a(F f, Spliterator spliterator) {
        C0021g c0021g = (C0021g) ((w) this.c).get();
        f.g(c0021g, spliterator);
        return Boolean.valueOf(c0021g.b);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
                BiFunction biFunction = (BiFunction) this.c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            default:
                BiConsumer biConsumer = (BiConsumer) this.b;
                BiConsumer biConsumer2 = (BiConsumer) this.c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.N
    public Object d(F f, Spliterator spliterator) {
        return (Boolean) new C0023i(this, f, spliterator).invoke();
    }

    @Override // j$.util.stream.N
    public int f() {
        return K.q | K.o;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C0021g((EnumC0022h) this.b, (Predicate) this.c);
    }

    public /* synthetic */ w(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    public w(L l, EnumC0022h enumC0022h, w wVar) {
        this.a = 5;
        this.b = enumC0022h;
        this.c = wVar;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                Consumer consumer = (Consumer) this.b;
                Consumer consumer2 = (Consumer) this.c;
                consumer.accept(obj);
                consumer2.accept(obj);
                break;
            default:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }
}
