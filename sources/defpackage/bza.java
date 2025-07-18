package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.stream.Collector;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bza {
    public static final Collector a;

    static {
        final int i = 1;
        final int i2 = 0;
        a = Collector.CC.of(new Supplier() { // from class: byy
            @Override // java.util.function.Supplier
            public final Object get() {
                int i3 = i;
                if (i3 == 0) {
                    return new bzz();
                }
                if (i3 != 1) {
                    bzy bzyVar = bzy.a;
                    return new adx((short[]) null);
                }
                int i4 = bzs.d;
                return new bzo();
            }
        }, new BiConsumer() { // from class: byz
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i3 = i;
                if (i3 == 0) {
                    ((bzz) obj).d(obj2);
                } else if (i3 != 1) {
                    ((adx) obj).l((cau) obj2);
                } else {
                    ((bzo) obj).g(obj2);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i3 = i;
                return i3 != 0 ? i3 != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: byx
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i3 = i2;
                return i3 != 0 ? i3 != 1 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.lang.Object] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i3 = i2;
                if (i3 == 0) {
                    bzo bzoVar = (bzo) obj;
                    bzo bzoVar2 = (bzo) obj2;
                    bzoVar.b(bzoVar2.a, bzoVar2.b);
                    return bzoVar;
                }
                if (i3 != 1) {
                    bzz bzzVar = (bzz) obj;
                    bzz bzzVar2 = (bzz) obj2;
                    bzzVar.b(bzzVar2.a, bzzVar2.b);
                    return bzzVar;
                }
                adx adxVar = (adx) obj;
                Iterator it = ((adx) obj2).a.iterator();
                while (it.hasNext()) {
                    adxVar.l((cau) it.next());
                }
                return adxVar;
            }
        }, new aro(9), new Collector.Characteristics[0]);
        final int i3 = 2;
        Collector.CC.of(new Supplier() { // from class: byy
            @Override // java.util.function.Supplier
            public final Object get() {
                int i32 = i2;
                if (i32 == 0) {
                    return new bzz();
                }
                if (i32 != 1) {
                    bzy bzyVar = bzy.a;
                    return new adx((short[]) null);
                }
                int i4 = bzs.d;
                return new bzo();
            }
        }, new BiConsumer() { // from class: byz
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i32 = i2;
                if (i32 == 0) {
                    ((bzz) obj).d(obj2);
                } else if (i32 != 1) {
                    ((adx) obj).l((cau) obj2);
                } else {
                    ((bzo) obj).g(obj2);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i32 = i2;
                return i32 != 0 ? i32 != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: byx
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i32 = i3;
                return i32 != 0 ? i32 != 1 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.lang.Object] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i32 = i3;
                if (i32 == 0) {
                    bzo bzoVar = (bzo) obj;
                    bzo bzoVar2 = (bzo) obj2;
                    bzoVar.b(bzoVar2.a, bzoVar2.b);
                    return bzoVar;
                }
                if (i32 != 1) {
                    bzz bzzVar = (bzz) obj;
                    bzz bzzVar2 = (bzz) obj2;
                    bzzVar.b(bzzVar2.a, bzzVar2.b);
                    return bzzVar;
                }
                adx adxVar = (adx) obj;
                Iterator it = ((adx) obj2).a.iterator();
                while (it.hasNext()) {
                    adxVar.l((cau) it.next());
                }
                return adxVar;
            }
        }, new aro(10), new Collector.Characteristics[0]);
        Collector.CC.of(new Supplier() { // from class: byy
            @Override // java.util.function.Supplier
            public final Object get() {
                int i32 = i3;
                if (i32 == 0) {
                    return new bzz();
                }
                if (i32 != 1) {
                    bzy bzyVar = bzy.a;
                    return new adx((short[]) null);
                }
                int i4 = bzs.d;
                return new bzo();
            }
        }, new BiConsumer() { // from class: byz
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i32 = i3;
                if (i32 == 0) {
                    ((bzz) obj).d(obj2);
                } else if (i32 != 1) {
                    ((adx) obj).l((cau) obj2);
                } else {
                    ((bzo) obj).g(obj2);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i32 = i3;
                return i32 != 0 ? i32 != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: byx
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i32 = i;
                return i32 != 0 ? i32 != 1 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.lang.Object] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i32 = i;
                if (i32 == 0) {
                    bzo bzoVar = (bzo) obj;
                    bzo bzoVar2 = (bzo) obj2;
                    bzoVar.b(bzoVar2.a, bzoVar2.b);
                    return bzoVar;
                }
                if (i32 != 1) {
                    bzz bzzVar = (bzz) obj;
                    bzz bzzVar2 = (bzz) obj2;
                    bzzVar.b(bzzVar2.a, bzzVar2.b);
                    return bzzVar;
                }
                adx adxVar = (adx) obj;
                Iterator it = ((adx) obj2).a.iterator();
                while (it.hasNext()) {
                    adxVar.l((cau) it.next());
                }
                return adxVar;
            }
        }, new aro(8), new Collector.Characteristics[0]);
    }
}
