package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class bm extends bp {
    final /* synthetic */ vs a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ vb c;
    final /* synthetic */ uq d;
    final /* synthetic */ bq e;

    public bm(bq bqVar, vs vsVar, AtomicReference atomicReference, vb vbVar, uq uqVar) {
        this.e = bqVar;
        this.a = vsVar;
        this.b = atomicReference;
        this.c = vbVar;
        this.d = uqVar;
    }

    @Override // defpackage.bp
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        bq bqVar = this.e;
        sb.append(bqVar.m);
        sb.append("_rq#");
        sb.append(bqVar.af.getAndIncrement());
        this.b.set(((bl) this.a).b().c(sb.toString(), bqVar, this.c, this.d));
    }
}
