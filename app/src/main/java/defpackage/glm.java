package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glm extends agtu implements agvb {
    int a;
    final /* synthetic */ glp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glm(glp glpVar, agsw agswVar) {
        super(2, agswVar);
        this.b = glpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((glm) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            glp glpVar = this.b;
            this.a = 1;
            if (glpVar.l(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new glm(this.b, agswVar);
    }
}
