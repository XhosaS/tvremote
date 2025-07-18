package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agit extends AtomicReference implements Runnable, agfg, aggi {
    private static final long serialVersionUID = 8571289934935992137L;
    final agfg a;
    final agfx b;
    Throwable c;

    public agit(agfg agfgVar, agfx agfxVar) {
        this.a = agfgVar;
        this.b = agfxVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        aghd.g(this, this.b.b(this));
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
        this.c = th;
        aghd.g(this, this.b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.c;
        if (th == null) {
            this.a.a();
        } else {
            this.c = null;
            this.a.fg(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.valueOf(this.a);
    }
}
