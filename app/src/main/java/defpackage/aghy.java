package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghy implements agfs, aggi {
    final agfs a;
    final aggy b;
    final aggv c;
    aggi d;

    public aghy(agfs agfsVar, aggy aggyVar, aggv aggvVar) {
        this.a = agfsVar;
        this.b = aggyVar;
        this.c = aggvVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        aggi aggiVar = this.d;
        aghd aghdVar = aghd.a;
        if (aggiVar != aghdVar) {
            this.d = aghdVar;
            this.a.a();
        }
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        try {
            this.b.a(aggiVar);
            if (aghd.d(this.d, aggiVar)) {
                this.d = aggiVar;
                this.a.d(this);
            }
        } catch (Throwable th) {
            aggq.a(th);
            aggiVar.dispose();
            this.d = aghd.a;
            aghe.e(th, this.a);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aggi aggiVar = this.d;
        aghd aghdVar = aghd.a;
        if (aggiVar != aghdVar) {
            this.d = aghdVar;
            try {
                this.c.a();
            } catch (Throwable th) {
                aggq.a(th);
                agoh.e(th);
            }
            aggiVar.dispose();
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        aggi aggiVar = this.d;
        aghd aghdVar = aghd.a;
        if (aggiVar == aghdVar) {
            agoh.e(th);
        } else {
            this.d = aghdVar;
            this.a.fe(th);
        }
    }
}
