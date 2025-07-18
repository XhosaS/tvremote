package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xym extends xwe {
    final xqo c;
    final xsq d;
    final xpy e;
    final /* synthetic */ xyn f;
    private final long g;

    /* JADX WARN: Illegal instructions before constructor call */
    public xym(xyn xynVar, xqo xqoVar, xsq xsqVar, xpy xpyVar) {
        this.f = xynVar;
        xyr xyrVar = xynVar.c;
        super(xyrVar.d(xpyVar), xyrVar.j, xpyVar.b);
        this.c = xqoVar;
        this.d = xsqVar;
        this.e = xpyVar;
        this.g = System.nanoTime();
    }

    @Override // defpackage.xwe
    protected final void b() {
        this.f.c.m.execute(new xyp(this, 1));
    }

    final void j() {
        xvz xvzVar;
        xqo xqoVarA = this.c.a();
        try {
            xqb xqbVarC = this.f.c(this.d, this.e.f(xqe.f, Long.valueOf(System.nanoTime() - this.g)));
            synchronized (this) {
                if (this.b != null) {
                    xvzVar = null;
                } else {
                    super.i(xqbVarC);
                    xvzVar = new xvz(this, this.a);
                }
            }
            if (xvzVar == null) {
                this.f.c.m.execute(new xyp(this, 1));
            } else {
                this.f.c.d(this.e).execute(new xxl((Object) this, (Object) xvzVar, 5, (byte[]) null));
            }
        } finally {
            this.c.c(xqoVarA);
        }
    }
}
