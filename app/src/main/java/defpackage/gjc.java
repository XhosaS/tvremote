package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjc extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjc(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjc) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        ydc ydcVar = ydc.a;
        ycz yczVar = new ycz();
        ght ghtVar = gkh.a;
        int iA = ydb.a(this.a);
        if (iA == 0) {
            iA = 1;
        }
        if ((yczVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yczVar.y();
        }
        ydc ydcVar2 = (ydc) yczVar.b;
        ydcVar2.c = iA - 1;
        ydcVar2.b |= 1;
        abxd abxdVarV = yczVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        ydc ydcVar3 = (ydc) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ydcVar3;
        ycbVar.c = 9;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjc gjcVar = new gjc(this.a, agswVar);
        gjcVar.b = obj;
        return gjcVar;
    }
}
