package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public interface IntStream extends InterfaceC0087e {

    /* renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                j$.util.M m = Spliterators.a;
                return new C0093k(m, k0.m(m), false);
            }
            r0 r0Var = new r0(i, i2);
            return new C0093k(r0Var, k0.m(r0Var), false);
        }
    }

    Stream<Integer> boxed();

    <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction);

    int sum();

    int[] toArray();
}
