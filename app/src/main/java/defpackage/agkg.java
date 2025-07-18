package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkg extends AtomicReference implements agfg, aggi {
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ agkh a;

    public agkg(agkh agkhVar) {
        this.a = agkhVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        agkh agkhVar = this.a;
        agkhVar.d.b(this);
        agkhVar.a();
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
        agkh agkhVar = this.a;
        agkhVar.d.b(this);
        agkhVar.fe(th);
    }
}
