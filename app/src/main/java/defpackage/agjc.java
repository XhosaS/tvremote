package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjc extends agff {
    final long a;
    final TimeUnit b;
    final agfx c;

    public agjc(long j, TimeUnit timeUnit, agfx agfxVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = agfxVar;
    }

    @Override // defpackage.agff
    protected final void l(agfg agfgVar) {
        agjb agjbVar = new agjb(agfgVar);
        agfgVar.c(agjbVar);
        aghd.g(agjbVar, this.c.c(agjbVar, this.a, this.b));
    }
}
