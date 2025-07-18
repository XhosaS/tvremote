package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjd extends aghv implements agfg {
    final agfs a;
    aggi b;

    public agjd(agfs agfsVar) {
        this.a = agfsVar;
    }

    @Override // defpackage.agfg
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.agfg
    public final void c(aggi aggiVar) {
        if (aghd.d(this.b, aggiVar)) {
            this.b = aggiVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.aghs
    public final /* bridge */ /* synthetic */ Object ff() {
        return null;
    }

    @Override // defpackage.agfg
    public final void fg(Throwable th) {
        this.a.fe(th);
    }

    @Override // defpackage.aghs
    public final boolean fj() {
        return true;
    }

    @Override // defpackage.aghq
    public final int i() {
        return 2;
    }

    @Override // defpackage.aghs
    public final void b() {
    }
}
