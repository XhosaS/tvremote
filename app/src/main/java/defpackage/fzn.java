package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzn extends agtu implements agvb {
    int a;
    final /* synthetic */ owx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzn(owx owxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = owxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fzn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            owx owxVar = this.b;
            oxg oxgVar = oxg.OOBE_GET_HOME_GRAPH;
            this.a = 1;
            if (owxVar.e(oxgVar, this) != agtgVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        Object obj2 = ((agpk) obj).a;
        ahgr ahgrVarH = this.b.h();
        fzm fzmVar = new fzm(null);
        this.a = 2;
        Object objB = ahii.b(ahgrVarH, fzmVar, this);
        return objB == agtgVar ? agtgVar : objB;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fzn(this.b, agswVar);
    }
}
