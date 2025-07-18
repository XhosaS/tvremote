package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blq extends bko implements bzt, blp, byc {
    public yjv a;
    private final blr b;
    private boolean c;

    public blq(blr blrVar, yjv yjvVar) {
        this.b = blrVar;
        this.a = yjvVar;
        blrVar.a = this;
    }

    @Override // defpackage.bko
    public final void bP() {
        e();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjv] */
    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        if (!this.c) {
            blr blrVar = this.b;
            blrVar.o();
            cbp.Q(this, new bmq(this, blrVar, 1, null));
            if (blrVar.b == null) {
                bty.a("DrawResult not defined, did you forget to call onDraw?");
                throw new yfs();
            }
            this.c = true;
        }
        kw kwVar = this.b.b;
        kwVar.getClass();
        kwVar.a.a(byuVar);
    }

    @Override // defpackage.byc
    public final void bW() {
        e();
    }

    @Override // defpackage.blp
    public final long c() {
        return clw.y(fh.J(this, 128).c);
    }

    @Override // defpackage.bko
    public final void cg() {
        e();
    }

    public final void e() {
        this.c = false;
        this.b.o();
        fh.D(this);
    }

    @Override // defpackage.bzt
    public final void l() {
        e();
    }

    @Override // defpackage.blp
    public final clx o() {
        return fh.L(this);
    }

    @Override // defpackage.blp
    public final cmi p() {
        return fh.M(this);
    }

    @Override // defpackage.bko
    public final void ch() {
    }
}
