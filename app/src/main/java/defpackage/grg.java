package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grg extends agtu implements agvb {
    int a;
    final /* synthetic */ grh b;
    final /* synthetic */ xjn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grg(grh grhVar, xjn xjnVar, agsw agswVar) {
        super(2, agswVar);
        this.b = grhVar;
        this.c = xjnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((grg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            grh grhVar = this.b;
            xbg xbgVar = this.c.b;
            if (xbgVar == null) {
                xbgVar = xbg.a;
            }
            fgx fgxVar = grhVar.d;
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
        return new grg(this.b, this.c, agswVar);
    }
}
