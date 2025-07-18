package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;

/* loaded from: classes4.dex */
public interface LongStream extends BaseStream<Long, LongStream> {

    /* renamed from: j$.util.stream.LongStream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static LongStream empty() {
            return StreamSupport.longStream(Spliterators.c, false);
        }

        public static LongStream of(long j) {
            o1 o1Var = new o1();
            o1Var.b = j;
            o1Var.a = -2;
            return StreamSupport.longStream(o1Var, false);
        }
    }

    Stream<Long> boxed();

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    Spliterator<Long> spliterator2();
}
