package j$.util;

import j$.util.stream.Stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return j$.nio.file.attribute.a.L(Spliterators.a(tArr, 0, tArr.length, 1040), false);
    }
}
