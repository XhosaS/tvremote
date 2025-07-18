package defpackage;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class zvc extends zvg {
    private static final zyc c = new zyc(zvc.class);
    public yxy a;
    private final boolean d;
    private final boolean e;

    public zvc(yxy yxyVar, boolean z, boolean z2) {
        super(yxyVar.size());
        yxyVar.getClass();
        this.a = yxyVar;
        this.d = z;
        this.e = z2;
    }

    private static boolean A(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void x(int i, Future future) {
        try {
            f(i, zze.a(future));
        } catch (ExecutionException e) {
            y(e.getCause());
        } catch (Throwable th) {
            y(th);
        }
    }

    private final void y(Throwable th) {
        th.getClass();
        if (this.d && !q(th)) {
            Set set = this.seenExceptionsField;
            if (set == null) {
                Set setF = Sets.f();
                e(setF);
                zvg.b.b(this, setF);
                set = this.seenExceptionsField;
                set.getClass();
            }
            if (A(set, th)) {
                z(th);
                return;
            }
        }
        if (th instanceof Error) {
            z(th);
        }
    }

    private static void z(Throwable th) {
        c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    @Override // defpackage.zum
    protected final String a() {
        yxy yxyVar = this.a;
        return yxyVar != null ? "futures=".concat(yxyVar.toString()) : super.a();
    }

    @Override // defpackage.zum
    protected final void b() {
        yxy yxyVar = this.a;
        w(1);
        if ((yxyVar != null) && isCancelled()) {
            boolean zR = r();
            zdl it = yxyVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zR);
            }
        }
    }

    @Override // defpackage.zvg
    public final void e(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thK = k();
        thK.getClass();
        A(set, thK);
    }

    public abstract void f(int i, Object obj);

    public final void g(yxy yxyVar) {
        int iA = zvg.b.a(this);
        int i = 0;
        yqw.M(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            if (yxyVar != null) {
                zdl it = yxyVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        x(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            h();
            w(2);
        }
    }

    public abstract void h();

    final void u() {
        yxy yxyVar = this.a;
        yxyVar.getClass();
        if (yxyVar.isEmpty()) {
            h();
            return;
        }
        if (this.d) {
            zdl it = this.a.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final zyd zydVar = (zyd) it.next();
                int i2 = i + 1;
                if (zydVar.isDone()) {
                    v(i, zydVar);
                } else {
                    zydVar.d(new Runnable() { // from class: zva
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.v(i, zydVar);
                        }
                    }, zwk.a);
                }
                i = i2;
            }
            return;
        }
        yxy yxyVar2 = this.a;
        final yxy yxyVar3 = true != this.e ? null : yxyVar2;
        Runnable runnable = new Runnable() { // from class: zvb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(yxyVar3);
            }
        };
        zdl it2 = yxyVar2.iterator();
        while (it2.hasNext()) {
            zyd zydVar2 = (zyd) it2.next();
            if (zydVar2.isDone()) {
                g(yxyVar3);
            } else {
                zydVar2.d(runnable, zwk.a);
            }
        }
    }

    public final void v(int i, zyd zydVar) {
        try {
            if (zydVar.isCancelled()) {
                this.a = null;
                cancel(false);
            } else {
                x(i, zydVar);
            }
        } finally {
            g(null);
        }
    }

    public void w(int i) {
        throw null;
    }
}
