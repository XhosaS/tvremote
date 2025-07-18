package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes4.dex */
public final class Optional<T> {
    public static final Optional b = new Optional();
    public final Object a;

    public Optional() {
        this.a = null;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        defpackage.a aVar = (Object) this.a;
        if (aVar != null) {
            consumer.accept(aVar);
        }
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        function.getClass();
        return !isPresent() ? empty() : ofNullable(function.apply((Object) this.a));
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }

    public Optional(Object obj) {
        obj.getClass();
        this.a = obj;
    }
}
