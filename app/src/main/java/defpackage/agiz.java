package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agiz extends AtomicReference implements Runnable, agfg, aggi {
    private static final long serialVersionUID = 7000911171163930287L;
    final agfg a;
    final aghg b = new aghg();
    final agfi c;

    public agiz(agfg agfgVar, agfi agfiVar) {
        this.a = agfgVar;
        this.c = agfiVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.agfg
    public final void c(aggi aggiVar) {
        aghd.c(this, aggiVar);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this);
        aghd.e(this.b);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfg
    public final void fg(Throwable th) {
        this.a.fg(th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this);
    }
}
