package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gju extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gju(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gju) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yee yeeVar = yee.a;
        yed yedVar = new yed();
        if ((yedVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yedVar.y();
        }
        int i = this.a;
        yee yeeVar2 = (yee) yedVar.b;
        yeeVar2.c = i - 1;
        yeeVar2.b |= 1;
        abxd abxdVarV = yedVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yee yeeVar3 = (yee) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yeeVar3;
        ycbVar.c = 20;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gju gjuVar = new gju(this.a, agswVar);
        gjuVar.b = obj;
        return gjuVar;
    }
}
