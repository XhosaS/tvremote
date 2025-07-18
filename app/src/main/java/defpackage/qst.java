package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qst {
    public qsu a;
    public qsm b;
    public final qss c = new qss();

    public qst(qsx qsxVar, qtd qtdVar, final agow agowVar, final agow agowVar2) {
        agowVar.getClass();
        yrp yrpVarA = yru.a(new yrp() { // from class: qsp
            @Override // defpackage.yrp
            public final Object eV() {
                return (Boolean) agowVar.a();
            }
        });
        agowVar2.getClass();
        yrp yrpVarA2 = yru.a(new yrp() { // from class: qsp
            @Override // defpackage.yrp
            public final Object eV() {
                return (Boolean) agowVar2.a();
            }
        });
        if (!((Boolean) yrpVarA2.eV()).booleanValue()) {
            b(qsxVar, yrpVarA, yrpVarA2);
            a(qtdVar, yrpVarA, yrpVarA2);
        } else if (((Boolean) yrpVarA.eV()).booleanValue()) {
            a(qtdVar, yrpVarA, yrpVarA2);
        } else {
            b(qsxVar, yrpVarA, yrpVarA2);
        }
    }

    private final void a(qtd qtdVar, yrp yrpVar, yrp yrpVar2) {
        this.b = new qsm(new qsr(this, yrpVar2, yrpVar, qtdVar));
        qtdVar.g.add(this.b);
    }

    private final void b(qsx qsxVar, yrp yrpVar, yrp yrpVar2) {
        this.a = new qsu(new qsq(this, yrpVar2, yrpVar, qsxVar));
        qsxVar.a.a(this.a);
    }
}
