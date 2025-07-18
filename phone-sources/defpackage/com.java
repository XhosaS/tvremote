package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class com {
    public Object a;
    public coq b;
    public cos c = new cos();
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        cos cosVar = this.c;
        if (cosVar != null) {
            cosVar.c(runnable, executor);
        }
    }

    public final void b() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void c(Object obj) {
        this.d = true;
        coq coqVar = this.b;
        if (coqVar == null || !coqVar.b.f(obj)) {
            return;
        }
        b();
    }

    public final void d(Throwable th) {
        this.d = true;
        coq coqVar = this.b;
        if (coqVar == null || !coqVar.a(th)) {
            return;
        }
        b();
    }

    protected final void finalize() {
        cos cosVar;
        coq coqVar = this.b;
        if (coqVar != null && !coqVar.isDone()) {
            Object obj = this.a;
            Objects.toString(obj);
            coqVar.a(new con("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (this.d || (cosVar = this.c) == null) {
            return;
        }
        cosVar.f(null);
    }
}
