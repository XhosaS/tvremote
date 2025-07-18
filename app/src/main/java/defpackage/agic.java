package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agic extends AtomicReference implements agfg, aggi {
    private static final long serialVersionUID = -4101678820158072998L;
    final agfg a;
    final agfi b;

    public agic(agfg agfgVar, agfi agfiVar) {
        this.a = agfgVar;
        this.b = agfiVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        this.b.a(new agib(this, this.a));
    }

    @Override // defpackage.agfg
    public final void c(aggi aggiVar) {
        if (aghd.c(this, aggiVar)) {
            this.a.c(this);
        }
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
        this.a.fg(th);
    }
}
