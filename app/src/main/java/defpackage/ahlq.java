package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahlq extends ahbm implements ahcd {
    public final ahbm a;
    private final int g;
    private final /* synthetic */ ahcd f = ahca.a;
    public final agzw d = new agzw(0, agzz.a);
    private final ahlw h = new ahlw();
    public final Object e = new Object();

    public ahlq(ahbm ahbmVar, int i) {
        this.a = ahbmVar;
        this.g = i;
    }

    private final boolean h() {
        synchronized (this.e) {
            agzw agzwVar = this.d;
            if (agzwVar.c >= this.g) {
                return false;
            }
            agzw.a.incrementAndGet(agzwVar);
            return true;
        }
    }

    @Override // defpackage.ahbm
    public final void a(agte agteVar, Runnable runnable) {
        Runnable runnableE;
        this.h.d(runnable);
        if (this.d.c >= this.g || !h() || (runnableE = e()) == null) {
            return;
        }
        try {
            ahle.b(this.a, this, new ahlp(this, runnableE));
        } catch (Throwable th) {
            agzw.a.decrementAndGet(this.d);
            throw th;
        }
    }

    @Override // defpackage.ahcd
    public final void c(long j, ahap ahapVar) {
        this.f.c(j, ahapVar);
    }

    public final Runnable e() {
        while (true) {
            ahlw ahlwVar = this.h;
            Runnable runnable = (Runnable) ahlwVar.b();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.e) {
                agzw agzwVar = this.d;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = agzw.a;
                atomicIntegerFieldUpdater.decrementAndGet(agzwVar);
                if (ahlwVar.a() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(agzwVar);
            }
        }
    }

    @Override // defpackage.ahbm
    public final void f(agte agteVar, Runnable runnable) {
        Runnable runnableE;
        this.h.d(runnable);
        if (this.d.c >= this.g || !h() || (runnableE = e()) == null) {
            return;
        }
        try {
            this.a.f(this, new ahlp(this, runnableE));
        } catch (Throwable th) {
            agzw.a.decrementAndGet(this.d);
            throw th;
        }
    }

    @Override // defpackage.ahcd
    public final ahcn g(long j, Runnable runnable, agte agteVar) {
        return this.f.g(j, runnable, agteVar);
    }

    @Override // defpackage.ahbm
    public final String toString() {
        return this.a + ".limitedParallelism(" + this.g + ")";
    }
}
