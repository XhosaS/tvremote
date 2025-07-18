package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdf {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zbv.a;
            }
        } else {
            if (!(iterable instanceof zde)) {
                return false;
            }
            comparator2 = ((zde) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
