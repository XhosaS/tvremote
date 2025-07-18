package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ywk {
    public static final Collector a = Collector.CC.of(new Supplier() { // from class: yvw
        @Override // java.util.function.Supplier
        public final Object get() {
            int i = yyk.e;
            return new yyf(4);
        }
    }, new BiConsumer() { // from class: yvz
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((yyf) obj).g(obj2);
        }

        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: ywa
        public final /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            yyf yyfVar = (yyf) obj;
            yyf yyfVar2 = (yyf) obj2;
            yyfVar.a(yyfVar2.a, yyfVar2.b);
            return yyfVar;
        }
    }, new Function() { // from class: ywb
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo116andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((yyf) obj).f();
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);
    public static final Collector b = Collector.CC.of(new Supplier() { // from class: ywc
        @Override // java.util.function.Supplier
        public final Object get() {
            return new yzo();
        }
    }, new BiConsumer() { // from class: ywd
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((yzo) obj).c(obj2);
        }

        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: ywe
        public final /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            yzo yzoVar = (yzo) obj;
            yzoVar.j((yzo) obj2);
            return yzoVar;
        }
    }, new Function() { // from class: ywf
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo116andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((yzo) obj).f();
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.CC.of(new Supplier() { // from class: ywg
            @Override // java.util.function.Supplier
            public final Object get() {
                yzn yznVar = yzn.a;
                return new yzl();
            }
        }, new BiConsumer() { // from class: ywh
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((yzl) obj).a((zcd) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: yvx
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                yzl yzlVar = (yzl) obj;
                Iterator it = ((yzl) obj2).a.iterator();
                while (it.hasNext()) {
                    yzlVar.a((zcd) it.next());
                }
                return yzlVar;
            }
        }, new Function() { // from class: yvy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list = ((yzl) obj).a;
                yyf yyfVar = new yyf(list.size());
                zcd zcdVar = zcd.a;
                Collections.sort(list, zcc.a);
                zap zapVarK = zar.k(list.iterator());
                while (zapVarK.hasNext()) {
                    zcd zcdVar2 = (zcd) zapVarK.next();
                    while (zapVarK.hasNext()) {
                        zcd zcdVar3 = (zcd) zapVarK.a();
                        yqw.J(((zcdVar2.b.compareTo(zcdVar3.b) < 0 || zcdVar2.c.compareTo(zcdVar3.c) > 0) ? zcdVar3 : zcdVar2).b(), "Overlapping ranges not permitted but found %s overlapping %s", zcdVar2, zcdVar3);
                        zcd zcdVar4 = (zcd) zapVarK.next();
                        yxi yxiVar = zcdVar4.b;
                        yxi yxiVar2 = zcdVar4.c;
                    }
                    yyfVar.g(zcdVar2);
                }
                yyk yykVarF = yyfVar.f();
                return yykVarF.isEmpty() ? yzn.a : (((zcg) yykVarF).d == 1 && ((zcd) zag.f(yykVarF)).equals(zcd.a)) ? yzn.b : new yzn(yykVarF);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
    }

    public static Collector a(Function function, Function function2, BinaryOperator binaryOperator) {
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: ywi
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: ywj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return yyr.j((LinkedHashMap) obj);
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
    }
}
