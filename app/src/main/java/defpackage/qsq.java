package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qsq implements qsn {
    final /* synthetic */ yrp a;
    final /* synthetic */ yrp b;
    final /* synthetic */ qsx c;
    final /* synthetic */ qst d;

    public qsq(qst qstVar, yrp yrpVar, yrp yrpVar2, qsx qsxVar) {
        this.a = yrpVar;
        this.b = yrpVar2;
        this.c = qsxVar;
        this.d = qstVar;
    }

    private final void a() {
        qst qstVar = this.d;
        qsu qsuVar = qstVar.a;
        if (qsuVar != null) {
            this.c.a.b(qsuVar);
            qstVar.a = null;
        }
    }

    @Override // defpackage.qsn
    public final void g(qpi qpiVar) {
        if (((Boolean) this.a.eV()).booleanValue()) {
            this.d.c.k(qpiVar);
        } else if (((Boolean) this.b.eV()).booleanValue()) {
            a();
        } else {
            this.d.c.k(qpiVar);
        }
    }

    @Override // defpackage.qsn
    public final void j(qpi qpiVar) {
        if (((Boolean) this.a.eV()).booleanValue()) {
            this.d.c.l(qpiVar);
        } else if (((Boolean) this.b.eV()).booleanValue()) {
            a();
        } else {
            this.d.c.l(qpiVar);
        }
    }
}
