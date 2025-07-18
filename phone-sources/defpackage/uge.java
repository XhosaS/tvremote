package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uge {
    public static final uho a = new uho(uge.class);
    public final ugb b;
    public final uhi c;
    private final AtomicReference d;

    public uge(uhp uhpVar) {
        this(uhpVar, new ugb());
    }

    public static void e(AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable != null) {
            try {
                executor.execute(new ufx(autoCloseable, 0));
            } catch (RejectedExecutionException e) {
                uho uhoVar = a;
                if (uhoVar.a().isLoggable(Level.WARNING)) {
                    uhoVar.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                e(autoCloseable, ugk.a);
            }
        }
    }

    private final boolean g(ugd ugdVar, ugd ugdVar2) {
        return a.t(this.d, ugdVar, ugdVar2);
    }

    private final uge h(uhi uhiVar) {
        uge ugeVar = new uge(uhiVar);
        c(ugeVar.b);
        return ugeVar;
    }

    public final uge a(ugc ugcVar, Executor executor) {
        return h((uhi) ufn.j(this.c, new ufz(this, ugcVar, 0), executor));
    }

    public final uge b(uga ugaVar, Executor executor) {
        return h((uhi) ufn.j(this.c, new ufz(this, ugaVar, 2), executor));
    }

    public final void c(ugb ugbVar) {
        d(ugd.OPEN, ugd.SUBSUMED);
        ugbVar.a(this.b, ugk.a);
    }

    public final void d(ugd ugdVar, ugd ugdVar2) {
        sij.A(g(ugdVar, ugdVar2), "Expected state to be %s, but it was %s", ugdVar, ugdVar2);
    }

    public final uhi f() {
        uge ugeVar;
        int i = 2;
        if (g(ugd.OPEN, ugd.WILL_CLOSE)) {
            ugeVar = this;
            a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", ugeVar);
            ugeVar.c.c(new ufx(this, i), ugk.a);
        } else {
            ugeVar = this;
            int iOrdinal = ((ugd) ugeVar.d.get()).ordinal();
            if (iOrdinal == 0) {
                throw new AssertionError();
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (iOrdinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return ugeVar.c;
    }

    protected final void finalize() {
        if (((ugd) this.d.get()).equals(ugd.OPEN)) {
            a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            f();
        }
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("state", this.d.get());
        tssVarH.a(this.c);
        return tssVarH.toString();
    }

    public uge(uhp uhpVar, ugb ugbVar) {
        this.d = new AtomicReference(ugd.OPEN);
        this.c = uhi.v(uhpVar);
        this.b = ugbVar;
    }
}
