package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gic extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gic(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gic) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yah yahVar = yah.a;
        yaf yafVar = new yaf();
        if ((yafVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yafVar.y();
        }
        int i = this.a;
        yah yahVar2 = (yah) yafVar.b;
        yahVar2.c = i - 1;
        yahVar2.b |= 1;
        abxd abxdVarV = yafVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yah yahVar3 = (yah) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yahVar3;
        ycbVar.c = 32;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gic gicVar = new gic(this.a, agswVar);
        gicVar.b = obj;
        return gicVar;
    }
}
