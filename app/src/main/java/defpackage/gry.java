package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gry extends agtu implements agvb {
    int a;
    final /* synthetic */ grz b;
    final /* synthetic */ xjg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gry(grz grzVar, xjg xjgVar, agsw agswVar) {
        super(2, agswVar);
        this.b = grzVar;
        this.c = xjgVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gry) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            grz grzVar = this.b;
            xbg xbgVar = this.c.e;
            if (xbgVar == null) {
                xbgVar = xbg.a;
            }
            fgx fgxVar = grzVar.c;
            xbgVar.getClass();
            this.a = 1;
            if (fgxVar.b(xbgVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gry(this.b, this.c, agswVar);
    }
}
