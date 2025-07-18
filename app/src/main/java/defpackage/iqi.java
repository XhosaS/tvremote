package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqi extends agtu implements agvb {
    int a;
    final /* synthetic */ iqk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqi(iqk iqkVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iqkVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iqi) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iqk iqkVar = this.b;
            this.a = 1;
            obj = iqkVar.c.f(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        fcy fcyVar = (fcy) obj;
        return fcyVar == null ? new fcy() : fcyVar;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iqi(this.b, agswVar);
    }
}
