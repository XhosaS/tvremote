package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ros implements roq {
    final /* synthetic */ ttm a;
    final /* synthetic */ ttm b;
    final /* synthetic */ rou c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public ros(rou rouVar, ttm ttmVar, ttm ttmVar2, Object obj, int i) {
        this.e = i;
        this.a = ttmVar;
        this.b = ttmVar2;
        this.d = obj;
        this.c = rouVar;
    }

    private final void a() {
        rou rouVar = this.c;
        roo rooVar = rouVar.b;
        if (rooVar != null) {
            ((rpb) this.d).g.remove(rooVar);
            rouVar.b = null;
        }
    }

    private final void b() {
        rou rouVar = this.c;
        rov rovVar = rouVar.a;
        if (rovVar != null) {
            ((cb) this.d).y(rovVar);
            rouVar.a = null;
        }
    }

    @Override // defpackage.roq
    public final void g(rmp rmpVar) {
        if (this.e != 0) {
            if (((Boolean) this.a.get()).booleanValue()) {
                this.c.c.k(rmpVar);
                return;
            } else if (((Boolean) this.b.get()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.k(rmpVar);
                return;
            }
        }
        if (((Boolean) this.a.get()).booleanValue()) {
            this.c.c.k(rmpVar);
        } else if (((Boolean) this.b.get()).booleanValue()) {
            this.c.c.k(rmpVar);
        } else {
            a();
        }
    }

    @Override // defpackage.roq
    public final void j(rmp rmpVar) {
        if (this.e != 0) {
            if (((Boolean) this.a.get()).booleanValue()) {
                this.c.c.l(rmpVar);
                return;
            } else if (((Boolean) this.b.get()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.l(rmpVar);
                return;
            }
        }
        if (((Boolean) this.a.get()).booleanValue()) {
            this.c.c.l(rmpVar);
        } else if (((Boolean) this.b.get()).booleanValue()) {
            this.c.c.l(rmpVar);
        } else {
            a();
        }
    }
}
