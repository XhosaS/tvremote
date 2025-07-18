package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srx {
    private final srk a;
    private final sro b;

    public srx(srk srkVar, sro sroVar) {
        srkVar.getClass();
        sroVar.getClass();
        this.a = srkVar;
        this.b = sroVar;
    }

    public final synchronized void a(sqx sqxVar, int i, rxn rxnVar) {
        srk srkVar = this.a;
        srkVar.e();
        srkVar.f(sqxVar, i, rxnVar);
    }

    public final synchronized void b(sqx sqxVar, rxn rxnVar) {
        rxnVar.getClass();
        this.a.a(sqxVar, rxnVar);
    }

    public final synchronized void c(sru sruVar, rxn rxnVar) {
        rxnVar.getClass();
        this.a.b(sruVar, rxnVar);
    }

    public final synchronized sra d(sqx sqxVar, sru sruVar, rvf rvfVar) {
        return this.a.d(sqxVar, sruVar, rvfVar, new srw(this.b.a()));
    }
}
