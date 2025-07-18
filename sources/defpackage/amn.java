package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amn extends ami {
    public boolean b;
    public volatile boolean c;
    public Exception d;
    private Object f;
    public final Object a = new Object();
    public final bxj e = new bxj((byte[]) null);

    private final void o() {
        boolean z;
        if (this.b) {
            synchronized (this.a) {
                z = this.b;
            }
            if (!z) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excB = b();
        }
    }

    @Override // defpackage.ami
    public final ami a(Executor executor, alx alxVar) {
        amn amnVar = new amn();
        this.e.g(new aly(executor, alxVar, amnVar));
        j();
        return amnVar;
    }

    @Override // defpackage.ami
    public final Exception b() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.ami
    public final Object c() {
        Object obj;
        synchronized (this.a) {
            qp.n(this.b, "Task is not yet complete");
            if (this.c) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.d;
            if (exc != null) {
                throw new amh(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.ami
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ami
    public final void e(Executor executor, amc amcVar) {
        this.e.g(new amb(executor, amcVar, 0));
        j();
    }

    @Override // defpackage.ami
    public final void f(amd amdVar) {
        g(amm.a, amdVar);
    }

    @Override // defpackage.ami
    public final void g(Executor executor, amd amdVar) {
        this.e.g(new amb(executor, amdVar, 2));
        j();
    }

    @Override // defpackage.ami
    public final void h(Executor executor, amf amfVar) {
        this.e.g(new amb(executor, amfVar, 3));
        j();
    }

    @Override // defpackage.ami
    public final void i(Executor executor, amg amgVar) {
        this.e.g(new amb(executor, amgVar, 4));
        j();
    }

    public final void j() {
        synchronized (this.a) {
            if (this.b) {
                this.e.h(this);
            }
        }
    }

    public final void k(Exception exc) {
        qp.q(exc, "Exception must not be null");
        synchronized (this.a) {
            o();
            this.b = true;
            this.d = exc;
        }
        this.e.h(this);
    }

    public final void l(Object obj) {
        synchronized (this.a) {
            o();
            this.b = true;
            this.f = obj;
        }
        this.e.h(this);
    }

    public final void m() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.h(this);
        }
    }

    public final void n(Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.f = obj;
            this.e.h(this);
        }
    }
}
