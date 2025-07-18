package com.google.common.collect;

import java.lang.Throwable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class SneakyThrows<T extends Throwable> {
    private SneakyThrows() {
    }

    static Error sneakyThrow(Throwable th) {
        throw new SneakyThrows().throwIt(th);
    }

    private Error throwIt(Throwable th) throws Throwable {
        throw th;
    }
}
