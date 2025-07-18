package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agnp extends AtomicInteger implements agfm, aidf {
    private static final long serialVersionUID = -4945028590049415624L;
    final aide a;
    final agnu b = new agnu();
    final AtomicLong c = new AtomicLong();
    final AtomicReference d = new AtomicReference();
    final AtomicBoolean e = new AtomicBoolean();
    volatile boolean f;

    public agnp(aide aideVar) {
        this.a = aideVar;
    }

    @Override // defpackage.agfm, defpackage.aide
    public final void a(aidf aidfVar) {
        if (!this.e.compareAndSet(false, true)) {
            aidfVar.fh();
            fh();
            e(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.a.a(this);
        AtomicReference atomicReference = this.d;
        AtomicLong atomicLong = this.c;
        aghn.b(aidfVar, "s is null");
        while (!atomicReference.compareAndSet(null, aidfVar)) {
            if (atomicReference.get() != null) {
                aidfVar.fh();
                if (atomicReference.get() != agns.a) {
                    agns.a();
                    return;
                }
                return;
            }
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet != 0) {
            aidfVar.fi(andSet);
        }
    }

    @Override // defpackage.aide
    public final void d() {
        this.f = true;
        if (getAndIncrement() == 0) {
            agnu agnuVar = this.b;
            aide aideVar = this.a;
            Throwable thB = agnx.b(agnuVar);
            if (thB != null) {
                aideVar.e(thB);
            } else {
                aideVar.d();
            }
        }
    }

    @Override // defpackage.aide
    public final void e(Throwable th) {
        this.f = true;
        agnu agnuVar = this.b;
        if (!agnx.c(agnuVar, th)) {
            agoh.e(th);
        } else if (getAndIncrement() == 0) {
            this.a.e(agnx.b(agnuVar));
        }
    }

    @Override // defpackage.aidf
    public final void fh() {
        aidf aidfVar;
        if (this.f) {
            return;
        }
        AtomicReference atomicReference = this.d;
        aidf aidfVar2 = (aidf) atomicReference.get();
        agns agnsVar = agns.a;
        if (aidfVar2 == agnsVar || (aidfVar = (aidf) atomicReference.getAndSet(agnsVar)) == agnsVar || aidfVar == null) {
            return;
        }
        aidfVar.fh();
    }

    @Override // defpackage.aidf
    public final void fi(long j) {
        if (j <= 0) {
            fh();
            e(new IllegalArgumentException(a.l(j, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference atomicReference = this.d;
        AtomicLong atomicLong = this.c;
        aidf aidfVar = (aidf) atomicReference.get();
        if (aidfVar != null) {
            aidfVar.fi(j);
            return;
        }
        if (agns.b(j)) {
            agnv.a(atomicLong, j);
            aidf aidfVar2 = (aidf) atomicReference.get();
            if (aidfVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    aidfVar2.fi(andSet);
                }
            }
        }
    }

    @Override // defpackage.aide
    public final void g(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            aide aideVar = this.a;
            aideVar.g(obj);
            if (decrementAndGet() != 0) {
                Throwable thB = agnx.b(this.b);
                if (thB != null) {
                    aideVar.e(thB);
                } else {
                    aideVar.d();
                }
            }
        }
    }
}
