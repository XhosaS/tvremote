package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class edj implements RunnableFuture {
    private Exception c;
    private Object d;
    private Thread e;
    private boolean f;
    public final shx a = new shx();
    private final shx g = new shx();
    private final Object b = new Object();

    protected edj() {
    }

    private final Object d() throws ExecutionException {
        if (this.f) {
            throw new CancellationException();
        }
        if (this.c == null) {
            return this.d;
        }
        throw new ExecutionException(this.c);
    }

    protected abstract Object a();

    public final void b() {
        this.g.c();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.b) {
            if (!this.f) {
                shx shxVar = this.g;
                if (!shxVar.f()) {
                    this.f = true;
                    c();
                    Thread thread = this.e;
                    if (thread == null) {
                        this.a.g();
                        shxVar.g();
                    } else if (z) {
                        thread.interrupt();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.g.b();
        return d();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.g.f();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            if (this.f) {
                return;
            }
            this.e = Thread.currentThread();
            this.a.g();
            try {
                try {
                    this.d = a();
                    synchronized (this.b) {
                        this.g.g();
                        this.e = null;
                        Thread.interrupted();
                    }
                } catch (Exception e) {
                    this.c = e;
                    synchronized (this.b) {
                        this.g.g();
                        this.e = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.b) {
                    this.g.g();
                    this.e = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.g.d(TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            return d();
        }
        throw new TimeoutException();
    }

    protected void c() {
    }
}
