package j$.nio.file;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC0083a;
import j$.util.stream.C0095m;
import j$.util.stream.C0097o;
import j$.util.stream.EnumC0096n;
import j$.util.stream.k0;
import j$.util.stream.l0;
import j$.util.stream.s0;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class A implements E, BiConsumer, BiFunction, Consumer, Supplier, s0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ A(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // j$.util.stream.s0
    public Object a(AbstractC0083a abstractC0083a, Spliterator spliterator) {
        C0095m c0095m = (C0095m) ((A) this.c).get();
        abstractC0083a.l(spliterator, c0095m);
        return Boolean.valueOf(c0095m.b);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
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
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.s0
    public Object b(AbstractC0083a abstractC0083a, Spliterator spliterator) {
        return (Boolean) new C0097o(this, abstractC0083a, spliterator).invoke();
    }

    @Override // j$.util.stream.s0
    public int c() {
        return k0.q | k0.o;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C0095m((EnumC0096n) this.b, (Predicate) this.c);
    }

    @Override // j$.nio.file.E
    public String name() {
        return (String) this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    @Override // j$.nio.file.E
    public Class type() {
        return (Class) this.c;
    }

    public A(l0 l0Var, EnumC0096n enumC0096n, A a) {
        this.a = 6;
        this.b = enumC0096n;
        this.c = a;
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
            case 4:
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
