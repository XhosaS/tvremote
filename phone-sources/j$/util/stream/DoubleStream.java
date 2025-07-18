package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;

/* loaded from: classes4.dex */
public interface DoubleStream extends BaseStream<Double, DoubleStream> {

    /* renamed from: j$.util.stream.DoubleStream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static DoubleStream empty() {
            return StreamSupport.doubleStream(Spliterators.d, false);
        }

        public static DoubleStream of(double d) {
            m1 m1Var = new m1();
            m1Var.b = d;
            m1Var.a = -2;
            return StreamSupport.doubleStream(m1Var, false);
        }
    }

    Stream<Double> boxed();

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    Spliterator<Double> spliterator2();
}
