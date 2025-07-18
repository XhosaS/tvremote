package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes4.dex */
public final class StreamSupport {
    public static DoubleStream doubleStream(Spliterator.OfDouble ofDouble, boolean z) {
        return new C0127i(ofDouble, a1.m(ofDouble), z);
    }

    public static IntStream intStream(Spliterator.OfInt ofInt, boolean z) {
        return new C0146s(ofInt, a1.m(ofInt), z);
    }

    public static LongStream longStream(Spliterator.OfLong ofLong, boolean z) {
        return new C0152v(ofLong, a1.m(ofLong), z);
    }

    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean z) {
        spliterator.getClass();
        return new F0(spliterator, a1.m(spliterator), z);
    }
}
