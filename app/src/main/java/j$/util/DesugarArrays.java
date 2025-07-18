package j$.util;

import j$.util.Spliterator;
import j$.util.stream.C0093k;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.k0;
import j$.util.stream.q0;

/* loaded from: classes3.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return q0.a(Spliterators.b(tArr, 0, tArr.length, 1040), false);
    }

    public static IntStream stream(int[] iArr) {
        Spliterator.OfInt ofIntSpliterator = Spliterators.spliterator(iArr, 0, iArr.length, 1040);
        return new C0093k(ofIntSpliterator, k0.m(ofIntSpliterator), false);
    }
}
