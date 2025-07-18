package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bro extends bqh {
    public final bcb a;
    public final bcb b;
    public final brk c;
    public int d;
    public final bdn e;
    private float f;
    private bnr g;

    public bro() {
        this(new bqk());
    }

    @Override // defpackage.bqh
    public final long a() {
        return ((bna) this.a.a()).a;
    }

    @Override // defpackage.bqh
    protected final void b(bpq bpqVar) {
        brk brkVar = this.c;
        bnr bnrVarD = this.g;
        if (bnrVarD == null) {
            bnrVarD = brkVar.d();
        }
        if (((Boolean) this.b.a()).booleanValue() && bpqVar.o() == cmi.b) {
            long jM = bpqVar.m();
            bpn bpnVarP = bpqVar.p();
            long jA = bpnVarP.a();
            bpnVarP.b().g();
            try {
                bpnVarP.c.x(-1.0f, 1.0f, jM);
                brkVar.g(bpqVar, this.f, bnrVarD);
            } finally {
                bpnVarP.b().e();
                bpnVarP.h(jA);
            }
        } else {
            brkVar.g(bpqVar, this.f, bnrVarD);
        }
        this.d = g();
    }

    @Override // defpackage.bqh
    protected final void c(float f) {
        this.f = f;
    }

    @Override // defpackage.bqh
    protected final void d(bnr bnrVar) {
        this.g = bnrVar;
    }

    public final int g() {
        return this.e.e();
    }

    public bro(bqk bqkVar) {
        bna bnaVar = new bna(0L);
        bcz bczVar = bcz.c;
        this.a = new bci(bnaVar, bczVar);
        this.b = new bci(false, bczVar);
        brk brkVar = new brk(bqkVar);
        brkVar.d = new bms(this, 2);
        this.c = brkVar;
        this.e = new bcf(0);
        this.f = 1.0f;
        this.d = -1;
    }
}
