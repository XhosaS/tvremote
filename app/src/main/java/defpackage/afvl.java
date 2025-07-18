package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afvl extends afei {
    public final afoh a;
    public final afil b;
    public final afih c;
    public final afem d;
    public final afev[] f;
    public afoe h;
    public boolean i;
    afqm j;
    private final afno k;
    public final Object g = new Object();
    public final affp e = affp.k();

    public afvl(afoh afohVar, afil afilVar, afih afihVar, afem afemVar, afno afnoVar, afev[] afevVarArr) {
        this.a = afohVar;
        this.b = afilVar;
        this.c = afihVar;
        this.d = afemVar;
        this.k = afnoVar;
        this.f = afevVarArr;
    }

    @Override // defpackage.afei
    public final void a(Status status) {
        yqw.B(!status.e(), "Cannot fail with OK status");
        yqw.M(!this.i, "apply() or fail() already called");
        b(new afqz(afrq.b(status), afof.PROCESSED, this.f));
    }

    public final void b(afoe afoeVar) {
        boolean z;
        yqw.M(!this.i, "already finalized");
        this.i = true;
        synchronized (this.g) {
            if (this.h == null) {
                this.h = afoeVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.k.a();
            return;
        }
        yqw.M(this.j != null, "delayedStream is null");
        Runnable runnableG = this.j.g(afoeVar);
        if (runnableG != null) {
            ((afqc) runnableG).a.j();
        }
        this.k.a();
    }
}
