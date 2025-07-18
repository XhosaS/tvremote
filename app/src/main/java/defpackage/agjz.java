package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjz implements agfs, aggi {
    final agfs a;
    final aggy b;
    aggi c;
    boolean d;

    public agjz(agfs agfsVar, aggy aggyVar) {
        this.a = agfsVar;
        this.b = aggyVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.a();
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        try {
            this.b.a(obj);
            this.a.c(obj);
        } catch (Throwable th) {
            aggq.a(th);
            this.c.dispose();
            fe(th);
        }
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (aghd.d(this.c, aggiVar)) {
            this.c = aggiVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.c.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        if (this.d) {
            agoh.e(th);
        } else {
            this.d = true;
            this.a.fe(th);
        }
    }
}
