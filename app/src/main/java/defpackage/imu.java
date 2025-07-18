package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imu extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ ind c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imu(ind indVar, agsw agswVar) {
        super(2, agswVar);
        this.c = indVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((imu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2;
        agtg agtgVar = agtg.a;
        if (this.b != 0) {
            obj2 = this.a;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            ind indVar = this.c;
            this.a = indVar;
            this.b = 1;
            Object objG = indVar.e.g(this);
            if (objG == agtgVar) {
                return agtgVar;
            }
            obj2 = indVar;
            obj = objG;
        }
        zdy zdyVar = ind.a;
        ((ind) obj2).q = (fcy) obj;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new imu(this.c, agswVar);
    }
}
