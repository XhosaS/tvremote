package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hva implements Future, hvb, hvm {
    private final int a;
    private final int b;
    private Object c;
    private hux d;
    private boolean e;
    private boolean f;
    private boolean g;
    private hnr h;

    public hva(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private final synchronized Object n(Long l) {
        if (!isDone() && !hwp.i()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.e) {
            throw new CancellationException();
        }
        if (this.g) {
            throw new ExecutionException(this.h);
        }
        if (!this.f) {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.g) {
                throw new ExecutionException(this.h);
            }
            if (this.e) {
                throw new CancellationException();
            }
            if (!this.f) {
                throw new TimeoutException();
            }
        }
        return this.c;
    }

    @Override // defpackage.hvm
    public final synchronized void b(Object obj, hvv hvvVar) {
    }

    @Override // defpackage.hvm
    public final synchronized hux c() {
        return this.d;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.e = true;
            notifyAll();
            hux huxVar = null;
            if (z) {
                hux huxVar2 = this.d;
                this.d = null;
                huxVar = huxVar2;
            }
            if (huxVar != null) {
                huxVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.hvm
    public final synchronized void d(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public final synchronized void f(hux huxVar) {
        this.d = huxVar;
    }

    @Override // defpackage.hvm
    public final void g(hvd hvdVar) {
        hvdVar.e(this.a, this.b);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return n(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.hvb
    public final synchronized void i(hnr hnrVar, hvm hvmVar) {
        this.g = true;
        this.h = hnrVar;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.e && !this.f) {
            if (!this.g) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.hvb
    public final synchronized void j(Object obj, Object obj2, int i) {
        this.f = true;
        this.c = obj;
        notifyAll();
    }

    public final String toString() {
        hux huxVar;
        String str;
        String strValueOf = String.valueOf(super.toString());
        synchronized (this) {
            huxVar = null;
            if (this.e) {
                str = "CANCELLED";
            } else if (this.g) {
                str = "FAILURE";
            } else if (this.f) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                huxVar = this.d;
            }
        }
        String strConcat = strValueOf.concat("[status=");
        if (huxVar == null) {
            return strConcat + str + "]";
        }
        return strConcat + str + ", request=[" + huxVar.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return n(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.hud
    public final void k() {
    }

    @Override // defpackage.hud
    public final void l() {
    }

    @Override // defpackage.hud
    public final void m() {
    }

    @Override // defpackage.hvm
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public final void h(hvd hvdVar) {
    }
}
