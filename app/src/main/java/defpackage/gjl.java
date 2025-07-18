package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjl extends agtu implements agvb {
    final /* synthetic */ String a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjl(String str, agsw agswVar) {
        super(2, agswVar);
        this.a = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjl) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yao yaoVar = yao.a;
        yam yamVar = new yam();
        if ((yamVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yamVar.y();
        }
        String str = this.a;
        yao yaoVar2 = (yao) yamVar.b;
        yaoVar2.b |= 2;
        yaoVar2.d = str;
        if ((yamVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yamVar.y();
        }
        yao yaoVar3 = (yao) yamVar.b;
        yaoVar3.c = 1;
        yaoVar3.b = 1 | yaoVar3.b;
        abxd abxdVarV = yamVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yao yaoVar4 = (yao) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yaoVar4;
        ycbVar.c = 42;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjl gjlVar = new gjl(this.a, agswVar);
        gjlVar.b = obj;
        return gjlVar;
    }
}
