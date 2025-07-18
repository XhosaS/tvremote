package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xi extends xj implements xd {
    final xf a;
    final /* synthetic */ xk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(xk xkVar, xf xfVar, yj yjVar) {
        super(xkVar, yjVar);
        this.b = xkVar;
        this.a = xfVar;
    }

    @Override // defpackage.xd
    public final void a(xf xfVar, xa xaVar) {
        xf xfVar2 = this.a;
        xb xbVar = xfVar2.m().a;
        if (xbVar == xb.a) {
            this.b.g(this.f);
            return;
        }
        xb xbVar2 = null;
        while (xbVar2 != xbVar) {
            e(d());
            xbVar2 = xbVar;
            xbVar = xfVar2.m().a;
        }
    }

    @Override // defpackage.xj
    public final void b() {
        this.a.m().c(this);
    }

    @Override // defpackage.xj
    public final boolean c(xf xfVar) {
        return this.a == xfVar;
    }

    @Override // defpackage.xj
    public final boolean d() {
        return this.a.m().a.a(xb.d);
    }
}
