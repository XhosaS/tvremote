package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class chn extends chr {
    private static final ciz b = new ciz(chn.class);
    private bzl c;
    private final boolean h;
    private final boolean i;

    public chn(bzl bzlVar, boolean z, boolean z2) {
        super(bzlVar.size());
        bzlVar.getClass();
        this.c = bzlVar;
        this.h = z;
        this.i = z2;
    }

    private final void A(int i, Future future) {
        try {
            g(i, dnx.bI(future));
        } catch (ExecutionException e) {
            B(e.getCause());
        } catch (Throwable th) {
            B(th);
        }
    }

    private final void B(Throwable th) {
        th.getClass();
        if (this.h && !d(th)) {
            Set set = this.seenExceptionsField;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                f(setNewSetFromMap);
                chr.a.b(this, setNewSetFromMap);
                set = this.seenExceptionsField;
                set.getClass();
            }
            if (D(set, th)) {
                C(th);
                return;
            }
        }
        if (th instanceof Error) {
            C(th);
        }
    }

    private static void C(Throwable th) {
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean D(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.cgx
    protected final String a() {
        bzl bzlVar = this.c;
        return bzlVar != null ? "futures=".concat(bzlVar.toString()) : super.a();
    }

    @Override // defpackage.cgx
    protected final void b() {
        bzl bzlVar = this.c;
        z(1);
        if ((bzlVar != null) && isCancelled()) {
            boolean zR = r();
            cbj cbjVarListIterator = bzlVar.listIterator();
            while (cbjVarListIterator.hasNext()) {
                ((Future) cbjVarListIterator.next()).cancel(zR);
            }
        }
    }

    @Override // defpackage.chr
    public final void f(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thL = l();
        thL.getClass();
        D(set, thL);
    }

    public abstract void g(int i, Object obj);

    public final void h(bzl bzlVar) {
        int iA = chr.a.a(this);
        int i = 0;
        bdq.k(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            if (bzlVar != null) {
                cbj cbjVarListIterator = bzlVar.listIterator();
                while (cbjVarListIterator.hasNext()) {
                    Future future = (Future) cbjVarListIterator.next();
                    if (!future.isCancelled()) {
                        A(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            i();
            z(2);
        }
    }

    public abstract void i();

    final void x() {
        bzl bzlVar = this.c;
        bzlVar.getClass();
        if (bzlVar.isEmpty()) {
            i();
            return;
        }
        if (this.h) {
            cbj cbjVarListIterator = this.c.listIterator();
            final int i = 0;
            while (cbjVarListIterator.hasNext()) {
                final cja cjaVar = (cja) cbjVarListIterator.next();
                int i2 = i + 1;
                if (cjaVar.isDone()) {
                    y(i, cjaVar);
                } else {
                    cjaVar.m(new Runnable() { // from class: chl
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.y(i, cjaVar);
                        }
                    }, chz.a);
                }
                i = i2;
            }
            return;
        }
        bzl bzlVar2 = this.c;
        final bzl bzlVar3 = true != this.i ? null : bzlVar2;
        Runnable runnable = new Runnable() { // from class: chm
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h(bzlVar3);
            }
        };
        cbj cbjVarListIterator2 = bzlVar2.listIterator();
        while (cbjVarListIterator2.hasNext()) {
            cja cjaVar2 = (cja) cbjVarListIterator2.next();
            if (cjaVar2.isDone()) {
                h(bzlVar3);
            } else {
                cjaVar2.m(runnable, chz.a);
            }
        }
    }

    public final void y(int i, cja cjaVar) {
        try {
            if (cjaVar.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                A(i, cjaVar);
            }
        } finally {
            h(null);
        }
    }

    public void z(int i) {
        this.c = null;
    }
}
