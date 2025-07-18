package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfo implements gfn {
    private final mcw a;
    private final euj b;
    private final eum c;

    public gfo(mcw mcwVar, euj eujVar, eum eumVar) {
        mcwVar.getClass();
        eujVar.getClass();
        eumVar.getClass();
        this.a = mcwVar;
        this.b = eujVar;
        this.c = eumVar;
    }

    @Override // defpackage.gfn
    public final /* synthetic */ gfi a(rqs rqsVar) {
        mcw mcwVar = this.a;
        ggg gggVar = ggg.EVENT_TYPE_MILESTONE;
        Duration durationOfNanos = Duration.ofNanos(mcwVar.a());
        durationOfNanos.getClass();
        ((rqt) rqsVar).c = yqt.i(durationOfNanos);
        return this.b.a(gggVar, rqsVar);
    }

    @Override // defpackage.gfn
    public final /* synthetic */ gfi b(rqs rqsVar) {
        mcw mcwVar = this.a;
        ggg gggVar = ggg.EVENT_TYPE_START;
        Duration durationOfNanos = Duration.ofNanos(mcwVar.a());
        durationOfNanos.getClass();
        ((rqt) rqsVar).c = yqt.i(durationOfNanos);
        return this.b.a(gggVar, rqsVar);
    }

    @Override // defpackage.gfn
    public final /* bridge */ /* synthetic */ gfd c(rqw rqwVar) {
        Duration durationOfNanos = Duration.ofNanos(this.a.a());
        durationOfNanos.getClass();
        rqwVar.f(durationOfNanos);
        return new gfe((geu) this.c.a.a.fE.a(), rqwVar);
    }
}
