package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmo extends agtu implements agvb {
    int a;
    final /* synthetic */ bmn b;
    final /* synthetic */ ahap c;
    final /* synthetic */ agvb d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmo(bmn bmnVar, ahap ahapVar, agvb agvbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = bmnVar;
        this.c = ahapVar;
        this.d = agvbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bmo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agsw agswVar;
        agtg agtgVar = agtg.a;
        if (this.a != 0) {
            agswVar = (agsw) this.e;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            agtc agtcVar = ((ahbt) this.e).fs().get(agsy.b);
            agtcVar.getClass();
            bmn bmnVar = this.b;
            agsy agsyVar = (agsy) agtcVar;
            agte agteVarPlus = agsyVar.plus(new bnc(agsyVar));
            agte agteVarPlus2 = agteVarPlus.plus(new ahmo(agteVarPlus, bmnVar.i));
            ahap ahapVar = this.c;
            agvb agvbVar = this.d;
            this.e = ahapVar;
            this.a = 1;
            obj = ahal.a(agteVarPlus2, agvbVar, this);
            if (obj == agtgVar) {
                return agtgVar;
            }
            agswVar = ahapVar;
        }
        agswVar.e(obj);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bmo bmoVar = new bmo(this.b, this.c, this.d, agswVar);
        bmoVar.e = obj;
        return bmoVar;
    }
}
