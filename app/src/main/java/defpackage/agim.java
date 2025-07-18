package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agim extends agff {
    final Runnable a;

    public agim(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.agff
    protected final void l(agfg agfgVar) {
        aggk aggkVar = new aggk(aghm.a);
        agfgVar.c(aggkVar);
        try {
            this.a.run();
            if (aggkVar.f()) {
                return;
            }
            agfgVar.a();
        } catch (Throwable th) {
            aggq.a(th);
            if (aggkVar.f()) {
                agoh.e(th);
            } else {
                agfgVar.fg(th);
            }
        }
    }
}
