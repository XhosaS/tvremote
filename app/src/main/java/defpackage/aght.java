package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aght implements agfs, aghp {
    protected final agfs a;
    protected aggi b;
    protected aghp c;
    protected boolean d;

    public aght(agfs agfsVar) {
        this.a = agfsVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.a();
    }

    @Override // defpackage.aghs
    public final void b() {
        this.c.b();
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (aghd.d(this.b, aggiVar)) {
            this.b = aggiVar;
            if (aggiVar instanceof aghp) {
                this.c = (aghp) aggiVar;
            }
            this.a.d(this);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.b.dispose();
    }

    protected final void e(Throwable th) {
        aggq.a(th);
        this.b.dispose();
        fe(th);
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

    @Override // defpackage.aghs
    public final boolean fj() {
        return this.c.fj();
    }

    @Override // defpackage.aghs
    public final boolean h(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
