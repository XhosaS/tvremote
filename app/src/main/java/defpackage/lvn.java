package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvn extends lvf {
    public volatile boolean a;
    private final Object b = new Object();
    private final lvh c = new lvh();
    private boolean d;
    private Object e;
    private Exception f;

    private final void t() {
        kkk.g(this.d, "Task is not yet complete");
    }

    private final void u() {
        if (this.a) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void v() {
        if (this.d) {
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excD = d();
        }
    }

    private final void w() {
        synchronized (this.b) {
            if (this.d) {
                this.c.b(this);
            }
        }
    }

    @Override // defpackage.lvf
    public final lvf a(Executor executor, luj lujVar) {
        lvn lvnVar = new lvn();
        this.c.a(new lul(executor, lujVar, lvnVar));
        w();
        return lvnVar;
    }

    @Override // defpackage.lvf
    public final lvf b(Executor executor, luj lujVar) {
        lvn lvnVar = new lvn();
        this.c.a(new lun(executor, lujVar, lvnVar));
        w();
        return lvnVar;
    }

    @Override // defpackage.lvf
    public final lvf c(Executor executor, lve lveVar) {
        lvn lvnVar = new lvn();
        this.c.a(new lvc(executor, lveVar, lvnVar));
        w();
        return lvnVar;
    }

    @Override // defpackage.lvf
    public final Exception d() {
        Exception exc;
        synchronized (this.b) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.lvf
    public final Object e() {
        Object obj;
        synchronized (this.b) {
            t();
            u();
            Exception exc = this.f;
            if (exc != null) {
                throw new lvd(exc);
            }
            obj = this.e;
        }
        return obj;
    }

    @Override // defpackage.lvf
    public final Object f(Class cls) {
        Object obj;
        synchronized (this.b) {
            t();
            u();
            if (cls.isInstance(this.f)) {
                throw ((Throwable) cls.cast(this.f));
            }
            Exception exc = this.f;
            if (exc != null) {
                throw new lvd(exc);
            }
            obj = this.e;
        }
        return obj;
    }

    @Override // defpackage.lvf
    public final boolean g() {
        return this.a;
    }

    @Override // defpackage.lvf
    public final boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.d;
        }
        return z;
    }

    @Override // defpackage.lvf
    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.d && !this.a && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.lvf
    public final void j(Executor executor, lur lurVar) {
        this.c.a(new luq(executor, lurVar));
        w();
    }

    @Override // defpackage.lvf
    public final void k(luu luuVar) {
        l(lvm.a, luuVar);
    }

    @Override // defpackage.lvf
    public final void l(Executor executor, luu luuVar) {
        this.c.a(new lut(executor, luuVar));
        w();
    }

    @Override // defpackage.lvf
    public final void m(Executor executor, lux luxVar) {
        this.c.a(new luw(executor, luxVar));
        w();
    }

    @Override // defpackage.lvf
    public final void n(Executor executor, lva lvaVar) {
        this.c.a(new luz(executor, lvaVar));
        w();
    }

    public final void o(Exception exc) {
        kkk.l(exc, "Exception must not be null");
        synchronized (this.b) {
            v();
            this.d = true;
            this.f = exc;
        }
        this.c.b(this);
    }

    public final void p(Object obj) {
        synchronized (this.b) {
            v();
            this.d = true;
            this.e = obj;
        }
        this.c.b(this);
    }

    public final boolean q(Exception exc) {
        kkk.l(exc, "Exception must not be null");
        synchronized (this.b) {
            if (this.d) {
                return false;
            }
            this.d = true;
            this.f = exc;
            this.c.b(this);
            return true;
        }
    }

    public final void r() {
        synchronized (this.b) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a = true;
            this.c.b(this);
        }
    }

    public final void s(Object obj) {
        synchronized (this.b) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.e = obj;
            this.c.b(this);
        }
    }
}
