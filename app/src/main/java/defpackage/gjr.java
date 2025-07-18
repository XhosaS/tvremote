package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjr extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjr(int i, int i2, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjr) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.c;
        yfc yfcVar = yfc.a;
        yes yesVar = new yes();
        ygu.b(3, yesVar);
        if ((yesVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yesVar.y();
        }
        int i = this.a;
        yfc yfcVar2 = (yfc) yesVar.b;
        yfcVar2.d = i - 1;
        yfcVar2.b |= 2;
        if ((yesVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yesVar.y();
        }
        int i2 = this.b;
        yfc yfcVar3 = (yfc) yesVar.b;
        yfcVar3.g = i2 - 1;
        yfcVar3.b |= 16;
        yfc yfcVarA = ygu.a(yesVar);
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yfcVarA;
        ycbVar.c = 21;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjr gjrVar = new gjr(this.a, this.b, agswVar);
        gjrVar.c = obj;
        return gjrVar;
    }
}
