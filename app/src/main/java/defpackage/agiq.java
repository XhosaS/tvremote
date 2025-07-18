package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agiq extends AtomicReference implements agfg, aggi {
    private static final long serialVersionUID = 251330541679988317L;
    final /* synthetic */ agir a;

    public agiq(agir agirVar) {
        this.a = agirVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        agir agirVar = this.a;
        agirVar.e.b(this);
        if (agirVar.decrementAndGet() != 0) {
            if (agirVar.b != Integer.MAX_VALUE) {
                agirVar.f.fi(1L);
            }
        } else {
            Throwable th = (Throwable) agirVar.d.get();
            if (th != null) {
                agirVar.a.fg(th);
            } else {
                agirVar.a.a();
            }
        }
    }

    @Override // defpackage.agfg
    public final void c(aggi aggiVar) {
        aghd.c(this, aggiVar);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfg
    public final void fg(Throwable th) {
        agir agirVar = this.a;
        aggh agghVar = agirVar.e;
        agghVar.b(this);
        if (!agirVar.c) {
            agirVar.f.fh();
            agghVar.dispose();
            agnu agnuVar = agirVar.d;
            if (!agnx.c(agnuVar, th)) {
                agoh.e(th);
                return;
            } else {
                if (agirVar.getAndSet(0) > 0) {
                    agirVar.a.fg(agnx.b(agnuVar));
                    return;
                }
                return;
            }
        }
        agnu agnuVar2 = agirVar.d;
        if (!agnx.c(agnuVar2, th)) {
            agoh.e(th);
        } else if (agirVar.decrementAndGet() == 0) {
            agirVar.a.fg(agnx.b(agnuVar2));
        } else if (agirVar.b != Integer.MAX_VALUE) {
            agirVar.f.fi(1L);
        }
    }
}
