package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkb extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkb(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gkb) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yfj yfjVar = yfj.a;
        yfh yfhVar = new yfh();
        if ((yfhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yfhVar.y();
        }
        int i = this.a;
        yfj yfjVar2 = (yfj) yfhVar.b;
        yfjVar2.c = i - 1;
        yfjVar2.b |= 1;
        abxd abxdVarV = yfhVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yfj yfjVar3 = (yfj) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yfjVar3;
        ycbVar.c = 41;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gkb gkbVar = new gkb(this.a, agswVar);
        gkbVar.b = obj;
        return gkbVar;
    }
}
