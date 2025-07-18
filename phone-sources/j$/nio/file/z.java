package j$.nio.file;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC0111a;
import j$.util.stream.AbstractC0160z;
import j$.util.stream.C0156x;
import j$.util.stream.C0158y;
import j$.util.stream.a1;
import j$.util.stream.b1;
import j$.util.stream.r1;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public final class z implements D, BiConsumer, BiFunction, Consumer, Supplier, r1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ z(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // j$.util.stream.r1
    public Object a(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        AbstractC0160z abstractC0160z = (AbstractC0160z) ((Supplier) this.c).get();
        abstractC0111a.n(spliterator, abstractC0160z);
        return Boolean.valueOf(abstractC0160z.b);
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
    @Override // j$.util.stream.r1
    public Object b(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        return (Boolean) new j$.util.stream.B(this, abstractC0111a, spliterator).invoke();
    }

    @Override // j$.util.stream.r1
    public int c() {
        return a1.s | a1.p;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 5:
                return new C0158y((j$.util.stream.A) this.b, (IntPredicate) this.c);
            default:
                return new C0156x((j$.util.stream.A) this.b, (Predicate) this.c);
        }
    }

    @Override // j$.nio.file.D
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

    @Override // j$.nio.file.D
    public Class type() {
        return (Class) this.c;
    }

    public z(b1 b1Var, j$.util.stream.A a, Supplier supplier) {
        this.a = 7;
        this.b = a;
        this.c = supplier;
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
