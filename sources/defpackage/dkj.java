package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkj extends dla {
    public static dhr b(dhp dhpVar, cyw cywVar) {
        try {
            dab dabVarV = dab.v(cywVar.n());
            if (!(dabVarV instanceof dag)) {
                return new dhr(dhpVar, czx.f(dabVarV).b);
            }
            dag dagVarJ = dag.j(dabVarV);
            return new dhr(dhpVar, czx.f(dagVarJ.h(0)).b, czx.f(dagVarJ.h(1)).b);
        } catch (Exception unused) {
            return new dhr(dhpVar, cywVar.n());
        }
    }

    @Override // defpackage.dla
    public final deu a(ddp ddpVar) {
        return b(dle.y(ddpVar.a.a), ddpVar.b);
    }
}
