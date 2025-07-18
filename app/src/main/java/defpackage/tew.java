package defpackage;

import j$.util.Collection;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tew implements wgx {
    private final pjn a;
    private final yyr b;

    public tew(pjn pjnVar, pgm pgmVar, pgm pgmVar2, pgm pgmVar3, pgm pgmVar4) {
        this.a = pjnVar;
        this.b = yyr.n("MDD.CELLULAR.CHARGING.PERIODIC.TASK", pgmVar, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", pgmVar2, "MDD.CHARGING.PERIODIC.TASK", pgmVar3, "MDD.WIFI.CHARGING.PERIODIC.TASK", pgmVar4);
    }

    @Override // defpackage.wgx
    public final zyd a() {
        return this.a.b(yqt.i((Map) Collection.EL.stream(this.b.entrySet()).collect(ywk.a(new Function() { // from class: tet
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: teu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return pkt.a((pgm) ((Map.Entry) obj).getValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: tev
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (pkq) obj;
            }
        }))));
    }
}
