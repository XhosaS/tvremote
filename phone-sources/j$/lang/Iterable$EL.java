package j$.lang;

import j$.util.C0168z;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-EL, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class Iterable$EL {
    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof a) {
            ((a) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof Collection)) {
            Iterable$CC.$default$forEach(iterable, consumer);
            return;
        }
        consumer.getClass();
        Iterator it = ((Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static Spliterator spliterator(Iterable iterable) {
        if (iterable instanceof a) {
            return ((a) iterable).spliterator();
        }
        if (iterable instanceof LinkedHashSet) {
            return Spliterators.spliterator((LinkedHashSet) iterable, 17);
        }
        if (!(iterable instanceof SortedSet)) {
            return iterable instanceof Set ? Spliterators.spliterator((Set) iterable, 1) : iterable instanceof List ? List.CC.$default$spliterator((java.util.List) iterable) : iterable instanceof Collection ? Collection.CC.$default$spliterator((java.util.Collection) iterable) : Spliterators.spliteratorUnknownSize(iterable.iterator(), 0);
        }
        SortedSet sortedSet = (SortedSet) iterable;
        return new C0168z(sortedSet, sortedSet);
    }
}
