package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwc {
    public static final zyc a = new zyc(zwc.class);
    public final AtomicReference b;
    public final zvw c;
    public final zwx d;

    public zwc(zyd zydVar) {
        this(zydVar, new zvw());
    }

    @Deprecated
    public static zwc b(zyd zydVar, Executor executor) {
        executor.getClass();
        zwc zwcVar = new zwc(zxn.i(zydVar));
        zxn.p(zydVar, new zvr(zwcVar, executor), zwk.a);
        return zwcVar;
    }

    public static zwc c(zvx zvxVar, Executor executor) {
        zvw zvwVar = new zvw();
        zzc zzcVar = new zzc(new zvp(zvxVar, zvwVar));
        executor.execute(zzcVar);
        return new zwc(zzcVar, zvwVar);
    }

    public static void k(final AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable != null) {
            try {
                executor.execute(new Runnable() { // from class: zvm
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        zyc zycVar = zwc.a;
                        try {
                            autoCloseable.close();
                        } catch (Exception e) {
                            zyo.a(e);
                            zwc.a.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", "thrown by close()", (Throwable) e);
                        }
                    }
                });
            } catch (RejectedExecutionException e) {
                zyc zycVar = a;
                if (zycVar.a().isLoggable(Level.WARNING)) {
                    zycVar.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                k(autoCloseable, zwk.a);
            }
        }
    }

    public final zwc a(zwx zwxVar) {
        zwc zwcVar = new zwc(zwxVar);
        h(zwcVar.c);
        return zwcVar;
    }

    public final zwc d(zvy zvyVar, Executor executor) {
        return a((zwx) zuz.h(this.d, new zvs(this, zvyVar), executor));
    }

    public final zwc e(zvv zvvVar, Executor executor) {
        return a((zwx) zuz.h(this.d, new zvt(this, zvvVar), executor));
    }

    public final zwx f() {
        zwc zwcVar;
        AtomicReference atomicReference = this.b;
        if (zvl.a(atomicReference, zwa.OPEN, zwa.WILL_CLOSE)) {
            zwcVar = this;
            a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", zwcVar);
            zwcVar.d.d(new Runnable() { // from class: zvo
                @Override // java.lang.Runnable
                public final void run() {
                    zwc zwcVar2 = this.a;
                    zwa zwaVar = zwa.WILL_CLOSE;
                    zwa zwaVar2 = zwa.CLOSING;
                    zwcVar2.i(zwaVar, zwaVar2);
                    zwcVar2.j();
                    zwcVar2.i(zwaVar2, zwa.CLOSED);
                }
            }, zwk.a);
        } else {
            zwcVar = this;
            int iOrdinal = ((zwa) atomicReference.get()).ordinal();
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
        return zwcVar.d;
    }

    protected final void finalize() {
        if (((zwa) this.b.get()).equals(zwa.OPEN)) {
            a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            f();
        }
    }

    public final zyd g() {
        return zxn.i(zuz.g(this.d, new yqj(), zwk.a));
    }

    public final void h(zvw zvwVar) {
        i(zwa.OPEN, zwa.SUBSUMED);
        zvwVar.b(this.c, zwk.a);
    }

    public final void i(zwa zwaVar, zwa zwaVar2) {
        yqw.ai(zvl.a(this.b, zwaVar, zwaVar2), "Expected state to be %s, but it was %s", zwaVar, zwaVar2);
    }

    public final void j() {
        a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", this);
        this.c.close();
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("state", this.b.get());
        yqqVarB.a().b = this.d;
        return yqqVarB.toString();
    }

    public zwc(zyd zydVar, zvw zvwVar) {
        this.b = new AtomicReference(zwa.OPEN);
        this.d = zwx.u(zydVar);
        this.c = zvwVar;
    }
}
