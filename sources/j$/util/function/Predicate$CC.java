package j$.util.function;

import j$.time.format.s;
import java.util.function.Predicate;

/* renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new b(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new s(1, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new b(predicate, predicate2, 1);
    }

    public static <T> Predicate<T> isEqual(Object obj) {
        return obj == null ? new j$.time.format.b(9) : new s(2, obj);
    }
}
