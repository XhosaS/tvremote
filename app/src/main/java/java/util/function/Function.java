package java.util.function;

/* loaded from: classes3.dex */
public interface Function<T, R> {
    /* renamed from: andThen */
    <V> Function<T, V> mo116andThen(Function<? super R, ? extends V> function);

    R apply(T t);
}
