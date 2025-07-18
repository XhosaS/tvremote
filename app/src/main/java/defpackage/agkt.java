package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkt implements agfs, aggi {
    final agfs a;
    aggi b;

    public agkt(agfs agfsVar) {
        this.a = agfsVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        agfs agfsVar = this.a;
        agfsVar.c(agfn.a);
        agfsVar.a();
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        aghn.b(obj, "value is null");
        this.a.c(new agfn(obj));
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
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

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        aghn.b(th, "error is null");
        agfn agfnVar = new agfn(new agoa(th));
        agfs agfsVar = this.a;
        agfsVar.c(agfnVar);
        agfsVar.a();
    }
}
