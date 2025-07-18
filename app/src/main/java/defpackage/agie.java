package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agie extends AtomicReference implements agfg {
    private static final long serialVersionUID = -5454794857847146511L;
    final agif a;

    public agie(agif agifVar) {
        this.a = agifVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        agif agifVar = this.a;
        agifVar.k = false;
        agifVar.b();
    }

    @Override // defpackage.agfg
    public final void c(aggi aggiVar) {
        aghd.g(this, aggiVar);
    }

    @Override // defpackage.agfg
    public final void fg(Throwable th) {
        this.a.c(th);
    }
}
