package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.IntPredicate;

/* loaded from: classes4.dex */
public interface IntStream extends BaseStream<Integer, IntStream> {

    /* renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntStream empty() {
            return StreamSupport.intStream(Spliterators.b, false);
        }

        public static IntStream of(int i) {
            n1 n1Var = new n1();
            n1Var.b = i;
            n1Var.a = -2;
            return StreamSupport.intStream(n1Var, false);
        }

        public static IntStream range(int i, int i2) {
            return i >= i2 ? empty() : StreamSupport.intStream(new p1(i, i2), false);
        }
    }

    boolean anyMatch(IntPredicate intPredicate);

    Stream<Integer> boxed();

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    Spliterator<Integer> spliterator2();

    int[] toArray();
}
