package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjq extends agtu implements agvb {
    final /* synthetic */ boolean a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjq(boolean z, agsw agswVar) {
        super(2, agswVar);
        this.a = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjq) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yha yhaVar = yha.a;
        ygz ygzVar = new ygz();
        if ((ygzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ygzVar.y();
        }
        boolean z = this.a;
        yha yhaVar2 = (yha) ygzVar.b;
        yhaVar2.b |= 1;
        yhaVar2.c = z;
        abxd abxdVarV = ygzVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yha yhaVar3 = (yha) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yhaVar3;
        ycbVar.c = 29;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjq gjqVar = new gjq(this.a, agswVar);
        gjqVar.b = obj;
        return gjqVar;
    }
}
