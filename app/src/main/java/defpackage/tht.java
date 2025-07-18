package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tht {
    private final AtomicReference a;

    public tht(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final Optional a() {
        return (Optional) this.a.get();
    }
}
