package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agno implements agfm, aghr {
    protected final aide b;
    protected aidf c;
    protected aghr d;
    protected boolean e;
    protected int f;

    public agno(aide aideVar) {
        this.b = aideVar;
    }

    @Override // defpackage.agfm, defpackage.aide
    public final void a(aidf aidfVar) {
        if (agns.d(this.c, aidfVar)) {
            this.c = aidfVar;
            if (aidfVar instanceof aghr) {
                this.d = (aghr) aidfVar;
            }
            this.b.a(this);
        }
    }

    @Override // defpackage.aghs
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.aide
    public final void d() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.d();
    }

    @Override // defpackage.aide
    public final void e(Throwable th) {
        if (this.e) {
            agoh.e(th);
        } else {
            this.e = true;
            this.b.e(th);
        }
    }

    @Override // defpackage.aidf
    public final void fh() {
        this.c.fh();
    }

    @Override // defpackage.aidf
    public final void fi(long j) {
        this.c.fi(j);
    }

    @Override // defpackage.aghs
    public final boolean fj() {
        return this.d.fj();
    }

    @Override // defpackage.aghs
    public final boolean h(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
