package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afug extends afpn {
    final affp c;
    final afil d;
    final afem e;
    final /* synthetic */ afuh f;
    private final long g;

    /* JADX WARN: Illegal instructions before constructor call */
    public afug(afuh afuhVar, affp affpVar, afil afilVar, afem afemVar) {
        this.f = afuhVar;
        afun afunVar = afuhVar.c;
        super(afunVar.g(afemVar), afunVar.j, afemVar.b);
        this.c = affpVar;
        this.d = afilVar;
        this.e = afemVar;
        this.g = System.nanoTime();
    }

    @Override // defpackage.afpn
    protected final void f() {
        afuf afufVar = new afuf(this);
        afkc afkcVar = this.f.c.m;
        afkcVar.c(afufVar);
        afkcVar.b();
    }

    final void j() {
        afoy afoyVar;
        affp affpVarA = this.c.a();
        try {
            afem afemVar = this.e;
            afel afelVar = afev.f;
            afeq afeqVarC = this.f.c(this.d, afemVar.f(afelVar, Long.valueOf(System.nanoTime() - this.g)));
            synchronized (this) {
                if (this.b != null) {
                    afoyVar = null;
                } else {
                    super.i(afeqVarC);
                    afoyVar = new afoy(this, this.a);
                }
            }
            if (afoyVar != null) {
                afuh afuhVar = this.f;
                afuhVar.c.g(this.e).execute(new afue(this, afoyVar));
            } else {
                afuh afuhVar2 = this.f;
                afuf afufVar = new afuf(this);
                afkc afkcVar = afuhVar2.c.m;
                afkcVar.c(afufVar);
                afkcVar.b();
            }
        } finally {
            this.c.f(affpVarA);
        }
    }
}
