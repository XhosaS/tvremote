package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aglw extends AtomicReference implements agfz, agfg, aggi {
    private static final long serialVersionUID = -2177128922851101253L;
    final agfg a;
    final aggz b;

    public aglw(agfg agfgVar, aggz aggzVar) {
        this.a = agfgVar;
        this.b = aggzVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.agfz
    public final void c(aggi aggiVar) {
        aghd.g(this, aggiVar);
    }

    @Override // defpackage.agfz
    public final void d(Object obj) {
        try {
            agfi agfiVar = (agfi) this.b.a(obj);
            aghn.b(agfiVar, "The mapper returned a null CompletableSource");
            if (aghd.b((aggi) get())) {
                return;
            }
            agfiVar.a(this);
        } catch (Throwable th) {
            aggq.a(th);
            fg(th);
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

    @Override // defpackage.agfz
    public final void fg(Throwable th) {
        this.a.fg(th);
    }
}
