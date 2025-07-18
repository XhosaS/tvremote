package defpackage;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ufq extends ufu {
    private static final uho b = new uho(ufq.class);
    private ImmutableCollection c;
    private final boolean h;
    private final boolean i;

    public ufq(ImmutableCollection immutableCollection, boolean z, boolean z2) {
        super(immutableCollection.size());
        immutableCollection.getClass();
        this.c = immutableCollection;
        this.h = z;
        this.i = z2;
    }

    private static void A(Throwable th) {
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean B(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void y(int i, Future future) {
        try {
            h(i, a.G(future));
        } catch (ExecutionException e) {
            z(e.getCause());
        } catch (Throwable th) {
            z(th);
        }
    }

    private final void z(Throwable th) {
        th.getClass();
        if (this.h && !e(th)) {
            Set<Throwable> set = this.seenExceptionsField;
            if (set == null) {
                Set setNewConcurrentHashSet = Sets.newConcurrentHashSet();
                g(setNewConcurrentHashSet);
                ufu.a.b(this, setNewConcurrentHashSet);
                set = this.seenExceptionsField;
                set.getClass();
            }
            if (B(set, th)) {
                A(th);
                return;
            }
        }
        if (th instanceof Error) {
            A(th);
        }
    }

    @Override // defpackage.ufb
    protected final void d() {
        ImmutableCollection immutableCollection = this.c;
        x(1);
        if ((immutableCollection != null) && isCancelled()) {
            boolean zR = r();
            UnmodifiableIterator it = immutableCollection.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zR);
            }
        }
    }

    @Override // defpackage.ufb
    protected final String dw() {
        ImmutableCollection immutableCollection = this.c;
        return immutableCollection != null ? "futures=".concat(immutableCollection.toString()) : super.dw();
    }

    @Override // defpackage.ufu
    public final void g(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thM = m();
        thM.getClass();
        B(set, thM);
    }

    public abstract void h(int i, Object obj);

    public final void i(ImmutableCollection immutableCollection) {
        int iA = ufu.a.a(this);
        int i = 0;
        sij.x(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            if (immutableCollection != null) {
                UnmodifiableIterator it = immutableCollection.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        y(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            j();
            x(2);
        }
    }

    public abstract void j();

    final void v() {
        ImmutableCollection immutableCollection = this.c;
        immutableCollection.getClass();
        if (immutableCollection.isEmpty()) {
            j();
            return;
        }
        if (this.h) {
            UnmodifiableIterator it = this.c.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final uhp uhpVar = (uhp) it.next();
                int i2 = i + 1;
                if (uhpVar.isDone()) {
                    w(i, uhpVar);
                } else {
                    uhpVar.c(new Runnable() { // from class: ufo
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.w(i, uhpVar);
                        }
                    }, ugk.a);
                }
                i = i2;
            }
            return;
        }
        ImmutableCollection immutableCollection2 = this.c;
        final ImmutableCollection immutableCollection3 = true != this.i ? null : immutableCollection2;
        Runnable runnable = new Runnable() { // from class: ufp
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(immutableCollection3);
            }
        };
        UnmodifiableIterator it2 = immutableCollection2.iterator();
        while (it2.hasNext()) {
            uhp uhpVar2 = (uhp) it2.next();
            if (uhpVar2.isDone()) {
                i(immutableCollection3);
            } else {
                uhpVar2.c(runnable, ugk.a);
            }
        }
    }

    public final void w(int i, uhp uhpVar) {
        try {
            if (uhpVar.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                y(i, uhpVar);
            }
        } finally {
            i(null);
        }
    }

    public void x(int i) {
        this.c = null;
    }
}
