package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgx extends agtu implements agvb {
    int a;
    final /* synthetic */ ahgr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgx(ahgr ahgrVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ahgrVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahgx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahgr ahgrVar = this.b;
            this.a = 1;
            Object objFD = ahgrVar.fD(ahkb.a, this);
            if (objFD != agtgVar) {
                objFD = agpu.a;
            }
            if (objFD == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ahgx(this.b, agswVar);
    }
}
