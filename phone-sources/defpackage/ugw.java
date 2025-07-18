package defpackage;

import com.google.common.collect.ForwardingObject;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ugw extends ForwardingObject implements Future {
    protected ugw() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return delegate().cancel(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract Future delegate();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return delegate().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return delegate().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return delegate().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return delegate().get(j, timeUnit);
    }
}
