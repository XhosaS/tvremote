package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ots implements uha {
    final /* synthetic */ uhp a;
    final /* synthetic */ kwy b;
    final /* synthetic */ kwy c;

    public ots(kwy kwyVar, uhp uhpVar, kwy kwyVar2) {
        this.b = kwyVar;
        this.a = uhpVar;
        this.c = kwyVar2;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            ((ooe) ((kwy) this.c.a).a).u(null);
        } else if (th instanceof Exception) {
            this.b.t((Exception) th);
        } else {
            this.b.t(new ExecutionException(th));
        }
    }

    @Override // defpackage.uha
    public final void b(Object obj) {
        this.b.u(obj);
    }
}
