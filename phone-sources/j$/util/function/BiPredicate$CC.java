package j$.util.function;

import java.util.function.BiPredicate;

/* renamed from: j$.util.function.BiPredicate$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class BiPredicate$CC {
    public static BiPredicate $default$and(BiPredicate biPredicate, BiPredicate biPredicate2) {
        biPredicate2.getClass();
        return new a(biPredicate, biPredicate2, 1);
    }

    public static BiPredicate $default$negate(BiPredicate biPredicate) {
        return new j$.desugar.sun.nio.fs.h(4, biPredicate);
    }

    public static BiPredicate $default$or(BiPredicate biPredicate, BiPredicate biPredicate2) {
        biPredicate2.getClass();
        return new a(biPredicate, biPredicate2, 0);
    }
}
