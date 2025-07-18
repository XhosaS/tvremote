package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zxa extends yxq implements Future {
    protected zxa() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return eR().cancel(z);
    }

    protected abstract Future eR();

    @Override // defpackage.yxq
    protected /* bridge */ /* synthetic */ Object f() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return eR().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return eR().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return eR().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return eR().get(j, timeUnit);
    }
}
