package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Comparator$CC {
    public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> function, Comparator<? super U> comparator) {
        function.getClass();
        comparator.getClass();
        return new b(function, comparator);
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return Collections.reverseOrder();
    }
}
