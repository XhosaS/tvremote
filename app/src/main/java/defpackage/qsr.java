package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qsr implements qsn {
    final /* synthetic */ yrp a;
    final /* synthetic */ yrp b;
    final /* synthetic */ qtd c;
    final /* synthetic */ qst d;

    public qsr(qst qstVar, yrp yrpVar, yrp yrpVar2, qtd qtdVar) {
        this.a = yrpVar;
        this.b = yrpVar2;
        this.c = qtdVar;
        this.d = qstVar;
    }

    private final void a() {
        qst qstVar = this.d;
        qsm qsmVar = qstVar.b;
        if (qsmVar != null) {
            this.c.g.remove(qsmVar);
            qstVar.b = null;
        }
    }

    @Override // defpackage.qsn
    public final void g(qpi qpiVar) {
        if (((Boolean) this.a.eV()).booleanValue()) {
            this.d.c.k(qpiVar);
        } else if (((Boolean) this.b.eV()).booleanValue()) {
            this.d.c.k(qpiVar);
        } else {
            a();
        }
    }

    @Override // defpackage.qsn
    public final void j(qpi qpiVar) {
        if (((Boolean) this.a.eV()).booleanValue()) {
            this.d.c.l(qpiVar);
        } else if (((Boolean) this.b.eV()).booleanValue()) {
            this.d.c.l(qpiVar);
        } else {
            a();
        }
    }
}
