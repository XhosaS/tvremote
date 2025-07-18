package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouy {
    public final Optional a(Optional optional) {
        Optional optionalFlatMap = optional.flatMap(new Function() { // from class: oux
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional optional2 = (Optional) obj;
                optional2.getClass();
                return optional2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        optionalFlatMap.getClass();
        return optionalFlatMap;
    }
}
