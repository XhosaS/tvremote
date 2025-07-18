package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xo {
    Object a;
    xs b;
    public xx c = new xx();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        xx xxVar = this.c;
        if (xxVar != null) {
            xxVar.d(runnable, executor);
        }
    }

    public final void b(Object obj) {
        this.d = true;
        xs xsVar = this.b;
        if (xsVar == null || !xsVar.b.g(obj)) {
            return;
        }
        e();
    }

    public final void c() {
        this.d = true;
        xs xsVar = this.b;
        if (xsVar == null || !xsVar.b.cancel(true)) {
            return;
        }
        e();
    }

    public final void d(Throwable th) {
        this.d = true;
        xs xsVar = this.b;
        if (xsVar == null || !xsVar.b.h(th)) {
            return;
        }
        e();
    }

    protected final void finalize() {
        xx xxVar;
        xs xsVar = this.b;
        if (xsVar != null) {
            xn xnVar = xsVar.b;
            if (!xnVar.isDone()) {
                Object obj = this.a;
                Objects.toString(obj);
                xnVar.h(new xp("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
            }
        }
        if (this.d || (xxVar = this.c) == null) {
            return;
        }
        xxVar.g(null);
    }
}
