package j$.util.stream;

import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class L implements BinaryOperator {
    public final /* synthetic */ int a;

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return new P((F) obj, (F) obj2);
            default:
                return new S((H) obj, (H) obj2);
        }
    }
}
