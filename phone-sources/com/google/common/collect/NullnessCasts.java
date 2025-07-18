package com.google.common.collect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class NullnessCasts {
    private NullnessCasts() {
    }

    static <T> T unsafeNull() {
        return null;
    }

    static <T> T uncheckedCastNullableTToT(T t) {
        return t;
    }
}
