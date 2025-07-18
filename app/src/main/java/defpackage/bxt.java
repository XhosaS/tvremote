package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxt extends agtu implements agvb {
    int a;
    final /* synthetic */ ahgr b;
    final /* synthetic */ afe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxt(ahgr ahgrVar, afe afeVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ahgrVar;
        this.c = afeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahgr ahgrVar = this.b;
            bxs bxsVar = new bxs(this.c);
            this.a = 1;
            if (ahgrVar.fD(bxsVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bxt(this.b, this.c, agswVar);
    }
}
