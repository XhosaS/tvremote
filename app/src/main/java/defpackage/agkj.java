package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkj extends AtomicReference implements agfz, aggi {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ agkk a;

    public agkj(agkk agkkVar) {
        this.a = agkkVar;
    }

    @Override // defpackage.agfz
    public final void c(aggi aggiVar) {
        aghd.c(this, aggiVar);
    }

    @Override // defpackage.agfz
    public final void d(Object obj) {
        agme agmeVar;
        agkk agkkVar = this.a;
        agkkVar.b.b(this);
        if (agkkVar.get() == 0 && agkkVar.compareAndSet(0, 1)) {
            agfs agfsVar = agkkVar.a;
            agfsVar.c(obj);
            AtomicInteger atomicInteger = agkkVar.c;
            AtomicReference atomicReference = agkkVar.f;
            int iDecrementAndGet = atomicInteger.decrementAndGet();
            agme agmeVar2 = (agme) atomicReference.get();
            if (iDecrementAndGet == 0 && (agmeVar2 == null || agmeVar2.fj())) {
                Throwable thB = agnx.b(agkkVar.d);
                if (thB != null) {
                    agfsVar.fe(thB);
                    return;
                } else {
                    agfsVar.a();
                    return;
                }
            }
            if (agkkVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            loop0: while (true) {
                AtomicReference atomicReference2 = agkkVar.f;
                agmeVar = (agme) atomicReference2.get();
                if (agmeVar == null) {
                    agmeVar = new agme(agfl.a);
                    while (!atomicReference2.compareAndSet(null, agmeVar)) {
                        if (atomicReference2.get() != null) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            agme agmeVar3 = agmeVar;
            synchronized (agmeVar3) {
                agmeVar3.h(obj);
            }
            agkkVar.c.decrementAndGet();
            if (agkkVar.getAndIncrement() != 0) {
                return;
            }
        }
        agkkVar.h();
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfz
    public final void fg(Throwable th) {
        agkk agkkVar = this.a;
        aggh agghVar = agkkVar.b;
        agghVar.b(this);
        if (!agnx.c(agkkVar.d, th)) {
            agoh.e(th);
            return;
        }
        agkkVar.g.dispose();
        agghVar.dispose();
        agkkVar.c.decrementAndGet();
        agkkVar.g();
    }
}
