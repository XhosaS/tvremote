package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agtq extends agto {
    public final agte E;
    public transient agsw F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtq(agsw agswVar) {
        super(agswVar);
        agte agteVarFr = agswVar != null ? agswVar.fr() : null;
        this.E = agteVarFr;
    }

    @Override // defpackage.agsw
    public agte fr() {
        agte agteVar = this.E;
        agteVar.getClass();
        return agteVar;
    }

    @Override // defpackage.agto
    protected void g() {
        agsw agswVar = this.F;
        if (agswVar != null && agswVar != this) {
            agtc agtcVar = fr().get(agsy.b);
            agtcVar.getClass();
            ((agsy) agtcVar).d(agswVar);
        }
        this.F = agtp.a;
    }

    public agtq(agsw agswVar, agte agteVar) {
        super(agswVar);
        this.E = agteVar;
    }
}
