package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghz extends AtomicReference implements agfg, aggi {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // defpackage.agfg
    public final void a() {
        lazySet(aghd.a);
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
        lazySet(aghd.a);
        agoh.e(new aggs(th));
    }
}
