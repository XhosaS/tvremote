package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyg {
    public final Object a = new Object();
    public zwb b;
    private zwc c;

    public vyg(zwc zwcVar) {
        uea.c();
        this.c = zwcVar;
    }

    private final void d() {
        synchronized (this.a) {
            yqw.L(this.c.g().isDone());
            final zwc zwcVar = this.c;
            final vyf vyfVar = new vyf(this);
            zwk zwkVar = zwk.a;
            zwa zwaVar = zwa.OPEN;
            zwa zwaVar2 = zwa.WILL_CREATE_VALUE_AND_CLOSER;
            AtomicReference atomicReference = zwcVar.b;
            if (!zvl.a(atomicReference, zwaVar, zwaVar2)) {
                int iOrdinal = ((zwa) atomicReference.get()).ordinal();
                if (iOrdinal == 1) {
                    throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
                }
                if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                    throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
                }
                if (iOrdinal == 5) {
                    throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
                }
                throw new AssertionError(atomicReference);
            }
            zwcVar.d.d(new Runnable() { // from class: zvn
                @Override // java.lang.Runnable
                public final void run() {
                    zwb zwbVar = new zwb(zwcVar);
                    vyg vygVar = vyfVar.a;
                    synchronized (vygVar.a) {
                        vygVar.b = zwbVar;
                    }
                }
            }, zwkVar);
            this.c = null;
        }
    }

    final vxn a() {
        vxn vxnVar;
        synchronized (this.a) {
            if (this.c != null) {
                d();
            }
            try {
                vxnVar = (vxn) zxn.o(this.b.a.d);
            } catch (ExecutionException e) {
                throw new vyy(e.getCause());
            }
        }
        return vxnVar;
    }

    final zyd b() {
        synchronized (this.a) {
            zwc zwcVar = this.c;
            if (zwcVar != null) {
                return zwcVar.g();
            }
            return zxy.a;
        }
    }

    final void c() {
        synchronized (this.a) {
            zwc zwcVar = this.c;
            if (zwcVar != null) {
                zwc.a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "cancel", "cancelling {0}", zwcVar);
                if (zwcVar.d.cancel(false)) {
                    zwcVar.j();
                }
                d();
            }
            this.b.a.j();
        }
    }
}
