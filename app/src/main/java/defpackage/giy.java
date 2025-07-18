package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class giy extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giy(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((giy) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        ycy ycyVar = ycy.a;
        ycx ycxVar = new ycx();
        if ((ycxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycxVar.y();
        }
        int i = this.a;
        ycy ycyVar2 = (ycy) ycxVar.b;
        ycyVar2.c = i - 1;
        ycyVar2.b |= 1;
        if ((ycxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycxVar.y();
        }
        ycy ycyVar3 = (ycy) ycxVar.b;
        ycyVar3.b |= 2;
        ycyVar3.d = 0;
        abxd abxdVarV = ycxVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        ycy ycyVar4 = (ycy) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ycyVar4;
        ycbVar.c = 7;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        giy giyVar = new giy(this.a, agswVar);
        giyVar.b = obj;
        return giyVar;
    }
}
