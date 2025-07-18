package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* loaded from: classes4.dex */
public interface Stream<T> extends BaseStream<T, Stream<T>> {

    /* renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static <T> Stream<T> empty() {
            return StreamSupport.stream(Spliterators.a, false);
        }

        public static <T> Stream<T> of(T t) {
            q1 q1Var = new q1();
            q1Var.b = t;
            q1Var.a = -2;
            return StreamSupport.stream(q1Var, false);
        }
    }

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    long count();

    Stream<T> filter(Predicate<? super T> predicate);

    Optional<T> findFirst();

    void forEach(Consumer<? super T> consumer);

    void forEachOrdered(Consumer<? super T> consumer);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    IntStream mapToInt(ToIntFunction<? super T> toIntFunction);

    Stream<T> peek(Consumer<? super T> consumer);

    Stream<T> sorted(Comparator<? super T> comparator);

    <A> A[] toArray(IntFunction<A[]> intFunction);
}
