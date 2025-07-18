package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ooe extends onz {
    public boolean b;
    public volatile boolean c;
    public Exception d;
    private Object f;
    public final Object a = new Object();
    public final yau e = new yau((byte[]) null);

    private final void w() {
        ocv.aA(this.b, "Task is not yet complete");
    }

    private final void x() {
        if (this.c) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void y() {
        if (this.b) {
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excD = d();
        }
    }

    @Override // defpackage.onz
    public final onz a(Executor executor, ono onoVar) {
        ooe ooeVar = new ooe();
        this.e.f(new onp(executor, onoVar, ooeVar));
        r();
        return ooeVar;
    }

    @Override // defpackage.onz
    public final onz b(Executor executor, ono onoVar) {
        ooe ooeVar = new ooe();
        this.e.f(new onw(executor, onoVar, ooeVar, 1));
        r();
        return ooeVar;
    }

    @Override // defpackage.onz
    public final onz c(Executor executor, ony onyVar) {
        ooe ooeVar = new ooe();
        this.e.f(new onw(executor, onyVar, ooeVar, 0));
        r();
        return ooeVar;
    }

    @Override // defpackage.onz
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.onz
    public final Object e() {
        Object obj;
        synchronized (this.a) {
            w();
            x();
            Exception exc = this.d;
            if (exc != null) {
                throw new onx(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.onz
    public final Object f(Class cls) {
        Object obj;
        synchronized (this.a) {
            w();
            x();
            if (cls.isInstance(this.d)) {
                throw ((Throwable) cls.cast(this.d));
            }
            Exception exc = this.d;
            if (exc != null) {
                throw new onx(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.onz
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.onz
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.onz
    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.onz
    public final void j(Executor executor, onr onrVar) {
        this.e.f(new ons(executor, onrVar, 1));
        r();
    }

    @Override // defpackage.onz
    public final void k(ont ontVar) {
        l(ooc.a, ontVar);
    }

    @Override // defpackage.onz
    public final void l(Executor executor, ont ontVar) {
        this.e.f(new ons(executor, ontVar, 0));
        r();
    }

    @Override // defpackage.onz
    public final void m(Executor executor, onu onuVar) {
        this.e.f(new ons(executor, onuVar, 2));
        r();
    }

    @Override // defpackage.onz
    public final void n(Executor executor, onv onvVar) {
        this.e.f(new ons(executor, onvVar, 3));
        r();
    }

    @Override // defpackage.onz
    public final void o(onr onrVar) {
        j(ooc.a, onrVar);
    }

    @Override // defpackage.onz
    public final void p(onu onuVar) {
        m(ooc.a, onuVar);
    }

    @Override // defpackage.onz
    public final void q(onv onvVar) {
        n(ooc.a, onvVar);
    }

    public final void r() {
        synchronized (this.a) {
            if (this.b) {
                this.e.g(this);
            }
        }
    }

    public final void s(Exception exc) {
        ocv.aG(exc, "Exception must not be null");
        synchronized (this.a) {
            y();
            this.b = true;
            this.d = exc;
        }
        this.e.g(this);
    }

    public final void t(Object obj) {
        synchronized (this.a) {
            y();
            this.b = true;
            this.f = obj;
        }
        this.e.g(this);
    }

    public final boolean u(Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f = obj;
            this.e.g(this);
            return true;
        }
    }

    public final void v() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.g(this);
        }
    }
}
