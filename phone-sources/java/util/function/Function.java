package java.util.function;

/* loaded from: classes4.dex */
public interface Function<T, R> {
    /* renamed from: andThen */
    <V> Function<T, V> mo439andThen(Function<? super R, ? extends V> function);

    R apply(T t);
}
