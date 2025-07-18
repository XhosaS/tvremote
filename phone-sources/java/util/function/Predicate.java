package java.util.function;

/* loaded from: classes4.dex */
public interface Predicate<T> {
    /* renamed from: negate */
    Predicate<T> mo438negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);
}
