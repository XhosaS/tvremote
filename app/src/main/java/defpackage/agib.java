package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agib implements agfg {
    final AtomicReference a;
    final agfg b;

    public agib(AtomicReference atomicReference, agfg agfgVar) {
        this.a = atomicReference;
        this.b = agfgVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.agfg
    public final void c(aggi aggiVar) {
        aghd.g(this.a, aggiVar);
    }

    @Override // defpackage.agfg
    public final void fg(Throwable th) {
        this.b.fg(th);
    }
}
