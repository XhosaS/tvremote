package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ugz extends ugu implements AutoCloseable, uhs {
    protected ugz() {
    }

    @Override // defpackage.ugu, java.lang.AutoCloseable
    public /* synthetic */ void close() throws InterruptedException {
        a.h(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ugu, com.google.common.collect.ForwardingObject
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract uhs delegate();

    @Override // defpackage.ugu, java.util.concurrent.ExecutorService
    /* renamed from: eq */
    public final uhp submit(Runnable runnable) {
        return delegate().submit(runnable);
    }

    @Override // defpackage.ugu, java.util.concurrent.ExecutorService
    /* renamed from: er */
    public final uhp submit(Callable callable) {
        return delegate().submit(callable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ugu
    /* renamed from: f */
    public /* bridge */ /* synthetic */ ExecutorService delegate() {
        throw null;
    }

    @Override // defpackage.ugu, java.util.concurrent.ExecutorService
    /* renamed from: g */
    public final uhp submit(Runnable runnable, Object obj) {
        return delegate().submit(runnable, obj);
    }
}
