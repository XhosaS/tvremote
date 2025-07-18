package java.util.function;

/* loaded from: classes2.dex */
public interface Predicate<T> {
    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);
}
